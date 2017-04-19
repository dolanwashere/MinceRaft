package com.waylon.minceraft;

import com.waylon.minceraft.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ModTab extends CreativeTabs {

	public ModTab() {
		super("tabMod");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.cheese);
	}

}
