package Talismans2.item.talismans;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;
import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;
import baubles.api.BaubleType;

/**
 * @author Gigabit101
 */

public class ItemCraftingTalisman extends ItemTalismanBauble {

	public ItemCraftingTalisman() {
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Crafting Talisman");
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("talismans2:Crafting");
	}
	
	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		return BaubleType.AMULET;
	}

}
