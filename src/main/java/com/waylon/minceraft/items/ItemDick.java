package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemDick extends Item {
	public ItemDick() {
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.DICK.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.DICK.getRegistryName());
	}
}
