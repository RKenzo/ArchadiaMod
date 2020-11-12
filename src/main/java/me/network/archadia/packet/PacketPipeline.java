package me.network.archadia.packet;

import cpw.mods.fml.common.network.*;
import cpw.mods.fml.common.network.internal.*;
import cpw.mods.fml.relauncher.*;
import io.netty.buffer.*;
import io.netty.channel.*;
import io.netty.handler.codec.*;
import me.network.archadia.*;

import java.util.*;

@ChannelHandler.Sharable
public class PacketPipeline extends MessageToMessageCodec<FMLProxyPacket, AbstractPacket> {

    private EnumMap<Side, FMLEmbeddedChannel> channels;
    private final LinkedList<Class<? extends AbstractPacket>> packets = new LinkedList<Class<? extends AbstractPacket>>();
    private boolean isPostInitialized = false;

    public boolean registerPacket(Class<? extends AbstractPacket> clazz) {
        if(this.packets.size() > 256) {
            System.err.println("Quantia maxima atingida!");
            return false;
        }

        if(this.packets.contains(clazz)) {
            System.err.println("Esse pacote já foi registrado!");
            return false;
        }
        if(this.isPostInitialized) {
            System.err.println("Registro do pacote atrasado!");
            return false;

        }
        this.packets.add(clazz);
        return true;
    }

    public void initialize() {
        this.channels = NetworkRegistry.INSTANCE.newChannel(References.PACKET_CHANNEL, this);

        registerPackets();
    }

    public void postInitialize() {
        if(isPostInitialized)
            return;

        isPostInitialized = true;
        Collections.sort(this.packets, new Comparator<Class<? extends AbstractPacket>>() {
            @Override
            public int compare(Class<? extends AbstractPacket> o1, Class<? extends AbstractPacket> o2) {
                int com = String.CASE_INSENSITIVE_ORDER.compare(o1.getCanonicalName(), o2.getCanonicalName());
                if(com == 0)
                    com = o1.getCanonicalName().compareTo(o2.getCanonicalName());

                return com;
            }
        });

    }

    public void registerPackets() {
        registerPacket(OpenGuiPacket.class);
    }

    @Override
    protected void encode(ChannelHandlerContext ctx, AbstractPacket msg, List<Object> out) throws Exception {
        ByteBuf buffer = Unpooled.buffer();
        Class<? extends AbstractPacket> clazz = msg.getClass();
        if(!this.packets.contains(clazz))
            throw new NullPointerException("Este packet nunca foi registrado: " + clazz.getCanonicalName());

        byte discriminator = (byte) this.packets.indexOf(clazz);
        buffer.writeByte(discriminator);
        msg.encodeInto(ctx, buffer);

        FMLProxyPacket proxyPacket = new FMLProxyPacket(buffer.copy(), ctx.channel()
                .attr(NetworkRegistry.FML_CHANNEL)
                .get());
        out.add(proxyPacket);
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, FMLProxyPacket msg, List<Object> out) throws Exception {
        ByteBuf payload = msg.payload();
        byte discriminator = payload.readByte();

        Class<? extends AbstractPacket> clazz = this.packets.get(discriminator);
        if(clazz == null)
            throw new NullPointerException("Este packet nunca foi registrado: " + discriminator);

        AbstractPacket abstractPacket = clazz.newInstance();
        abstractPacket.decodeInto(ctx, payload.slice());

        ArchadiaMod.proxy.handlePacketWithPlayer(ctx, abstractPacket);
        out.add(abstractPacket);
    }

    public void sendToServer(AbstractPacket message) {
        this.channels.get(Side.CLIENT)
                .attr(FMLOutboundHandler.FML_MESSAGETARGET)
                .set(FMLOutboundHandler.OutboundTarget.TOSERVER);
        this.channels.get(Side.CLIENT).writeAndFlush(message);
    }
}