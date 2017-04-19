package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;
import com.waylon.minceraft.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemEmeraldChestplate extends ItemArmor {

	public ItemEmeraldChestplate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.EMERALDCHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.EMERALDCHESTPLATE.getRegistryName());	
		}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ModItems.emeraldhelmet
		        && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ModItems.emeraldchestplate
		        && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ModItems.emeraldleggings
		        && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ModItems.emeraldboots) 
		{
		        this.effectPlayer(player, MobEffects.REGENERATION, 1);
		}
		
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == ModItems.emeraldhelmet
		        && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == ModItems.emeraldchestplate
		        && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == ModItems.emeraldleggings
		        && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == ModItems.emeraldboots) 
		{
		        this.effectPlayer(player, MobEffects.SPEED, 1);
		}
		
	} 

	private void effectPlayer(EntityPlayer player, Potion potion, int amplifier) {
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(potion, 159, amplifier, true, true));
	}


}
