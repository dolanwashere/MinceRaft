package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.ItemSword;

public class ItemEmeraldSword extends ItemSword {

	public ItemEmeraldSword(ToolMaterial material) {
		super(material);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.EMERALDSWORD.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.EMERALDSWORD.getRegistryName());
	}

}
