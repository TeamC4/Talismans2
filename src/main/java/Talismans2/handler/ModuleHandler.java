package Talismans2.handler;

import Talismans2.config.ConfigTalismans;
import Talismans2.module.bloodmagic.BloodMagicModule;
import Talismans2.module.botania.BotaniaModule;
import Talismans2.module.thaumcraft.ThaumcraftModule;
import Talismans2.util.LogHelper;
import cpw.mods.fml.common.Loader;

public class ModuleHandler {
	public static ConfigTalismans properties;

	public static void init()
	{
		// Loads Thaumcraft Module if Thaumcraft is Installed
		if (Loader.isModLoaded("Thaumcraft")) {
			ThaumcraftModule.init(properties);
			LogHelper.info("Thaumcraft Module Loaded!");
		} else {
			LogHelper.info("Thaumcraft Not Detected Aborting Loading Thaumcraft Module!");

		}
		// Loads Blood Magic Module
		if (Loader.isModLoaded("AWWayofTime")) {
			BloodMagicModule.init(properties);
			LogHelper.info("BloodMagic Module Loaded!");
		} else {
			LogHelper.info("BloodMagic Not Detected Aborting Loading BloodMagic Module!");
		}
		// Loads Botania Module
		if (Loader.isModLoaded("Botania")) {
			BotaniaModule.init(properties);
			LogHelper.info("Botania Module Loaded!");
		} else {
			LogHelper.info("Botania Not Detected Aborting Loading Botania Module!");
		}
	}

}
