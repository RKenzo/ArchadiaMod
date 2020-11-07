package me.network.archadia.container;

import me.network.archadia.inventory.InventoryBackpack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ContainerBackpack extends Container {
    InventoryBackpack backpack;

    public boolean updateState;

    @Override
    public boolean canInteractWith(EntityPlayer p_75145_1_) {
        return false;
    }

    public void saveToNBT(ItemStack itemStack){
        if(!itemStack.hasTagCompound())
            itemStack.setTagCompound(new NBTTagCompound());

        backpack.writeToNBT(itemStack.getTagCompound());
    }

}
