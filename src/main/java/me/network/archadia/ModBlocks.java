package me.network.archadia;

import cpw.mods.fml.common.registry.GameRegistry;
import me.network.archadia.Blocks.BlockRuby;
import me.network.archadia.Blocks.oreRuby;
import me.network.archadia.Blocks.oreSapphire;
import me.network.archadia.Blocks.blockSapphire;
import me.network.archadia.Blocks.oreOpal;
import me.network.archadia.Blocks.blockOpal;
import me.network.archadia.Blocks.oreTanzanite;
import me.network.archadia.Blocks.blockTanzanite;
import me.network.archadia.Blocks.blockAlexandrite;
import me.network.archadia.Blocks.oreAlexandrite;
import me.network.archadia.Blocks.blockAmber;
import me.network.archadia.Blocks.oreAmber;
import me.network.archadia.Blocks.blockAmethyst;
import me.network.archadia.Blocks.oreAmethyst;
import me.network.archadia.Blocks.blockAquamarine;
import me.network.archadia.Blocks.oreAquamarine;
import me.network.archadia.Blocks.blockBlackOpal;
import me.network.archadia.Blocks.oreBlackOpal;
import me.network.archadia.Blocks.blockCitrine;
import me.network.archadia.Blocks.oreCitrine;
import me.network.archadia.Blocks.blockGarnet;
import me.network.archadia.Blocks.oreGarnet;
import me.network.archadia.Blocks.blockJade;
import me.network.archadia.Blocks.oreJade;
import me.network.archadia.Blocks.blockJasper;
import me.network.archadia.Blocks.oreJasper;
import me.network.archadia.Blocks.blockMalachite;
import me.network.archadia.Blocks.oreMalachite;
import me.network.archadia.Blocks.blockOnyx;
import me.network.archadia.Blocks.oreOnyx;
import me.network.archadia.Blocks.blockPeridot;
import me.network.archadia.Blocks.orePeridot;
import me.network.archadia.Blocks.blockRoseQuartz;
import me.network.archadia.Blocks.oreRoseQuartz;
import me.network.archadia.Blocks.blockSpinel;
import me.network.archadia.Blocks.oreSpinel;
import me.network.archadia.Blocks.blockSugilite;
import me.network.archadia.Blocks.oreSugilite;
import me.network.archadia.Blocks.blockTopaz;
import me.network.archadia.Blocks.oreTopaz;
import me.network.archadia.Blocks.blockTourmaline;
import me.network.archadia.Blocks.oreTourmaline;
import me.network.archadia.Blocks.blockTurquoise;
import me.network.archadia.Blocks.oreTurquoise;
import me.network.archadia.Blocks.blockZircon;
import me.network.archadia.Blocks.oreZircon;
import me.network.archadia.CreativeTabs.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks extends Block {
    protected ModBlocks(Material material) {
        super(material);
    }
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
        blockRuby = new BlockRuby(Material.rock).setBlockName("BlockRuby").setBlockTextureName("arcmod:blockruby").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreRuby = new oreRuby(Material.rock).setBlockName("OreRuby").setBlockTextureName("arcmod:oreruby").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockRuby, blockRuby.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreRuby, oreRuby.getUnlocalizedName().substring(5));

        blockSapphire = new blockSapphire(Material.rock).setBlockName("BlockSapphire").setBlockTextureName("arcmod:blocksapphire").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreSapphire = new oreSapphire(Material.rock).setBlockName("OreSapphire").setBlockTextureName("arcmod:oresapphire").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockSapphire, blockSapphire.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreSapphire, oreSapphire.getUnlocalizedName().substring(5));


        blockOpal = new blockOpal(Material.rock).setBlockName("BlockOpal").setBlockTextureName("arcmod:blockopal").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreOpal = new oreOpal(Material.rock).setBlockName("OreOpal").setBlockTextureName("arcmod:oreopal").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockOpal, blockOpal.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreOpal, oreOpal.getUnlocalizedName().substring(5));

        blockTanzanite = new blockTanzanite(Material.rock).setBlockName("BlockTanzanite").setBlockTextureName("arcmod:blocktanzanite").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreTanzanite = new oreTanzanite(Material.rock).setBlockName("OreTanzanite").setBlockTextureName("arcmod:oretanzanite").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockTanzanite, blockTanzanite.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreTanzanite, oreTanzanite.getUnlocalizedName().substring(5));






        blockAlexandrite = new blockAlexandrite(Material.rock).setBlockName("BlockAlexandrite").setBlockTextureName("arcmod:blockalexandrite").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreAlexandrite = new oreAlexandrite(Material.rock).setBlockName("OreAlexandrite").setBlockTextureName("arcmod:orealexandrite").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockAlexandrite, blockAlexandrite.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreAlexandrite, oreAlexandrite.getUnlocalizedName().substring(5));

        blockAmber = new blockAmber(Material.rock).setBlockName("BlockAmber").setBlockTextureName("arcmod:blockamber").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreAmber = new oreAmber(Material.rock).setBlockName("OreAmber").setBlockTextureName("arcmod:oreamber").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockAmber, blockAmber.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreAmber, oreAmber.getUnlocalizedName().substring(5));

        blockAmethyst = new blockAmethyst(Material.rock).setBlockName("BlockAmethyst").setBlockTextureName("arcmod:blockamethyst").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreAmethyst = new oreAmethyst(Material.rock).setBlockName("OreAmethyst").setBlockTextureName("arcmod:oreamethyst").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockAmethyst, blockAmethyst.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreAmethyst, oreAmethyst.getUnlocalizedName().substring(5));

        blockAquamarine = new blockAquamarine(Material.rock).setBlockName("BlockAquamarine").setBlockTextureName("arcmod:blockaquamarine").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreAquamarine = new oreAquamarine(Material.rock).setBlockName("OreAquamarine").setBlockTextureName("arcmod:oreaquamarine").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockAquamarine, blockAquamarine.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreAquamarine, oreAquamarine.getUnlocalizedName().substring(5));

        blockBlackOpal = new blockBlackOpal(Material.rock).setBlockName("BlockBlackOpal").setBlockTextureName("arcmod:blockblackopal").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreBlackOpal = new oreBlackOpal(Material.rock).setBlockName("OreBlackOpal").setBlockTextureName("arcmod:oreblackopal").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockBlackOpal, blockBlackOpal.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreBlackOpal, oreBlackOpal.getUnlocalizedName().substring(5));

        blockCitrine = new blockCitrine(Material.rock).setBlockName("BlockCitrine").setBlockTextureName("arcmod:blockcitrine").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreCitrine = new oreCitrine(Material.rock).setBlockName("OreCitrine").setBlockTextureName("arcmod:orecitrine").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockCitrine, blockCitrine.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreCitrine, oreCitrine.getUnlocalizedName().substring(5));

        blockGarnet = new blockGarnet(Material.rock).setBlockName("BlockGarnet").setBlockTextureName("arcmod:blockgarnet").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreGarnet = new oreGarnet(Material.rock).setBlockName("OreGarnet").setBlockTextureName("arcmod:oregarnet").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockGarnet, blockGarnet.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreGarnet, oreGarnet.getUnlocalizedName().substring(5));

        blockJade = new blockJade(Material.rock).setBlockName("BlockJade").setBlockTextureName("arcmod:blockjade").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreJade = new oreJade(Material.rock).setBlockName("OreJade").setBlockTextureName("arcmod:orejade").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockJade, blockJade.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreJade, oreJade.getUnlocalizedName().substring(5));

        blockJasper = new blockJasper(Material.rock).setBlockName("BlockJasper").setBlockTextureName("arcmod:blockjasper").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreJasper = new oreJasper(Material.rock).setBlockName("OreJasper").setBlockTextureName("arcmod:orejasper").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockJasper, blockJasper.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreJasper, oreJasper.getUnlocalizedName().substring(5));

        blockMalachite = new blockMalachite(Material.rock).setBlockName("BlockMalachite").setBlockTextureName("arcmod:blockmalachite").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreMalachite = new oreMalachite(Material.rock).setBlockName("OreMalachite").setBlockTextureName("arcmod:oremalachite").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockMalachite, blockMalachite.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreMalachite, oreMalachite.getUnlocalizedName().substring(5));

        blockOnyx = new blockOnyx(Material.rock).setBlockName("BlockOnyx").setBlockTextureName("arcmod:blockonyx").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreOnyx = new oreOnyx(Material.rock).setBlockName("OreOnyx").setBlockTextureName("arcmod:oreonyx").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockOnyx, blockOnyx.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreOnyx, oreOnyx.getUnlocalizedName().substring(5));

        blockPeridot = new blockPeridot(Material.rock).setBlockName("BlockPeridot").setBlockTextureName("arcmod:blockperidot").setCreativeTab(CreativeTabs.tabArchadiaMod);
        orePeridot = new orePeridot(Material.rock).setBlockName("OrePeridot").setBlockTextureName("arcmod:oreperidot").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockPeridot, blockPeridot.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(orePeridot, orePeridot.getUnlocalizedName().substring(5));

        blockRoseQuartz = new blockRoseQuartz(Material.rock).setBlockName("BlockRoseQuartz").setBlockTextureName("arcmod:blockrosequartz").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreRoseQuartz = new oreRoseQuartz(Material.rock).setBlockName("OreRoseQuartz").setBlockTextureName("arcmod:orerosequartz").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockRoseQuartz, blockRoseQuartz.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreRoseQuartz, oreRoseQuartz.getUnlocalizedName().substring(5));

        blockSpinel = new blockSpinel(Material.rock).setBlockName("BlockSpinel").setBlockTextureName("arcmod:blockspinel").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreSpinel = new oreSpinel(Material.rock).setBlockName("OreSpinel").setBlockTextureName("arcmod:orespinel").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockSpinel, blockSpinel.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreSpinel, oreSpinel.getUnlocalizedName().substring(5));

        blockSugilite = new blockSugilite(Material.rock).setBlockName("BlockSugilite").setBlockTextureName("arcmod:blocksugilite").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreSugilite = new oreSugilite(Material.rock).setBlockName("OreSugilite").setBlockTextureName("arcmod:oresugilite").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockSugilite, blockSugilite.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreSugilite, oreSugilite.getUnlocalizedName().substring(5));

        blockTopaz = new blockTopaz(Material.rock).setBlockName("BlockTopaz").setBlockTextureName("arcmod:blocktopaz").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreTopaz = new oreTopaz(Material.rock).setBlockName("OreTopaz").setBlockTextureName("arcmod:oretopaz").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockTopaz, blockTopaz.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreTopaz, oreTopaz.getUnlocalizedName().substring(5));

        blockTourmaline = new blockTourmaline(Material.rock).setBlockName("BlockTourmaline").setBlockTextureName("arcmod:blocktourmaline").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreTourmaline = new oreTourmaline(Material.rock).setBlockName("OreTourmaline").setBlockTextureName("arcmod:oretourmaline").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockTourmaline, blockTourmaline.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreTourmaline, oreTourmaline.getUnlocalizedName().substring(5));

        blockTurquoise = new blockTurquoise(Material.rock).setBlockName("BlockTurquoise").setBlockTextureName("arcmod:blockturquoise").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreTurquoise = new oreTurquoise(Material.rock).setBlockName("OreTurquoise").setBlockTextureName("arcmod:oreturquoise").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockTurquoise, blockTurquoise.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreTurquoise, oreTurquoise.getUnlocalizedName().substring(5));

        blockZircon = new blockZircon(Material.rock).setBlockName("BlockZircon").setBlockTextureName("arcmod:blockzircon").setCreativeTab(CreativeTabs.tabArchadiaMod);
        oreZircon = new oreZircon(Material.rock).setBlockName("OreZircon").setBlockTextureName("arcmod:orezircon").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerBlock(blockZircon, blockZircon.getUnlocalizedName().substring(5));
        GameRegistry.registerBlock(oreZircon, oreZircon.getUnlocalizedName().substring(5));














    }
}
