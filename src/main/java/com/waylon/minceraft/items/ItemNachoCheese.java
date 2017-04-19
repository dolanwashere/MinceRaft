package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.Item;

public class ItemNachoCheese extends Item {

	public ItemNachoCheese() {
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.NACHOCHEESE.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.NACHOCHEESE.getRegistryName());
	}
		
}
