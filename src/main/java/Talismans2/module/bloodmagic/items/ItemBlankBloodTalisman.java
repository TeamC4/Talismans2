package Talismans2.module.bloodmagic.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import Talismans2.Talismans2;

public class ItemBlankBloodTalisman extends Item {

	public ItemBlankBloodTalisman() {
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Blank Blood Talisman");
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("talismans2:BloodBlank");
	}

}
