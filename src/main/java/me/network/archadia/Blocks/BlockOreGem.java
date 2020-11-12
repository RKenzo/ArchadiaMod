package me.network.archadia.Blocks;

import me.network.archadia.Items.*;
import net.minecraft.block.*;
import net.minecraft.block.material.*;
import net.minecraft.item.*;
import net.minecraft.util.*;

import java.util.*;

public class BlockOreGem extends Block {

    private final ItemGem droppedGem;

    public BlockOreGem(ItemGem droppedGem, String unlocalizedName, ResourceLocation textureLocation) {
        super(Material.rock);
        this.droppedGem = droppedGem;
        this.setHardness(4.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightOpacity(16);

        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(textureLocation.toString());
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return droppedGem;
    }

    @Override
    public int quantityDropped(Random rand) {
        return 1;
    }

    public int quantityDroppedWithBonus(int fortune, Random random) {
        if(fortune > 0) {
            int j = random.nextInt(fortune + 2) - 1;

            if(j < 0) {
                j = 0;
            }

            return quantityDropped(random) * (j + 1);
        } else {
            return quantityDropped(random);
        }
    }
}