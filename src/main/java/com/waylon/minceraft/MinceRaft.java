package com.waylon.minceraft;

import com.waylon.minceraft.init.ModBlocks;
import com.waylon.minceraft.init.ModCrafting;
import com.waylon.minceraft.init.ModItems;
import com.waylon.minceraft.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MCVERSION)
public class MinceRaft {

	@Instance 
	public static MinceRaft instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final CreativeTabs CREATIVE_TAB = new ModTab();

	@EventHandler 
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("Pre Init");
		
		ModItems.init();
		ModItems.register();
		
		ModBlocks.init();
		ModBlocks.register();
	}
	
	@EventHandler 
	public void init(FMLInitializationEvent event)
	{
		System.out.println("Init");
		proxy.init();
		
		ModCrafting.register();
	}
	
	@EventHandler 
	public void postInit(FMLPostInitializationEvent event)
	{
		System.out.println("Post Init");
	}
}
