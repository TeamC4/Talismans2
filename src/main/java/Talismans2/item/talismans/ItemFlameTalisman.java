package Talismans2.item.talismans;

import net.minecraft.client.renderer.texture.IIconRegister;
import Talismans2.item.ItemTalismanBauble;

/**
 * @author Gigabit101
 */

public class ItemFlameTalisman extends ItemTalismanBauble{
	
	public ItemFlameTalisman(){
		super();
		this.setUnlocalizedName("Flame Talisman");	
	}
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("talismans2:Flame");
	}

}
