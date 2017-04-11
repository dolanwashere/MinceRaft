package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.Item;

public class ItemRollingPin extends Item {

	public ItemRollingPin() {
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.ROLLINGPIN.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.ROLLINGPIN.getRegistryName());
	}
	
}
