package Talismans2.module.bloodmagic;

import java.util.Properties;

import Talismans2.config.ConfigTalismans;

public class BloodMagicModule {

	public static void init(ConfigTalismans properties) {
		if (properties.BloodMagicModuleTrue)
			BloodMagicInit();

	}

	public static void BloodMagicInit() {
		// Load Blood Magic Recipes
		BloodMagicRecipes.init();
	}
}
