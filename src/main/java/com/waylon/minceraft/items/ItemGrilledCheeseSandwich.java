package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemGrilledCheeseSandwich extends ItemFood {

	public ItemGrilledCheeseSandwich() {
		super(10, 1F, false);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.GRILLEDCHEESE.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.GRILLEDCHEESE.getRegistryName());
	}	
}
