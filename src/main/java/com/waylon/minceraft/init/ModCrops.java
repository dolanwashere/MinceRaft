package com.waylon.minceraft.init;

import com.waylon.minceraft.Reference;
import com.waylon.minceraft.blocks.crops.JalapenoPlant;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrops {

	public static Block jalapenoplant;

	public static void init() {
		jalapenoplant = new JalapenoPlant();
	}
	
	public static void register() {
		registerBlock(jalapenoplant);
	}

	private static void registerBlock(Block block) {
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
	}
	
	public static void registerRenders() {
		registerRender(jalapenoplant);
	}
	
	private static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0 , new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
