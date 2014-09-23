package Talismans2.module.bloodmagic.items;

import Talismans2.Talismans2;
import Talismans2.item.ItemTalismanBauble;
import baubles.api.BaubleType;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemStack;

public class ItemBloodMiningTalisman extends ItemTalismanBauble {

    public ItemBloodMiningTalisman(){
        super();
        this.setCreativeTab(Talismans2.tabsTalismans);
        this.setUnlocalizedName("Blood Mining Talisman");
        this.setMaxStackSize(1);
    }


    @Override
    public void registerIcons(IIconRegister iconRegister) {
        itemIcon = iconRegister.registerIcon("talismans2:BloodMining");
    }

    @Override
    public BaubleType getBaubleType(ItemStack arg0) {
        return BaubleType.AMULET;
    }

}
