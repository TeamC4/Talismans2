package Talismans2.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigTalismans {
	private static ConfigTalismans instance = null;
	private final String CATEGORY_Thaumcraft = "Thaumcraft";
//	private final String CATEGORY_LOOT = "loot";
	public final boolean ThaumscraftModuleTrue;
//	public final boolean DungeonLootAllowed;

	private ConfigTalismans(File configFile) {
		Configuration config = new Configuration(configFile);
		config.load();
		ThaumscraftModuleTrue = config.get(CATEGORY_Thaumcraft,
				"Thaumcraft Module On", true).getBoolean(true);

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
