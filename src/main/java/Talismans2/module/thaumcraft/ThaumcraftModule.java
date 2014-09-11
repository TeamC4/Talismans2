package Talismans2.module.thaumcraft;

import Talismans2.config.ConfigTalismans;

public class ThaumcraftModule {

	public static void init() {
		if (ConfigTalismans.ThaumcraftRecipes = true)
		
		    // Load Thaumonomicon Tab
		    ThaumonomiconResearch.addResearchTab();
		    // Load Thaumcraft Research
		    ThaumonomiconResearch.addResearch();
		    //Load Thaumcraft Recipes
			ThaumcraftRecipes.init();
	}

}
