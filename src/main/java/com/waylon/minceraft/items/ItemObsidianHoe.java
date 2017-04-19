package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ItemObsidianHoe extends ItemHoe {
	public ItemObsidianHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.OBSIDIANHOE.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.OBSIDIANHOE.getRegistryName());
	}
}
