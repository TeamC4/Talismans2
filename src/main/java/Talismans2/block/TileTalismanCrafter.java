package Talismans2.block;

import Talismans2.lib.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IChatComponent;

public class TileTalismanCrafter extends TileEntity implements ISidedInventory{

	public static final int INVENTORY_SIZE = 4;
	public static final int INPUT_INVENTORY1_INDEX = 0;
	public static final int INPUT_INVENTORY2_INDEX = 1;
	public static final int INPUT_INVENTORY3_INDEX = 2;
	public static final int OUTPUT_INVENTORY_INDEX = 3;

	public ItemStack outputItemStack;
	private ItemStack[] inventory;
	
	public TileTalismanCrafter() 
	{
		inventory = new ItemStack[INVENTORY_SIZE];
	}
	
	@Override
	public boolean canInsertItem(int index, ItemStack itemStackIn,
			EnumFacing direction) {
//		if (worldObj.getTileEntity(xCoord, yCoord + 1, zCoord) instanceof TileEntity) {
//			return isItemValidForSlot(slotIndex, itemStack);
//		} else {
			return false;
//		}
	}
	
	@Override
	public boolean canExtractItem(int slotIndex, ItemStack stack,
			EnumFacing direction) 
	{
		return slotIndex == OUTPUT_INVENTORY_INDEX;
	}

	@Override
	public ItemStack getStackInSlot(int slotIndex) {
		return inventory[slotIndex];
	}

	@Override
	public ItemStack decrStackSize(int slotIndex, int decrementAmount) {
		ItemStack itemStack = getStackInSlot(slotIndex);
		if (itemStack != null) {
			if (itemStack.stackSize <= decrementAmount) {
				setInventorySlotContents(slotIndex, null);
			} else {
				itemStack = itemStack.splitStack(decrementAmount);
				if (itemStack.stackSize == 0) {
					setInventorySlotContents(slotIndex, null);
				}
			}
		}

		return itemStack;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slotIndex) {
		ItemStack itemStack = getStackInSlot(slotIndex);
		if (itemStack != null) {
			setInventorySlotContents(slotIndex, null);
		}
		return itemStack;
	}

	@Override
	public void setInventorySlotContents(int slotIndex, ItemStack itemStack) {
		inventory[slotIndex] = itemStack;
		if (itemStack != null && itemStack.stackSize > getInventoryStackLimit()) {
			itemStack.stackSize = getInventoryStackLimit();
		}
	}

	@Override
	public int getInventoryStackLimit() 
	{
		return 64;
	}

	@Override
	public String getName()
	{
		return Names.NameTalismanCrafter;
	}
	
	@Override
	public boolean hasCustomName() 
	{
		return true;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer entityPlayer) 
	{
		return true;
	}

	
	@Override
	public void openInventory(EntityPlayer player) {}

	@Override
	public void closeInventory(EntityPlayer player) {}

	@Override
	public boolean isItemValidForSlot(int slotIndex, ItemStack itemStack) 
	{
		switch (slotIndex) {
		case INPUT_INVENTORY1_INDEX: {
			return true;
		}
		case INPUT_INVENTORY2_INDEX: {
			return true;
		}
		case INPUT_INVENTORY3_INDEX: {
			return true;
		}
		case OUTPUT_INVENTORY_INDEX: {
			return false;
		}
		default: {
			return false;
		}
		}
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTagCompound) 
	{
		super.writeToNBT(nbtTagCompound);

		NBTTagList tagList = new NBTTagList();
		for (int currentIndex = 0; currentIndex < inventory.length; ++currentIndex) {

			if (inventory[currentIndex] != null) {
				NBTTagCompound item = new NBTTagCompound();
				nbtTagCompound.setByte("Slot", (byte) currentIndex);
				inventory[currentIndex].writeToNBT(nbtTagCompound);
				tagList.appendTag(nbtTagCompound);

			}

		}

	}

	@Override
	public void readFromNBT(NBTTagCompound nbtTagCompound) 
	{
		super.readFromNBT(nbtTagCompound);

		// Read in the ItemStacks in the inventory from NBT
		NBTTagList tagList = nbtTagCompound.getTagList("Slot", 10);
		inventory = new ItemStack[this.getSizeInventory()];
		for (int i = 0; i < tagList.tagCount(); ++i) {
			NBTTagCompound tagCompound = tagList.getCompoundTagAt(i);
			byte slotIndex = tagCompound.getByte("Slot");
			if (slotIndex >= 0 && slotIndex < inventory.length) {
				inventory[slotIndex] = ItemStack
						.loadItemStackFromNBT(tagCompound);
			}
		}
	}

	
	@Override
	public int[] getSlotsForFace(EnumFacing side) 
	{
		return null;
	}

	@Override
	public int getSizeInventory()
	{
		return inventory.length;
	}

	@Override
	public int getField(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setField(int id, int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFieldCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IChatComponent getDisplayName() {
		// TODO Auto-generated method stub
		return null;
	}

}
