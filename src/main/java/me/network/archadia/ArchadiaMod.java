package me.network.archadia;


import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import me.network.archadia.handler.GuiHandler;
import me.network.archadia.packet.PacketPipeline;
import me.network.archadia.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


@Mod(modid = ArchadiaMod.MODID, version = ArchadiaMod.VERSION, name = ArchadiaMod.NAME)
public class ArchadiaMod
{
    public static final String MODID = "arcmod";
    public static final String VERSION = "1.0";
    public static final String NAME = "Gemas Archadia";



    @Mod.Instance(MODID)
    public static ArchadiaMod instance;
    @SidedProxy(clientSide= "me.network.archadia.proxy.ClientProxy", serverSide= "me.network.archadia.proxy.CommonProxy")
        public static CommonProxy proxy;

    public static final PacketPipeline packetPipeline = new PacketPipeline();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){

    GameRegistry.registerWorldGenerator(new OresGeneration(), 0);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        packetPipeline.initialize();
        ModItems.init();
        ModBlocks.init();
        ModRecipes.init();
        NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

        proxy.registerProxies();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
    }
    @EventHandler
    public void preLoad(FMLPostInitializationEvent event){
        packetPipeline.postInitialize();
    }

}
