package Talismans2.module.bloodmagic;

import Talismans2.init.ModItems;
import Talismans2.util.TalismanStacks;
import WayofTime.alchemicalWizardry.api.altarRecipeRegistry.AltarRecipeRegistry;
import WayofTime.alchemicalWizardry.api.bindingRegistry.BindingRecipe;
import WayofTime.alchemicalWizardry.api.bindingRegistry.BindingRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class BloodMagicRecipes {


    public static void init() {
        //Altar Recipes
        AltarRecipeRegistry.registerAltarRecipe(TalismanStacks.talismanCrafting, new ItemStack(Blocks.crafting_table), 3, 6000, 10, 1, false);
        AltarRecipeRegistry.registerAltarRecipe(TalismanStacks.talismanFlame, new ItemStack(Items.flint_and_steel), 3, 6000, 10, 1, false);
        AltarRecipeRegistry.registerAltarRecipe(TalismanStacks.talismanInvisible, new ItemStack(Items.carrot), 3, 6000, 10, 1, false);
        AltarRecipeRegistry.registerAltarRecipe(TalismanStacks.talismanLight, new ItemStack(Blocks.torch), 3, 6000, 10, 1, false);
        AltarRecipeRegistry.registerAltarRecipe(TalismanStacks.talismanMining, new ItemStack(Items.diamond_pickaxe), 3, 6000, 10, 1, false);
        AltarRecipeRegistry.registerAltarRecipe(TalismanStacks.talismanMovement, new ItemStack(Items.diamond_boots), 3, 6000, 10, 1, false);
        AltarRecipeRegistry.registerAltarRecipe(TalismanStacks.talismanWater, new ItemStack(Items.water_bucket), 3, 6000, 10, 1, false);
        AltarRecipeRegistry.registerAltarRecipe(TalismanStacks.talismanWitherless, new ItemStack(Blocks.skull), 3, 6000, 10, 1, false);
        
        //Binding Recipes
        BindingRegistry.registerRecipe(TalismanStacks.talismanRingCrafting, TalismanStacks.talismanCrafting);
        BindingRegistry.registerRecipe(TalismanStacks.talismanRingFlame, TalismanStacks.talismanFlame);
        BindingRegistry.registerRecipe(TalismanStacks.talismanRingInvisible, TalismanStacks.talismanInvisible);
        BindingRegistry.registerRecipe(TalismanStacks.talismanRingLight, TalismanStacks.talismanLight);
        BindingRegistry.registerRecipe(TalismanStacks.talismanRingMining, TalismanStacks.talismanMining);
        BindingRegistry.registerRecipe(TalismanStacks.talismanRingMovement, TalismanStacks.talismanMovement);
        BindingRegistry.registerRecipe(TalismanStacks.talismanRingWater, TalismanStacks.talismanWater);
        BindingRegistry.registerRecipe(TalismanStacks.talismanRingWitherless, TalismanStacks.talismanWitherless);


    }
}
