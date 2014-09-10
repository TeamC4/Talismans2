package Talismans2;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import Talismans2.config.ConfigTalismans;
import Talismans2.creativeTab.CreativeTabTalismans;
import Talismans2.init.ModItems;
import Talismans2.lib.Modinfo;
import Talismans2.module.thaumcraft.ThaumcraftModule;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author Gigabit101
 */

@Mod(modid = Modinfo.ID, name = Modinfo.NAME, version = Modinfo.Version)
public class Talismans2 {

	// Loads Talismans Creative Tab
	public static CreativeTabs tabsTalismans = new CreativeTabTalismans(
			CreativeTabs.getNextID(), Modinfo.NAME);

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		// Loads ModItems
		ModItems.init();
		ConfigTalismans.config = new Configuration(
				event.getSuggestedConfigurationFile());
		ConfigTalismans.createConfig();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {

	}

	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		// Loads Thaumcraft Module
		ThaumcraftModule.init();
	}

}
