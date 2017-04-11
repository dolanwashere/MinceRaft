package com.waylon.minceraft.proxy;

import com.waylon.minceraft.init.ModBlocks;
import com.waylon.minceraft.init.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy implements CommonProxy {
	 @Override
	public void init() {
		ModItems.registerRenders();
		ModBlocks.registerRenders();
	}

}
