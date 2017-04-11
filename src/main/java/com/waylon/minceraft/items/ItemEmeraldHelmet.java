package com.waylon.minceraft.items;

import com.waylon.minceraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemEmeraldHelmet extends ItemArmor {

	public ItemEmeraldHelmet(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setCreativeTab(CreativeTabs.COMBAT);
		setUnlocalizedName(Reference.minceraftItems.EMERALDHELMET.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.EMERALDHELMET.getRegistryName());
	}

}
