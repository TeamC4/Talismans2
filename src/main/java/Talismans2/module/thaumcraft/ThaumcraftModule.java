package Talismans2.module.thaumcraft;

import Talismans2.config.ConfigTalismans;

public class ThaumcraftModule {

	public static void init(ConfigTalismans properties) {
		if (properties.ThaumscraftModuleTrue)
			ThaumcraftInit();

	}

	public static void ThaumcraftInit() {
		// Load Thaumcraft Recipes
		ThaumcraftRecipes.init(null);
		// Load Thaumonomicon Tab
		ThaumonomiconResearch.addResearchTab();
		// Load Thaumcraft Research
		ThaumonomiconResearch.addResearch();
		// Load Fusion Research
		ThaumonomiconResearch.addFusionResearch();
		// Load Donator Credits
		ThaumonomiconResearch.addDonationThanks();

	}

}
