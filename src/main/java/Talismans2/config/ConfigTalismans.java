package Talismans2.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigTalismans {
	private static ConfigTalismans instance = null;
	private final String CATEGORY_THAUMCRAFT = "Thaumcraft";
	private final String CATEGORY_LOOT = "loot";
	
	public final boolean ThaumscraftModuleTrue;
    public final boolean BlankTalismanLootTrue;
    public final boolean FlameTalismanLootTrue;
    public final boolean WaterTalismanLootTrue;
    public final boolean LightTalismanLootTrue;
    public final boolean MiningTalismanLootTrue;
    public final boolean MovementTalismanLootTrue;
    
    public static int ChanceBlankTalisman;
    public static int ChanceFlameTalisman;
    public static int ChanceWaterTalisman;
    public static int ChanceLightTalisman;
    public static int ChanceMovementTalisman;
    public static int ChanceMiningTalisman;


	private ConfigTalismans(File configFile) {
		Configuration config = new Configuration(configFile);
		config.load();
		ThaumscraftModuleTrue = config.get(CATEGORY_THAUMCRAFT,
				"Thaumcraft Module On", true).getBoolean(true);
		//Loot
		BlankTalismanLootTrue = config.get(CATEGORY_LOOT,
				"Add Blank Talismans To DungeonLoot", true).getBoolean(true);
		FlameTalismanLootTrue = config.get(CATEGORY_LOOT,
				"Add Flame Talismans To DungeonLoot", true).getBoolean(true);
		WaterTalismanLootTrue = config.get(CATEGORY_LOOT,
				"Add Water Talismans To DungeonLoot", true).getBoolean(true);
		LightTalismanLootTrue = config.get(CATEGORY_LOOT,
				"Add Light Talismans To DungeonLoot", true).getBoolean(true);
		MiningTalismanLootTrue = config.get(CATEGORY_LOOT,
				"Add Mining Talismans To DungeonLoot", true).getBoolean(true);
		MovementTalismanLootTrue = config.get(CATEGORY_LOOT,
				"Add Movement Talismans To DungeonLoot", true).getBoolean(true);
		
		//Loot Chance
        ChanceBlankTalisman = config.get(Configuration.CATEGORY_GENERAL, "Blank Talisman spawning chance", 15).getInt();
        ChanceFlameTalisman = config.get(Configuration.CATEGORY_GENERAL, "Flame Talisman spawning chance", 15).getInt();
        ChanceWaterTalisman = config.get(Configuration.CATEGORY_GENERAL, "Water Talisman spawning chance", 15).getInt();
        ChanceLightTalisman = config.get(Configuration.CATEGORY_GENERAL, "Light Talisman spawning chance", 15).getInt();
        ChanceMovementTalisman = config.get(Configuration.CATEGORY_GENERAL, "Movement Talisman spawning chance", 15).getInt();
        ChanceMiningTalisman = config.get(Configuration.CATEGORY_GENERAL, "Mining Talisman spawning chance", 15).getInt();


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

}
