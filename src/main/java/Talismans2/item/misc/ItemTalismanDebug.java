package Talismans2.item.misc;

import net.minecraft.entity.IEntityLivingData;
import net.minecraft.item.Item;
import Talismans2.Talismans2;

public class ItemTalismanDebug extends Item {

	public ItemTalismanDebug() {
		super();
		{
			this.setCreativeTab(Talismans2.tabsTalismans);
			this.setUnlocalizedName("Talismans.debug");
		}

	}

	public void onRightClick(IEntityLivingData par1EntityLivingData) {

	}
}
