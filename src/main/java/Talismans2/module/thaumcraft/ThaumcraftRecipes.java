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
		BlankTalisman = ThaumcraftApi.addCrucibleRecipe("Blank_Talisman", new ItemStack(ModItems.BlankTalisman), new ItemStack(Blocks.stone), new AspectList().add(Aspect.MAGIC, 12).add(Aspect.AIR, 10));
		BlankRing = ThaumcraftApi.addCrucibleRecipe("Blank_Ring", new ItemStack(ModItems.TalismanRings), new ItemStack(Items.iron_ingot), new AspectList().add(Aspect.MAGIC, 12).add(Aspect.METAL, 10));

		// Infusion Recipes
		FlameTalisman = ThaumcraftApi.addInfusionCraftingRecipe("Flame_Talisman", new ItemStack(ModItems.FlameTalisman), 5, new AspectList().add(Aspect.MAGIC, 15).add(Aspect.FIRE, 15), new ItemStack(ModItems.BlankTalisman), new ItemStack[]
                {
						new ItemStack(Items.coal),
						new ItemStack(Items.coal, 1, 1),
						new ItemStack(Items.lava_bucket)
                });

		WaterTalisman = ThaumcraftApi.addInfusionCraftingRecipe("Water_Talisman", new ItemStack(ModItems.WaterTalisman), 5, new AspectList().add(Aspect.MAGIC, 15).add(Aspect.WATER, 15), new ItemStack(ModItems.BlankTalisman), new ItemStack[]
                {
						new ItemStack(Items.fish),
						new ItemStack(Items.fishing_rod),
						new ItemStack(Items.boat),
						new ItemStack(Items.water_bucket)
                });

		LightTalisman = ThaumcraftApi.addInfusionCraftingRecipe("Light_Talisman", new ItemStack(ModItems.LightTalisman), 5, new AspectList().add(Aspect.MAGIC, 15).add(Aspect.LIGHT, 15), new ItemStack(ModItems.BlankTalisman), new ItemStack[]
                {
						new ItemStack(Items.carrot),
						new ItemStack(Items.carrot),
						new ItemStack(Items.ender_eye)
                });

		MovementTalisman = ThaumcraftApi.addInfusionCraftingRecipe("Movement_Talisman", new ItemStack(ModItems.MovementTalisman), 5, new AspectList().add(Aspect.MAGIC, 15).add(Aspect.MAN, 15), new ItemStack(ModItems.BlankTalisman), new ItemStack[]
                {
						new ItemStack(Items.bed),
                        new ItemStack(Items.sugar),
						new ItemStack(Items.iron_boots)
                });

		MiningTalisman = ThaumcraftApi.addInfusionCraftingRecipe("Mining_Talisman", new ItemStack(ModItems.MiningTalisman), 5, new AspectList().add(Aspect.MAGIC, 15).add(Aspect.TOOL, 15), new ItemStack(ModItems.BlankTalisman), new ItemStack[]
                {
                        new ItemStack(Items.diamond_pickaxe),
						new ItemStack(Items.diamond_shovel),
						new ItemStack(Items.sugar),
						new ItemStack(Items.sugar)
                });
		
		InvisibleTalisman = ThaumcraftApi.addInfusionCraftingRecipe("Invisible_Talisman", new ItemStack(ModItems.InvisibleTalisman), 5, new AspectList().add(Aspect.MAGIC, 15).add(Aspect.MAN, 15), new ItemStack(ModItems.BlankTalisman), new ItemStack[]
                {
                        new ItemStack(Items.ghast_tear),
				        new ItemStack(Items.blaze_powder),
						new ItemStack(Items.sugar)
                });
		
		WitherlessTalisman = ThaumcraftApi.addInfusionCraftingRecipe("Witherless_Talisman", new ItemStack(ModItems.WitherlessTalisman), 5, new AspectList().add(Aspect.MAGIC, 15).add(Aspect.MAN,15).add(Aspect.HEAL,15), new ItemStack(ModItems.BlankTalisman), new ItemStack[]
                {
                        new ItemStack(Items.ghast_tear),
						new ItemStack(Items.milk_bucket),
						new ItemStack(Items.sugar)
                });
		
		FlameRing = ThaumcraftApi.addInfusionCraftingRecipe("Flame_Ring", new ItemStack(ModItems.TalismanRings,1,2), 5, new AspectList().add(Aspect.MAGIC, 15).add(Aspect.FIRE, 15), new ItemStack(ModItems.TalismanRings), new ItemStack[]
                {
						new ItemStack(Items.coal),
						new ItemStack(Items.coal, 1, 1),
						new ItemStack(Items.lava_bucket)
                });
		
		WaterRing = ThaumcraftApi.addInfusionCraftingRecipe("Water_Ring", new ItemStack(ModItems.TalismanRings,1,7), 5, new AspectList().add(Aspect.MAGIC, 15).add(Aspect.WATER, 15), new ItemStack(ModItems.TalismanRings), new ItemStack[]
                {
		             	new ItemStack(Items.fish),
			            new ItemStack(Items.fishing_rod),
			            new ItemStack(Items.boat),
			            new ItemStack(Items.water_bucket)
                });
		
		LightRing = ThaumcraftApi.addInfusionCraftingRecipe("Light_Ring", new ItemStack(ModItems.TalismanRings,1,4), 5, new AspectList().add(Aspect.MAGIC, 15).add(Aspect.LIGHT, 15), new ItemStack(ModItems.TalismanRings), new ItemStack[]
                {
			            new ItemStack(Items.carrot),
		             	new ItemStack(Items.carrot),
			            new ItemStack(Items.ender_eye)
                });
		
		InvisibleRing = ThaumcraftApi.addInfusionCraftingRecipe("Invisible_Ring", new ItemStack(ModItems.TalismanRings,1,3), 5, new AspectList().add(Aspect.MAGIC, 15).add(Aspect.MAN, 15), new ItemStack(ModItems.TalismanRings), new ItemStack[]
                {
			            new ItemStack(Items.ghast_tear),
		             	new ItemStack(Items.blaze_powder),
			            new ItemStack(Items.sugar)
                });
		
		MiningRing = ThaumcraftApi.addInfusionCraftingRecipe("Mining_Ring", new ItemStack(ModItems.TalismanRings,1,5), 5, new AspectList().add(Aspect.MAGIC, 15).add(Aspect.TOOL, 15), new ItemStack(ModItems.TalismanRings), new ItemStack[]
                {
			            new ItemStack(Items.diamond_shovel),
		             	new ItemStack(Items.diamond_pickaxe),
			            new ItemStack(Items.sugar),
			            new ItemStack(Items.sugar)
                });
		
		MovementRing = ThaumcraftApi.addInfusionCraftingRecipe("Movement_Ring", new ItemStack(ModItems.TalismanRings,1,6), 5, new AspectList().add(Aspect.MAGIC, 15).add(Aspect.MAN, 15), new ItemStack(ModItems.TalismanRings), new ItemStack[]
                {
			            new ItemStack(Items.bed),
		             	new ItemStack(Items.iron_boots),
			            new ItemStack(Items.sugar)
                });
		
		WitherlessRing = ThaumcraftApi.addInfusionCraftingRecipe("Witherless_Ring", new ItemStack(ModItems.TalismanRings,1,8), 5, new AspectList().add(Aspect.MAGIC, 15).add(Aspect.HEAL, 15), new ItemStack(ModItems.TalismanRings), new ItemStack[]
                {
			            new ItemStack(Items.ghast_tear),
		             	new ItemStack(Items.milk_bucket),
			            new ItemStack(Items.sugar)
                });
		
		

	}

}
