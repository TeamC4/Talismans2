package Talismans2.module.thaumcraft;

import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

/**
 * @author Gigabit101
 */

public class ThaumcraftEasyMode {


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
				new AspectList().add(Aspect.MAGIC, 5).add(Aspect.SENSES, 5), 0, 2, 1,
				new ResourceLocation("talismans2:textures/items/Flame.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.FlameTalisman))
				.registerResearchItem();

		// Water Talisman
		text = "PAGE_WATER_TALISMAN";
		research = new ResearchItem("Water_Talisman", "Talismans",
				new AspectList().add(Aspect.MAGIC, 5).add(Aspect.SENSES, 5), 0, -2, 1,
				new ResourceLocation("talismans2:textures/items/Water.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.WaterTalisman))
				.registerResearchItem();

		// Light Talisman
		text = "PAGE_LIGHT_TALISMAN";
		research = new ResearchItem("Light_Talisman", "Talismans",
				new AspectList().add(Aspect.MAGIC, 5).add(Aspect.SENSES, 5), 2, 0, 1,
				new ResourceLocation("talismans2:textures/items/Light.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.LightTalisman))
				.registerResearchItem();

		// Movement Talisman
		text = "PAGE_MOVEMENT_TALISMAN";
		research = new ResearchItem("Movement_Talisman", "Talismans",
				new AspectList().add(Aspect.MAGIC, 5).add(Aspect.SENSES, 5), -2, 0, 1,
				new ResourceLocation("talismans2:textures/items/Movement.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.MovementTalisman))
				.registerResearchItem();

		// Mining Talisman
		text = "PAGE_MINING_TALISMAN";
		research = new ResearchItem("Mining_Talisman", "Talismans",
				new AspectList().add(Aspect.MAGIC, 5).add(Aspect.SENSES, 5), -1, 1, 1,
				new ResourceLocation("talismans2:textures/items/Mining.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.MiningTalisman))
				.registerResearchItem();

		// Invisible Talisman
		text = "PAGE_INVISIBLE_TALISMAN";
		research = new ResearchItem("Invisible_Talisman", "Talismans",
				new AspectList().add(Aspect.MAGIC, 5).add(Aspect.SENSES, 5), 1,
				1, 1,
				new ResourceLocation("talismans2:textures/items/Invisible.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.InvisibleTalisman))
				.registerResearchItem();

		// Witherless Talisman
		text = "PAGE_WITHERLESS_TALISMAN";
		research = new ResearchItem("Witherless_Talisman", "Talismans",
				new AspectList().add(Aspect.MAGIC, 5).add(Aspect.HEAL, 5), 1,
				-1, 1,
				new ResourceLocation("talismans2:textures/items/Witherless.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.WitherlessTalisman))
				.registerResearchItem();

	}

}