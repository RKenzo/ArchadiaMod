package me.network.archadia;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModRecipes extends Item {
    public static void init() {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockOpal, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaOpal});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaOpal, 9), new Object[]{ModBlocks.blockOpal});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockRuby, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaRuby});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaRuby, 9), new Object[]{ModBlocks.blockRuby});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSapphire, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaSapphire});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaSapphire, 9), new Object[]{ModBlocks.blockSapphire});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockTanzanite, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaTanzanite});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaTanzanite, 9), new Object[]{ModBlocks.blockTanzanite});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockAlexandrite, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaAlexandrite});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaAlexandrite, 9), new Object[]{ModBlocks.blockAlexandrite});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockAmber, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaAmber});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaAmber, 9), new Object[]{ModBlocks.blockAmber});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockAmethyst, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaAmethyst});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaAmethyst, 9), new Object[]{ModBlocks.blockAmethyst});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockAquamarine, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaAquamarine});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaAquamarine, 9), new Object[]{ModBlocks.blockAquamarine});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockBlackOpal, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaBlackOpal});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaBlackOpal, 9), new Object[]{ModBlocks.blockBlackOpal});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockCitrine, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaCitrine});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaCitrine, 9), new Object[]{ModBlocks.blockCitrine});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockGarnet, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaGarnet});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaGarnet, 9), new Object[]{ModBlocks.blockGarnet});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockJade, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaJade});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaJade, 9), new Object[]{ModBlocks.blockJade});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockJasper, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaJasper});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaJasper, 9), new Object[]{ModBlocks.blockJasper});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockMalachite, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaMalachite});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaMalachite, 9), new Object[]{ModBlocks.blockMalachite});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockOnyx, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaOnyx});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaOnyx, 9), new Object[]{ModBlocks.blockOnyx});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockPeridot, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaPeridot});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaPeridot, 9), new Object[]{ModBlocks.blockPeridot});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockRoseQuartz, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaRoseQuartz});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaRoseQuartz, 9), new Object[]{ModBlocks.blockRoseQuartz});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSpinel, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaSpinel});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaSpinel, 9), new Object[]{ModBlocks.blockSpinel});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockSugilite, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaSugilite});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaSugilite, 9), new Object[]{ModBlocks.blockSugilite});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockTopaz, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaTopaz});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaTopaz, 9), new Object[]{ModBlocks.blockTopaz});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockTourmaline, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaTourmaline});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaTourmaline, 9), new Object[]{ModBlocks.blockTourmaline});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockTurquoise, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaTurquoise});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaTurquoise, 9), new Object[]{ModBlocks.blockTurquoise});

        GameRegistry.addRecipe(new ItemStack(ModBlocks.blockZircon, 1), new Object[]{"BBB", "BBB", "BBB", 'B', ModItems.gemaZircon});
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.gemaZircon, 9), new Object[]{ModBlocks.blockZircon});

    }
}
