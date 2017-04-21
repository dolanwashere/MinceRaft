package com.waylon.minceraft.blocks;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;

public class BlockAluminumOre extends BlockOre {

	public BlockAluminumOre() {
		super();
		setHarvestLevel("pickaxe", 2);
		setHardness(2F);
		setResistance(1F);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftBlocks.ALUMINUMORE.getUnlocalizedName());
		setRegistryName(Reference.minceraftBlocks.ALUMINUMORE.getRegistryName());
	}
	
}
