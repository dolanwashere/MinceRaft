package com.waylon.minceraft.proxy;

import com.waylon.minceraft.init.ModBlocks;
import com.waylon.minceraft.init.ModItems;
import com.waylon.minceraft.init.mobs.MobRegistry;
import com.waylon.minceraft.init.worldgen.ModWorldGen;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ClientProxy implements CommonProxy {
	
	public void preInit() {
		ModBlocks.init();
		ModItems.init();
	}
	
	@Override
	public void init() {
		ModBlocks.registerRenders();
		ModItems.registerRenders();
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
	}

}
