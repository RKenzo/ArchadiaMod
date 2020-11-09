package me.network.archadia.gui;

import me.network.archadia.References;
import me.network.archadia.container.*;
import net.minecraft.client.gui.inventory.*;
import net.minecraft.item.*;
import net.minecraft.util.*;
import org.lwjgl.opengl.*;

public class GuiBackpack extends GuiContainer {
    
    private static final int guiWidth = 176;
    private static final int guiHeight = 176;
    
    public GuiBackpack(ContainerBackpack backPack) {
        super(backPack);
    }
    
    
    public static GuiBackpack readFromNBT(ItemStack stack) {
        final ContainerBackpack containerBackpack = ContainerBackpack.readFromNBT(stack);
        if(containerBackpack == null) {
            return null;
        }
        
        return new GuiBackpack(containerBackpack);
    }
    
    @Override
    public void drawScreen(int x, int y, float ticks) {
        super.drawScreen(x, y, ticks);
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int x, int y) {
        int guiX = (width - guiWidth) / 2;
        int guiy = (height - guiHeight) / 2;
        mc.renderEngine.bindTexture(new ResourceLocation(References.MOD_ID, "textures/gui/testGui.png"));
        drawTexturedModalRect(guiX, guiy, 0, 0, guiWidth, guiHeight);
    }
}
