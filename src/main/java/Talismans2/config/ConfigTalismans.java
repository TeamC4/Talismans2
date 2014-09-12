package Talismans2.config;

import net.minecraftforge.common.config.Configuration;

public class ConfigTalismans {

	public static boolean ThaumcraftRecipes;

	public static String CATEGORY_THAUMCRAFT = "Thaumcraft";
	public static String CATEGORY_VALUES = "numeric values";
	public static Configuration config;

	public static void createConfig() {
		config.load();
		
		config.addCustomCategoryComment(CATEGORY_THAUMCRAFT,
				"Enable Thaumcraft Intergration");
		
		// CATEGORY_THAUMCRAFT
		ThaumcraftRecipes = config.get(CATEGORY_THAUMCRAFT,
				"ThaumcraftRecipes", false).getBoolean(ThaumcraftRecipes);

		config.save();
	}
}
