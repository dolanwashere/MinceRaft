package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCheeseCloth extends Item {
	public ItemCheeseCloth() {
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.CHEESECLOTH.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.CHEESECLOTH.getRegistryName());
	}
}
