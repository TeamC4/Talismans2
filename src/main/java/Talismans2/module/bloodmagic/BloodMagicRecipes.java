package Talismans2.module.bloodmagic;

import Talismans2.util.TalismanStacks;
import WayofTime.alchemicalWizardry.api.altarRecipeRegistry.AltarRecipeRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

public class BloodMagicRecipes {



    public static void init()
    {
        //Altar Recipes
        AltarRecipeRegistry.registerAltarRecipe(TalismanStacks.talismanCrafting, new ItemStack(Blocks.crafting_table), 1, 400, 10, 1, false);

    }
}
