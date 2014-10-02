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

/**
 * @author Gigabit101
 */

public class BotaniaRecipes {

	public static RecipeManaInfusion poolRecipe;
	public static RecipeManaInfusion blankTalisman;
	public static RecipeRuneAltar flameTalisman;
	public static RecipeRuneAltar waterTalisman;
	public static RecipeRuneAltar lightTalisman;
	public static RecipeRuneAltar miningTalisman;
	public static RecipeRuneAltar movementTalisman;
	public static RecipeRuneAltar witherlessTalisman;
//	public static RecipeRuneAltar craftTalisman;

	
	public static void init(){
						
		blankTalisman = BotaniaAPI.registerManaInfusionRecipe(new ItemStack(ModItems.BlankTalisman, 1), new ItemStack(Blocks.stone), 6000);
		//Talismans
		flameTalisman = BotaniaAPI.registerRuneAltarRecipe(new ItemStack(ModItems.FlameTalisman, 1), 50000, new ItemStack (ModItems.BlankTalisman), new ItemStack(Items.gunpowder), new ItemStack(Items.flint_and_steel), new ItemStack(Blocks.nether_brick));
		waterTalisman = BotaniaAPI.registerRuneAltarRecipe(new ItemStack(ModItems.WaterTalisman, 1), 50000, new ItemStack (ModItems.BlankTalisman), new ItemStack(Blocks.waterlily), new ItemStack(Items.water_bucket), new ItemStack(Blocks.reeds));
		lightTalisman = BotaniaAPI.registerRuneAltarRecipe(new ItemStack(ModItems.LightTalisman, 1), 50000, new ItemStack (ModItems.BlankTalisman), new ItemStack(Blocks.glowstone), new ItemStack(Blocks.redstone_lamp), new ItemStack(Blocks.torch));
		miningTalisman = BotaniaAPI.registerRuneAltarRecipe(new ItemStack(ModItems.MiningTalisman, 1), 50000, new ItemStack (ModItems.BlankTalisman), new ItemStack(Items.diamond_pickaxe), new ItemStack(Items.iron_shovel), new ItemStack(Items.nether_wart));
		movementTalisman = BotaniaAPI.registerRuneAltarRecipe(new ItemStack(ModItems.MovementTalisman, 1), 50000, new ItemStack (ModItems.BlankTalisman), new ItemStack(Items.diamond_boots), new ItemStack(Items.sugar), new ItemStack(Items.golden_apple));
		witherlessTalisman = BotaniaAPI.registerRuneAltarRecipe(new ItemStack(ModItems.WitherlessTalisman, 1), 50000, new ItemStack (ModItems.BlankTalisman), new ItemStack(Items.milk_bucket), new ItemStack(Items.nether_wart), new ItemStack(Items.golden_apple));


		
	}



}
