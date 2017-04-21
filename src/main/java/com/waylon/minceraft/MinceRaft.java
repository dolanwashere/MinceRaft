package com.waylon.minceraft;

import com.waylon.minceraft.init.DebugCommand;
import com.waylon.minceraft.init.ModBlocks;
import com.waylon.minceraft.init.ModCrafting;
import com.waylon.minceraft.init.ModCrops;
import com.waylon.minceraft.init.ModItems;
import com.waylon.minceraft.init.mobs.MobRegistry;
import com.waylon.minceraft.init.mobs.entities.EntityMummy;
import com.waylon.minceraft.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MCVERSION)
public class MinceRaft {

	@Instance 
	public static MinceRaft instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs CREATIVE_TAB = new ModTab();

	@EventHandler 
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("Pre Init");
		
		ModCrops.init();
		ModCrops.register();
		
		ModBlocks.init();
		ModBlocks.register();
		
		ModItems.init();
		ModItems.register();
		
		EntityRegistry.addSpawn(EntityMummy.class, 100, 1, 3, EnumCreatureType.MONSTER, Biome.REGISTRY.getObjectById(2));
	}
	
	@EventHandler 
	public void init(FMLInitializationEvent event) {
		System.out.println("Init");
		proxy.init();
		
		ModCrafting.register();
		MobRegistry.registerRender();
		MobRegistry.registerEntity();
	}
	
	@EventHandler 
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println("Post Init");
	}

	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)  {
		event.registerServerCommand(new DebugCommand());
	}
	
}
