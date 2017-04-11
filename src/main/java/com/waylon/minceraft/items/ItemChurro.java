package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemChurro extends ItemFood {
	
	public ItemChurro() {
		super(7, 0.7F, false);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.CHURRO.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.CHURRO.getRegistryName());
	}
}
