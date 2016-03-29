package Talismans2.item;

import java.util.List;

import net.minecraft.init.MobEffects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.translation.I18n;
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
		setUnlocalizedName("talisman");
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
			player.removePotionEffect(effect);
		}
		if(effect2 != null)
		{
			player.removePotionEffect(effect2);
		}
	}

	@Override
	public void onWornTick(ItemStack stack, EntityLivingBase player)
	{
		if(effect != null && !removeEffect)
		{
			if (!player.isPotionActive(effect))
			{
				player.addPotionEffect(new PotionEffect(effect, Integer.MAX_VALUE, 1, true, true));
			}
		}
		if(effect2 != null && !removeEffect)
		{
			if (!player.isPotionActive(effect2)) 
			{
				player.addPotionEffect(new PotionEffect(effect2, Integer.MAX_VALUE, 1, true, true));
			}
		}
		if(removeEffect)
		{
			player.removePotionEffect(effect);
		}
	}

	public boolean isFull3D()
	{
		return true;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player, EnumHand hand)
	{
		InventoryBaubles baubles = PlayerHandler.getPlayerBaubles(player);
		for (int i = 0; i < baubles.getSizeInventory(); i++)
		{
			if (baubles.isItemValidForSlot(i, itemStack))
			{
				ItemStack stackInSlot = baubles.getStackInSlot(i);
				if (stackInSlot == null || ((IBauble) stackInSlot.getItem()).canUnequip(stackInSlot, player))
				{
					if (!world.isRemote)
					{
						baubles.setInventorySlotContents(i, itemStack.copy());

						if (!player.capabilities.isCreativeMode)
							player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
					}

					onEquipped(itemStack, player);

					if (stackInSlot != null)
					{
						((IBauble) stackInSlot.getItem()).onUnequipped(stackInSlot, player);
						return new ActionResult<>(EnumActionResult.SUCCESS ,itemStack);
					}
					break;
				}
			}
		}
		return new ActionResult<>(EnumActionResult.FAIL ,itemStack);
	}
	
	@Override
	public void addInformation(ItemStack iS, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT) || Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) 
		{
			par3List.add(I18n.translateToLocal("toolTip1" + iS.getUnlocalizedName()));
		} 
		else 
		{
			par3List.add(I18n.translateToLocal(Modinfo.ID + "toolTipShift"));
		}
	}
}
