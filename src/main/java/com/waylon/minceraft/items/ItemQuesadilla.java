package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.ItemFood;

public class ItemQuesadilla extends ItemFood {

	public ItemQuesadilla() {
		super(10, 1.0F, false);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.QUESADILLA.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.QUESADILLA.getRegistryName());
	}

}
