package Talismans;

import net.minecraft.creativetab.CreativeTabs;
import Talismans.creativeTab.CreativeTabTalismans;
import Talismans.init.ModItems;
import Talismans.lib.Modinfo;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Modinfo.ID, name = Modinfo.NAME, version = Modinfo.Version)
public class Talismans2 {
	
	//Loads Talismans Creative Tab
	public static CreativeTabs tabsTalismans = new CreativeTabTalismans(
			CreativeTabs.getNextID(), Modinfo.NAME);
	
	@Mod.EventHandler
	public void preinit (FMLPreInitializationEvent event){
		//Loads ModItems
		ModItems.init();
	}
	@Mod.EventHandler
	public void init (FMLInitializationEvent event){
			
	}
	@Mod.EventHandler
	public void postinit (FMLPostInitializationEvent event){
		
	}
	

}
