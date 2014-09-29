package Talismans2.module.bloodmagic;

import Talismans2.config.ConfigTalismans;
import Talismans2.init.ModItems;

public class BloodMagicModule {

	public static void init(ConfigTalismans properties) {
		if (properties.BloodMagicModuleTrue)
			BloodMagicInit();

	}

	public static void BloodMagicInit() {
		// Load Blood Magic Recipes
		BloodMagicRecipes.init();
		ModItems.BloodInit();
		
	}
}
