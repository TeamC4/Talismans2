package Talismans2.module.botania;

import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.lexicon.LexiconCategory;
import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.botania.common.lexicon.BLexiconEntry;
import vazkii.botania.common.lexicon.page.PageManaInfusionRecipe;
import vazkii.botania.common.lexicon.page.PageRuneRecipe;
import vazkii.botania.common.lexicon.page.PageText;

/**
 * @author Gigabit101
 */

public class BotaniaLexicon {

	public static LexiconCategory categoryBaubles;

	public static LexiconEntry entryBlankTalisman;
	public static LexiconEntry entryFlameTalisman;
	public static LexiconEntry entryWaterTalisman;
	public static LexiconEntry entryLightTalisman;
	public static LexiconEntry entryMiningTalisman;
	public static LexiconEntry entryMovementTalisman;
	public static LexiconEntry entryWitherlessTalisman;

	// public static LexiconEntry entryCraftTalisman;

	public static void init() {
		BotaniaAPI.addCategory(categoryBaubles = new LexiconCategory(
				"KEY_BOTANIA_LEXICA_CATERGORY"));

		entryBlankTalisman = new BLexiconEntry("blankTalisman", categoryBaubles);
		entryBlankTalisman.setLexiconPages(new PageText("0"),
				new PageManaInfusionRecipe("1", BotaniaRecipes.blankTalisman));
		entryFlameTalisman = new BLexiconEntry("flameTalisman", categoryBaubles);
		entryFlameTalisman.setLexiconPages(new PageText("0"),
				new PageRuneRecipe("1", BotaniaRecipes.flameTalisman));
		entryWaterTalisman = new BLexiconEntry("waterTalisman", categoryBaubles);
		entryWaterTalisman.setLexiconPages(new PageText("0"),
				new PageRuneRecipe("1", BotaniaRecipes.waterTalisman));
		entryLightTalisman = new BLexiconEntry("lightTalisman", categoryBaubles);
		entryLightTalisman.setLexiconPages(new PageText("0"),
				new PageRuneRecipe("1", BotaniaRecipes.lightTalisman));
		entryMiningTalisman = new BLexiconEntry("miningTalisman",
				categoryBaubles);
		entryMiningTalisman.setLexiconPages(new PageText("0"),
				new PageRuneRecipe("1", BotaniaRecipes.miningTalisman));
		entryMovementTalisman = new BLexiconEntry("movementTalisman",
				categoryBaubles);
		entryMovementTalisman.setLexiconPages(new PageText("0"),
				new PageRuneRecipe("1", BotaniaRecipes.movementTalisman));
		entryWitherlessTalisman = new BLexiconEntry("witherlessTalisman",
				categoryBaubles);
		entryWitherlessTalisman.setLexiconPages(new PageText("0"),
				new PageRuneRecipe("1", BotaniaRecipes.witherlessTalisman));

	}

}
