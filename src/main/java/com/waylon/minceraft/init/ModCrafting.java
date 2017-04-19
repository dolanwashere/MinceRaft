package com.waylon.minceraft.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

public class ModCrafting {

	public static void register() {
		//Blocks
		GameRegistry.addShapedRecipe(new ItemStack(ModBlocks.cheesecube), "CCC","CCC","CCC", 'C', ModItems.cheese);
		// Obsidian Armor and Tools
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianpickaxe), "OOO", " R ", " R ", 'O', Blocks.OBSIDIAN, 'R', ModItems.obsidianrod);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianaxe), "OO ", "OR ", " R ", 'O', Blocks.OBSIDIAN, 'R', ModItems.obsidianrod);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidiansword), " O ", " O ", " R ", 'O', Blocks.OBSIDIAN, 'R', ModItems.obsidianrod);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianshovel), " O ", " R ", " R ", 'O', Blocks.OBSIDIAN, 'R', ModItems.obsidianrod);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianhoe), "OO ", " R ", " R ", 'O', Blocks.OBSIDIAN, 'R', ModItems.obsidianrod);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianrod), " R", " R", 'R', Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianhelmet), "OOO", "O O", "   ", 'O', Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianchestplate), "O O", "OOO","OOO", 'O', Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianleggings), "OOO", "O O", "O O", 'O', Blocks.OBSIDIAN);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.obsidianboots), "   ", "O O", "O O", 'O', Blocks.OBSIDIAN);
		//Emerald Armor and Tools
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldpickaxe), "OOO", " R ", " R ", 'O', Items.EMERALD, 'R', ModItems.emeraldrod);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldaxe), "OO ", "OR ", " R ", 'O', Items.EMERALD, 'R', ModItems.emeraldrod);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldsword), " O ", " O ", " R ", 'O', Items.EMERALD, 'R', ModItems.emeraldrod);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldshovel), " O ", " R ", " R ", 'O', Items.EMERALD, 'R', ModItems.emeraldrod);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldhoe), "OO ", " R ", " R ", 'O', Items.EMERALD, 'R', ModItems.emeraldrod);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldrod), " R", " R", 'R', Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldhelmet), "OOO", "O O", "   ", 'O', Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldchestplate), "O O", "OOO","OOO", 'O', Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldleggings), "OOO", "O O", "O O", 'O', Items.EMERALD);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.emeraldboots), "   ", "O O", "O O", 'O', Items.EMERALD);
		//Food
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.cheese, 3), Items.MILK_BUCKET, ModItems.cheesecloth);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.churro), "   ", "SSS", "BBB", 'S', Items.SUGAR, 'B', Items.BREAD);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.dough), ModItems.flour, Items.WATER_BUCKET);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.nachos), ModItems.tortillachips, ModItems.nachocheese, ModItems.jalapeno);
		GameRegistry.addSmelting(ModItems.cheese, new ItemStack(ModItems.nachocheese), 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.quesadilla), new ItemStack(ModItems.tortilla, 2), ModItems.cheese);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tortilla), ModItems.dough, ModItems.rollingpin);
		GameRegistry.addSmelting(ModItems.tortilla, new ItemStack(ModItems.tortillachips,3), 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.flour), Items.WHEAT, Items.SHEARS);
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.grilledcheese), "BBB", "CCC", "BBB", 'B', Items.BREAD, 'C', ModItems.cheese);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.jalapenoseed, 3), ModItems.jalapeno);
		//Food Items
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.cheesecloth, 3), "SSS", "SSS", "SSS", 'S', Items.STRING);
		GameRegistry.addRecipe(new ItemStack(ModItems.rollingpin), "SSS", 'S', Items.STICK);
		//Misc. Items
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.dick), " P "," W ","WWW", 'P', new ItemStack(Items.DYE, 1, 9), 'W', new ItemStack(Items.DYE, 1, 15));

	}
	
}