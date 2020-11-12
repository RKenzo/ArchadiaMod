package me.network.archadia.proxy;

import cpw.mods.fml.common.network.*;
import io.netty.channel.*;
import me.network.archadia.packet.*;
import net.minecraft.entity.player.*;
import net.minecraft.network.*;

public class CommonProxy {

    public void registerProxies() {

    }

    public int addArmor(String armor) {
        return 0;
    }

    public void handlePacketWithPlayer(ChannelHandlerContext ctx, AbstractPacket abstractPacket) {
        INetHandler iNetHandler = ctx.channel().attr(NetworkRegistry.NET_HANDLER).get();
        final EntityPlayer player = ((NetHandlerPlayServer) iNetHandler).playerEntity;
        abstractPacket.handleServerSide(player);
    }
}