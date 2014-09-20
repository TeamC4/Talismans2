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
        BindingRegistry.registerRecipe(new ItemStack(ModItems.TalismanRings,1,1), TalismanStacks.talismanCrafting);
        BindingRegistry.registerRecipe(new ItemStack(ModItems.TalismanRings,1,2), TalismanStacks.talismanFlame);
        BindingRegistry.registerRecipe(new ItemStack(ModItems.TalismanRings,1,3), TalismanStacks.talismanInvisible);
        BindingRegistry.registerRecipe(new ItemStack(ModItems.TalismanRings,1,4), TalismanStacks.talismanLight);
        BindingRegistry.registerRecipe(new ItemStack(ModItems.TalismanRings,1,5), TalismanStacks.talismanMining);
        BindingRegistry.registerRecipe(new ItemStack(ModItems.TalismanRings,1,6), TalismanStacks.talismanMovement);
        BindingRegistry.registerRecipe(new ItemStack(ModItems.TalismanRings,1,7), TalismanStacks.talismanWater);
        BindingRegistry.registerRecipe(new ItemStack(ModItems.TalismanRings,1,8), TalismanStacks.talismanWitherless);


    }
}
