package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;

public class ItemObsidianRod extends Item {
	public ItemObsidianRod() {
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.OBSIDIANROD.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.OBSIDIANROD.getRegistryName());
	}
}
