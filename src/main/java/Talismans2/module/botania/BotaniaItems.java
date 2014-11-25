package Talismans2.module.botania;

import cpw.mods.fml.common.registry.GameRegistry;
import Talismans2.module.botania.items.ItemManaFlameTalisman;
import net.minecraft.item.Item;

public class BotaniaItems {
	
	public static Item FlameManaTalisman;
	
	public static void init()
	{
		FlameManaTalisman = new ItemManaFlameTalisman();
		GameRegistry.registerItem(FlameManaTalisman, "manaFlameTalisman");
	}

}
