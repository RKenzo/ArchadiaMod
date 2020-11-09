package me.network.archadia;

import cpw.mods.fml.common.registry.*;
import me.network.archadia.Blocks.*;
import me.network.archadia.CreativeTabs.*;
import me.network.archadia.Items.*;
import net.minecraft.block.*;
import net.minecraft.util.*;

public class ModBlocks {
    
    public static Block blockRuby;
    public static Block oreRuby;
    
    public static Block blockSapphire;
    public static Block oreSapphire;
    
    public static Block blockOpal;
    public static Block oreOpal;
    
    public static Block blockTanzanite;
    public static Block oreTanzanite;
    
    public static Block blockAlexandrite;
    public static Block oreAlexandrite;
    
    public static Block blockAmber;
    public static Block oreAmber;
    
    public static Block blockAmethyst;
    public static Block oreAmethyst;
    
    public static Block blockAquamarine;
    public static Block oreAquamarine;
    
    public static Block blockBlackOpal;
    public static Block oreBlackOpal;
    
    public static Block blockCitrine;
    public static Block oreCitrine;
    
    public static Block blockGarnet;
    public static Block oreGarnet;
    
    public static Block blockJade;
    public static Block oreJade;
    
    public static Block blockJasper;
    public static Block oreJasper;
    
    public static Block blockMalachite;
    public static Block oreMalachite;
    
    public static Block blockOnyx;
    public static Block oreOnyx;
    
    public static Block blockPeridot;
    public static Block orePeridot;
    
    public static Block blockRoseQuartz;
    public static Block oreRoseQuartz;
    
    public static Block blockSpinel;
    public static Block oreSpinel;
    
    public static Block blockSugilite;
    public static Block oreSugilite;
    
    public static Block blockTopaz;
    public static Block oreTopaz;
    
    public static Block blockTourmaline;
    public static Block oreTourmaline;
    
    public static Block blockTurquoise;
    public static Block oreTurquoise;
    
    public static Block blockZircon;
    public static Block oreZircon;
    
    
    public static void init() {
        blockRuby = createAndRegisterGem("Ruby");
        oreRuby = createAndRegisterOre("Ruby", ModItems.gemaRuby);
        
        blockSapphire = createAndRegisterGem("Sapphire");
        oreSapphire = createAndRegisterOre("Sapphire", ModItems.gemaSapphire);
        
        blockOpal = createAndRegisterGem("Opal");
        oreOpal = createAndRegisterOre("Opal", ModItems.gemaOpal);
        
        blockTanzanite = createAndRegisterGem("Tanzanite");
        oreTanzanite = createAndRegisterOre("Tanzanite", ModItems.gemaTanzanite);
        
        blockAlexandrite = createAndRegisterGem("Alexandrite");
        oreAlexandrite = createAndRegisterOre("Alexandrite", ModItems.gemaAlexandrite);
        
        blockAmber = createAndRegisterGem("Amber");
        oreAmber = createAndRegisterOre("Amber", ModItems.gemaAmber);
        
        blockAmethyst = createAndRegisterGem("Amethyst");
        oreAmethyst = createAndRegisterOre("Amethyst", ModItems.gemaAmethyst);
        
        blockAquamarine = createAndRegisterGem("Aquamarine");
        oreAquamarine = createAndRegisterOre("Aquamarine", ModItems.gemaAquamarine);
        
        blockBlackOpal = createAndRegisterGem("BlackOpal");
        oreBlackOpal = createAndRegisterOre("BlackOpal", ModItems.gemaBlackOpal);
        
        blockCitrine = createAndRegisterGem("Citrine");
        oreCitrine = createAndRegisterOre("Citrine", ModItems.gemaCitrine);
        
        blockGarnet = createAndRegisterGem("Garnet");
        oreGarnet = createAndRegisterOre("Garnet", ModItems.gemaGarnet);
        
        blockJade = createAndRegisterGem("Jade");
        oreJade = createAndRegisterOre("Jade", ModItems.gemaJade);
        
        blockJasper = createAndRegisterGem("Jasper");
        oreJasper = createAndRegisterOre("Jasper", ModItems.gemaJasper);
        
        blockMalachite = createAndRegisterGem("Malachite");
        oreMalachite = createAndRegisterOre("Malachite", ModItems.gemaMalachite);
        
        blockOnyx = createAndRegisterGem("Onyx");
        oreOnyx = createAndRegisterOre("Onyx", ModItems.gemaOnyx);
        
        blockPeridot = createAndRegisterGem("Peridot");
        orePeridot = createAndRegisterOre("Peridot", ModItems.gemaPeridot);
        
        blockRoseQuartz = createAndRegisterGem("RoseQuartz");
        oreRoseQuartz = createAndRegisterOre("RoseQuartz", ModItems.gemaRoseQuartz);
        
        blockSpinel = createAndRegisterGem("Spinel");
        oreSpinel = createAndRegisterOre("Spinel", ModItems.gemaSpinel);
        
        blockSugilite = createAndRegisterGem("Sugilite");
        oreSugilite = createAndRegisterOre("Sugilite", ModItems.gemaSugilite);
        
        blockTopaz = createAndRegisterGem("Topaz");
        oreTopaz = createAndRegisterOre("Topaz", ModItems.gemaTopaz);
        
        blockTourmaline = createAndRegisterGem("Tourmaline");
        oreTourmaline = createAndRegisterOre("Tourmaline", ModItems.gemaTourmaline);
        
        blockTurquoise = createAndRegisterGem("Turquoise");
        oreTurquoise = createAndRegisterOre("Turquoise", ModItems.gemaTurquoise);
        
        blockZircon = createAndRegisterGem("Zircon");
        oreZircon = createAndRegisterOre("Zircon", ModItems.gemaZircon);
    }
    
    private static BlockGem createAndRegisterGem(String name) {
        final String textureLocationBlock = "block/" + name.toLowerCase();
        final ResourceLocation blockTextureLocation = new ResourceLocation(ArchadiaMod.MODID, textureLocationBlock);
        final BlockGem blockGem = new BlockGem("Block" + name, blockTextureLocation);
        blockGem.setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockGem, "block_" + name.toLowerCase());
        return blockGem;
    }
    
    private static BlockOreGem createAndRegisterOre(String name, ItemGem itemGem) {
        final String textureLocationOre = "ore/" + name.toLowerCase();
        final ResourceLocation textureLocation = new ResourceLocation(ArchadiaMod.MODID, textureLocationOre);
        final BlockOreGem blockOreGem = new BlockOreGem(itemGem, "Ore" + name, textureLocation);
        blockOreGem.setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockOreGem, "ore_" + name.toLowerCase());
        return blockOreGem;
    }
}
