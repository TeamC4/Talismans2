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

public class ItemWitherlessTalisman extends ItemTalismanBauble {

	public ItemWitherlessTalisman() {
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Witherless Talisman");
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("talismans2:Witherless");
	}

	@Override
	// Removes Potion Effect on Tick
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if (!player.isPotionActive(Potion.wither)) {
			player.removePotionEffect(Potion.wither.id);

		}
	}

}
