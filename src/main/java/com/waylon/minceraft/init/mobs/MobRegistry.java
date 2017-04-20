package com.waylon.minceraft.init.mobs;

import com.waylon.minceraft.MinceRaft;
import com.waylon.minceraft.init.mobs.entities.EntityMummy;
import com.waylon.minceraft.init.mobs.models.ModelMummy;
import com.waylon.minceraft.init.mobs.renderers.RenderMummy;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class MobRegistry {

	public static void register() {
		
		MobRegistry.registerRender();
		MobRegistry.registerEntity();
		
	}
	
	public static void registerRender() {
		RenderingRegistry.registerEntityRenderingHandler(EntityMummy.class, new RenderMummy(Minecraft.getMinecraft().getRenderManager(), new ModelMummy(), 0.5F));
	}
	
	public static void registerEntity() {
		EntityRegistry.registerModEntity(RenderMummy.MUMMY_TEXTURE, EntityMummy.class, "mummy", 300, MinceRaft.instance, 64, 1, true, 0xC7BE57, 0x887F19);
		EntityRegistry.addSpawn(EntityMummy.class, 10, 1, 3, EnumCreatureType.MONSTER);
	}
	
}
