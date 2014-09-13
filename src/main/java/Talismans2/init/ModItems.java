package Talismans2.init;

import net.minecraft.item.Item;
import Talismans2.item.talismans.ItemBlankTalisman;
import Talismans2.item.talismans.ItemFlameTalisman;
import Talismans2.item.talismans.ItemLightTalisman;
import Talismans2.item.talismans.ItemMiningTalisman;
import Talismans2.item.talismans.ItemMovementTalisman;
import Talismans2.item.talismans.ItemWaterTalisman;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Gigabit101
 */

public class ModItems {

	public static Item BlankTalisman;
	public static Item FlameTalisman;
	public static Item WaterTalisman;
	public static Item LightTalisman;
	public static Item MovementTalisman;
	public static Item MiningTalisman;

	public static void init() {
		// Blank Talisman
		BlankTalisman = new ItemBlankTalisman();
		GameRegistry.registerItem(BlankTalisman, "Blank Talisman");
		// Flame Talisman
		FlameTalisman = new ItemFlameTalisman();
		GameRegistry.registerItem(FlameTalisman, "Flame Talisman");
		// Water Talisman
		WaterTalisman = new ItemWaterTalisman();
		GameRegistry.registerItem(WaterTalisman, "Water Talisman");
		// Light Talisman
		LightTalisman = new ItemLightTalisman();
		GameRegistry.registerItem(LightTalisman, "Light Talisman");
		// Movement Talisman
		MovementTalisman = new ItemMovementTalisman();
		GameRegistry.registerItem(MovementTalisman, "Movement Talisman");
		// Mining Talisman
		MiningTalisman = new ItemMiningTalisman();
		GameRegistry.registerItem(MiningTalisman, "Mining Talisman");

	}

}
