package Talismans2.item.talismans;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;
import Talismans2.lib.Names;
import baubles.api.BaubleType;

/**
 * @author Gigabit101
 */

public class ItemWitherlessTalisman extends ItemTalismanBauble {

	public ItemWitherlessTalisman()
	{
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setMaxStackSize(1);
		this.setUnlocalizedName(Names.NameWitherlessTalisman);
	}

	@Override
	// Removes Potion Effect on Tick
	public void onWornTick(ItemStack itemstack, EntityLivingBase player)
	{
		player.removePotionEffect(Potion.wither.id);
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0)
	{
		return BaubleType.AMULET;
	}

}
