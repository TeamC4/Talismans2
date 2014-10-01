package Talismans2.module.botania;

import java.util.List;

import Talismans2.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.lexicon.LexiconCategory;
import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.botania.api.recipe.RecipeManaInfusion;
import vazkii.botania.api.recipe.RecipeRuneAltar;
import vazkii.botania.common.lexicon.BLexiconEntry;
import vazkii.botania.common.lexicon.page.PageCraftingRecipe;
import vazkii.botania.common.lexicon.page.PageManaInfusionRecipe;
import vazkii.botania.common.lexicon.page.PageText;
import vazkii.botania.common.lib.LibLexicon;

public class BotaniaRecipes {

	public static RecipeManaInfusion poolRecipe;
	public static RecipeManaInfusion blankTalisman;
	public static RecipeRuneAltar flameTalisman;

	
	public static void init(){
						
		blankTalisman = BotaniaAPI.registerManaInfusionRecipe(new ItemStack(ModItems.BlankTalisman, 1), new ItemStack(Blocks.stone), 6000);

		flameTalisman = BotaniaAPI.registerRuneAltarRecipe(new ItemStack(ModItems.FlameTalisman, 1), 5000, new ItemStack (ModItems.BlankTalisman), new ItemStack(Items.gunpowder), new ItemStack(Items.flint_and_steel), new ItemStack(Blocks.nether_brick));
		
		
	}



}
