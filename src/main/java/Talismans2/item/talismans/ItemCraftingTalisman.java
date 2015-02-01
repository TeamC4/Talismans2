package Talismans2.item.talismans;

import net.minecraft.item.ItemStack;
import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;
import Talismans2.lib.Names;
import baubles.api.BaubleType;

/**
 * @author Gigabit101
 */

public class ItemCraftingTalisman extends ItemTalismanBauble {

	public ItemCraftingTalisman()
	{
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setMaxStackSize(1);
		this.setUnlocalizedName(Names.NameCraftTalisman);
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0)
	{
		return BaubleType.AMULET;
	}

}
