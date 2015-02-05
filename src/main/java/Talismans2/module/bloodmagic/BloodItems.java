package Talismans2.module.bloodmagic;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import Talismans2.lib.Modinfo;
import Talismans2.lib.Names;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodFlameTalisman;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodInvisibleTalisman;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodLightTalisman;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodMiningTalisman;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodMovementTalisman;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodWaterTalisman;
import Talismans2.module.bloodmagic.items.talismans.ItemBloodWitherlessTalisman;

/**
 * @author Gigabit101
 */

public class BloodItems {

	// Blood Magic Talismans
	public static Item BloodFlameTalisman;
	public static Item BloodWaterTalisman;
	public static Item BloodLightTalisman;
	public static Item BloodMovementTalisman;
	public static Item BloodMiningTalisman;
	public static Item BloodInvisibleTalisman;
	public static Item BloodWitherlessTalisman;

	public static void init()
	{
		BloodFlameTalisman = new ItemBloodFlameTalisman();
		GameRegistry.registerItem(BloodFlameTalisman, Names.NameBloodFlameTalisman);

		BloodWaterTalisman = new ItemBloodWaterTalisman();
		GameRegistry.registerItem(BloodWaterTalisman, Names.NameBloodWaterTalisman);

		BloodLightTalisman = new ItemBloodLightTalisman();
		GameRegistry.registerItem(BloodLightTalisman, Names.NameBloodLightTalisman);

		BloodMovementTalisman = new ItemBloodMovementTalisman();
		GameRegistry.registerItem(BloodMovementTalisman,Names.NameBloodMovementTalisman);

		BloodMiningTalisman = new ItemBloodMiningTalisman();
		GameRegistry.registerItem(BloodMiningTalisman, Names.NameBloodMiningTalisman);

		BloodInvisibleTalisman = new ItemBloodInvisibleTalisman();
		GameRegistry.registerItem(BloodInvisibleTalisman, Names.NameBloodInvisibleTalisman);

		BloodWitherlessTalisman = new ItemBloodWitherlessTalisman();
		GameRegistry.registerItem(BloodWitherlessTalisman, Names.NameBloodWitherlessTalisman);
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders()
	{
		registerRender(BloodFlameTalisman);
		registerRender(BloodInvisibleTalisman);
		registerRender(BloodLightTalisman);
		registerRender(BloodMiningTalisman);
		registerRender(BloodMovementTalisman);
		registerRender(BloodWaterTalisman);
		registerRender(BloodWitherlessTalisman);
		
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Modinfo.ID.toLowerCase() + ":" + item.getUnlocalizedName().toLowerCase().substring(5), "inventory"));
	}

}
