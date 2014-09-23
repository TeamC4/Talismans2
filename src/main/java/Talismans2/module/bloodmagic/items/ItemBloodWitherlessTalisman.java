package Talismans2.module.bloodmagic.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;
import baubles.api.BaubleType;

public class ItemBloodWitherlessTalisman extends ItemTalismanBauble {

	public ItemBloodWitherlessTalisman() {
		super();
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Blood Witherless Talisman");
		this.setCreativeTab(Talismans2.tabsTalismans);
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("talismans2:BloodWitherless");
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		return BaubleType.AMULET;
	}

}
