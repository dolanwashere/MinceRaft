package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSpade;

public class ItemObsidianShovel extends ItemSpade {
	public ItemObsidianShovel(ToolMaterial material) {
		super(material);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.OBSIDIANSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.OBSIDIANSHOVEL.getRegistryName());
	}

}
