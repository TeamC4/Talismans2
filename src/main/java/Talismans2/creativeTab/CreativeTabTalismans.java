package Talismans2.creativeTab;

import Talismans2.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * @author Gigabit101
 */

public class CreativeTabTalismans extends CreativeTabs {

	public CreativeTabTalismans(int tabId, String tabLabel)
	{
		super(tabId, tabLabel);
	}

	@Override
	public Item getTabIconItem()
	{
		return ModItems.BlankTalisman;
	}

}
