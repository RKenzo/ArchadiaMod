package me.network.archadia.Items;

import me.network.archadia.*;
import me.network.archadia.packet.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import net.minecraft.world.*;

public class ItemBackpack extends Item {
    
    @Override
    public ItemStack onItemRightClick(ItemStack usedStack, World world, EntityPlayer player) {
        if(world.isRemote) {
            ArchadiaMod.packetPipeline.sendToServer(new OpenGuiPacket(References.GUI_BACKPACK));
        }
        return usedStack;
    }
    
}
