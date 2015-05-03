package Talismans2.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import Talismans2.item.misc.ItemCraftingItems;
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
import Talismans2.lib.Modinfo;
import Talismans2.lib.Names;

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
	public static Item TalismanRings;
	public static Item CraftingItems;

	public static void init()
	{
		// Blank Talisman
		BlankTalisman = new ItemBlankTalisman();
		GameRegistry.registerItem(BlankTalisman, Names.NameBlankTalisman);
		// Flame Talisman
		FlameTalisman = new ItemFlameTalisman();
		GameRegistry.registerItem(FlameTalisman, Names.NameFlameTalisman);
		// Water Talisman
		WaterTalisman = new ItemWaterTalisman();
		GameRegistry.registerItem(WaterTalisman, Names.NameWaterTalisman);
		// Light Talisman
		LightTalisman = new ItemLightTalisman();
		GameRegistry.registerItem(LightTalisman, Names.NameLightTalisman);
		// Movement Talisman
		MovementTalisman = new ItemMovementTalisman();
		GameRegistry.registerItem(MovementTalisman, Names.NameMovementTalisman);
		// Mining Talisman
		MiningTalisman = new ItemMiningTalisman();
		GameRegistry.registerItem(MiningTalisman, Names.NameminingTalisman);
		// Invisible Talisman
		InvisibleTalisman = new ItemInvisibleTalisman();
		GameRegistry.registerItem(InvisibleTalisman, Names.NameInvisibleTalisman);
		// Witherless Talisman
		WitherlessTalisman = new ItemWitherlessTalisman();
		GameRegistry.registerItem(WitherlessTalisman, Names.NameWitherlessTalisman);
		// Crafting Talisman
		CraftingTalisman = new ItemCraftingTalisman();
		GameRegistry.registerItem(CraftingTalisman, Names.NameCraftTalisman);
		// Talisman Rings
		TalismanRings = new ItemTalismanRings();
		GameRegistry.registerItem(TalismanRings, Names.NameTalismanRing);
		// Crafting Items
		CraftingItems = new ItemCraftingItems();
		GameRegistry.registerItem(CraftingItems, Names.NameCraftingItem);

		// Container Items
		FlameTalisman.setContainerItem(FlameTalisman);
		WaterTalisman.setContainerItem(WaterTalisman);
		LightTalisman.setContainerItem(LightTalisman);
		MovementTalisman.setContainerItem(MovementTalisman);
		MiningTalisman.setContainerItem(MiningTalisman);
		InvisibleTalisman.setContainerItem(InvisibleTalisman);
		WitherlessTalisman.setContainerItem(WitherlessTalisman);
		CraftingTalisman.setContainerItem(CraftingTalisman);

	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders()
	{
		registerRender(BlankTalisman);
		registerRender(CraftingTalisman);
		registerRender(FlameTalisman);
		registerRender(InvisibleTalisman);
		registerRender(LightTalisman);
		registerRender(MiningTalisman);
		registerRender(MovementTalisman);
		registerRender(WaterTalisman);
		registerRender(WitherlessTalisman);
		registerRender(CraftingItems);
		
		registerMetaRender(TalismanRings);
	
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Modinfo.ID.toLowerCase() + ":" + item.getUnlocalizedName().toLowerCase().substring(5), "inventory"));
	}
	
	public static void registerMetaRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Modinfo.ID.toLowerCase() + ":" + item.getUnlocalizedName().toLowerCase().substring(5), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 1, new ModelResourceLocation(Modinfo.ID.toLowerCase() + ":" + item.getUnlocalizedName().toLowerCase().substring(5), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 2, new ModelResourceLocation(Modinfo.ID.toLowerCase() + ":" + item.getUnlocalizedName().toLowerCase().substring(5), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 3, new ModelResourceLocation(Modinfo.ID.toLowerCase() + ":" + item.getUnlocalizedName().toLowerCase().substring(5), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 4, new ModelResourceLocation(Modinfo.ID.toLowerCase() + ":" + item.getUnlocalizedName().toLowerCase().substring(5), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 5, new ModelResourceLocation(Modinfo.ID.toLowerCase() + ":" + item.getUnlocalizedName().toLowerCase().substring(5), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 6, new ModelResourceLocation(Modinfo.ID.toLowerCase() + ":" + item.getUnlocalizedName().toLowerCase().substring(5), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 7, new ModelResourceLocation(Modinfo.ID.toLowerCase() + ":" + item.getUnlocalizedName().toLowerCase().substring(5), "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 8, new ModelResourceLocation(Modinfo.ID.toLowerCase() + ":" + item.getUnlocalizedName().toLowerCase().substring(5), "inventory"));
	}

}
