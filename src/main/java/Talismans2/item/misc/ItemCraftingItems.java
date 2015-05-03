package Talismans2.item.misc;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import Talismans2.Talismans2;
import Talismans2.lib.Names;
import C4Lib.item.C4Item;

public class ItemCraftingItems extends C4Item{
	
	public static final String[] types = new String[] { "empty", "world",
		"hell", "end", };
	
	public ItemCraftingItems()
	{
		setHasSubtypes(true);
		setMaxStackSize(1);
		setCreativeTab(Talismans2.tabsTalismans);
		setUnlocalizedName(Names.NameCraftingItem);
	}
	
	@Override
	// gets Unlocalized Name depending on meta data
	public String getUnlocalizedName(ItemStack itemStack)
	{
		int meta = itemStack.getItemDamage();
		if (meta < 0 || meta >= types.length) 
		{
			meta = 0;
		}

		return super.getUnlocalizedName() + "." + types[meta];
	}
	// adds subtypes to creative tab
	public void getSubItems(Item item, CreativeTabs creativeTabs, List list)
	{
		for (int meta = 0; meta < types.length; ++meta) 
		{
			list.add(new ItemStack(item, 1, meta));
		}
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) 
	{
		BiomeGenBase b = world.getBiomeGenForCoords(new BlockPos (player));
		boolean isNether = b.biomeName.toLowerCase().equals("hell");
		boolean isEnd = b.biomeName.toLowerCase().equals("the end");


		if(player.isSneaking())
		{
			if(isNether && itemStack.getItemDamage() == 0)
			{
				itemStack.setItemDamage(2);
			}
			else if(isEnd && itemStack.getItemDamage() == 0)
			{
				itemStack.setItemDamage(3);
			}
			else if(itemStack.getItemDamage() == 0)
			{
				itemStack.setItemDamage(1);
			}
			
		}
		return itemStack;
	}

}
