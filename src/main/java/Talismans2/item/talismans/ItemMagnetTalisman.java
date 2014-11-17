package Talismans2.item.talismans;

import java.util.Iterator;
import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;
import baubles.api.BaubleType;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMagnetTalisman extends ItemTalismanBauble {

	public ItemMagnetTalisman()
	{
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Magnet Talisman");
	}

	@Override
	public void registerIcons(IIconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("talismans2:Blank");
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0)
	{
		return BaubleType.AMULET;
	}

	@Override
	public void onUpdate(ItemStack ist, World world, Entity e, int i, boolean f)
	{

		if (ist.getItemDamage() == 0)
			return;
		EntityPlayer player = null;
		if (e instanceof EntityPlayer) {
			player = (EntityPlayer) e;
		}
		if (player == null)
			return;
		scanForEntitiesInRange(world, player, 5.0D);
	}

	private void scanForEntitiesInRange(World world, EntityPlayer player,
			double d)
	{
		List iList = world.getEntitiesWithinAABB(EntityItem.class,
				AxisAlignedBB.getBoundingBox(player.posX - d, player.posY - d,
						player.posZ - d, player.posX + d, player.posY + d,
						player.posZ + d));
		Iterator iterator = iList.iterator();
		while (iterator.hasNext()) {
			EntityItem item = (EntityItem) iterator.next();
			if (!checkForRoom(item.getEntityItem(), player)) {
				continue;
			}
			if (item.delayBeforeCanPickup > 0) {
				item.delayBeforeCanPickup = 0;
			}
			if (player.getDistanceToEntity(item) < 1.5D) {
				continue;
			}
			teleportEntityToPlayer(item, player);
			break;
		}
		List iList2 = world.getEntitiesWithinAABB(EntityXPOrb.class,
				AxisAlignedBB.getBoundingBox(player.posX - d, player.posY - d,
						player.posZ - d, player.posX + d, player.posY + d,
						player.posZ + d));
		Iterator iterator2 = iList2.iterator();
		while (iterator2.hasNext()) {
			EntityXPOrb item = (EntityXPOrb) iterator2.next();
			if (player.xpCooldown > 0) {
				player.xpCooldown = 0;
			}
			if (player.getDistanceToEntity(item) < 1.5D) {
				continue;
			}
			teleportEntityToPlayer(item, player);
			break;
		}
	}

	private void teleportEntityToPlayer(Entity item, EntityPlayer player)
	{
		player.worldObj.spawnParticle("portal", item.posX, item.posY,
				item.posZ, 0.0D, 0.1D, 0.0D);
		player.getLookVec();
		double x = player.posX + player.getLookVec().xCoord * 0.2D;
		double y = player.posY - player.height / 2F;
		double z = player.posZ + player.getLookVec().zCoord * 0.2D;
		item.setPosition(x, y, z);
		player.worldObj.spawnParticle("portal", item.posX, item.posY,
				item.posZ, 0.0D, 0.1D, 0.0D);
	}

	private boolean checkForRoom(ItemStack item, EntityPlayer player)
	{
		int remaining = item.stackSize;
		for (ItemStack ist : player.inventory.mainInventory) {
			if (ist == null) {
				continue;
			}
			if (ist.getItem() == item.getItem()
					&& ist.getItemDamage() == item.getItemDamage()) {
				if (ist.stackSize + remaining <= ist.getMaxStackSize())
					return true;
				else {
					int count = ist.stackSize;
					while (count < ist.getMaxStackSize()) {
						count++;
						remaining--;
						if (remaining == 0)
							return true;
					}
				}
			}
		}
		for (int slot = 0; slot < player.inventory.mainInventory.length; slot++) {
			if (player.inventory.mainInventory[slot] == null)
				return true;
		}
		return false;
	}

	public void onUsingItemTick(ItemStack ist, EntityPlayer player, int count)
	{
		if (ist.getItemDamage() == 0)
			return;
		scanForEntitiesInRange(player.worldObj, player, 15.0D);
	}

	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		return 64;
	}

	@Override
	public EnumAction getItemUseAction(ItemStack par1ItemStack)
	{
		return EnumAction.block;
	}

	@Override
	public ItemStack onItemRightClick(ItemStack ist, World world,
			EntityPlayer player)
	{

		if (player.isSneaking()) {
			ist.setItemDamage(ist.getItemDamage() == 0 ? 1 : 0);
		} else {
			return ist;
		}

		return ist;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack ist)
	{
		if (ist.getItemDamage() == 1) {
			return true;
		} else
			return false;
	}

	@Override
	public void onWornTick(ItemStack stack, EntityLivingBase player)
	{
		this.onUpdate(stack, player.worldObj, player, 0, false);
	}
}
