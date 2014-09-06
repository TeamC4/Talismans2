package Talismans2.init;

import Talismans2.item.talismans.ItemBlankTalisman;
import Talismans2.item.talismans.ItemFlameTalisman;
import Talismans2.item.talismans.ItemLightTalisman;
import Talismans2.item.talismans.ItemWaterTalisman;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * @author Gigabit101
 */

public class ModItems {
	
	public static Item BlankTalisman;
	public static Item FlameTalisman;
	public static Item WaterTalisman;
	public static Item LightTalisman;
	
	public static void init(){
		//Blank Talisman
		BlankTalisman = new ItemBlankTalisman();
		GameRegistry.registerItem(BlankTalisman, "Blank Talisman");
		//Flame Talisman
		FlameTalisman = new ItemFlameTalisman();
		GameRegistry.registerItem(FlameTalisman, "Flame Talisman");
		//Water Talisman
		WaterTalisman = new ItemWaterTalisman();
		GameRegistry.registerItem(WaterTalisman, "Water Talisman");
		//Light Talisman
		LightTalisman = new ItemLightTalisman();
		GameRegistry.registerItem(LightTalisman, "Light Talisman");
		
		
	}

}
