package Talismans2.module.bloodmagic;

import Talismans2.config.ConfigTalismans;

public class BloodMagicModule {

	public static void init(ConfigTalismans properties) {
		if (properties.BloodMagicModuleTrue)
			BloodMagicInit();

	}

	public static void BloodMagicInit() {
		// Load Blood Items
		BloodItems.init();

		// Load Blood Magic Recipes
		BloodMagicRecipes.init();
	}
}
