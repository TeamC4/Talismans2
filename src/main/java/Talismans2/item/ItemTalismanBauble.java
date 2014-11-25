package Talismans2.item;

import java.util.List;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import Talismans2.Talismans2;
import Talismans2.lib.Modinfo;
import Talismans2.util.Color;
import baubles.api.BaubleType;
import baubles.api.IBauble;
import baubles.common.container.InventoryBaubles;
import baubles.common.lib.PlayerHandler;

/**
 * @author Gigabit101
 */

public class ItemTalismanBauble extends Item implements IBauble {

	public ItemTalismanBauble()
	{
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setMaxStackSize(1);

	}
	
	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon(Modinfo.ID.toLowerCase() + ":" + getUnlocalizedName());
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
		return null;
	}

	@Override
	public void onEquipped(ItemStack arg0, EntityLivingBase arg1)
	{
	}

	@Override
	public void onUnequipped(ItemStack arg0, EntityLivingBase arg1)
	{
	}

	@Override
	public void onWornTick(ItemStack arg0, EntityLivingBase arg1)
	{
	}

	public boolean isFull3D()
	{
		return true;
	}

	@Override
	// Equips Talismans When Right Clicked In Players Hand
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
			EntityPlayer par3EntityPlayer)
	{
		InventoryBaubles baubles = PlayerHandler
				.getPlayerBaubles(par3EntityPlayer);
		for (int i = 0; i < baubles.getSizeInventory(); i++) {
			if (baubles.isItemValidForSlot(i, par1ItemStack)) {
				ItemStack stackInSlot = baubles.getStackInSlot(i);

				if (stackInSlot == null
						|| ((IBauble) stackInSlot.getItem()).canUnequip(
								stackInSlot, par3EntityPlayer)) {
					if (!par2World.isRemote) {
						baubles.setInventorySlotContents(i,
								par1ItemStack.copy());

						if (!par3EntityPlayer.capabilities.isCreativeMode)
							par3EntityPlayer.inventory
									.setInventorySlotContents(
											par3EntityPlayer.inventory.currentItem,
											null);
					}

					onEquipped(par1ItemStack, par3EntityPlayer);

					if (stackInSlot != null) {
						((IBauble) stackInSlot.getItem()).onUnequipped(
								stackInSlot, par3EntityPlayer);
						return stackInSlot.copy();
					}
					break;
				}
			}
		}

		return par1ItemStack;
	}
	
	@Override
	public void addInformation(ItemStack iS, EntityPlayer par2EntityPlayer,
			List par3List, boolean par4)
	{
		if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)
				|| Keyboard.isKeyDown(Keyboard.KEY_RSHIFT)) {
			par3List.add(StatCollector.translateToLocal("toolTip1"
					+ iS.getUnlocalizedName()));

		} else {

			par3List.add(Color.DARK_PURPLE
					+ StatCollector.translateToLocal(Modinfo.ID + "toolTipShift"));

		}
	}

}
