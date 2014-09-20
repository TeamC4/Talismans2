package Talismans2.item.misc;

import java.util.List;

import baubles.api.BaubleType;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.IIcon;
import Talismans2.item.ItemTalismanBauble;

public class ItemTalismanRings extends ItemTalismanBauble{
	// Names For Rings Depending on Meta Data
	public static final String[] types = new String[] {"Blank","Crafting",
			"Flame", "Invisible", "Light", "Mining", "Movement", "Water", "Witherless",};
	
	private static final int par7 = 0;
	private IIcon[] textures;
	
	public ItemTalismanRings(){
		super();
		this.setHasSubtypes(true);
		this.setUnlocalizedName("Talisman Ring");
		
	}
	
	@Override
	// Tells Baubles What slot Rings Can Be Equiped To
	public BaubleType getBaubleType(ItemStack itemstack) {
		return BaubleType.RING;
	}
	
	@Override
	// Registers Textures For All Rings
	public void registerIcons(IIconRegister iconRegister) {
		textures = new IIcon[types.length];

		for (int i = 0; i < types.length; ++i) {
			textures[i] = iconRegister.registerIcon("talismans:" + "Ring");
		}
	}
	@Override
	// Adds Texture what match's meta data
	public IIcon getIconFromDamage(int meta) {
		if (meta < 0 || meta >= textures.length) {
			meta = 0;
		}

		return textures[meta];
	}
	@Override
	// gets Unlocalized Name depending on meta data
	public String getUnlocalizedName(ItemStack itemStack) {
		int meta = itemStack.getItemDamage();
		if (meta < 0 || meta >= types.length) {
			meta = 0;
		}

		return super.getUnlocalizedName() + "." + types[meta];
	}
	
	// Adds Rings SubItems To Creative Tab
	public void getSubItems(Item item, CreativeTabs creativeTabs, List list) {
		for (int meta = 0; meta < types.length; ++meta) {
			list.add(new ItemStack(item, 1, meta));
		}
	}
	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player) {

		if (itemstack.getItemDamage() == 2
				&& !player.isPotionActive(Potion.fireResistance)) {
			player.addPotionEffect(new PotionEffect(Potion.fireResistance.id,
					Integer.MAX_VALUE, 1, true));
		}
		if (itemstack.getItemDamage() == 3
				&& !player.isPotionActive(Potion.invisibility)) {
			player.addPotionEffect(new PotionEffect(Potion.invisibility.id,
					Integer.MAX_VALUE, 1, true));
		}
		if (itemstack.getItemDamage() == 4
				&& !player.isPotionActive(Potion.nightVision)) {
			player.addPotionEffect(new PotionEffect(Potion.nightVision.id,
					Integer.MAX_VALUE, 1, true));
		}
		if (itemstack.getItemDamage() == 5
				&& !player.isPotionActive(Potion.digSpeed)) {
			player.addPotionEffect(new PotionEffect(Potion.digSpeed.id,
					Integer.MAX_VALUE, 1, true));
		}
		if (itemstack.getItemDamage() == 6
				&& !player.isPotionActive(Potion.moveSpeed)) {
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id,
					Integer.MAX_VALUE, 1, true));
			player.addPotionEffect(new PotionEffect(Potion.jump.id,
					Integer.MAX_VALUE, 1, true));
		}
		if (itemstack.getItemDamage() == 7
				&& !player.isPotionActive(Potion.waterBreathing)) {
			player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id,
					Integer.MAX_VALUE, 1, true));
		}
		if (itemstack.getItemDamage() == 8
				&& !player.isPotionActive(Potion.wither)) {
			player.removePotionEffect(Potion.wither.id);

		}
	}
	@Override
	// Removes Potion effect on Unequip
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
		if (itemstack.getItemDamage() == 2)
			player.removePotionEffect(Potion.fireResistance.id);
		if (itemstack.getItemDamage() == 3)
			player.removePotionEffect(Potion.invisibility.id);
		if (itemstack.getItemDamage() == 4)
			player.removePotionEffect(Potion.nightVision.id);
		if (itemstack.getItemDamage() == 5)
			player.removePotionEffect(Potion.digSpeed.id);
		if (itemstack.getItemDamage() == 6)
			player.removePotionEffect(Potion.moveSpeed.id);
		    player.removePotionEffect(Potion.jump.id);
		if (itemstack.getItemDamage() == 7)
			player.removePotionEffect(Potion.waterBreathing.id);

	}
}
