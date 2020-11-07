package me.network.archadia.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import me.network.archadia.handler.KeyHandler;

public class ClientProxy extends CommonProxy{

    public void registerProxies(){
        FMLCommonHandler.instance().bus().register(new KeyHandler());
    }

    public int addArmor(String armor){
        return RenderingRegistry.addNewArmourRendererPrefix(armor);
    }

}
