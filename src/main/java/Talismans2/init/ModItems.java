package Talismans2.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import Talismans2.item.misc.ItemTalismanRings;
import Talismans2.item.talismans.ItemBlankTalisman;
import Talismans2.item.talismans.ItemCraftingTalisman;
import Talismans2.item.talismans.ItemFlameTalisman;
import Talismans2.item.talismans.ItemInvisibleTalisman;
import Talismans2.item.talismans.ItemLightTalisman;
import Talismans2.item.talismans.ItemMiningTalisman;
import Talismans2.item.talismans.ItemMovementTalisman;
import Talismans2.item.talismans.ItemWaterTalisman;
import Talismans2.item.talismans.ItemWitherlessTalisman;

/**
 * @author Gigabit101
 */

public class ModItems {

	// Default Items
	public static Item BlankTalisman;
	public static Item FlameTalisman;
	public static Item WaterTalisman;
	public static Item LightTalisman;
	public static Item MovementTalisman;
	public static Item MiningTalisman;
	public static Item InvisibleTalisman;
	public static Item WitherlessTalisman;
	public static Item CraftingTalisman;
	public static Item MagnetTalisman;
	public static Item TalismanRings;

	public static void init()
	{
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
		// Invisible Talisman
		InvisibleTalisman = new ItemInvisibleTalisman();
		GameRegistry.registerItem(InvisibleTalisman, "Invisible Talisman");
		// Witherless Talisman
		WitherlessTalisman = new ItemWitherlessTalisman();
		GameRegistry.registerItem(WitherlessTalisman, "Witherless Talisman");
		// Crafting Talisman
		CraftingTalisman = new ItemCraftingTalisman();
		GameRegistry.registerItem(CraftingTalisman, "Crafting Talisman");
		// Talisman Rings
		TalismanRings = new ItemTalismanRings();
		GameRegistry.registerItem(TalismanRings, "Talisman Rings");

		// Container Items
		FlameTalisman.setContainerItem(FlameTalisman);
		WaterTalisman.setContainerItem(WaterTalisman);
		LightTalisman.setContainerItem(LightTalisman);
		MovementTalisman.setContainerItem(MovementTalisman);
		MiningTalisman.setContainerItem(MiningTalisman);
		InvisibleTalisman.setContainerItem(InvisibleTalisman);
		WitherlessTalisman.setContainerItem(WitherlessTalisman);
		CraftingTalisman.setContainerItem(CraftingTalisman);
		MagnetTalisman.setContainerItem(MagnetTalisman);
		MagnetTalisman.setContainerItem(MagnetTalisman);

	}

}
