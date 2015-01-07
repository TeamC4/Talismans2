package Talismans2.module.botania;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import Talismans2.module.botania.items.ItemManaFlameTalisman;

public class BotaniaItems {
	
	public static Item FlameManaTalisman;
	
	public static void init()
	{
		FlameManaTalisman = new ItemManaFlameTalisman();
		GameRegistry.registerItem(FlameManaTalisman, "manaFlameTalisman");
	}

}
