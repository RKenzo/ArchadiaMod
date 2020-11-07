package me.network.archadia;

import cpw.mods.fml.common.registry.GameRegistry;
import javafx.scene.shape.Arc;
import me.network.archadia.CreativeTabs.CreativeTabs;
import me.network.archadia.Items.gemaRuby;
import me.network.archadia.Items.gemaSapphire;
import me.network.archadia.Items.gemaOpal;
import me.network.archadia.Items.gemaTanzanite;
import me.network.archadia.Items.gemaAlexandrite;
import me.network.archadia.Items.gemaAmber;
import me.network.archadia.Items.gemaAmethyst;
import me.network.archadia.Items.gemaAquamarine;
import me.network.archadia.Items.gemaBlackOpal;
import me.network.archadia.Items.gemaCitrine;
import me.network.archadia.Items.gemaGarnet;
import me.network.archadia.Items.gemaJade;
import me.network.archadia.Items.gemaJasper;
import me.network.archadia.Items.gemaMalachite;
import me.network.archadia.Items.gemaOnyx;
import me.network.archadia.Items.gemaPeridot;
import me.network.archadia.Items.gemaRoseQuartz;
import me.network.archadia.Items.gemaSpinel;
import me.network.archadia.Items.gemaSugilite;
import me.network.archadia.Items.gemaTopaz;
import me.network.archadia.Items.gemaTourmaline;
import me.network.archadia.Items.gemaTurquoiuse;
import me.network.archadia.Items.gemaZircon;
import me.network.archadia.Items.portajoias;
import me.network.archadia.Items.goldKey;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems  extends Item {
    public static Item gemaRuby;
    public static Item gemaSapphire;
    public static Item gemaOpal;
    public static Item gemaTanzanite;
    public static Item gemaAlexandrite;
    public static Item gemaAmber;
    public static Item gemaAmethyst;
    public static Item gemaAquamarine;
    public static Item gemaBlackOpal;
    public static Item gemaCitrine;
    public static Item gemaGarnet;
    public static Item gemaJade;
    public static Item gemaJasper;
    public static Item gemaMalachite;
    public static Item gemaOnyx;
    public static Item gemaPeridot;
    public static Item gemaRoseQuartz;
    public static Item gemaSpinel;
    public static Item gemaSugilite;
    public static Item gemaTopaz;
    public static Item gemaTourmaline;
    public static Item gemaTurquoise;
    public static Item gemaZircon;
    public static Item portaJoias;
    public static Item goldKey;

    public static void init() {
        gemaRuby = new gemaRuby().setUnlocalizedName("GemaRuby").setTextureName("arcmod:gemaruby").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaRuby, gemaRuby.getUnlocalizedName().substring(5));

        gemaSapphire = new gemaSapphire().setUnlocalizedName("GemaSapphire").setTextureName("arcmod:gemasapphire").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaSapphire, gemaSapphire.getUnlocalizedName().substring(5));

        gemaOpal = new gemaOpal().setUnlocalizedName("GemaOpal").setTextureName("arcmod:gemaopal").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaOpal, gemaOpal.getUnlocalizedName().substring(5));

        gemaTanzanite = new gemaTanzanite().setUnlocalizedName("GemaTanzanite").setTextureName("arcmod:gematanzanite").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaTanzanite, gemaTanzanite.getUnlocalizedName().substring(5));

        gemaAlexandrite = new gemaAlexandrite().setUnlocalizedName("GemaAlexandrite").setTextureName("arcmod:gemaalexandrite").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaAlexandrite, gemaAlexandrite.getUnlocalizedName().substring(5));

        gemaAmber = new gemaAmber().setUnlocalizedName("GemaAmber").setTextureName("arcmod:gemaamber").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaAmber, gemaAmber.getUnlocalizedName().substring(5));

        gemaAmethyst = new gemaAmber().setUnlocalizedName("GemaAmethyst").setTextureName("arcmod:gemaamethyst").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaAmethyst, gemaAmethyst.getUnlocalizedName().substring(5));

        gemaAquamarine = new gemaAmber().setUnlocalizedName("GemaAquamarine").setTextureName("arcmod:gemaaquamarine").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaAquamarine, gemaAquamarine.getUnlocalizedName().substring(5));

        gemaBlackOpal = new gemaBlackOpal().setUnlocalizedName("GemaBlackOpal").setTextureName("arcmod:gemablackopal").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaBlackOpal, gemaBlackOpal.getUnlocalizedName().substring(5));

        gemaCitrine = new gemaCitrine().setUnlocalizedName("GemaCitrine").setTextureName("arcmod:gemacitrine").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaCitrine, gemaCitrine.getUnlocalizedName().substring(5));

        gemaGarnet = new gemaGarnet().setUnlocalizedName("GemaGarnet").setTextureName("arcmod:gemagarnet").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaGarnet, gemaGarnet.getUnlocalizedName().substring(5));

        gemaJade = new gemaAmber().setUnlocalizedName("GemaJade").setTextureName("arcmod:gemajade").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaJade, gemaJade.getUnlocalizedName().substring(5));

        gemaJasper = new gemaAmber().setUnlocalizedName("GemaJasper").setTextureName("arcmod:gemajasper").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaJasper, gemaJasper.getUnlocalizedName().substring(5));

        gemaMalachite = new gemaAmber().setUnlocalizedName("GemaMalachite").setTextureName("arcmod:gemamalachite").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaMalachite, gemaMalachite.getUnlocalizedName().substring(5));

        gemaOnyx = new gemaAmber().setUnlocalizedName("GemaOnyx").setTextureName("arcmod:gemaonyx").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaOnyx, gemaOnyx.getUnlocalizedName().substring(5));

        gemaPeridot = new gemaAmber().setUnlocalizedName("GemaPeridot").setTextureName("arcmod:gemaperidot").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaPeridot, gemaPeridot.getUnlocalizedName().substring(5));

        gemaRoseQuartz = new gemaAmber().setUnlocalizedName("GemaRoseQuartz").setTextureName("arcmod:gemarosequartz").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaRoseQuartz, gemaRoseQuartz.getUnlocalizedName().substring(5));

        gemaSpinel = new gemaAmber().setUnlocalizedName("GemaSpinel").setTextureName("arcmod:gemaspinel").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaSpinel, gemaSpinel.getUnlocalizedName().substring(5));

        gemaSugilite = new gemaAmber().setUnlocalizedName("GemaSugilite").setTextureName("arcmod:gemasugilite").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaSugilite, gemaSugilite.getUnlocalizedName().substring(5));

        gemaTopaz = new gemaAmber().setUnlocalizedName("GemaTopaz").setTextureName("arcmod:gematopaz").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaTopaz, gemaTopaz.getUnlocalizedName().substring(5));

        gemaTourmaline = new gemaAmber().setUnlocalizedName("GemaTourmaline").setTextureName("arcmod:gematourmaline").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaTourmaline, gemaTourmaline.getUnlocalizedName().substring(5));

        gemaTurquoise = new gemaAmber().setUnlocalizedName("GemaTurquoise").setTextureName("arcmod:gematurquoise").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaTurquoise, gemaTurquoise.getUnlocalizedName().substring(5));

        gemaZircon = new gemaAmber().setUnlocalizedName("GemaZircon").setTextureName("arcmod:gemazircon").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(gemaZircon, gemaZircon.getUnlocalizedName().substring(5));

        goldKey = new goldKey().setUnlocalizedName("GoldKey").setTextureName("arcmod:goldkey").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(goldKey, goldKey.getUnlocalizedName().substring(5));


        ItemArmor.ArmorMaterial backpackMaterial = EnumHelper.addArmorMaterial("backpackArmor", -1, new int[]{0, 0, 0, 0}, 0);
        int backpackRenderIndex = ArchadiaMod.proxy.addArmor("archamodia_backpack");

        portaJoias = new portajoias(backpackMaterial, backpackRenderIndex, 2).setUnlocalizedName("PortaJoias").setTextureName("arcmod:portajoias").setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(portaJoias, portaJoias.getUnlocalizedName().substring(5));




    }


    }
