package Talismans2.module.bloodmagic;

import net.minecraft.item.Item;
import Talismans2.module.bloodmagic.items.talismans.ItemBlankBloodTalisman;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodCraftingTalisman;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodFlameTalisman;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodInvisibleTalisman;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodLightTalisman;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodMiningTalisman;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodMovementTalisman;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodWaterTalisman;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodWitherlessTalisman;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * @author Gigabit101
 */

public class BloodItems {

	// Blood Magic Talismans
	public static Item BloodBlankTalisman;
	public static Item BloodFlameTalisman;
	public static Item BloodWaterTalisman;
	public static Item BloodLightTalisman;
	public static Item BloodMovementTalisman;
	public static Item BloodMiningTalisman;
	public static Item BloodInvisibleTalisman;
	public static Item BloodWitherlessTalisman;
	public static Item BloodCraftingTalisman;

	public static void init() {

		BloodBlankTalisman = new ItemBlankBloodTalisman();
		GameRegistry.registerItem(BloodBlankTalisman, "Blank Blood Talisman");

		BloodFlameTalisman = new ItemBloodFlameTalisman();
		GameRegistry.registerItem(BloodFlameTalisman, "Blood Flame Talisman");

		BloodWaterTalisman = new ItemBloodWaterTalisman();
		GameRegistry.registerItem(BloodWaterTalisman, "Blood Water Talisman");

		BloodLightTalisman = new ItemBloodLightTalisman();
		GameRegistry.registerItem(BloodLightTalisman, "Blood Light Talisman");

		BloodMovementTalisman = new ItemBloodMovementTalisman();
		GameRegistry.registerItem(BloodMovementTalisman, "Blood Movement Talisman");

		BloodMiningTalisman = new ItemBloodMiningTalisman();
		GameRegistry.registerItem(BloodMiningTalisman, "Blood Mining Talisman");

		BloodInvisibleTalisman = new ItemBloodInvisibleTalisman();
		GameRegistry.registerItem(BloodInvisibleTalisman, "Blood Invisible Talisman");

		BloodWitherlessTalisman = new ItemBloodWitherlessTalisman();
		GameRegistry.registerItem(BloodWitherlessTalisman, "Blood Witherless Talisman");

		BloodCraftingTalisman = new ItemBloodCraftingTalisman();
		GameRegistry.registerItem(BloodCraftingTalisman, "Blood Crafting Talisman");
	}

}
