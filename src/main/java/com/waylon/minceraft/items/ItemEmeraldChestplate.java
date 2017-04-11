package com.waylon.minceraft.items;

import com.waylon.minceraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemEmeraldChestplate extends ItemArmor {

	public ItemEmeraldChestplate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setCreativeTab(CreativeTabs.COMBAT);
		setUnlocalizedName(Reference.minceraftItems.EMERALDCHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.EMERALDCHESTPLATE.getRegistryName());	}

}
