package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.Item;

public class ItemEmeraldRod extends Item {

	public ItemEmeraldRod() {
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.OBSIDIANROD.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.OBSIDIANROD.getRegistryName());
	}
}
