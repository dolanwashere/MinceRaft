package com.waylon.minceraft.blocks.crops;

import com.waylon.minceraft.Reference;
import com.waylon.minceraft.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class JalapenoPlant extends BlockCrops {

	private static final AxisAlignedBB[] JALAPENOPLANT = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.625D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.75D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D)};
	
	public JalapenoPlant() {
		setUnlocalizedName(Reference.minceraftCrops.JALAPENOPLANT.getUnlocalizedName());
		setRegistryName(Reference.minceraftCrops.JALAPENOPLANT.getRegistryName());
	}
	
	@Override
	public Item getSeed() {
		return ModItems.jalapenoseed;
	}
	
	@Override
	public Item getCrop() {
		return ModItems.jalapeno;
	}
	
	public AxisAlignedBB getBoundBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return JALAPENOPLANT[(Integer)state.getValue(this.getAgeProperty()).intValue()] ;
	}
	
}
