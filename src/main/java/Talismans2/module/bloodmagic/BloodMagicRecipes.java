package Talismans2.module.bloodmagic;

import Talismans2.util.TalismanStacks;
import WayofTime.alchemicalWizardry.api.altarRecipeRegistry.AltarRecipeRegistry;
import WayofTime.alchemicalWizardry.api.bindingRegistry.BindingRegistry;
import net.minecraft.item.ItemStack;

public class BloodMagicRecipes {

	public static void init() {
		// Altar Recipes
		AltarRecipeRegistry.registerAltarRecipe(
				new ItemStack(BloodItems.BloodBlankTalisman),
				TalismanStacks.talismanBlank, 3, 4000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				new ItemStack(BloodItems.BloodCraftingTalisman),
				TalismanStacks.talismanCrafting, 5, 14000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				new ItemStack(BloodItems.BloodFlameTalisman),
				TalismanStacks.talismanFlame, 5, 14000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				new ItemStack(BloodItems.BloodInvisibleTalisman),
				TalismanStacks.talismanInvisible, 5, 14000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				new ItemStack(BloodItems.BloodLightTalisman),
				TalismanStacks.talismanLight, 5, 14000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				new ItemStack(BloodItems.BloodMiningTalisman),
				TalismanStacks.talismanMining, 5, 14000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				new ItemStack(BloodItems.BloodMovementTalisman),
				TalismanStacks.talismanMovement, 5, 14000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				new ItemStack(BloodItems.BloodWaterTalisman),
				TalismanStacks.talismanWater, 5, 14000, 50, 15, false);
		AltarRecipeRegistry.registerAltarRecipe(
				new ItemStack(BloodItems.BloodWitherlessTalisman),
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
