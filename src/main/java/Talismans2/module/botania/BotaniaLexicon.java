package Talismans2.module.botania;

import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.lexicon.LexiconCategory;
import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.botania.common.lexicon.BLexiconEntry;
import vazkii.botania.common.lexicon.page.PageManaInfusionRecipe;
import vazkii.botania.common.lexicon.page.PageRuneRecipe;
import vazkii.botania.common.lexicon.page.PageText;

public class BotaniaLexicon {
	
	
	public static LexiconCategory categoryBaubles;

	public static LexiconEntry entryBlankTalisman;
	public static LexiconEntry entryFlameTalisman;
	
	public static void init(){
		BotaniaAPI.addCategory(categoryBaubles = new LexiconCategory("Talismans"));

		entryBlankTalisman = new BLexiconEntry("blankTalisman", categoryBaubles);
		entryBlankTalisman.setLexiconPages(new PageText("0"), new PageManaInfusionRecipe("1", BotaniaRecipes.blankTalisman));
		entryFlameTalisman = new BLexiconEntry("flameTalisman", categoryBaubles);
		entryFlameTalisman.setLexiconPages(new PageText("0"), new PageRuneRecipe("1", BotaniaRecipes.flameTalisman));
		
		
		
	}

}
