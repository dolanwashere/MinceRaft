package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.ItemHoe;

public class ItemEmeraldHoe extends ItemHoe {

	public ItemEmeraldHoe(ToolMaterial material) {
		super(material);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.EMERALDHOE.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.EMERALDHOE.getRegistryName());
	}

}
