package me.network.archadia.Items;

import me.network.archadia.container.ContainerBackpack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class portajoias extends ItemArmor {

    public portajoias(ArmorMaterial armorMaterial, int renderIndex, int armorType){
        super(armorMaterial, renderIndex, armorType);
        this.setMaxStackSize(1);
        //this.setHastSubtypes(true);
    }
    public String getAmorTexture(ItemStack itemStack, Entity entity, int slot, String type){
        return null;
    }

    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack){
        if(world.isRemote)
            return;

        if(player.openContainer == null || player.openContainer instanceof ContainerPlayer)
            return;

        if(!(itemStack.getItem() instanceof portajoias))
            return;

        if(ContainerBackpack.class.isAssignableFrom(player.openContainer.getClass())){
            ContainerBackpack backpack = (ContainerBackpack) player.openContainer;

            if(backpack.updateState){
                backpack.saveToNBT(itemStack);
                backpack.updateState = false;
            }
        }
    }



}
