package com.waylon.minceraft.blocks;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.Reference;
import com.waylon.minceraft.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockJalapeno extends BlockCrops {

	public BlockJalapeno() {
		setCreativeTab(MinceRaft.CREATIVE_TAB);
		setUnlocalizedName(Reference.minceraftBlocks.JALAPENO.getUnlocalizedName());
		setRegistryName(Reference.minceraftBlocks.JALAPENO.getRegistryName());	
	}
	
	@Override
	protected Item getSeed() {
		return ModItems.jalapeno;
	}
	
	@Override
	protected Item getCrop() {
		return ModItems.jalapeno;
	}
	
}
