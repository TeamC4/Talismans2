package Talismans2.module.thaumcraft;

import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;
import thaumcraft.api.research.ResearchPage.PageType;

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
				.setAutoUnlock().registerResearchItem().setSpecial();
		research.setPages(new ResearchPage(text), new ResearchPage(
				ThaumcraftRecipes.BlankTalisman));

		// Flame Talisman
		text = "PAGE_FLAME_TALISMAN";
		research = new ResearchItem("Flame_Talisman", "Talismans",
		
				ResearchAspects.FlameTalismanResearch, 0, 2, 1, new ResourceLocation(
						"talismans2:textures/items/Flame.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.FlameTalisman))
				.registerResearchItem();

		// Water Talisman
		text = "PAGE_WATER_TALISMAN";
		research = new ResearchItem("Water_Talisman", "Talismans",
				ResearchAspects.WaterTalismanResearch, -1, 2, 1, new ResourceLocation(
						"talismans2:textures/items/Water.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.WaterTalisman))
				.registerResearchItem();

		// Light Talisman
		text = "PAGE_LIGHT_TALISMAN";
		research = new ResearchItem("Light_Talisman", "Talismans",
				ResearchAspects.LightTalismanResearch, 1, 2, 1, new ResourceLocation(
						"talismans2:textures/items/Light.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.LightTalisman))
                .registerResearchItem();

		// Movement Talisman
		text = "PAGE_MOVEMENT_TALISMAN";
		research = new ResearchItem("Movement_Talisman", "Talismans",
				ResearchAspects.MovementTalismanResearch, 0, 3, 1, new ResourceLocation(
						"talismans2:textures/items/Movement.png"))
				.setParents("Flame_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.MovementTalisman))
				.registerResearchItem();

		// Mining Talisman
		text = "PAGE_MINING_TALISMAN";
		research = new ResearchItem("Mining_Talisman", "Talismans",
				ResearchAspects.MiningTalismanResearch, 0, 4, 1, new ResourceLocation(
						"talismans2:textures/items/Mining.png"))
				.setParents("Movement_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.MiningTalisman))
				.registerResearchItem();

	}

}