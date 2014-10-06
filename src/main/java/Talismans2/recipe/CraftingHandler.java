package Talismans2.recipe;

import net.minecraft.item.ItemStack;
import Talismans2.config.ConfigTalismans;
import Talismans2.init.ModItems;
import Talismans2.util.TalismanStacks;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingHandler {

	public static void CopyTalismans(ConfigTalismans properties) {
		if (properties.CopyTalismansTrue)
			addCopyRecipes();

	}

	public static void addCopyRecipes() {
		GameRegistry.addShapelessRecipe(TalismanStacks.talismanFlame,
				TalismanStacks.talismanBlank , TalismanStacks.talismanFlame);
		
		GameRegistry.addShapelessRecipe(TalismanStacks.talismanWater,
				TalismanStacks.talismanBlank , TalismanStacks.talismanWater);

		GameRegistry.addShapelessRecipe(TalismanStacks.talismanCrafting,
				TalismanStacks.talismanBlank , TalismanStacks.talismanCrafting);

		GameRegistry.addShapelessRecipe(TalismanStacks.talismanInvisible,
				TalismanStacks.talismanBlank , TalismanStacks.talismanInvisible);

		GameRegistry.addShapelessRecipe(TalismanStacks.talismanLight,
				TalismanStacks.talismanBlank , TalismanStacks.talismanLight);

		GameRegistry.addShapelessRecipe(TalismanStacks.talismanMining,
				TalismanStacks.talismanBlank , TalismanStacks.talismanMining);

		GameRegistry.addShapelessRecipe(TalismanStacks.talismanMovement,
				TalismanStacks.talismanBlank , TalismanStacks.talismanMovement);

		GameRegistry.addShapelessRecipe(TalismanStacks.talismanWitherless,
				TalismanStacks.talismanBlank , TalismanStacks.talismanWitherless);
		
		GameRegistry.addShapelessRecipe(TalismanStacks.talismanMagnet,
				TalismanStacks.talismanBlank , TalismanStacks.talismanMagnet);

	}
}
