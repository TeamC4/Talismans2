package Talismans2.client.gui;

import Talismans2.block.ContainerTalismanCrafter;
import Talismans2.block.TileTalismanCrafter;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler{
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity((new BlockPos(x, y, z)));

		if (entity instanceof TileTalismanCrafter) {
			return new ContainerTalismanCrafter(player.inventory,
					(TileTalismanCrafter) entity);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		TileEntity entity = world.getTileEntity((new BlockPos(x, y, z)));

		if (entity instanceof TileTalismanCrafter) {
			return new GuiTalismanCrafter(player.inventory,
					(TileTalismanCrafter) entity);
		}
		return null;
	}

}
