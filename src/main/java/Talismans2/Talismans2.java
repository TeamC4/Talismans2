package Talismans2;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import Talismans2.config.ConfigTalismans;
import Talismans2.creativeTab.CreativeTabTalismans;
import Talismans2.init.DungeonLoot;
import Talismans2.init.ModItems;
import Talismans2.lib.Modinfo;
import Talismans2.module.thaumcraft.ThaumcraftModule;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * @author Gigabit101
 */

@Mod(modid = Modinfo.ID, name = Modinfo.NAME, version = Modinfo.Version)
public class Talismans2 {
	public static ConfigTalismans properties;

	@Instance(Modinfo.ID)
	public static Talismans2 instance;

	// Loads Talismans Creative Tab
	public static CreativeTabs tabsTalismans = new CreativeTabTalismans(
			CreativeTabs.getNextID(), Modinfo.NAME);

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		instance = this;
		// This should be the FIRST thing that gets done.
		String path = event.getSuggestedConfigurationFile().getAbsolutePath()
				.replace(Modinfo.ID, "Talismans2");

		properties = ConfigTalismans.initialize(new File(path));
		// Load ModItems
		ModItems.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		DungeonLoot.init(properties);
	}

	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		// Loads Thaumcraft Module
		ThaumcraftModule.init(properties);
	}

}
