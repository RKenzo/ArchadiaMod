package me.network.archadia;

import cpw.mods.fml.common.registry.*;
import me.network.archadia.Items.*;
import net.minecraft.block.*;
import net.minecraft.item.*;

public class ModRecipes extends Item {

    public static void init() {
        addBlockRecipe(ModItems.gemaOpal, ModBlocks.blockOpal);
        addBlockRecipe(ModItems.gemaRuby, ModBlocks.blockRuby);
        addBlockRecipe(ModItems.gemaSapphire, ModBlocks.blockSapphire);
        addBlockRecipe(ModItems.gemaTanzanite, ModBlocks.blockTanzanite);
        addBlockRecipe(ModItems.gemaAlexandrite, ModBlocks.blockAlexandrite);
        addBlockRecipe(ModItems.gemaAmber, ModBlocks.blockAmber);
        addBlockRecipe(ModItems.gemaAmethyst, ModBlocks.blockAmethyst);
        addBlockRecipe(ModItems.gemaAquamarine, ModBlocks.blockAquamarine);
        addBlockRecipe(ModItems.gemaBlackOpal, ModBlocks.blockBlackOpal);
        addBlockRecipe(ModItems.gemaCitrine, ModBlocks.blockCitrine);
        addBlockRecipe(ModItems.gemaGarnet, ModBlocks.blockGarnet);
        addBlockRecipe(ModItems.gemaJade, ModBlocks.blockJade);
        addBlockRecipe(ModItems.gemaJasper, ModBlocks.blockJasper);
        addBlockRecipe(ModItems.gemaMalachite, ModBlocks.blockMalachite);
        addBlockRecipe(ModItems.gemaOnyx, ModBlocks.blockOnyx);
        addBlockRecipe(ModItems.gemaPeridot, ModBlocks.blockPeridot);
        addBlockRecipe(ModItems.gemaRoseQuartz, ModBlocks.blockRoseQuartz);
        addBlockRecipe(ModItems.gemaSpinel, ModBlocks.blockSpinel);
        addBlockRecipe(ModItems.gemaSugilite, ModBlocks.blockSugilite);
        addBlockRecipe(ModItems.gemaTopaz, ModBlocks.blockTopaz);
        addBlockRecipe(ModItems.gemaTourmaline, ModBlocks.blockTourmaline);
        addBlockRecipe(ModItems.gemaTurquoise, ModBlocks.blockTurquoise);
        addBlockRecipe(ModItems.gemaZircon, ModBlocks.blockZircon);
    }

    private static void addBlockRecipe(ItemGem ItemGem, Block block) {
        GameRegistry.addRecipe(new ItemStack(block, 1), "BBB", "BBB", "BBB", 'B', new ItemStack(ItemGem, 1));
        GameRegistry.addShapelessRecipe(new ItemStack(ItemGem, 9), block);
    }
}