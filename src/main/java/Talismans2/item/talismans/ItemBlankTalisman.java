package Talismans2.item.talismans;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import Talismans2.Talismans2;

/**
 * @author Gigabit101
 */

public class ItemBlankTalisman extends Item {

	public ItemBlankTalisman() {
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setUnlocalizedName("Blank Talisman");
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("talismans2:Blank");
	}

}
