package Talismans2.item.talismans;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;

public class ItemInvisibleTalisman extends ItemTalismanBauble{

	public ItemInvisibleTalisman(){
		super();
		this.setCreativeTab(Talismans2.tabsTalismans);
		this.setUnlocalizedName("Invisible Talisman");		
	}
	@Override
	public void registerIcons(IIconRegister iconRegister){
		itemIcon = iconRegister.registerIcon("talismans2:Invisible");	
	}
	
	@Override
	public void onWornTick(ItemStack itemstack, EntityLivingBase player){
		if(!player.isPotionActive(Potion.invisibility))
        {
			player.addPotionEffect(new PotionEffect(Potion.invisibility.id,Integer.MAX_VALUE, 1, true));
		}
		
	}
	@Override
	public void onUnequipped(ItemStack itemstack, EntityLivingBase player){
		player.removePotionEffect(Potion.invisibility.id);
		
	}
	
}
