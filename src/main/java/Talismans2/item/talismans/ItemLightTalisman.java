package Talismans2.item.talismans;

import net.minecraft.client.renderer.texture.IIconRegister;
import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;

public class ItemLightTalisman extends ItemTalismanBauble{

	public ItemLightTalisman(){
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setUnlocalizedName("Light Talisman");
		
	}
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("talismans2:Light");
	}
}
