package com.waylon.minceraft.init;

import com.waylon.minceraft.items.ItemAluminumIngot;
import com.waylon.minceraft.items.ItemCheese;
import com.waylon.minceraft.items.ItemCheeseCloth;
import com.waylon.minceraft.items.ItemChurro;
import com.waylon.minceraft.items.ItemDough;
import com.waylon.minceraft.items.ItemEmeraldAxe;
import com.waylon.minceraft.items.ItemEmeraldBoots;
import com.waylon.minceraft.items.ItemEmeraldChestplate;
import com.waylon.minceraft.items.ItemEmeraldHelmet;
import com.waylon.minceraft.items.ItemEmeraldHoe;
import com.waylon.minceraft.items.ItemEmeraldLeggings;
import com.waylon.minceraft.items.ItemEmeraldPickaxe;
import com.waylon.minceraft.items.ItemEmeraldRod;
import com.waylon.minceraft.items.ItemEmeraldShovel;
import com.waylon.minceraft.items.ItemEmeraldSword;
import com.waylon.minceraft.items.ItemFlour;
import com.waylon.minceraft.items.ItemGrilledCheeseSandwich;
import com.waylon.minceraft.items.ItemJalapeno;
import com.waylon.minceraft.items.ItemJalapenoSeed;
import com.waylon.minceraft.items.ItemNachoCheese;
import com.waylon.minceraft.items.ItemNachos;
import com.waylon.minceraft.items.ItemObsidianAxe;
import com.waylon.minceraft.items.ItemObsidianBoots;
import com.waylon.minceraft.items.ItemObsidianChestplate;
import com.waylon.minceraft.items.ItemObsidianHelmet;
import com.waylon.minceraft.items.ItemObsidianHoe;
import com.waylon.minceraft.items.ItemObsidianLeggings;
import com.waylon.minceraft.items.ItemObsidianPickaxe;
import com.waylon.minceraft.items.ItemObsidianRod;
import com.waylon.minceraft.items.ItemObsidianShovel;
import com.waylon.minceraft.items.ItemObsidianSword;
import com.waylon.minceraft.items.ItemQuesadilla;
import com.waylon.minceraft.items.ItemRollingPin;
import com.waylon.minceraft.items.ItemTortilla;
import com.waylon.minceraft.items.ItemTortillaChips;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor.EnumHingePosition;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	//Food and Food Items
	public static Item cheese;
	public static Item grilledcheese;
	public static Item churro;
	public static Item dough;
	public static Item nachos;
	public static Item nachocheese;
	public static Item quesadilla;
	public static Item rollingpin;
	public static Item tortilla;
	public static Item tortillachips;
	public static Item flour;
	//public static Item jalapeno;
	//public static Item jalapenoseed;
	//Obsidian Armor and Tools
	public static Item obsidianaxe;
	public static Item obsidianpickaxe;
	public static Item obsidiansword;
	public static Item obsidianshovel;
	public static Item obsidianrod;
	public static Item obsidianhoe;
	public static Item cheesecloth;
	public static Item obsidianhelmet;
	public static Item obsidianchestplate;
	public static Item obsidianleggings;
	public static Item obsidianboots;
	//Emerald Armor and Tools
	public static Item emeraldaxe;
	public static Item emeraldpickaxe;
	public static Item emeraldshovel;
	public static Item emeraldhoe;
	public static Item emeraldsword;
	public static Item emeraldrod;
	public static Item emeraldhelmet;
	public static Item emeraldchestplate;
	public static Item emeraldleggings;
	public static Item emeraldboots;
	//Ingots
	public static Item aluminumingot;
	
	//Custom Tool and Armor Materials
	public static final Item.ToolMaterial obsidianToolMaterial = EnumHelper.addToolMaterial("obsidianToolMaterial", 4, 1750, 12.0F, 4.0F, 15);
	public static final ArmorMaterial obsidianArmorMaterial = EnumHelper.addArmorMaterial("obsidianArmorMaterial", "minceraft:obsidianarmor", 40, new int[]{3, 8, 6, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8F);
	public static final Item.ToolMaterial emeraldToolMaterial = EnumHelper.addToolMaterial("emeraldToolMaterial", 4, 2000, 20.0F, 5.0F, 20);
	public static final ArmorMaterial emeraldArmorMaterial = EnumHelper.addArmorMaterial("emeraldArmorMaterial", "minceraft:emeraldarmor", 50, new int[]{3, 8, 6, 3}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8F);
	
	public static void init() {
		//Food and Food Items
		cheese = new ItemCheese();
		grilledcheese = new ItemGrilledCheeseSandwich();
		churro = new ItemChurro();
		cheesecloth = new ItemCheeseCloth();
		dough = new ItemDough();
		nachos = new ItemNachos();
		nachocheese = new ItemNachoCheese();
		quesadilla = new ItemQuesadilla();
		rollingpin = new ItemRollingPin();
		tortilla = new ItemTortilla();
		tortillachips = new ItemTortillaChips();
		flour = new ItemFlour();
		//jalapeno =new ItemJalapeno();
		//jalapenoseed = new ItemJalapenoSeed(ModCrops.jalapenoplant, Blocks.FARMLAND);
		//Obsidian Armor and Tools
		obsidianaxe = new ItemObsidianAxe(obsidianToolMaterial);
		obsidianpickaxe = new ItemObsidianPickaxe(obsidianToolMaterial);
		obsidiansword = new ItemObsidianSword(obsidianToolMaterial);
		obsidianshovel = new ItemObsidianShovel(obsidianToolMaterial);
		obsidianhoe = new ItemObsidianHoe(obsidianToolMaterial);
		obsidianrod = new ItemObsidianRod();
		obsidianhelmet = new ItemObsidianHelmet(obsidianArmorMaterial, 1, EntityEquipmentSlot.HEAD);
		obsidianchestplate = new ItemObsidianChestplate(obsidianArmorMaterial, 1, EntityEquipmentSlot.CHEST);
		obsidianleggings = new ItemObsidianLeggings(obsidianArmorMaterial, 2, EntityEquipmentSlot.LEGS);
		obsidianboots = new ItemObsidianBoots(obsidianArmorMaterial, 1, EntityEquipmentSlot.FEET);
		//Emerald Armor and Tools
		emeraldaxe = new ItemEmeraldAxe(emeraldToolMaterial);
		emeraldpickaxe = new ItemEmeraldPickaxe(emeraldToolMaterial);
		emeraldsword = new ItemEmeraldSword(emeraldToolMaterial);
		emeraldhoe = new ItemEmeraldHoe(emeraldToolMaterial);
		emeraldshovel = new ItemEmeraldShovel(emeraldToolMaterial);
		emeraldrod = new ItemEmeraldRod();
		emeraldhelmet = new ItemEmeraldHelmet(emeraldArmorMaterial, 1, EntityEquipmentSlot.HEAD);
		emeraldchestplate = new ItemEmeraldChestplate(emeraldArmorMaterial, 1, EntityEquipmentSlot.CHEST);
		emeraldleggings = new ItemEmeraldLeggings(emeraldArmorMaterial, 2, EntityEquipmentSlot.LEGS);
		emeraldboots = new ItemEmeraldBoots(emeraldArmorMaterial, 1, EntityEquipmentSlot.FEET);
		//Ingots
		aluminumingot = new ItemAluminumIngot();
	}

	public static void register() {
		//Food and Food Items
		GameRegistry.register(cheese);
		GameRegistry.register(grilledcheese);
		GameRegistry.register(churro);
		GameRegistry.register(dough);
		GameRegistry.register(nachos);
		GameRegistry.register(nachocheese);
		GameRegistry.register(quesadilla);
		GameRegistry.register(rollingpin);
		GameRegistry.register(tortilla);
		GameRegistry.register(tortillachips);
		GameRegistry.register(flour);
		GameRegistry.register(cheesecloth);
		//GameRegistry.register(jalapeno);
		//GameRegistry.register(jalapenoseed);
		//Obsidian Armor and Tools
		GameRegistry.register(obsidianaxe);
		GameRegistry.register(obsidianpickaxe);
		GameRegistry.register(obsidiansword);
		GameRegistry.register(obsidianshovel);
		GameRegistry.register(obsidianhoe);
		GameRegistry.register(obsidianrod);
		GameRegistry.register(obsidianhelmet);
		GameRegistry.register(obsidianchestplate);
		GameRegistry.register(obsidianleggings);
		GameRegistry.register(obsidianboots);
		//Emerald Armor and Tools
		GameRegistry.register(emeraldaxe);
		GameRegistry.register(emeraldpickaxe);
		GameRegistry.register(emeraldshovel);
		GameRegistry.register(emeraldsword);
		GameRegistry.register(emeraldhoe);
		GameRegistry.register(emeraldrod);
		GameRegistry.register(emeraldhelmet);
		GameRegistry.register(emeraldchestplate);
		GameRegistry.register(emeraldleggings);
		GameRegistry.register(emeraldboots);
		//Ingots
		GameRegistry.register(aluminumingot);
	}
	
	public static void registerRenders() {
		//Food and Food Items
		registerRender(cheese);
		registerRender(grilledcheese);
		registerRender(churro);
		registerRender(cheesecloth);
		registerRender(dough);
		registerRender(nachos);
		registerRender(nachocheese);
		registerRender(quesadilla);
		registerRender(rollingpin);
		registerRender(tortilla);
		registerRender(tortillachips);
		registerRender(flour);
		//registerRender(jalapeno);
		//registerRender(jalapenoseed);
		//Obsidian Armor and Tools
		registerRender(obsidianaxe);
		registerRender(obsidianpickaxe);
		registerRender(obsidiansword);
		registerRender(obsidianshovel);
		registerRender(obsidianhoe);
		registerRender(obsidianrod);
		registerRender(obsidianhelmet);
		registerRender(obsidianchestplate);
		registerRender(obsidianleggings);
		registerRender(obsidianboots);
		//Emerald Armor and Tools
		registerRender(emeraldaxe);
		registerRender(emeraldpickaxe);
		registerRender(emeraldshovel);
		registerRender(emeraldsword);
		registerRender(emeraldhoe);
		registerRender(emeraldrod);
		registerRender(emeraldhelmet);
		registerRender(emeraldchestplate);
		registerRender(emeraldleggings);
		registerRender(emeraldboots);
		//Ingots
		registerRender(aluminumingot);
	}

	private static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
