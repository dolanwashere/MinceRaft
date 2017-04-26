package com.waylon.minceraft;

public class Reference {
	public static final String MOD_ID = "minceraft";
	public static final String NAME = "MinceRaft";
	public static final String VERSION = "1.0";
	public static final String MCVERSION = "[1.11.2]"; 
	
	public static final String CLIENT_PROXY_CLASS = "com.waylon.minceraft.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.waylon.minceraft.proxy.ServerProxy";
	
	public static enum minceraftItems {
		//Food and Food Items
		CHEESE("cheese","ItemCheese"),
		GRILLEDCHEESE("grilledcheese", "ItemGrilledCheeseSandwich"),
		CHURRO("churro", "ItemChurro"),
		NACHOS("nachos", "ItemNachos"),
		NACHOCHEESE("nachocheese", "ItemNachoCheese"),
		TORTILLA("tortilla", "ItemTortilla"),
		QUESADILLA("quesadilla", "ItemQuesadilla"),
		ROLLINGPIN("rollingpin", "ItemRollingPin"),
		DOUGH("dough", "ItemDough"),
		TORTILLACHIPS("tortillachips", "ItemTortillaChips"),
		FLOUR("flour", "ItemFlour"),
		CHEESECLOTH("cheesecloth", "ItemCheeseCloth"),
		//JALAPENO("jalapeno", "ItemJalapeno"),
		//JALAPENOSEED("jalapenoseed", "ItemJalapenoSeed"),
		//Obsidian Armor and Tools
		OBSIDIANAXE("obsidianaxe", "ItemObsidianAxe"),
		OBSIDIANPICKAXE("obsidianpickaxe", "ItemObsidianPickaxe"),
		OBSIDIANSWORD("obsidiansword", "ItemObsidianSword"),
		OBSIDIANSHOVEL("obsidianshovel", "ItemObsidianShovel"),
		OBSIDIANHOE("obsidianhoe", "ItemObsidianHoe"),
		OBSIDIANROD("obsidianrod", "ItemObsidianRod"),
		OBSIDIANHELMET("obsidianhelmet", "ItemObsidianHelmet"),
		OBSIDIANCHESTPLATE("obsidianchestplate", "ItemObsidianChestplate"),
		OBSIDIANLEGGINGS("obsidianleggings", "ItemObsidianLeggings"),
		OBSIDIANBOOTS("obsidianboots", "ItemObsidianBoots"),
		//Emerald Armor and Tools
		EMERALDAXE("emeraldaxe", "ItemEmeraldAxe"),
		EMERALDPICKAXE("emeraldpickaxe", "ItemEmeraldPickaxe"),
		EMERALDSHOVEL("emeraldshovel", "ItemEmeraldShovel"),
		EMERALDHOE("emeraldhoe", "ItemEmeraldHoe"),
		EMERALDSWORD("emeraldsword", "ItemEmeraldSword"),
		EMERALDHELMET("emeraldhelmet", "ItemEmeraldHelmet"),
		EMERALDCHESTPLATE("emeraldchestplate", "ItemEmeraldChestplate"),
		EMERALDLEGGINGS("emeraldleggings", "ItemEmeraldLeggings"),
		EMERALDBOOTS("emeraldboots", "ItemEmeraldBoots"),
		EMERALDROD("emeraldrod", "ItemEmeraldRod"),
		//Ingots
		ALUMINUMINGOT("aluminumingot", "ItemAluminumIngot");

		private String unlocalizedName;
		private String registryName;
		
		minceraftItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
	
	public static enum minceraftBlocks {
		CHEESECUBE("cheesecube","BlockCheeseCube"),
		JALAPENO("jalapeno","BlockJalapeno"),
		ALUMINUMORE("aluminumore", "BlockAluminumOre");
		
		private String unlocalizedName;
		private String registryName;
		
		minceraftBlocks(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		
		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}

	/**public static enum minceraftCrops {
		JALAPENOPLANT("jalapenoplant", "JalapenoPlant");
		
		private String unlocalizedName;
		private String registryName;
		
		minceraftCrops(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}

		public String getRegistryName() {
			return registryName;
		}
		
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
	}
	**/
	
}
