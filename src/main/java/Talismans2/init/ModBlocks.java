package Talismans2.init;

import Talismans2.block.BlockTalismanCrafter;
import Talismans2.block.TileTalismanCrafter;
import Talismans2.lib.Modinfo;
import Talismans2.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author Gigabit101
 */

public class ModBlocks 
{
	public static Block TalismanCrafter;
	
	public static void init()
	{
		TalismanCrafter = new BlockTalismanCrafter(Material.iron);
		GameRegistry.registerBlock(TalismanCrafter, Names.NameTalismanCrafter);
		GameRegistry.registerTileEntity(TileTalismanCrafter.class, Names.NameTalismanCrafter);
	}
	
	public static void registerRenders()
	{
		registerRender(TalismanCrafter);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
        
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Modinfo.ID.toLowerCase() + ":" + item.getUnlocalizedName().substring(5), "inventory"));
        ModelBakery.addVariantName(Item.getItemFromBlock(block), Modinfo.ID.toLowerCase() + ":" + item.getUnlocalizedName().substring(5));

	}

}
