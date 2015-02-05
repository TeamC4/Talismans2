package Talismans2.module.bloodmagic.items.talismans;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import Talismans2.Talismans2;
import Talismans2.lib.Names;
import Talismans2.module.bloodmagic.items.ItemBloodTalisman;
import baubles.api.BaubleType;

public class ItemBloodMiningTalisman extends ItemBloodTalisman {

	public ItemBloodMiningTalisman()
	{
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setUnlocalizedName(Names.NameBloodMiningTalisman);
		this.setMaxStackSize(1);
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0)
	{
		return BaubleType.AMULET;
	}

	@Override
	public void onUnequipped(ItemStack arg0, EntityLivingBase player)
	{
		player.removePotionEffect(Potion.digSpeed.id);
	}

//	@Override
//	public void onWornTick(ItemStack par1ItemStack, EntityLivingBase player)
//	{
//
//		if (!player.isPotionActive(Potion.digSpeed)
//				& SoulNetworkHandler.syphonFromNetwork(par1ItemStack, 15) > 0) {
//			SoulNetworkHandler.syphonFromNetwork(par1ItemStack, 15);
//			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id,
//					Integer.MAX_VALUE, 3, true));
//		} else {
//		}
//
//	}

}
