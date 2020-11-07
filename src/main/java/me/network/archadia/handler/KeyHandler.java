package me.network.archadia.handler;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent;
import me.network.archadia.ArchadiaMod;
import me.network.archadia.References;
import me.network.archadia.packet.OpenGuiPacket;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

public class KeyHandler {

    public static final int BACKPACK_KEY = 0;

    private static final String[] keyDesc = {"key.archmod.backpack.desc"};
    private static final int[] keyValues = {Keyboard.KEY_B};
    private final KeyBinding[] keys;

    public KeyHandler(){
        keys = new KeyBinding[keyValues.length];
        for(int i = 0; i < keyValues.length; i++){
            keys[i] = new KeyBinding(keyDesc[i], keyValues[i], "key.archmod.category" );
            ClientRegistry.registerKeyBinding(keys[i]);
        }
    }
    @SubscribeEvent
    public void onKeyInput(InputEvent.KeyInputEvent event){
    if(!FMLClientHandler.instance().isGUIOpen(GuiChat.class)){
        int key = Keyboard.getEventKey();
        boolean isDown = Keyboard.getEventKeyState();

        if(isDown && key == keyValues[BACKPACK_KEY]){
            ArchadiaMod.packetPipeline.sendToServer(new OpenGuiPacket(References.GUI_BACKPACK));
        }
    }
    }

}
