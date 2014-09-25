package Talismans2.module.bloodmagic;

import Talismans2.config.ConfigTalismans;
import Talismans2.util.TalismanStacks;
import WayofTime.alchemicalWizardry.api.altarRecipeRegistry.AltarRecipeRegistry;
import WayofTime.alchemicalWizardry.api.bindingRegistry.BindingRegistry;

public class BloodMagicRecipes {

	public static void init() {
		// Altar Recipes
		AltarRecipeRegistry.registerAltarRecipe(
				TalismanStacks.bloodBlankTalisman,
				TalismanStacks.talismanBlank, 3, 4000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				TalismanStacks.bloodCraftingTalisman,
				TalismanStacks.talismanCrafting, 5, 14000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				TalismanStacks.bloodFlameTalisman,
				TalismanStacks.talismanFlame, 5, 14000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				TalismanStacks.bloodInvisibleTalisman,
				TalismanStacks.talismanInvisible, 5, 14000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				TalismanStacks.bloodLightTalisman,
				TalismanStacks.talismanLight, 5, 14000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				TalismanStacks.bloodMiningTalisman,
				TalismanStacks.talismanMining, 5, 14000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				TalismanStacks.bloodMovementTalisman,
				TalismanStacks.talismanMovement, 5, 14000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				TalismanStacks.bloodWaterTalisman,
				TalismanStacks.talismanWater, 5, 14000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				TalismanStacks.bloodWitherlessTalisman,
				TalismanStacks.talismanWitherless, 5, 14000, 50, 15, false);

		// Binding Recipes
		BindingRegistry.registerRecipe(TalismanStacks.talismanRingCrafting,
				TalismanStacks.talismanCrafting);
		BindingRegistry.registerRecipe(TalismanStacks.talismanRingFlame,
				TalismanStacks.talismanFlame);
		BindingRegistry.registerRecipe(TalismanStacks.talismanRingInvisible,
				TalismanStacks.talismanInvisible);
		BindingRegistry.registerRecipe(TalismanStacks.talismanRingLight,
				TalismanStacks.talismanLight);
		BindingRegistry.registerRecipe(TalismanStacks.talismanRingMining,
				TalismanStacks.talismanMining);
		BindingRegistry.registerRecipe(TalismanStacks.talismanRingMovement,
				TalismanStacks.talismanMovement);
		BindingRegistry.registerRecipe(TalismanStacks.talismanRingWater,
				TalismanStacks.talismanWater);
		BindingRegistry.registerRecipe(TalismanStacks.talismanRingWitherless,
				TalismanStacks.talismanWitherless);

	}
}
