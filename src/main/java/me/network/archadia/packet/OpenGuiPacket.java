package me.network.archadia.packet;

import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import me.network.archadia.ArchadiaMod;
import net.minecraft.entity.player.EntityPlayer;

public class OpenGuiPacket extends AbstractPacket{

    private byte id;
    public OpenGuiPacket(){}

    public OpenGuiPacket(byte id){
        this.id = id;
    }
    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
        buffer.writeByte(id);
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf buffer) {
        id = buffer.readByte();
    }

    @Override
    public void handleClientSide(EntityPlayer player) {

    }

    @Override
    public void handleServerSide(EntityPlayer player) {
        System.out.println("PASSOU?");
        FMLNetworkHandler.openGui(player, ArchadiaMod.instance, id, player.worldObj, (int)player.posX,(int)player.posY,(int)player.posZ);
    }
}
