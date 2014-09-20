package Talismans2.item.talismans;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;

public class ItemMovementTalisman extends ItemTalismanBauble {

	public ItemMovementTalisman() {
		super();
		this.setUnlocalizedName("Movement Talisman");
		this.setCreativeTab(Talismans2.tabsTalismans);
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("talismans2:Movement");
	}

	@Override
	// Returns Potion Effect on Tick
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {
		if (!player.isPotionActive(Potion.moveSpeed))
        {
            player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, Integer.MAX_VALUE, 1, true));
			player.addPotionEffect(new PotionEffect(Potion.jump.id, Integer.MAX_VALUE, 1, true));
		}
	}

	// Removes Potion effect on Unequip
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		player.removePotionEffect(Potion.moveSpeed.id);
		player.removePotionEffect(Potion.jump.id);
	}

}
