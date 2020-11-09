package me.network.archadia.handler;

import cpw.mods.fml.common.network.IGuiHandler;
import me.network.archadia.References;
import me.network.archadia.container.*;
import me.network.archadia.gui.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID){
            case References.GUI_BACKPACK:
                return ContainerBackpack.readFromNBT(player.getHeldItem());
    
        }
        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID){
            case References
                    .GUI_BACKPACK:
                return GuiBackpack.readFromNBT(player.getHeldItem());
        }
        return null;
    }
}
