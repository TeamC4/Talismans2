package Talismans2.module.bloodmagic.items.talismans;

import Talismans2.Talismans2;
import Talismans2.module.bloodmagic.items.ItemBloodTalisman;
import WayofTime.alchemicalWizardry.api.soulNetwork.SoulNetworkHandler;
import baubles.api.BaubleType;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemBloodWitherlessTalisman extends ItemBloodTalisman {

	public ItemBloodWitherlessTalisman() {
		super();
		this.setMaxStackSize(1);
		this.setUnlocalizedName("Blood Witherless Talisman");
		this.setCreativeTab(Talismans2.tabsTalismans);
	}

	@Override
	public void registerIcons(IIconRegister iconRegister) {
		itemIcon = iconRegister.registerIcon("talismans2:Witherless_Crack");
	}

	@Override
	public BaubleType getBaubleType(ItemStack arg0) {
		return BaubleType.AMULET;
	}
	
    @Override
    public void onWornTick(ItemStack par1ItemStack, EntityLivingBase player) {

        if (!player.isPotionActive(Potion.waterBreathing) || SoulNetworkHandler.syphonFromNetwork(par1ItemStack, 15) > 0) {
            SoulNetworkHandler.syphonFromNetwork(par1ItemStack, 15);
            player.removePotionEffect(Potion.wither.id);
        }else{
        	player.addPotionEffect(new PotionEffect (Potion.confusion.id, 10));;
        }

    }
    
}
