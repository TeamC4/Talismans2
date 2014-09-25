package Talismans2.module.bloodmagic.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;
import WayofTime.alchemicalWizardry.api.items.interfaces.IBindable;
import baubles.api.BaubleType;
import baubles.api.IBauble;

public class ItemBloodFlameTalisman extends ItemTalismanBauble {

	public ItemBloodFlameTalisman() {
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Blood Flame Talisman");
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("talismans2:BloodFlame");
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		return BaubleType.AMULET;
	}

	@Override
	public boolean canEquip(ItemStack arg0, EntityLivingBase arg1) {
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack arg0, EntityLivingBase arg1) {
		return true;
	}

	@Override
	public void onEquipped(ItemStack arg0, EntityLivingBase arg1) {}

	@Override
	public void onUnequipped(ItemStack arg0, EntityLivingBase arg1) {}

	@Override
	public void onWornTick(ItemStack arg0, EntityLivingBase arg1) {}

}
