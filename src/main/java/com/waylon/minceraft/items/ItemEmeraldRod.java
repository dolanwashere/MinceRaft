package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.Item;

public class ItemEmeraldRod extends Item {

	public ItemEmeraldRod() {
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.EMERALDROD.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.EMERALDROD.getRegistryName());
	}
}
