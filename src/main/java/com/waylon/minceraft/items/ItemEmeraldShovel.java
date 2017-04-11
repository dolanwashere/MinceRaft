package com.waylon.minceraft.items;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.item.ItemSpade;

public class ItemEmeraldShovel extends ItemSpade {

	public ItemEmeraldShovel(ToolMaterial material) {
		super(material);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.OBSIDIANSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.OBSIDIANSHOVEL.getRegistryName());
	}

}
