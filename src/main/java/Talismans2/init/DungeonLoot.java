package Talismans2.init;

import java.util.Properties;

import Talismans2.config.ConfigTalismans;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

/**
 * @author Gigabit101
 */

public class DungeonLoot {
		
    public static void init(ConfigTalismans properties) {
        if (properties.BlankTalismanLootTrue) {
            ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.BlankTalisman), 0, 1, ConfigTalismans.ChanceBlankTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.BlankTalisman), 0, 1, ConfigTalismans.ChanceBlankTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.BlankTalisman), 0, 1, ConfigTalismans.ChanceBlankTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.BlankTalisman), 0, 1, ConfigTalismans.ChanceBlankTalisman));
        }
        if (properties.FlameTalismanLootTrue) {
            ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.FlameTalisman), 0, 1, ConfigTalismans.ChanceFlameTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.FlameTalisman), 0, 1, ConfigTalismans.ChanceFlameTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.FlameTalisman), 0, 1, ConfigTalismans.ChanceFlameTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.FlameTalisman), 0, 1, ConfigTalismans.ChanceFlameTalisman));
        }
        if (properties.LightTalismanLootTrue) {
            ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.LightTalisman), 0, 1, ConfigTalismans.ChanceLightTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.LightTalisman), 0, 1, ConfigTalismans.ChanceLightTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.LightTalisman), 0, 1, ConfigTalismans.ChanceLightTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.LightTalisman), 0, 1, ConfigTalismans.ChanceLightTalisman));
        }
        if (properties.MiningTalismanLootTrue) {
            ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.MiningTalisman), 0, 1, ConfigTalismans.ChanceMiningTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.MiningTalisman), 0, 1, ConfigTalismans.ChanceMiningTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.MiningTalisman), 0, 1, ConfigTalismans.ChanceMiningTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.MiningTalisman), 0, 1, ConfigTalismans.ChanceMiningTalisman));
        }
        if (properties.MovementTalismanLootTrue) {
            ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.MovementTalisman), 0, 1, ConfigTalismans.ChanceMovementTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.MovementTalisman), 0, 1, ConfigTalismans.ChanceMovementTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.MovementTalisman), 0, 1, ConfigTalismans.ChanceMovementTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.MovementTalisman), 0, 1, ConfigTalismans.ChanceMovementTalisman));
        }
        if (properties.WaterTalismanLootTrue) {
            ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.WaterTalisman), 0, 1, ConfigTalismans.ChanceWaterTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.WaterTalisman), 0, 1, ConfigTalismans.ChanceWaterTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.WaterTalisman), 0, 1, ConfigTalismans.ChanceWaterTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.WaterTalisman), 0, 1, ConfigTalismans.ChanceWaterTalisman));
        }
        if (properties.InvisibleTalismanLootTrue){
        	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.InvisibleTalisman), 0, 1, ConfigTalismans.ChanceInvisibleTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.InvisibleTalisman), 0, 1, ConfigTalismans.ChanceInvisibleTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.InvisibleTalisman), 0, 1, ConfigTalismans.ChanceInvisibleTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.InvisibleTalisman), 0, 1, ConfigTalismans.ChanceInvisibleTalisman));
        }
        if (properties.WitherlessTalismanLootTrue){
        	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.WitherlessTalisman), 0, 1, ConfigTalismans.ChanceWitherlessTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.WitherlessTalisman), 0, 1, ConfigTalismans.ChanceWitherlessTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.WitherlessTalisman), 0, 1, ConfigTalismans.ChanceWitherlessTalisman));
            ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(ModItems.WitherlessTalisman), 0, 1, ConfigTalismans.ChanceWitherlessTalisman));
        }

    }

}
