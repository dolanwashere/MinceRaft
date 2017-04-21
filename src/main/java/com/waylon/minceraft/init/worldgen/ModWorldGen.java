package com.waylon.minceraft.init.worldgen;

import java.util.Random;

import com.waylon.minceraft.init.ModBlocks;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator {
	
	//Overworld Ores
	private WorldGenerator ALUMINUMORE;
	
	public ModWorldGen() {
		this.ALUMINUMORE = new ModWorldGenMineable(ModBlocks.aluminumore.getDefaultState(), 5);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		
		switch(world.provider.getDimension()) {
		case 0:  //overworld
			this.runGenerator(this.ALUMINUMORE, world, random, chunkX, chunkZ, 85, 0, 60);
			break;
		
		case -1:  //nether
			
			break;
			
		case 1: //end
			
			break;
		
		}
		
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunkx, int chunkz, int chanceToSpawn, int minHeight, int maxHeight) {
		
		if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight) {
			throw new IllegalArgumentException("Min or Max Height Out Of Bounds");
		}
		
		int heightDiff = maxHeight - minHeight +1;
		
		for (int i = 0; i < chanceToSpawn; i ++) {
			int x = chunkx * 16 + random.nextInt(16);
			int y = minHeight + random.nextInt(heightDiff);
			int z = chunkz * 16 + random.nextInt(16);
			generator.generate(world, random, new BlockPos(x, y, z));
		}
		
	}
	
}
