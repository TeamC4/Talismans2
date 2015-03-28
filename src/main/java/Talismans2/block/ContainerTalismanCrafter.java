package Talismans2.block;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerTalismanCrafter extends Container{

	private TileTalismanCrafter TileTalismanCrafter;
	private final int PLAYER_INVENTORY_ROWS = 3;
	private final int PLAYER_INVENTORY_COLUMNS = 9;

	public ContainerTalismanCrafter(InventoryPlayer inventoryPlayer,
			TileTalismanCrafter tileTalismanCrafter) 
	{
		this.TileTalismanCrafter = tileTalismanCrafter;

		// Dark Infuser Slots
		this.addSlotToContainer(new Slot(tileTalismanCrafter,
				TileTalismanCrafter.INPUT_INVENTORY1_INDEX, 80, 7));
		this.addSlotToContainer(new Slot(tileTalismanCrafter,
				TileTalismanCrafter.INPUT_INVENTORY2_INDEX, 27, 76));
		this.addSlotToContainer(new Slot(tileTalismanCrafter,
				TileTalismanCrafter.INPUT_INVENTORY3_INDEX, 132, 76));
		this.addSlotToContainer(new SlotCrafterOutput(tileTalismanCrafter,
				TileTalismanCrafter.OUTPUT_INVENTORY_INDEX, 80, 52));

		// Players Inventory Slots
		for (int inventoryRowIndex = 0; inventoryRowIndex < PLAYER_INVENTORY_ROWS; ++inventoryRowIndex) {
			for (int inventoryColumnIndex = 0; inventoryColumnIndex < PLAYER_INVENTORY_COLUMNS; ++inventoryColumnIndex) {
				this.addSlotToContainer(new Slot(inventoryPlayer,
						inventoryColumnIndex + inventoryRowIndex * 9 + 9,
						8 + inventoryColumnIndex * 18,
						106 + inventoryRowIndex * 18));
			}

		}

		// Players action bar Slots
		for (int actionBarSlotIndex = 0; actionBarSlotIndex < PLAYER_INVENTORY_COLUMNS; ++actionBarSlotIndex) {
			this.addSlotToContainer(new Slot(inventoryPlayer,
					actionBarSlotIndex, 8 + actionBarSlotIndex * 18, 164));
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer playerIn) 
	{
		return true;
	}

}
