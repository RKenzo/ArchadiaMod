package me.network.archadia.handler;

import cpw.mods.fml.common.network.IGuiHandler;
import me.network.archadia.References;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {
    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID){
            case References
                    .GUI_BACKPACK:
                break;
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
        switch (ID){
            case References
                    .GUI_BACKPACK:
                break;
        }
        return null;
    }
}
