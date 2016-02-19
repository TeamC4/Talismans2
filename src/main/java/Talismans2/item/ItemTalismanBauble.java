package Talismans2.item;

import java.util.List;

import org.lwjgl.input.Keyboard;

import Talismans2.Talismans2;
import Talismans2.lib.Modinfo;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.common.container.InventoryBaubles;
import baubles.common.lib.PlayerHandler;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

/**
 * @author Gigabit101
 */

public class ItemTalismanBauble extends Item implements IBauble 
{
	Potion effect;
	Potion effect2;
	boolean removeEffect;
	BaubleType baubletype;
	
	public ItemTalismanBauble(Potion effect, Potion effect2, boolean removeeffect, BaubleType type)
	{
		setCreativeTab(Talismans2.tabsTalismans);
		setMaxStackSize(1);
		this.baubletype = type;
		this.effect = effect;
		this.effect2 = effect2;
		this.removeEffect = removeeffect;
	}

	@Override
	public boolean canEquip(ItemStack arg0, EntityLivingBase arg1)
	{
		return true;
	}

	@Override
	public boolean canUnequip(ItemStack arg0, EntityLivingBase arg1)
	{
		return true;
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0)
	{
		return baubletype;
	}

	@Override
	public void onEquipped(ItemStack arg0, EntityLivingBase arg1){}

	@Override
	public void onUnequipped(ItemStack stack, EntityLivingBase player)
	{
		if(effect != null)
		{
			player.removePotionEffect(effect.id);
		}
		if(effect2 != null)
		{
			player.removePotionEffect(effect2.id);
		}
	}

	@Override
	public void onWornTick(ItemStack stack, EntityLivingBase player)
	{
		if(effect != null && !removeEffect)
		{
			if (!player.isPotionActive(effect)) 
			{
				player.addPotionEffect(new PotionEffect(effect.id, Integer.MAX_VALUE, 1, true, true));
			}
		}
		if(effect2 != null && !removeEffect)
		{
			if (!player.isPotionActive(effect2)) 
			{
				player.addPotionEffect(new PotionEffect(effect2.id, Integer.MAX_VALUE, 1, true, true));
			}
		}
		if(removeEffect)
		{
			player.removePotionEffect(effect.id);
		}
	}

	public boolean isFull3D()
	{
		return true;
	}

	@Override
	// Equips Talismans When Right Clicked In Players Hand
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		InventoryBaubles baubles = PlayerHandler.getPlayerBaubles(par3EntityPlayer);
		for (int i = 0; i < baubles.getSizeInventory(); i++) 
		{
			if (baubles.isItemValidForSlot(i, par1ItemStack)) 
			{
				ItemStack stackInSlot = baubles.getStackInSlot(i);
				if (stackInSlot == null || ((IBauble) stackInSlot.getItem()).canUnequip(stackInSlot, par3EntityPlayer)) 
				{
					if (!par2World.isRemote) 
					{
						baubles.setInventorySlotContents(i, par1ItemStack.copy());

						if (!par3EntityPlayer.capabilities.isCreativeMode)
							par3EntityPlayer.inventory.setInventorySlotContents(par3EntityPlayer.inventory.currentItem, null);
					}

					onEquipped(par1ItemStack, par3EntityPlayer);

					if (stackInSlot != null) 
					{
						((IBauble) stackInSlot.getItem()).onUnequipped(stackInSlot, par3EntityPlayer);
						return stackInSlot.copy();
					}
					break;
				}
			}
		}

		return par1ItemStack;
	}
	
	@Override
	public void addInformation(ItemStack iS, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) 
		{
			par3List.add(StatCollector.translateToLocal("toolTip1" + iS.getUnlocalizedName()));
		} 
		else 
		{
			par3List.add(StatCollector.translateToLocal(Modinfo.ID + "toolTipShift"));
		}
	}
}
