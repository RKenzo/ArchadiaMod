package me.network.archadia.packet;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.network.FMLEmbeddedChannel;
import cpw.mods.fml.common.network.FMLOutboundHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.internal.FMLProxyPacket;
import cpw.mods.fml.relauncher.Side;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;
import me.network.archadia.References;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.NetHandlerPlayServer;

import java.util.*;
@ChannelHandler.Sharable
public class PacketPipeline extends MessageToMessageCodec<FMLProxyPacket, AbstractPacket> {

    private EnumMap<Side, FMLEmbeddedChannel> channels;
    private LinkedList<Class<? extends AbstractPacket>> packets = new LinkedList<Class<? extends AbstractPacket>>();
    private boolean isPostInitialized = false;

    public boolean registerPacket(Class<? extends AbstractPacket> clazz) {
        if (this.packets.size() > 256) {
        System.err.println("Quantia maxima atingida!");
            return false;
        }

        if(this.packets.contains(clazz)){
            System.err.println("Esse pacote já foi registrado!");
            return false;
        }
        if(this.isPostInitialized){
            System.err.println("Registro do pacote atrasado!");
            return false;

        }
        this.packets.add(clazz);
        return true;
    }

    public void initialize(){
    this.channels = NetworkRegistry.INSTANCE.newChannel(References.PACKET_CHANNEL, this);

    registerPackets();
    }

    public void postInitialize(){
    if(isPostInitialized)
        return;

        isPostInitialized = true;
        Collections.sort(this.packets, new Comparator<Class<? extends AbstractPacket>>() {
            @Override
            public int compare(Class<? extends AbstractPacket> o1, Class<? extends AbstractPacket> o2) {
                int com = String.CASE_INSENSITIVE_ORDER.compare(o1.getCanonicalName(), o2.getCanonicalName());
                if(com  == 0)
                    com = o1.getCanonicalName().compareTo(o2.getCanonicalName());

                return com;
            }
        });

    }
    public void registerPackets(){
        registerPacket(OpenGuiPacket.class);
    }

    @Override
    protected void encode(ChannelHandlerContext ctx, AbstractPacket msg, List<Object> out) throws Exception {
        ByteBuf buffer = Unpooled.buffer();
        Class<? extends AbstractPacket> clazz = msg.getClass();
        if(!this.packets.contains(clazz))
        throw new NullPointerException("Este packet nunca foi registrado: "+ clazz.getCanonicalName());

        byte discriminator = (byte) this.packets.indexOf(clazz);
        buffer.writeByte(discriminator);
        msg.encodeInto(ctx, buffer);

        FMLProxyPacket proxyPacket = new FMLProxyPacket(buffer.copy(), ctx.channel().attr(NetworkRegistry.FML_CHANNEL).get());
        out.add(proxyPacket);
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, FMLProxyPacket msg, List<Object> out) throws Exception {
        ByteBuf payload = msg.payload();
        byte discriminator = payload.readByte();

        Class<? extends AbstractPacket> clazz = this.packets.get(discriminator);
        if(clazz == null)
            throw new NullPointerException("Este packet nunca foi registrado: "+ clazz.getCanonicalName());

        AbstractPacket abstractPacket = clazz.newInstance();
        abstractPacket.decodeInto(ctx, payload.slice());

        EntityPlayer player;
        switch(FMLCommonHandler.instance().getEffectiveSide()){
            case CLIENT:
                player = Minecraft.getMinecraft().thePlayer;
                abstractPacket.handleClientSide(player);
                break;
            case SERVER:
                INetHandler iNetHandler = ctx.channel().attr(NetworkRegistry.NET_HANDLER).get();
                player = ((NetHandlerPlayServer) iNetHandler).playerEntity;
                abstractPacket.handleServerSide(player);
                break;
            default:
        }
        out.add(abstractPacket);
    }

    public void sendToServer(AbstractPacket message){
        this.channels.get(Side.CLIENT).attr(FMLOutboundHandler.FML_MESSAGETARGET).set(FMLOutboundHandler.OutboundTarget.TOSERVER);
        this.channels.get(Side.CLIENT).writeAndFlush(message);
    }
}
