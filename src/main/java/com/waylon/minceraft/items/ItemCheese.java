package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemCheese extends ItemFood {

	public ItemCheese() {
		super(2, 0.2F, false);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.CHEESE.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.CHEESE.getRegistryName());
	}

}
