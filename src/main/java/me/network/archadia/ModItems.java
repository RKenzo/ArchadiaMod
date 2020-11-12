package me.network.archadia;

import cpw.mods.fml.common.registry.*;
import me.network.archadia.CreativeTabs.*;
import me.network.archadia.Items.*;
import net.minecraft.item.*;
import net.minecraft.util.*;

public class ModItems extends Item {

    public static ItemGem gemaRuby;
    public static ItemGem gemaSapphire;
    public static ItemGem gemaOpal;
    public static ItemGem gemaTanzanite;
    public static ItemGem gemaAlexandrite;
    public static ItemGem gemaAmber;
    public static ItemGem gemaAmethyst;
    public static ItemGem gemaAquamarine;
    public static ItemGem gemaBlackOpal;
    public static ItemGem gemaCitrine;
    public static ItemGem gemaGarnet;
    public static ItemGem gemaJade;
    public static ItemGem gemaJasper;
    public static ItemGem gemaMalachite;
    public static ItemGem gemaOnyx;
    public static ItemGem gemaPeridot;
    public static ItemGem gemaRoseQuartz;
    public static ItemGem gemaSpinel;
    public static ItemGem gemaSugilite;
    public static ItemGem gemaTopaz;
    public static ItemGem gemaTourmaline;
    public static ItemGem gemaTurquoise;
    public static ItemGem gemaZircon;

    public static Item goldKey;
    public static Item backPack;

    public static void init() {

        initGems();

        goldKey = new ItemGoldKey().setUnlocalizedName("GoldKey")
                .setTextureName("arcmod:goldkey")
                .setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(goldKey, goldKey.getUnlocalizedName().substring(5));

        backPack = new ItemBackpack().setUnlocalizedName("backpack")
                .setTextureName("arcmod:backpack")
                .setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(backPack, "backpack");

    }

    private static void initGems() {
        gemaRuby = createAndRegisterGem("Ruby");
        gemaSapphire = createAndRegisterGem("Sapphire");
        gemaOpal = createAndRegisterGem("Opal");
        gemaTanzanite = createAndRegisterGem("Tanzanite");
        gemaAlexandrite = createAndRegisterGem("Alexandrite");
        gemaAmber = createAndRegisterGem("Amber");
        gemaAmethyst = createAndRegisterGem("Amethyst");
        gemaAquamarine = createAndRegisterGem("Aquamarine");
        gemaBlackOpal = createAndRegisterGem("BlackOpal");
        gemaCitrine = createAndRegisterGem("Citrine");
        gemaGarnet = createAndRegisterGem("Garnet");
        gemaJade = createAndRegisterGem("Jade");
        gemaJasper = createAndRegisterGem("Jasper");
        gemaMalachite = createAndRegisterGem("Malachite");
        gemaOnyx = createAndRegisterGem("Onyx");
        gemaPeridot = createAndRegisterGem("Peridot");
        gemaRoseQuartz = createAndRegisterGem("RoseQuartz");
        gemaSpinel = createAndRegisterGem("Spinel");
        gemaSugilite = createAndRegisterGem("Sugilite");
        gemaTopaz = createAndRegisterGem("Topaz");
        gemaTourmaline = createAndRegisterGem("Tourmaline");
        gemaTurquoise = createAndRegisterGem("Turquoise");
        gemaZircon = createAndRegisterGem("Zircon");
    }

    private static ItemGem createAndRegisterGem(String name) {
        final ResourceLocation texturePath = new ResourceLocation(ArchadiaMod.MODID, "gem/" + name.toLowerCase());
        final ItemGem ItemGem = new ItemGem("Gema" + name, texturePath);
        ItemGem.setCreativeTab(CreativeTabs.tabArchadiaMod);
        GameRegistry.registerItem(ItemGem, "gem_" + name.toLowerCase(), ArchadiaMod.MODID);
        return ItemGem;
    }
}