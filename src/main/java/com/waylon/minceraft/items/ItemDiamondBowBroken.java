package com.waylon.minceraft.items;

import com.waylon.minceraft.Reference;
import com.waylon.minceraft.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemSword;
import net.minecraft.world.storage.loot.functions.SetDamage;

public class ItemDiamondBowBroken extends ItemBow {
	public ItemDiamondBowBroken(ToolMaterial diamondbowToolMaterial) {
		super();
		setCreativeTab(CreativeTabs.COMBAT);
		//setUnlocalizedName(Reference.FirstItems.DIAMONDBOW.getUnlocalizedName());
		//setRegistryName(Reference.FirstItems.DIAMONDBOW.getRegistryName());

	}
}