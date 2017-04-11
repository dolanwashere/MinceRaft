package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.Item;

public class ItemFlour extends Item {

	public ItemFlour() {
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.FLOUR.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.FLOUR.getRegistryName());
	}
	
}
