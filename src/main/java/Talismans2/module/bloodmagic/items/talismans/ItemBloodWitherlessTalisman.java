package Talismans2.module.bloodmagic.items.talismans;

import Talismans2.Talismans2;
import Talismans2.module.bloodmagic.items.ItemBloodTalisman;
import baubles.api.BaubleType;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class ItemBloodWitherlessTalisman extends ItemBloodTalisman {

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