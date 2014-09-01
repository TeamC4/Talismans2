package Talismans2.init;

import Talismans2.item.talismans.ItemBlankTalisman;
import Talismans2.item.talismans.ItemDragonTalisman;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * @author Gigabit101
 */

public class ModItems {
	
	public static Item BlankTalisman;
	public static Item DragonTalisman;
	
	public static void init(){
		//Blank Talisman
		BlankTalisman = new ItemBlankTalisman();
		GameRegistry.registerItem(BlankTalisman, "Blank Talisman");
		//Dragon Talisman
		DragonTalisman = new ItemDragonTalisman();
		GameRegistry.registerItem(DragonTalisman, "Dragon Talisman");
		
		
	}

}
