package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.ItemFood;

public class ItemNachos extends ItemFood {

	public ItemNachos() {
		super(12, 1.2F, false);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.NACHOS.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.NACHOS.getRegistryName());
	}

}
