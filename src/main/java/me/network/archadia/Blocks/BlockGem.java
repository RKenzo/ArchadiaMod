package me.network.archadia.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.*;

public class BlockGem extends Block {
    public BlockGem(String unlocalizedName, ResourceLocation textureLocation) {
        super(Material.rock);
        this.setHardness(4.0F);
        this.setHarvestLevel("pickaxe", 2);
        this.setLightOpacity(16);
        this.setBlockName(unlocalizedName);
        this.setBlockTextureName(textureLocation.toString());
        
    }
}
