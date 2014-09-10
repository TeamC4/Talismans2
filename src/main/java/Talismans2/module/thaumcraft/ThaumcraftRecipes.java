package Talismans2.module.thaumcraft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import Talismans2.init.ModItems;

public class ThaumcraftRecipes {

	public static CrucibleRecipe BlankTalisman;
	public static InfusionRecipe FlameTalisman;

	public static void init() {
		// Crucible Recipes
		BlankTalisman = ThaumcraftApi.addCrucibleRecipe("Blank Talisman",
				new ItemStack(ModItems.BlankTalisman), new ItemStack(
						Blocks.stone), new AspectList().add(Aspect.MAGIC, 12)
						.add(Aspect.AIR, 10));
		// Infusion Recipes
		FlameTalisman = ThaumcraftApi.addInfusionCraftingRecipe(
				"Flame Talisman", new ItemStack(ModItems.FlameTalisman), 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.FIRE, 15),
				new ItemStack(ModItems.BlankTalisman), new ItemStack[] {
						new ItemStack(Items.coal),
						new ItemStack(Items.coal, 1, 1),
						new ItemStack(Items.lava_bucket) });

	}

}
