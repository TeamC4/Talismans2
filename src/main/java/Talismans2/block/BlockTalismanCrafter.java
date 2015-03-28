package Talismans2.block;

import Talismans2.Talismans2;
import Talismans2.lib.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.internal.FMLNetworkHandler;

public class BlockTalismanCrafter extends Block{

	public BlockTalismanCrafter(Material material) 
	{
		super(material);
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setUnlocalizedName(Names.NameTalismanCrafter);
	}
	
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) 
	{
		return new TileTalismanCrafter();
	}

	// Loads GUI On Right Click
	@Override
	public boolean onBlockActivated(World world, BlockPos pos,
			IBlockState state, EntityPlayer entity, EnumFacing side,
			float x, float y, float z) 
	{
		int X = (int) x;
		int Y = (int) y;
		int Z = (int) z;
		
		if (!world.isRemote) 
		{
			FMLNetworkHandler.openGui(entity, Talismans2.instance, 0, world, X,Y, Z);
			System.out.print("OPEN GUI MAYBE");
		}

		return true;
	}


}
