package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.ItemPickaxe;

public class ItemEmeraldPickaxe extends ItemPickaxe {

	public ItemEmeraldPickaxe(ToolMaterial material) {
		super(material);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.OBSIDIANPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.OBSIDIANPICKAXE.getRegistryName());
	}

}
