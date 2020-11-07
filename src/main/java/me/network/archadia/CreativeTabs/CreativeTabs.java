package me.network.archadia.CreativeTabs;

import me.network.archadia.ModItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CreativeTabs {
    public static net.minecraft.creativetab.CreativeTabs tabArchadiaMod = new net.minecraft.creativetab.CreativeTabs("tabArchadiaMod"){

        @Override
        public Item getTabIconItem(){
            return new ItemStack(ModItems.gemaRuby).getItem();
        }
    };
}
