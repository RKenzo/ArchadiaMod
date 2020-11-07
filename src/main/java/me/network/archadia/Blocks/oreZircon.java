package me.network.archadia.Blocks;

import me.network.archadia.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class oreZircon extends Block {
    public oreZircon(Material material) {
        super(material);
        this.setHardness(4.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightOpacity(16);
    }
    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return ModItems.gemaZircon;
    }

    @Override
    public int quantityDropped(Random rand) {
        return 1;
    }

    public int quantityDroppedWithBonus(int fortune, Random random) {
        if (fortune > 0) {
            int j = random.nextInt(fortune + 2) - 1;

            if (j < 0) {
                j = 0;
            }

            return quantityDropped(random) * (j + 1);
        } else {
            return quantityDropped(random);
        }
    }
}
