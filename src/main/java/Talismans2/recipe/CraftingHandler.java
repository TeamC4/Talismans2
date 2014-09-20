package Talismans2.recipe;

import net.minecraft.item.ItemStack;
import Talismans2.config.ConfigTalismans;
import Talismans2.init.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingHandler {

	public static void CopyTalismans(ConfigTalismans properties){
		if (properties.CopyTalismansTrue)
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.FlameTalisman,2),
					new Object[] { new ItemStack(ModItems.BlankTalisman),
							ModItems.FlameTalisman});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.CraftingTalisman,2),
				new Object[] { new ItemStack(ModItems.BlankTalisman),
						ModItems.CraftingTalisman});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.InvisibleTalisman,2),
				new Object[] { new ItemStack(ModItems.BlankTalisman),
						ModItems.InvisibleTalisman});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LightTalisman,2),
				new Object[] { new ItemStack(ModItems.BlankTalisman),
						ModItems.LightTalisman});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.MiningTalisman,2),
				new Object[] { new ItemStack(ModItems.BlankTalisman),
						ModItems.MiningTalisman});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.MovementTalisman,2),
				new Object[] { new ItemStack(ModItems.BlankTalisman),
						ModItems.MovementTalisman});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.WitherlessTalisman,2),
				new Object[] { new ItemStack(ModItems.BlankTalisman),
						ModItems.WitherlessTalisman});
		
	}
}
