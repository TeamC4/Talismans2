//package Talismans2.module.thaumcraft;
//
//import Talismans2.config.ConfigTalismans;
//
///**
// * @author Gigabit101
// */
//
//public class ThaumcraftModule {
//	public static ConfigTalismans properties;
//
//	public static void init(ConfigTalismans properties)
//	{
//		if (properties.ThaumscraftModuleTrue)
//			ThaumcraftInit();
//
//	}
//
//	public static void ThaumcraftInit()
//	{
//		if (thaumcraft.common.config.Config.researchDifficulty == -1) {
//			// Load Thaumcraft Recipes
//			ThaumcraftRecipes.init(properties);
//			// Load Thaumonomicon Tab
//			ThaumonomiconResearch.addResearchTab();
//			// Load EasyModeResearch
//			ThaumcraftEasyMode.addResearch();
//			// Load Thaumcraft Research
//			ThaumonomiconResearch.addFusionResearch();
//			// Load Donator Credits
//			ThaumonomiconResearch.addDonationThanks();
//		} else {
//			// Load Thaumcraft Recipes
//			ThaumcraftRecipes.init(properties);
//			// Load Thaumonomicon Tab
//			ThaumonomiconResearch.addResearchTab();
//			// Load Thaumcraft Research
//			ThaumonomiconResearch.addResearch();
//			// Load Fusion Research
//			ThaumonomiconResearch.addFusionResearch();
//			// Load Donator Credits
//			ThaumonomiconResearch.addDonationThanks();
//
//		}
//
//	}
//
//}
