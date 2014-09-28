package Talismans2.module.bloodmagic.items.talismans;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import Talismans2.Talismans2;
import Talismans2.module.bloodmagic.items.ItemBloodTalisman;
import WayofTime.alchemicalWizardry.api.soulNetwork.SoulNetworkHandler;
import baubles.api.BaubleType;

public class ItemBloodWaterTalisman extends ItemBloodTalisman {

	public ItemBloodWaterTalisman() {
		super();
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Blood Water Talisman");
		this.setCreativeTab(Talismans2.tabsTalismans);
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("talismans2:BloodWater");
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		return BaubleType.AMULET;
	}

	@Override
	public void onUnequipped(ItemStack arg0, EntityLivingBase player) {
		player.removePotionEffect(Potion.waterBreathing.id);
	}

	@Override
	public void onWornTick(ItemStack par1ItemStack, EntityLivingBase player) {

		if (!player.isPotionActive(Potion.waterBreathing)
				|| SoulNetworkHandler.syphonFromNetwork(par1ItemStack, 15) > 0) {
			SoulNetworkHandler.syphonFromNetwork(par1ItemStack, 15);
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id,
					Integer.MAX_VALUE, 1, true));
		} else {
			player.removePotionEffect(Potion.waterBreathing.id);
		}

	}

}
