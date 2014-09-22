package Talismans2.module.thaumcraft;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.crafting.InfusionRecipe;
import Talismans2.util.TalismanStacks;

public class ThaumcraftRecipes {

	public static CrucibleRecipe BlankTalisman;
	public static InfusionRecipe FlameTalisman;
	public static InfusionRecipe WaterTalisman;
	public static InfusionRecipe LightTalisman;
	public static InfusionRecipe MovementTalisman;
	public static InfusionRecipe MiningTalisman;
	public static InfusionRecipe InvisibleTalisman;
	public static InfusionRecipe WitherlessTalisman;
	public static CrucibleRecipe BlankRing;
	public static InfusionRecipe FlameRing;
	public static InfusionRecipe WaterRing;
	public static InfusionRecipe LightRing;
	public static InfusionRecipe MovementRing;
	public static InfusionRecipe MiningRing;
	public static InfusionRecipe InvisibleRing;
	public static InfusionRecipe WitherlessRing;

	public static void init() {
		// Crucible Recipes
		BlankTalisman = ThaumcraftApi.addCrucibleRecipe("Blank_Talisman",
				TalismanStacks.talismanBlank, new ItemStack(Blocks.stone),
				new AspectList().add(Aspect.MAGIC, 12).add(Aspect.AIR, 10));
		BlankRing = ThaumcraftApi.addCrucibleRecipe("Blank_Ring",
				TalismanStacks.talismanRingBlank, new ItemStack(
						Items.iron_ingot),
				new AspectList().add(Aspect.MAGIC, 12).add(Aspect.METAL, 10));

		// Infusion Recipes
		FlameTalisman = ThaumcraftApi.addInfusionCraftingRecipe(
				"Flame_Talisman", TalismanStacks.talismanFlame, 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.FIRE, 15),
				TalismanStacks.talismanBlank, new ItemStack[] {
						new ItemStack(Items.coal),
						new ItemStack(Items.coal, 1, 1),
						new ItemStack(Items.lava_bucket),
						new ItemStack(Items.flint_and_steel) });

		WaterTalisman = ThaumcraftApi.addInfusionCraftingRecipe(
				"Water_Talisman", TalismanStacks.talismanWater, 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.WATER, 15),
				TalismanStacks.talismanBlank, new ItemStack[] {
						new ItemStack(Items.fish),
						new ItemStack(Items.fishing_rod),
						new ItemStack(Items.boat),
						new ItemStack(Items.water_bucket) });

		LightTalisman = ThaumcraftApi.addInfusionCraftingRecipe(
				"Light_Talisman", TalismanStacks.talismanLight, 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.LIGHT, 15),
				TalismanStacks.talismanBlank, new ItemStack[] {
						new ItemStack(Items.carrot),
						new ItemStack(Items.carrot),
						new ItemStack(Items.ender_eye) });

		MovementTalisman = ThaumcraftApi.addInfusionCraftingRecipe(
				"Movement_Talisman", TalismanStacks.talismanMovement, 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.MAN, 15),
				TalismanStacks.talismanBlank, new ItemStack[] {
						new ItemStack(Items.bed), new ItemStack(Items.sugar),
						new ItemStack(Items.iron_boots) });

		MiningTalisman = ThaumcraftApi
				.addInfusionCraftingRecipe(
						"Mining_Talisman",
						TalismanStacks.talismanMining,
						5,
						new AspectList().add(Aspect.MAGIC, 15).add(Aspect.TOOL,
								15), TalismanStacks.talismanBlank,
						new ItemStack[] { new ItemStack(Items.diamond_pickaxe),
								new ItemStack(Items.diamond_shovel),
								new ItemStack(Items.sugar),
								new ItemStack(Items.sugar) });

		InvisibleTalisman = ThaumcraftApi.addInfusionCraftingRecipe(
				"Invisible_Talisman", TalismanStacks.talismanInvisible, 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.MAN, 15),
				TalismanStacks.talismanBlank, new ItemStack[] {
						new ItemStack(Items.ghast_tear),
						new ItemStack(Items.blaze_powder),
						new ItemStack(Items.sugar) });

		WitherlessTalisman = ThaumcraftApi.addInfusionCraftingRecipe(
				"Witherless_Talisman",
				TalismanStacks.talismanWitherless,
				5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.MAN, 15)
						.add(Aspect.HEAL, 15), TalismanStacks.talismanBlank,
				new ItemStack[] { new ItemStack(Items.ghast_tear),
						new ItemStack(Items.milk_bucket),
						new ItemStack(Items.sugar) });

		FlameRing = ThaumcraftApi.addInfusionCraftingRecipe("Flame_Ring",
				TalismanStacks.talismanRingFlame, 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.FIRE, 15),
				TalismanStacks.talismanRingBlank, new ItemStack[] {
						new ItemStack(Items.coal),
						new ItemStack(Items.coal, 1, 1),
						new ItemStack(Items.lava_bucket) });

		WaterRing = ThaumcraftApi.addInfusionCraftingRecipe("Water_Ring",
				TalismanStacks.talismanRingWater, 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.WATER, 15),
				TalismanStacks.talismanRingBlank, new ItemStack[] {
						new ItemStack(Items.fish),
						new ItemStack(Items.fishing_rod),
						new ItemStack(Items.boat),
						new ItemStack(Items.water_bucket) });

		LightRing = ThaumcraftApi.addInfusionCraftingRecipe("Light_Ring",
				TalismanStacks.talismanRingLight, 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.LIGHT, 15),
				TalismanStacks.talismanRingBlank, new ItemStack[] {
						new ItemStack(Items.carrot),
						new ItemStack(Items.carrot),
						new ItemStack(Items.ender_eye) });

		InvisibleRing = ThaumcraftApi.addInfusionCraftingRecipe(
				"Invisible_Ring", TalismanStacks.talismanRingInvisible, 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.MAN, 15),
				TalismanStacks.talismanRingBlank, new ItemStack[] {
						new ItemStack(Items.ghast_tear),
						new ItemStack(Items.blaze_powder),
						new ItemStack(Items.sugar) });

		MiningRing = ThaumcraftApi
				.addInfusionCraftingRecipe("Mining_Ring",
						TalismanStacks.talismanRingMining, 5, new AspectList()
								.add(Aspect.MAGIC, 15).add(Aspect.TOOL, 15),
						TalismanStacks.talismanRingBlank, new ItemStack[] {
								new ItemStack(Items.diamond_shovel),
								new ItemStack(Items.diamond_pickaxe),
								new ItemStack(Items.sugar),
								new ItemStack(Items.sugar) });

		MovementRing = ThaumcraftApi.addInfusionCraftingRecipe("Movement_Ring",
				TalismanStacks.talismanRingMovement, 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.MAN, 15),
				TalismanStacks.talismanRingBlank, new ItemStack[] {
						new ItemStack(Items.bed),
						new ItemStack(Items.iron_boots),
						new ItemStack(Items.sugar) });

		WitherlessRing = ThaumcraftApi.addInfusionCraftingRecipe(
				"Witherless_Ring", TalismanStacks.talismanRingWitherless, 5,
				new AspectList().add(Aspect.MAGIC, 15).add(Aspect.HEAL, 15),
				TalismanStacks.talismanRingBlank, new ItemStack[] {
						new ItemStack(Items.ghast_tear),
						new ItemStack(Items.milk_bucket),
						new ItemStack(Items.sugar) });

	}

}
