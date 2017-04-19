package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.ItemFood;

public class ItemJalapeno extends ItemFood {

	public ItemJalapeno() {
		super(2, 0.2F, false);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.JALAPENO.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.JALAPENO.getRegistryName());
		
	}

}
