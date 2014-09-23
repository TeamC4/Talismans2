package Talismans2.module.bloodmagic.items;

import Talismans2.Talismans2;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemBlankBloodTalisman extends Item {

    public ItemBlankBloodTalisman(){
        super();
        this.setCreativeTab(Talismans2.tabsTalismans);
        this.setMaxStackSize(1);
        this.setUnlocalizedName("Blank Blood Talisman");
    }

    @Override
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon("talismans2:BloodBlank");
    }

}
