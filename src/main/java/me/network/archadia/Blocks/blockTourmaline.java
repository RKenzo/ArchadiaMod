package me.network.archadia.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class blockTourmaline extends Block {
    public blockTourmaline(Material material) {
        super(material);
        this.setHardness(4.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightOpacity(16);
    }
}