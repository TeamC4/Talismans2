package Talismans2.recipe;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import Talismans2.config.ConfigTalismans;
import Talismans2.init.ModItems;

public class CopyingTalismans {

    public static void init(ConfigTalismans properties) {
        if (properties.CopyTalismansTrue)
            GameRegistry.addShapelessRecipe(new ItemStack(ModItems.FlameTalisman),
                    new Object[]{new ItemStack(ModItems.BlankTalisman),
                            ModItems.FlameTalisman});

    }
}
