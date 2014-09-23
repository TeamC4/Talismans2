package Talismans2.init;

import Talismans2.item.misc.ItemTalismanRings;
import Talismans2.item.talismans.*;
import Talismans2.module.bloodmagic.items.*;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * @author Gigabit101
 */

public class ModItems {

    //Default Items
	public static Item BlankTalisman;
	public static Item FlameTalisman;
	public static Item WaterTalisman;
	public static Item LightTalisman;
	public static Item MovementTalisman;
	public static Item MiningTalisman;
	public static Item InvisibleTalisman;
	public static Item WitherlessTalisman;
	public static Item CraftingTalisman;
	public static Item TalismanRings;
	public static Item TalismansDubugTool;

    //Blood Magic Talismans
    public static Item  BloodBlankTalisman;
    public static Item  BloodFlameTalisman;
    public static Item  BloodWaterTalisman;
    public static Item  BloodLightTalisman;
    public static Item  BloodMovementTalisman;
    public static Item  BloodMiningTalisman;
    public static Item  BloodInvisibleTalisman;
    public static Item  BloodWitherlessTalisman;
    public static Item  BloodCraftingTalisman;


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
		// Talismans Debug
		// TalismansDubugTool = new ItemTalismanDebug();
		// GameRegistry.registerItem(TalismansDubugTool,
		// "Talismans Debug Tool");

        if(Loader.isModLoaded("AWWayofTime")) {

            BloodBlankTalisman = new ItemBlankBloodTalisman();
            GameRegistry.registerItem(BloodBlankTalisman, "Blank Blood Talisman");

            BloodCraftingTalisman = new ItemBloodCraftingTalisman();
            GameRegistry.registerItem(BloodCraftingTalisman, "Blood Crafting Talisman");

            BloodFlameTalisman = new ItemBloodFlameTalisman();
            GameRegistry.registerItem(BloodFlameTalisman, "Blood Flame Talisman");

            BloodInvisibleTalisman = new ItemBloodInvisibleTalisman();
            GameRegistry.registerItem(BloodInvisibleTalisman, "Blood Invisible Talisman");

            BloodLightTalisman = new ItemBloodLightTalisman();
            GameRegistry.registerItem(BloodLightTalisman, "Blood Light Talisman");

            BloodMiningTalisman = new ItemBloodMiningTalisman();
            GameRegistry.registerItem(BloodMiningTalisman, "Blood Mining Talisman");

            BloodWaterTalisman = new ItemBloodWaterTalisman();
            GameRegistry.registerItem(BloodWaterTalisman, "Blood Water Talisman");

            BloodMovementTalisman = new ItemBloodMovementTalisman();
            GameRegistry.registerItem(BloodMovementTalisman, "Blood Movement Talisman");

            BloodWitherlessTalisman = new ItemBloodWitherlessTalisman();
            GameRegistry.registerItem(BloodWitherlessTalisman, "Blood Witherless Talisman");

        }

	}

}
