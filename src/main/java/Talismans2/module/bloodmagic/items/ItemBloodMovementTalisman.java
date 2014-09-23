package Talismans2.module.bloodmagic.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;
import baubles.api.BaubleType;

public class ItemBloodMovementTalisman extends ItemTalismanBauble {

	public ItemBloodMovementTalisman() {
		super();
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Blood Movement Talisman");
		this.setCreativeTab(Talismans2.tabsTalismans);
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("talismans2:BloodMovement");
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {

	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		return BaubleType.AMULET;
	}

}
