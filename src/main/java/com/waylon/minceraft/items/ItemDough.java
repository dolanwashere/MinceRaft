package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.Item;

public class ItemDough extends Item {
	
	public ItemDough() {
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.DOUGH.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.DOUGH.getRegistryName());
	}
	
}
