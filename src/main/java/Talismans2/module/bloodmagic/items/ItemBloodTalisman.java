//package Talismans2.module.bloodmagic.items;
//
//import java.util.List;
//
//import net.minecraft.entity.EntityLivingBase;
//import net.minecraft.entity.player.EntityPlayer;
//import net.minecraft.item.Item;
//import net.minecraft.item.ItemStack;
//import net.minecraft.world.World;
//import Talismans2.Talismans2;
//import baubles.api.BaubleType;
//import baubles.api.IBauble;
//
//public class ItemBloodTalisman extends Item implements IBauble, IBindable {
//
//	public ItemBloodTalisman()
//	{
//		super();
//		this.setMaxStackSize(1);
//		this.setCreativeTab(Talismans2.tabsTalismans);
//	}
//
//	@Override
//	public BaubleType getBaubleType(ItemStack itemStack)
//	{
//		return null;
//	}
//
//	@Override
//	public void onWornTick(ItemStack itemStack,
//			EntityLivingBase entityLivingBase)
//	{
//
//	}
//
//	@Override
//	public void onEquipped(ItemStack itemStack,
//			EntityLivingBase entityLivingBase)
//	{
//
//	}
//
//	@Override
//	public void onUnequipped(ItemStack itemStack,
//			EntityLivingBase entityLivingBase)
//	{
//
//	}
//
//	@Override
//	public boolean canEquip(ItemStack itemStack,
//			EntityLivingBase entityLivingBase)
//	{
//		if (itemStack.hasTagCompound()) {
//			return true;
//
//		}
//		return false;
//	}
//
//	@Override
//	public boolean canUnequip(ItemStack itemStack,
//			EntityLivingBase entityLivingBase)
//	{
//		return true;
//	}
//
//	public boolean isFull3D()
//	{
//		return true;
//	}
//
//	@Override
//	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World,
//			EntityPlayer par3EntityPlayer)
//	{
//
//		if (par3EntityPlayer.isSneaking()) {
//			SoulNetworkHandler.checkAndSetItemOwner(par1ItemStack,
//					par3EntityPlayer);
//		}
//
//		return par1ItemStack;
//	}
//
//	@Override
//	public void addInformation(ItemStack iS, EntityPlayer eP, List list,
//			boolean par4)
//	{
//		if (iS.hasTagCompound()) {
//			list.add("");
//			list.add("Current owner: "
//					+ iS.stackTagCompound.getString("ownerName"));
//		}
//
//	}
//}
