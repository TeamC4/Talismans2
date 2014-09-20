package Talismans2.item.talismans;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;

/**
 * @author Gigabit101
 */

public class ItemMiningTalisman extends ItemTalismanBauble {

	public ItemMiningTalisman() {
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Mining Talisman");
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("talismans2:Mining");
	}

	@Override
	// Returns Potion Effect on Tick
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if (!player.isPotionActive(Potion.digSpeed))
        {
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id,Integer.MAX_VALUE, 3, true));
		}
	}

	// Removes Potion effect on Unequip
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		player.removePotionEffect(Potion.digSpeed.id);
	}

}
