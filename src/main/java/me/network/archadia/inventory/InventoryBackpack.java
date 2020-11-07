package me.network.archadia.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

public class InventoryBackpack implements IInventory {

    private static final String LIST_TAG = "ARCHADIAMOD_BACKPACK";

    public ItemStack[] itemStacks;
    public String uniqueId = "";

    public void writeToNBT(NBTTagCompound compound){
        NBTTagList list = new NBTTagList();

        for(byte b = 0; b < itemStacks.length; b++){
            if(itemStacks[b] != null && itemStacks[b].stackSize > 0){
                NBTTagCompound tag = new NBTTagCompound();
                list.appendTag(tag);
                tag.setByte("slot", b);
                itemStacks[b].writeToNBT(tag);

            }
        }

        compound.setTag(LIST_TAG, list);
        compound.setString("uniqueID", uniqueId);
        compound.setInteger("invSize", getSizeInventory());

    }
    @Override
    public int getSizeInventory() {
        return 0;
    }

    @Override
    public ItemStack getStackInSlot(int p_70301_1_) {
        return null;
    }

    @Override
    public ItemStack decrStackSize(int p_70298_1_, int p_70298_2_) {
        return null;
    }

    @Override
    public ItemStack getStackInSlotOnClosing(int p_70304_1_) {
        return null;
    }

    @Override
    public void setInventorySlotContents(int p_70299_1_, ItemStack p_70299_2_) {

    }

    @Override
    public String getInventoryName() {
        return null;
    }

    @Override
    public boolean hasCustomInventoryName() {
        return false;
    }

    @Override
    public int getInventoryStackLimit() {
        return 0;
    }

    @Override
    public void markDirty() {

    }

    @Override
    public boolean isUseableByPlayer(EntityPlayer p_70300_1_) {
        return false;
    }

    @Override
    public void openInventory() {

    }

    @Override
    public void closeInventory() {

    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return false;
    }
}
