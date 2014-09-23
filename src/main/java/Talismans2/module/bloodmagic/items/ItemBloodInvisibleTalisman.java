package Talismans2.module.bloodmagic.items;

import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;
import baubles.api.BaubleType;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class ItemBloodInvisibleTalisman extends ItemTalismanBauble {


    public ItemBloodInvisibleTalisman(){
        super();
        this.setMaxStackSize(1);
        this.setUnlocalizedName("Blood Invisible Talisman");
        this.setCreativeTab(Talismans2.tabsTalismans);
    }
    @Override
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon("talismans2:BloodInvisible");
    }

    @Override
    public BaubleType getBaubleType(ItemStack arg0) {
        return BaubleType.AMULET;
    }

}
