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
				ResearchAspects.FlameTalismanResearch, 0, 2, 1,
				new ResourceLocation("talismans2:textures/items/Flame.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.FlameTalisman))
				.registerResearchItem();

		// Water Talisman
		text = "PAGE_WATER_TALISMAN";
		research = new ResearchItem("Water_Talisman", "Talismans",
				ResearchAspects.WaterTalismanResearch, 0, -2, 1,
				new ResourceLocation("talismans2:textures/items/Water.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.WaterTalisman))
				.registerResearchItem();

		// Light Talisman
		text = "PAGE_LIGHT_TALISMAN";
		research = new ResearchItem("Light_Talisman", "Talismans",
				ResearchAspects.LightTalismanResearch, 2, 0, 1,
				new ResourceLocation("talismans2:textures/items/Light.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.LightTalisman))
				.registerResearchItem();

		// Movement Talisman
		text = "PAGE_MOVEMENT_TALISMAN";
		research = new ResearchItem("Movement_Talisman", "Talismans",
				ResearchAspects.MovementTalismanResearch, -2, 0, 1,
				new ResourceLocation("talismans2:textures/items/Movement.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.MovementTalisman))
				.registerResearchItem();

		// Mining Talisman
		text = "PAGE_MINING_TALISMAN";
		research = new ResearchItem("Mining_Talisman", "Talismans",
				ResearchAspects.MiningTalismanResearch, -1, 1, 1,
				new ResourceLocation("talismans2:textures/items/Mining.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.MiningTalisman))
				.registerResearchItem();

		// Invisible Talisman
		text = "PAGE_INVISIBLE_TALISMAN";
		research = new ResearchItem("Invisible_Talisman", "Talismans",
				ResearchAspects.InvisibleTalismanResearch, 1, 1, 1,
				new ResourceLocation("talismans2:textures/items/Invisible.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.InvisibleTalisman))
				.registerResearchItem();

		// Witherless Talisman
		text = "PAGE_WITHERLESS_TALISMAN";
		research = new ResearchItem(
				"Witherless_Talisman",
				"Talismans",
				ResearchAspects.WitherlessTalismanResearch,
				1,
				-1,
				1,
				new ResourceLocation("talismans2:textures/items/Witherless.png"))
				.setParents("Blank_Talisman");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.WitherlessTalisman))
				.registerResearchItem();

	}

	public static void addFusionResearch() {
		ResearchItem research;
		String text = "1";

		// FusionResearch
		text = "PAGE_FUSION_RESEARCH";
		research = new ResearchItem("Fusion", "Talismans", new AspectList(), 0,
				6, 0,
				new ResourceLocation("talismans2:textures/items/Ring.png"))
				.setRound().registerResearchItem().setSpecial();
		research.setPages(new ResearchPage(text), new ResearchPage(
				ThaumcraftRecipes.BlankRing));

		// Flame Ring
		text = "PAGE_FLAME_RING";
		research = new ResearchItem("Flame_Ring", "Talismans", new AspectList()
				.add(Aspect.MAGIC, 5).add(Aspect.FIRE, 5), -2, 9, 0,
				new ResourceLocation("talismans2:textures/items/Ring.png"))
				.setRound().registerResearchItem().setParents("Fusion");
		research.setPages(new ResearchPage(text), new ResearchPage(
				ThaumcraftRecipes.FlameRing));

		// Water Ring
		text = "PAGE_WATER_RING";
		research = new ResearchItem("Water_Ring", "Talismans", new AspectList()
				.add(Aspect.MAGIC, 5).add(Aspect.WATER, 5), -2, 10, 0,
				new ResourceLocation("talismans2:textures/items/Ring.png"))
				.setRound().registerResearchItem().setParents("Fusion");
		research.setPages(new ResearchPage(text), new ResearchPage(
				ThaumcraftRecipes.WaterRing));

		// Light Ring
		text = "PAGE_LIGHT_RING";
		research = new ResearchItem("Light_Ring", "Talismans", new AspectList()
				.add(Aspect.MAGIC, 5).add(Aspect.LIGHT, 5), -3, 8, 0,
				new ResourceLocation("talismans2:textures/items/Ring.png"))
				.setRound().setParents("Fusion");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.LightRing))
				.registerResearchItem();

		// Movement Ring
		text = "PAGE_MOVEMENT_RING";
		research = new ResearchItem("Movement_Ring", "Talismans",
				new AspectList().add(Aspect.MAGIC, 5).add(Aspect.MAN, 5), -3,
				9, 0,
				new ResourceLocation("talismans2:textures/items/Ring.png"))
				.setRound().setParents("Fusion");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.MovementRing))
				.registerResearchItem();

		// Mining Ring
		text = "PAGE_MINING_RING";
		research = new ResearchItem("Mining_Ring", "Talismans",
				new AspectList().add(Aspect.MAGIC, 5).add(Aspect.TOOL, 5), -3,
				10, 0, new ResourceLocation(
						"talismans2:textures/items/Ring.png")).setRound()
				.setParents("Fusion");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.MiningRing))
				.registerResearchItem();

		// Invisible Ring
		text = "PAGE_INVISIBLE_RING";
		research = new ResearchItem("Invisible_Ring", "Talismans",
				new AspectList().add(Aspect.MAGIC, 5).add(Aspect.MAN, 5)
						.add(Aspect.SENSES, 5), -1, 8, 0, new ResourceLocation(
						"talismans2:textures/items/Ring.png")).setRound()
				.setParents("Fusion");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.InvisibleRing))
				.registerResearchItem();

		// Witherless Ring
		text = "PAGE_WITHERLESS_RING";
		research = new ResearchItem("Witherless_Ring", "Talismans",
				new AspectList().add(Aspect.MAGIC, 5).add(Aspect.HEAL, 5), -1,
				9, 0,
				new ResourceLocation("talismans2:textures/items/Ring.png"))
				.setRound().setParents("Fusion");
		research.setPages(new ResearchPage(text),
				new ResearchPage(ThaumcraftRecipes.WitherlessRing))
				.registerResearchItem();

	}

	public static void addDonationThanks() {
		ResearchItem research;
		String text = "1";

		text = "PAGE_THANKS_RESEARCH";
		research = new ResearchItem("Thanks", "Talismans", new AspectList(), 0,
				-4, 1, new ResourceLocation(
						"talismans2:textures/items/Donator.png")).setRound()
				.setAutoUnlock().registerResearchItem().setSpecial();
		research.setPages(new ResearchPage(text));

	}

}