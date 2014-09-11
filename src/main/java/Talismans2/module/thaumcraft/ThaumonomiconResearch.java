package Talismans2.module.thaumcraft;

import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

/**
 * @author Gigabit101
 */

public class ThaumonomiconResearch {

	public static void addResearchTab() {
		ResourceLocation background = new ResourceLocation("thaumcraft",
				"textures/gui/gui_researchback.png");
		ResearchCategories.registerCategory("Talismans", new ResourceLocation(
				"talismans2:textures/items/Blank.png"), background);
	}

	public static void addResearch() {
		ResearchItem research;
		String text = "1";

		// Blank Talisman
		text = "PAGE_BLANK_TALISMAN";
		research = new ResearchItem("Blank_Talisman", "Talismans",
				new AspectList(), 0, 0, 0, new ResourceLocation(
						"talismans2:textures/items/Blank.png")).setRound()
				.setAutoUnlock().registerResearchItem();
		research.setPages(new ResearchPage(text), new ResearchPage(
				ThaumcraftRecipes.BlankTalisman));

		// Flame Talisman
		text = "PAGE_FLAME_TALISMAN";
		research = new ResearchItem("Flame_Talisman", "Talismans",
				new AspectList(), 1, 2, 3, new ResourceLocation(
						"talismans2:textures/items/Flame.png")).setAutoUnlock()
				.setParents("Blank_Talisman").setRound();
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.FlameTalisman))
				.setSecondary().registerResearchItem();

		// Water Talisman
		text = "PAGE_WATER_TALISMAN";
		research = new ResearchItem("Water_Talisman", "Talismans",
				new AspectList(), 2, 2, 2, new ResourceLocation(
						"talismans2:textures/items/Water.png")).setSecondary()
				.setAutoUnlock().setParents("Blank_Talisman")
				.registerResearchItem();
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.WaterTalisman))
				.setSecondary().registerResearchItem();

		// Light Talisman
		text = "PAGE_LIGHT_TALISMAN";
		research = new ResearchItem("Light_Talisman", "Talismans",
				new AspectList(), 3, 3, 3, new ResourceLocation(
						"talismans2:textures/items/Light.png")).setSecondary()
				.setAutoUnlock().setParents("Blank_Talisman")
				.registerResearchItem();
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.LightTalisman))
				.setSecondary().registerResearchItem();
		
		// Movement Talisman
		text = "PAGE_MOVEMENT_TALISMAN";
		research = new ResearchItem("Movement_Talisman", "Talismans",
				new AspectList(), 4, 4, 4, new ResourceLocation(
						"talismans2:textures/items/Movement.png")).setSecondary()
				.setAutoUnlock().setParents("Blank_Talisman")
				.registerResearchItem();
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.MovementTalisman))
				.setSecondary().registerResearchItem();
		
	}
}