package Talismans2;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import Talismans2.config.ConfigTalismans;
import Talismans2.creativeTab.CreativeTabTalismans;
import Talismans2.init.DungeonLoot;
import Talismans2.init.ModItems;
import Talismans2.lib.Modinfo;
import Talismans2.module.ModuleHandler;
import Talismans2.module.bloodmagic.BloodItems;
import Talismans2.proxies.CommonProxy;
import Talismans2.recipe.CraftingHandler;
import Talismans2.util.LogHelper;

/**
 * @author Gigabit101
 */

@Mod(modid = Modinfo.ID, name = Modinfo.NAME, version = Modinfo.Version, dependencies = Modinfo.ModDependences, guiFactory = Modinfo.GUI_FACTORY_CLASS)
public class Talismans2 {
	
	public static ConfigTalismans properties;

	@Instance(Modinfo.ID)
	public static Talismans2 instance;

	@SidedProxy(clientSide = Modinfo.CLIENT_PROXY_CLASS, serverSide = Modinfo.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;

	// Loads Talismans Creative Tab
	public static CreativeTabs tabsTalismans = new CreativeTabTalismans(
			CreativeTabs.getNextID(), Modinfo.NAME);

	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event)
	{
		instance = this;
		// This should be the FIRST thing that gets done.
		String path = event.getSuggestedConfigurationFile().getAbsolutePath()
				.replace(Modinfo.ID, "Talismans2");

		properties = ConfigTalismans.initialize(new File(path));

		// Loads Keybindings
		proxy.registerKeyBindings();

		// Loads Floating Talisman Patreon Only
		// proxy.registerPlayerRenderHandler();

		// Load ModItems
		ModItems.init();

		// Load Old Recipes
		CraftingHandler.CopyTalismans(properties);

		LogHelper.info("Pre Initialization Complete!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		// Load DungeonLoot
		DungeonLoot.init(properties);

		LogHelper.info("Initialization Complete!");

		FMLCommonHandler.instance().bus().register(instance);

	}

	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event)
	{
		proxy.registerRender();

		ModuleHandler.init();

		LogHelper.info("Post Initialization Complete!");

	}

	@SubscribeEvent
	public void onConfigChanged(
			ConfigChangedEvent.OnConfigChangedEvent cfgChange)
	{
		if (cfgChange.modID.equals("Talismans 2")) {
			ConfigTalismans.Configs();

		}
	}

}
