package com.waylon.minceraft.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

public class DebugCommand implements ICommand {

	private final List aliases;
	
	public DebugCommand() {
		aliases = new ArrayList();
		aliases.add("mrd");
	}
	
	@Override
	public int compareTo(ICommand arg0) {
		return 0;
	}

	@Override
	public String getName() {
		return "mrdebug";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		//What appears after typer "/help mrdebug"
		return "/debug <feature>";
	}

	@Override
	public List<String> getAliases() {
		return this.aliases;
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		EntityPlayer player = (EntityPlayer)sender;
		if (args.length == 0) {
			// "/mrd"
			sender.sendMessage(new TextComponentString("Invalid argument")); 
            return; 
		} else if (args[0].equalsIgnoreCase("heal")) {
			// "/mrd heal"
			player.setHealth(20);
			sender.sendMessage(new TextComponentString("You're Healed!"));
			return;
		} else if (args[0].equalsIgnoreCase("hurt")) {
			// "/mrd hurt"
			player.setHealth(1);
			sender.sendMessage(new TextComponentString("You're Hurt!"));
			return;
		} else if (args[0].equalsIgnoreCase("full")) {
			// "/mrd full"
			player.getFoodStats().setFoodLevel(20);
			sender.sendMessage(new TextComponentString("You're Full!"));
			return;
		} else if (args[0].equalsIgnoreCase("hungry")) {
			player.getFoodStats().setFoodLevel(0);
			sender.sendMessage(new TextComponentString("You're Hungry!"));
			return;
		} else if (args[0].equalsIgnoreCase("obsidianset")) {
			player.setItemStackToSlot(EntityEquipmentSlot.HEAD, new ItemStack(ModItems.obsidianhelmet));
			player.setItemStackToSlot(EntityEquipmentSlot.CHEST, new ItemStack(ModItems.obsidianchestplate));
			player.setItemStackToSlot(EntityEquipmentSlot.LEGS, new ItemStack(ModItems.obsidianleggings));
			player.setItemStackToSlot(EntityEquipmentSlot.FEET, new ItemStack(ModItems.obsidianboots));
			player.inventory.setInventorySlotContents(0, new ItemStack(ModItems.obsidiansword));
			player.inventory.setInventorySlotContents(1, new ItemStack(ModItems.obsidianpickaxe));
			player.inventory.setInventorySlotContents(2, new ItemStack(ModItems.obsidianaxe));
			player.inventory.setInventorySlotContents(3, new ItemStack(ModItems.obsidianshovel));
			player.inventory.setInventorySlotContents(4, new ItemStack(ModItems.obsidianhoe));
			sender.sendMessage(new TextComponentString("Obsidian Set Equipped!"));
			return;
		} else if (args[0].equalsIgnoreCase("emeraldarmor")) {
			player.setItemStackToSlot(EntityEquipmentSlot.HEAD, new ItemStack(ModItems.emeraldhelmet));
			player.setItemStackToSlot(EntityEquipmentSlot.CHEST, new ItemStack(ModItems.emeraldchestplate));player.inventory.setInventorySlotContents(0, new ItemStack(ModItems.emeraldsword));
			player.inventory.setInventorySlotContents(1, new ItemStack(ModItems.emeraldpickaxe));
			player.inventory.setInventorySlotContents(2, new ItemStack(ModItems.emeraldaxe));
			player.inventory.setInventorySlotContents(3, new ItemStack(ModItems.emeraldshovel));
			player.inventory.setInventorySlotContents(4, new ItemStack(ModItems.emeraldhoe));
			player.setItemStackToSlot(EntityEquipmentSlot.LEGS, new ItemStack(ModItems.emeraldleggings));
			player.setItemStackToSlot(EntityEquipmentSlot.FEET, new ItemStack(ModItems.emeraldboots));
			sender.sendMessage(new TextComponentString("Emerald Set Equipped!"));
			return;
		}
	}

	@Override
	public boolean checkPermission(MinecraftServer server, ICommandSender sender) {
		return true;
	}

	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos targetPos) {
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int index) {
		return false;
	}

}
