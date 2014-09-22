package Talismans2.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

/**
 * @author Gigabit101
 */

public class ConfigTalismans {
	private static ConfigTalismans instance = null;
	public static String CATEGORY_THAUMCRAFT = "thaumcraft";
	public static String CATEGORY_BLOODMAGIC = "blood magic";
	public static String CATEGORY_LOOT = "loot";
	public static String CATEGORY_RECIPES = "recipes";

	public static boolean ThaumscraftModuleTrue;
	public static boolean BloodMagicModuleTrue;
	public static boolean BlankTalismanLootTrue;
	public static boolean FlameTalismanLootTrue;
	public static boolean WaterTalismanLootTrue;
	public static boolean LightTalismanLootTrue;
	public static boolean MiningTalismanLootTrue;
	public static boolean MovementTalismanLootTrue;
	public static boolean InvisibleTalismanLootTrue;
	public static boolean WitherlessTalismanLootTrue;
	public static boolean CopyTalismansTrue;

	public static int ChanceBlankTalisman;
	public static int ChanceFlameTalisman;
	public static int ChanceWaterTalisman;
	public static int ChanceLightTalisman;
	public static int ChanceMovementTalisman;
	public static int ChanceMiningTalisman;
	public static int ChanceInvisibleTalisman;
	public static int ChanceWitherlessTalisman;

	public static Configuration config;

	private ConfigTalismans(File configFile) {
		config = new Configuration(configFile);
		config.load();

		ConfigTalismans.Configs();

		config.save();

	}

	public static ConfigTalismans initialize(File configFile) {

		if (instance == null)
			instance = new ConfigTalismans(configFile);
		else
			throw new IllegalStateException(
					"Cannot initialize TalismanConfig twice");

		return instance;
	}

	public static ConfigTalismans instance() {
		if (instance == null) {

			throw new IllegalStateException(
					"Instance of Talisman2Config requested before initialization");
		}
		return instance;
	}

	public static void Configs() {

		CopyTalismansTrue = config.get(CATEGORY_RECIPES,
				"Allow Talismans to be copied", false,
				"Craft a blank talisman with another to get 2 of the other.")
				.getBoolean(true);
		ThaumscraftModuleTrue = config.get(CATEGORY_THAUMCRAFT,
				"Thaumcraft Module On", true,
				"Enable or Disable Thaumcraft Integration").getBoolean(true);
		BloodMagicModuleTrue = config.get(CATEGORY_BLOODMAGIC,
				"Blood Magic Module On", true,
				"Enable or Disable Blood Magic Integration").getBoolean(true);
		// Loot
		BlankTalismanLootTrue = config.get(CATEGORY_LOOT,
				"Add Blank Talismans To DungeonLoot", true,
				"Add or Remove Blank Talismans from loot").getBoolean(true);
		FlameTalismanLootTrue = config.get(CATEGORY_LOOT,
				"Add Flame Talismans To DungeonLoot", true,
				"Add or Remove Flame Talismans from loot").getBoolean(true);
		WaterTalismanLootTrue = config.get(CATEGORY_LOOT,
				"Add Water Talismans To DungeonLoot", true,
				"Add or Remove Water Talismans from loot").getBoolean(true);
		LightTalismanLootTrue = config.get(CATEGORY_LOOT,
				"Add Light Talismans To DungeonLoot", true,
				"Add or Remove Light Talismans from loot").getBoolean(true);
		MiningTalismanLootTrue = config.get(CATEGORY_LOOT,
				"Add Mining Talismans To DungeonLoot", true,
				"Add or Remove Mining Talismans from loot").getBoolean(true);
		MovementTalismanLootTrue = config.get(CATEGORY_LOOT,
				"Add Movement Talismans To DungeonLoot", true,
				"Add or Remove Movement Talismans from loot").getBoolean(true);
		InvisibleTalismanLootTrue = config.get(CATEGORY_LOOT,
				"Add Invisible Talisman To DungeonLoot", true,
				"Add or Remove Invisible Talismans from loot").getBoolean(true);
		WitherlessTalismanLootTrue = config.get(CATEGORY_LOOT,
				"Add Witherless Talisman To DungeonLoot", true,
				"Add or Remove Witherless Talismans from loot")
				.getBoolean(true);

		// Loot Chance
		ChanceBlankTalisman = config
				.get(Configuration.CATEGORY_GENERAL,
						"Blank Talisman spawning chance", 15,
						"Change the spawn chance for Blank Talisman's to appear in chests")
				.getInt();
		ChanceFlameTalisman = config
				.get(Configuration.CATEGORY_GENERAL,
						"Flame Talisman spawning chance", 15,
						"Change the spawn chance for Flame Talisman's to appear in chests")
				.getInt();
		ChanceWaterTalisman = config
				.get(Configuration.CATEGORY_GENERAL,
						"Water Talisman spawning chance", 15,
						"Change the spawn chance for Water Talisman's to appear in chests")
				.getInt();
		ChanceLightTalisman = config
				.get(Configuration.CATEGORY_GENERAL,
						"Light Talisman spawning chance", 15,
						"Change the spawn chance for Light Talisman's to appear in chests")
				.getInt();
		ChanceMovementTalisman = config
				.get(Configuration.CATEGORY_GENERAL,
						"Movement Talisman spawning chance", 15,
						"Change the spawn chance for Movement Talisman's to appear in chests")
				.getInt();
		ChanceMiningTalisman = config
				.get(Configuration.CATEGORY_GENERAL,
						"Mining Talisman spawning chance", 15,
						"Change the spawn chance for Mining Talisman's to appear in chests")
				.getInt();
		ChanceInvisibleTalisman = config
				.get(Configuration.CATEGORY_GENERAL,
						"Invisible Talisman Spawning Chance", 15,
						"Change the spawn chance for Invisible Talisman's to appear in chests")
				.getInt();
		ChanceWitherlessTalisman = config
				.get(Configuration.CATEGORY_GENERAL,
						"Witherless Talisman Spawning Chance", 15,
						"Change the spawn chance for Witherless Talisman's to appear in chests")
				.getInt();

		if (config.hasChanged())
			config.save();
	}
}
