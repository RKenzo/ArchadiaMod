package me.network.archadia.inventory;

import me.network.archadia.*;
import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.nbt.*;

import java.util.*;

public class InventoryBackpack implements IInventory {
    
    private static final String LIST_TAG = "ARCHADIAMOD_BACKPACK";
    private static final int defaultSize = 27;
    
    public final ItemStack[] itemStacks;
    public final String uniqueId;
    private final ItemStack theBackpack;
    
    public InventoryBackpack(ItemStack theBackpack) {
        this(defaultSize, theBackpack);
    }
    
    public InventoryBackpack(int size, ItemStack theBackpack) {
        this.itemStacks = new ItemStack[size];
        this.theBackpack = theBackpack;
        for(int i = 0; i < size; i++) {
            itemStacks[i] = new ItemStack(ModItems.gemaRuby, i + 1);
        }
        this.uniqueId = UUID.randomUUID().toString();
    }
    
    public InventoryBackpack(ItemStack[] itemStacks, String uniqueId, ItemStack theBackpack) {
        this.itemStacks = itemStacks;
        this.uniqueId = uniqueId;
        this.theBackpack = theBackpack;
    }
    
    
    public static InventoryBackpack readFromStack(ItemStack stack) {
        if(!stack.hasTagCompound()) {
            final InventoryBackpack inventoryBackpack = new InventoryBackpack(stack);
            final NBTTagCompound nbtTagCompound = new NBTTagCompound();
            inventoryBackpack.writeToNBT(nbtTagCompound);
            stack.setTagCompound(nbtTagCompound);
            return inventoryBackpack;
        }
        
        final NBTTagCompound tagCompound = stack.getTagCompound();
        final int invSize = tagCompound.getInteger("invSize");
        final NBTTagList tagList = tagCompound.getTagList(LIST_TAG, 10);
        final ItemStack[] itemStacks = new ItemStack[invSize];
        for(int i = 0; i < invSize; i++) {
            final NBTTagCompound compoundTagAt = tagList.getCompoundTagAt(i);
            final byte slot = compoundTagAt.getByte("slot");
            itemStacks[slot] = ItemStack.loadItemStackFromNBT(compoundTagAt);
        }
        final String uniqueId = tagCompound.getString("uniqueID");
        return new InventoryBackpack(itemStacks, uniqueId, stack);
    }
    
    public void writeToNBT(NBTTagCompound compound) {
        NBTTagList list = new NBTTagList();
        
        for(byte b = 0; b < itemStacks.length; b++) {
            if(itemStacks[b] != null && itemStacks[b].stackSize > 0) {
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
        return itemStacks.length;
    }
    
    @Override
    public ItemStack getStackInSlot(int index) {
        return itemStacks[index];
    }
    
    @Override
    public ItemStack decrStackSize(int index, int amount) {
        final ItemStack stackInSlot = getStackInSlot(index);
        final ItemStack returnedStack;
        if(stackInSlot.stackSize > amount) {
            returnedStack = stackInSlot.splitStack(amount);
        } else {
            setInventorySlotContents(index, null);
            returnedStack = stackInSlot;
        }
        write();
        return returnedStack;
    }
    
    @Override
    public ItemStack getStackInSlotOnClosing(int index) {
        return itemStacks[index];
    }
    
    @Override
    public void setInventorySlotContents(int index, ItemStack stack) {
        itemStacks[index] = stack;
        write();
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
        return 64;
    }
    
    @Override
    public void markDirty() {
        write();
    }
    
    private void write() {
        writeToNBT(theBackpack.getTagCompound());
    }
    
    @Override
    public boolean isUseableByPlayer(EntityPlayer player) {
        return true;
    }
    
    @Override
    public void openInventory() {
    
    }
    
    @Override
    public void closeInventory() {
    
    }
    
    @Override
    public boolean isItemValidForSlot(int index, ItemStack stack) {
        return true;
    }
}
