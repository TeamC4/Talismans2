package Talismans2.item.talismans;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;
import Talismans2.lib.Names;
import baubles.api.BaubleType;

public class ItemInvisibleTalisman extends ItemTalismanBauble {

	public ItemInvisibleTalisman()
	{
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setMaxStackSize(1);
		this.setUnlocalizedName(Names.NameInvisibleTalisman);
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player)
	{
		if (!player.isPotionActive(Potion.invisibility)) {
			player.addPotionEffect(new PotionEffect(Potion.invisibility.id,
					Integer.MAX_VALUE, 1, true, true));
		}

	}

	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player)
	{
		player.removePotionEffect(Potion.invisibility.id);

	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0)
	{
		return BaubleType.AMULET;
	}

}
