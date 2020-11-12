package me.network.archadia.Items;

import net.minecraft.item.Item;
import net.minecraft.util.*;

public class ItemGem extends Item {
    public ItemGem(String unlocalizedName, ResourceLocation texturePath) {
        setUnlocalizedName(unlocalizedName);
        setTextureName(texturePath.toString());
    }
}