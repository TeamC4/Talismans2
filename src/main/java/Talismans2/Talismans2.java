package Talismans2;

import Talismans2.config.ConfigTalismans;
import Talismans2.creativeTab.CreativeTabTalismans;
import Talismans2.init.DungeonLoot;
import Talismans2.init.ModItems;
import Talismans2.lib.Modinfo;
import Talismans2.module.thaumcraft.ThaumcraftModule;
import Talismans2.proxies.CommonProxy;
import Talismans2.recipe.CopyingTalismans;
import Talismans2.util.LogHelper;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;

import java.io.File;

/**
 * @author Gigabit101
 */

@Mod(modid = Modinfo.ID, name = Modinfo.NAME, version = Modinfo.Version, dependencies = "required-after:Baubles@:")
public class Talismans2 {
	public static ConfigTalismans properties;

	@Instance(Modinfo.ID)
	public static Talismans2 instance;
	
	@SidedProxy(clientSide = Modinfo.CLIENT_PROXY_CLASS, serverSide = Modinfo.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	// Loads Talismans Creative Tab
	public static CreativeTabs tabsTalismans = new CreativeTabTalismans(CreativeTabs.getNextID(), Modinfo.NAME);

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event)
    {
		instance = this;
		// This should be the FIRST thing that gets done.
		String path = event.getSuggestedConfigurationFile().getAbsolutePath().replace(Modinfo.ID, "Talismans2");

		properties = ConfigTalismans.initialize(new File(path));
		
		// Loads Keybindings
		proxy.registerKeyBindings();
		
		// Load ModItems
		ModItems.init();
		
		// Load Old Recipes
		CopyingTalismans.init(properties);
		
        LogHelper.info("Pre Initialization Complete!");

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		//Load DungeonLoot
		DungeonLoot.init(properties);
		
        LogHelper.info("Initialization Complete!");

	}

	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		// Loads Thaumcraft Module if Thaumcraft is Installed   
		if (Loader.isModLoaded("Thaumcraft"))
        {            
   		   ThaumcraftModule.init(properties);
        }
        else
        {

        }
        if (Loader.isModLoaded("AWWayofTime"))
        {
        }
        else
        {
        }
        LogHelper.info("Post Initialization Complete!");


	}

}
