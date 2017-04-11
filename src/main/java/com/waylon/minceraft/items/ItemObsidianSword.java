package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemObsidianSword extends ItemSword {
	public ItemObsidianSword(ToolMaterial material) {
		super(material);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.OBSIDIANSWORD.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.OBSIDIANSWORD.getRegistryName());
	}
}
