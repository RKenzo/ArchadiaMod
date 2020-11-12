package me.network.archadia.container;

import me.network.archadia.Items.*;
import me.network.archadia.inventory.*;
import net.minecraft.entity.player.*;
import net.minecraft.inventory.*;
import net.minecraft.item.*;
import net.minecraft.nbt.*;

public class ContainerBackpack extends Container {

    private static final int heightPerSlot = 16;
    private static final int widthPerSlot = 16;
    private static final int slotsPerRow = 9;

    private static final int slotOffsetX = 3;
    private static final int slotOffsetY = 3;

    private final InventoryBackpack backpack;

    public boolean updateState;

    public ContainerBackpack(InventoryBackpack backpack) {
        this.backpack = backpack;

        for(int slotId = 0; slotId < backpack.getSizeInventory(); slotId++) {
            final int x = (slotId % slotsPerRow) * (widthPerSlot + slotOffsetX);
            final int y = (slotId / slotsPerRow) * (heightPerSlot + slotOffsetY);
            addSlotToContainer(new Slot(backpack, slotId, x, y));
        }
    }

    public static ContainerBackpack readFromNBT(ItemStack stack) {
        if(stack == null) {
            return null;
        }

        if(!(stack.getItem() instanceof ItemBackpack)) {
            return null;
        }
        final InventoryBackpack backpack = InventoryBackpack.readFromStack(stack);
        return new ContainerBackpack(backpack);
    }

    @Override
    public boolean canInteractWith(EntityPlayer p_75145_1_) {
        return true;
    }

    public void saveToNBT(ItemStack itemStack) {
        if(!itemStack.hasTagCompound())
            itemStack.setTagCompound(new NBTTagCompound());

        backpack.writeToNBT(itemStack.getTagCompound());
    }

    @Override
    public ItemStack transferStackInSlot(EntityPlayer p_82846_1_, int p_82846_2_) {
        return super.transferStackInSlot(p_82846_1_, p_82846_2_);
    }

    @Override
    public void putStackInSlot(int p_75141_1_, ItemStack p_75141_2_) {
        super.putStackInSlot(p_75141_1_, p_75141_2_);
    }

    @Override
    public void putStacksInSlots(ItemStack[] p_75131_1_) {
        super.putStacksInSlots(p_75131_1_);
    }

    @Override
    public ItemStack slotClick(int p_75144_1_, int p_75144_2_, int p_75144_3_, EntityPlayer p_75144_4_) {
        return super.slotClick(p_75144_1_, p_75144_2_, p_75144_3_, p_75144_4_);
    }

}