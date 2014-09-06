package Talismans2.module.thaumcraft;

import Talismans2.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;

public class ThaumcraftRecipes {

	public static IRecipe BlankTalisman;
	public static IRecipe FlameTalisman;
	
	public static void init(){
		
        BlankTalisman = GameRegistry.addShapedRecipe(new ItemStack(ModItems.BlankTalisman), "XSX", "SDS", "XSX", 'S', new ItemStack(Blocks.stone), 'D', new ItemStack(Items.diamond));
        FlameTalisman = GameRegistry.addShapedRecipe(new ItemStack(ModItems.FlameTalisman), "XFX", "XDX", "XXX", 'F', new ItemStack(Items.potionitem), 'D', new ItemStack(Items.diamond));


	}

}
