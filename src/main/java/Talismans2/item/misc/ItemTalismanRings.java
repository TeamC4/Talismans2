package Talismans2.item.misc;

import java.util.List;

import Talismans2.item.ItemTalismanBauble;
import Talismans2.lib.Names;
import baubles.api.BaubleType;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemTalismanRings extends ItemTalismanBauble 
{
	// Names For Rings Depending on Meta Data
	public static final String[] types = new String[] { "Blank", "Crafting",
			"Flame", "Invisible", "Light", "Mining", "Movement", "Water",
			"Witherless", };

	public ItemTalismanRings()
	{
		super(null, null, false, null);
		this.setHasSubtypes(true);
		this.setUnlocalizedName(Names.NameTalismanRing);

	}

	@Override
	// Tells Baubles What slot Rings Can Be Equiped To
	public BaubleType getBaubleType(ItemStack itemstack)
	{
		return BaubleType.RING;
	}

	@Override
	// gets Unlocalized Name depending on meta data
	public String getUnlocalizedName(ItemStack itemStack)
	{
		int meta = itemStack.getItemDamage();
		if (meta < 0 || meta >= types.length) {
			meta = 0;
		}

		return super.getUnlocalizedName() + "." + types[meta];
	}

	// Adds Rings SubItems To Creative Tab
	public void getSubItems(Item item, CreativeTabs creativeTabs, List list)
	{
		for (int meta = 0; meta < types.length; ++meta) {
			list.add(new ItemStack(item, 1, meta));
		}
	}

	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player)
	{

		if (itemstack.getItemDamage() == 2
				&& !player.isPotionActive(MobEffects.fireResistance)) {
			player.addPotionEffect(new PotionEffect(MobEffects.fireResistance,
					Integer.MAX_VALUE, 1, true, true));
		}
		if (itemstack.getItemDamage() == 3
				&& !player.isPotionActive(MobEffects.invisibility)) {
			player.addPotionEffect(new PotionEffect(MobEffects.invisibility,
					Integer.MAX_VALUE, 1, true, true));
		}
		if (itemstack.getItemDamage() == 4
				&& !player.isPotionActive(MobEffects.nightVision)) {
			player.addPotionEffect(new PotionEffect(MobEffects.nightVision,
					Integer.MAX_VALUE, 1, true, true));
		}
		if (itemstack.getItemDamage() == 5
				&& !player.isPotionActive(MobEffects.digSpeed)) {
			player.addPotionEffect(new PotionEffect(MobEffects.digSpeed,
					Integer.MAX_VALUE, 1, true, true));
		}
		if (itemstack.getItemDamage() == 6
				&& !player.isPotionActive(MobEffects.moveSpeed)) {
			player.addPotionEffect(new PotionEffect(MobEffects.moveSpeed,
					Integer.MAX_VALUE, 1, true, true));
			player.addPotionEffect(new PotionEffect(MobEffects.jump,
					Integer.MAX_VALUE, 1, true, true));
		}
		if (itemstack.getItemDamage() == 7
				&& !player.isPotionActive(MobEffects.waterBreathing)) {
			player.addPotionEffect(new PotionEffect(MobEffects.waterBreathing,
					Integer.MAX_VALUE, 1, true, true));
		}
		if (itemstack.getItemDamage() == 8)
			;
		player.removePotionEffect(MobEffects.wither);
	}

	@Override
	// Removes Potion effect on Unequip
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player)
	{
		if (itemstack.getItemDamage() == 2)
			player.removePotionEffect(MobEffects.fireResistance);

		if (itemstack.getItemDamage() == 3)
			player.removePotionEffect(MobEffects.invisibility);

		if (itemstack.getItemDamage() == 4)
			player.removePotionEffect(MobEffects.nightVision);

		if (itemstack.getItemDamage() == 5)
			player.removePotionEffect(MobEffects.digSpeed);

		if (itemstack.getItemDamage() == 6)
			player.removePotionEffect(MobEffects.moveSpeed);
		player.removePotionEffect(MobEffects.jump);

		if (itemstack.getItemDamage() == 7)
			player.removePotionEffect(MobEffects.waterBreathing);

	}
}
