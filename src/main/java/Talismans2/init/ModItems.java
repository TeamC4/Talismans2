package Talismans2.init;

import Talismans2.item.ItemTalismanBauble;
import Talismans2.item.misc.ItemTalismanRings;
import Talismans2.lib.Modinfo;
import Talismans2.lib.Names;
import baubles.api.BaubleType;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author Gigabit101
 */

public class ModItems 
{
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

	public static void init()
	{
		//Blank Talisman
		BlankTalisman = new ItemTalismanBauble(null, null, false, BaubleType.AMULET).setUnlocalizedName(Names.NameBlankTalisman);
		GameRegistry.registerItem(BlankTalisman, Names.NameBlankTalisman);
		// Flame Talisman
		FlameTalisman = new ItemTalismanBauble(Potion.fireResistance, null, false, BaubleType.AMULET).setUnlocalizedName(Names.NameFlameTalisman);
		GameRegistry.registerItem(FlameTalisman, Names.NameFlameTalisman);
		// Water Talisman
		WaterTalisman = new ItemTalismanBauble(Potion.waterBreathing, null, false, BaubleType.AMULET).setUnlocalizedName(Names.NameWaterTalisman);
		GameRegistry.registerItem(WaterTalisman, Names.NameWaterTalisman);
		// Light Talisman
		LightTalisman = new ItemTalismanBauble(Potion.nightVision, null, false, BaubleType.AMULET).setUnlocalizedName(Names.NameLightTalisman);
		GameRegistry.registerItem(LightTalisman, Names.NameLightTalisman);
		// Movement Talisman
		MovementTalisman = new ItemTalismanBauble(Potion.moveSpeed, Potion.jump, false, BaubleType.AMULET).setUnlocalizedName(Names.NameMovementTalisman);
		GameRegistry.registerItem(MovementTalisman, Names.NameMovementTalisman);
		// Mining Talisman
		MiningTalisman = new ItemTalismanBauble(Potion.digSpeed, null, false, BaubleType.AMULET).setUnlocalizedName(Names.NameminingTalisman);
		GameRegistry.registerItem(MiningTalisman, Names.NameminingTalisman);
		// Invisible Talisman
		InvisibleTalisman = new ItemTalismanBauble(Potion.invisibility, null, false, BaubleType.AMULET).setUnlocalizedName(Names.NameInvisibleTalisman);
		GameRegistry.registerItem(InvisibleTalisman, Names.NameInvisibleTalisman);
		// Witherless Talisman
		WitherlessTalisman = new ItemTalismanBauble(Potion.wither, null, true, BaubleType.AMULET).setUnlocalizedName(Names.NameWitherlessTalisman);
		GameRegistry.registerItem(WitherlessTalisman, Names.NameWitherlessTalisman);
		// Crafting Talisman
		CraftingTalisman = new ItemTalismanBauble(null, null, false, BaubleType.AMULET).setUnlocalizedName(Names.NameCraftTalisman);
		GameRegistry.registerItem(CraftingTalisman, Names.NameCraftTalisman);
		// Talisman Rings
		TalismanRings = new ItemTalismanRings();
		GameRegistry.registerItem(TalismanRings, Names.NameTalismanRing);

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
		registerMetaRender(TalismanRings);
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Modinfo.ID.toLowerCase() + ":" + item.getUnlocalizedName().toLowerCase().substring(5), "inventory"));
	}
	
	@SideOnly(Side.CLIENT)
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
