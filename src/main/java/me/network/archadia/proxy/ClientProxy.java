package me.network.archadia.proxy;

import io.netty.channel.*;
import me.network.archadia.packet.*;
import net.minecraft.client.*;
import net.minecraft.client.entity.*;

public class ClientProxy extends CommonProxy {
    
    public void registerProxies() {
    }
    
    @Override
    public void handlePacketWithPlayer(ChannelHandlerContext ctx, AbstractPacket abstractPacket) {
        final EntityClientPlayerMP thePlayer = Minecraft.getMinecraft().thePlayer;
        abstractPacket.handleClientSide(thePlayer);
    }
}
