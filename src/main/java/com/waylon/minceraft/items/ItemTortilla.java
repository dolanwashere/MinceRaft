package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.ItemFood;

public class ItemTortilla extends ItemFood {

	public ItemTortilla() {
		super(2, 0.2F, false);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.TORTILLA.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.TORTILLA.getRegistryName());
	}
	
}
