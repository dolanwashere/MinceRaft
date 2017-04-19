package com.waylon.minceraft.blocks;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockCheeseCube extends Block {
	public BlockCheeseCube() {
		super(Material.SPONGE);
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftBlocks.CHEESECUBE.getUnlocalizedName());
		setRegistryName(Reference.minceraftBlocks.CHEESECUBE.getRegistryName());
	}
}
