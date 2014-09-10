package Talismans2.item.talismans;

import net.minecraft.client.renderer.texture.IIconRegister;
import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;

/**
 * @author Gigabit101
 */

public class ItemWaterTalisman extends ItemTalismanBauble {

	public ItemWaterTalisman() {
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Water Talisman");
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("talismans2:Water");
	}

}
