package com.waylon.minceraft.items;

import java.util.Set;

import com.google.common.collect.Sets;
import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemTool;

public class ItemObsidianAxe extends ItemTool {

	private static final Set<Block> EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN, Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});

	public ItemObsidianAxe(ToolMaterial material) {
		super(material, EFFECTIVE_ON);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftItems.OBSIDIANAXE.getUnlocalizedName());
		setRegistryName(Reference.minceraftItems.OBSIDIANAXE.getRegistryName());
	}
}
