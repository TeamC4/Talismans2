package Talismans2.block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class SlotCrafterOutput extends Slot
{

	public SlotCrafterOutput(IInventory inventory, int slotIndex, int x, int y) 
	{
		super(inventory, slotIndex, x, y);
	}
	

	@Override
	public void onPickupFromSlot(EntityPlayer entityPlayer, ItemStack itemStack) {
		super.onPickupFromSlot(entityPlayer, itemStack);
		FMLCommonHandler.instance().firePlayerCraftingEvent(entityPlayer,
				itemStack, inventory);
	}

	@Override
	public boolean isItemValid(ItemStack itemStack) {
		return false;
	}

}
