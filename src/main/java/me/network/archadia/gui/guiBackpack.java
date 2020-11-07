package me.network.archadia.gui;

import me.network.archadia.References;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class guiBackpack extends GuiScreen {
    int guiWidth = 176;
    int guiHeight = 176;


    @Override
    public void drawScreen(int x, int y, float ticks) {
        int guiX = (width - guiWidth) / 2;
        int guiy = (height - guiHeight) / 2;
        GL11.glColor4f(1, 1, 1, 1);
        drawDefaultBackground();
        mc.renderEngine.bindTexture(new ResourceLocation(References.MOD_ID, "textures/gui/testGui.png"));
        drawTexturedModalRect(guiX, guiy, 0, 0, guiWidth, guiHeight);
        super.drawScreen(x, y, ticks);
    }
}
