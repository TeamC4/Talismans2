package Talismans2.item;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import Talismans2.Talismans2;
import baubles.api.BaubleType;
import baubles.api.IBauble;

/**
 * @author Gigabit101
 */

public class ItemTalismanBauble extends Item implements IBauble{
	
	public ItemTalismanBauble(){
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setMaxStackSize(1);

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
	public BaubleType getBaubleType(ItemStack arg0) {
		return BaubleType.AMULET;
	}

	@Override
	public void onEquipped(ItemStack arg0, EntityLivingBase arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onUnequipped(ItemStack arg0, EntityLivingBase arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onWornTick(ItemStack arg0, EntityLivingBase arg1) {
		// TODO Auto-generated method stub
		
	}

}
