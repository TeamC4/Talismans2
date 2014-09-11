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
	public static InfusionRecipe WaterTalisman;
	public static InfusionRecipe LightTalisman;
	public static InfusionRecipe MovementTalisman;

	public static void init() {
		// Crucible Recipes
		BlankTalisman = ThaumcraftApi.addCrucibleRecipe("Blank_Talisman",
				new ItemStack(ModItems.BlankTalisman), new ItemStack(
						Blocks.stone), new AspectList().add(Aspect.MAGIC, 12)
						.add(Aspect.AIR, 10));
		
		// Infusion Recipes
		FlameTalisman = ThaumcraftApi.addInfusionCraftingRecipe(
				"Flame_Talisman", new ItemStack(ModItems.FlameTalisman), 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.FIRE, 15),
				new ItemStack(ModItems.BlankTalisman), new ItemStack[] {
						new ItemStack(Items.coal),
						new ItemStack(Items.coal, 1, 1),
						new ItemStack(Items.lava_bucket) });
		
		WaterTalisman = ThaumcraftApi.addInfusionCraftingRecipe(
				"Water_Talisman", new ItemStack(ModItems.WaterTalisman), 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.WATER, 15),
				new ItemStack(ModItems.BlankTalisman), new ItemStack[] {
						new ItemStack(Items.fish),
						new ItemStack(Items.fishing_rod),
						new ItemStack(Items.boat),
						new ItemStack(Items.water_bucket) });
		
		LightTalisman = ThaumcraftApi.addInfusionCraftingRecipe(
				"Light_Talisman", new ItemStack(ModItems.WaterTalisman), 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.LIGHT, 15),
				new ItemStack(ModItems.BlankTalisman), new ItemStack[] {
						new ItemStack(Items.carrot),
						new ItemStack(Items.carrot),
						new ItemStack(Items.ender_eye) });
		
		MovementTalisman = ThaumcraftApi.addInfusionCraftingRecipe(
				"Movement_Talisman", new ItemStack(ModItems.MovementTalisman), 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.MAN, 15),
				new ItemStack(ModItems.BlankTalisman), new ItemStack[] {
						new ItemStack(Items.bed),
						new ItemStack(Items.sugar),
						new ItemStack(Items.iron_boots) });
		
	}

}
