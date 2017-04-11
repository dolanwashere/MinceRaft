package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.ItemFood;

public class ItemTortillaChips extends ItemFood {

	public ItemTortillaChips() {
		super(2, 0.2F, false);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.TORTILLACHIPS.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.TORTILLACHIPS.getRegistryName());
	}

}
