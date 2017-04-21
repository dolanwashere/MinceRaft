package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.Item;

public class ItemAluminumIngot extends Item {
	
	public ItemAluminumIngot() {
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.ALUMINUMINGOT.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.ALUMINUMINGOT.getRegistryName());
	}
	
}
