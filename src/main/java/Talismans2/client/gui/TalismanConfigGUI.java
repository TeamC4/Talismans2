package Talismans2.client.gui;

import java.util.ArrayList;
import java.util.List;

import Talismans2.config.ConfigTalismans;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.DummyConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.GuiConfigEntries;
import net.minecraftforge.fml.client.config.GuiConfigEntries.CategoryEntry;
import net.minecraftforge.fml.client.config.GuiConfigEntries.IConfigEntry;
import net.minecraftforge.fml.client.config.IConfigElement;

public class TalismanConfigGUI extends GuiConfig {
	public TalismanConfigGUI(GuiScreen top)
	{
		super(top, getConfigCategories(), "Talismans 2", false, false,
				GuiConfig.getAbridgedConfigPath(ConfigTalismans.config
						.toString()));
	}

	private static List<IConfigElement> getConfigCategories()
	{
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		list.add(new DummyConfigElement.DummyCategoryElement("Spawn Chances",
				"tm2.configgui.category.tmGeneral", (Class<? extends IConfigEntry>) TMGeneral.class));
		list.add(new DummyConfigElement.DummyCategoryElement(
				"Loot Spawn Chances", "tm2.configgui.category.tmLoot",
				(Class<? extends IConfigEntry>) TMLoot.class));
		list.add(new DummyConfigElement.DummyCategoryElement(
				"Configure Boolean Recipes",
				"tm2.configgui.category.tmRecipes", (Class<? extends IConfigEntry>) TMRecipes.class));
		list.add(new DummyConfigElement.DummyCategoryElement(
				"Blood Magic Integration",
				"tm2.configgui.category.tmBloodMagic", (Class<? extends IConfigEntry>) TMBloodMagic.class));
		list.add(new DummyConfigElement.DummyCategoryElement(
				"Thaumcraft Integration",
				"tm2.configgui.category.tmThaumcraft", (Class<? extends IConfigEntry>) TMTC.class));
		list.add(new DummyConfigElement.DummyCategoryElement(
				"Botania Integration", "tm2.configgui.category.tmBotania",
				(Class<? extends IConfigEntry>) TMBotania.class));
		return list;
	}

	public static class TMGeneral extends CategoryEntry {

		public TMGeneral(GuiConfig owningScreen,
				GuiConfigEntries owningEntryList, IConfigElement configElement)
		{
			super(owningScreen, owningEntryList, configElement);
		}

		@Override
		protected GuiScreen buildChildScreen()
		{
			return new GuiConfig(this.owningScreen,
					(new ConfigElement(ConfigTalismans.config
							.getCategory(Configuration.CATEGORY_GENERAL)))
							.getChildElements(), this.owningScreen.modID,
					Configuration.CATEGORY_GENERAL,
					this.configElement.requiresWorldRestart()
							|| this.owningScreen.allRequireWorldRestart,
					this.configElement.requiresMcRestart()
							|| this.owningScreen.allRequireMcRestart,
					GuiConfig.getAbridgedConfigPath(ConfigTalismans.config
							.toString()));
		}
	}

	// Loot
	public static class TMLoot extends CategoryEntry {

		public TMLoot(GuiConfig owningScreen, GuiConfigEntries owningEntryList,
				IConfigElement configElement)
		{
			super(owningScreen, owningEntryList, configElement);
		}

		@Override
		protected GuiScreen buildChildScreen()
		{
			return new GuiConfig(this.owningScreen,
					(new ConfigElement(ConfigTalismans.config
							.getCategory(ConfigTalismans.CATEGORY_LOOT)))
							.getChildElements(), this.owningScreen.modID,
					Configuration.CATEGORY_GENERAL,
					this.configElement.requiresWorldRestart()
							|| this.owningScreen.allRequireWorldRestart,
					this.configElement.requiresMcRestart()
							|| this.owningScreen.allRequireMcRestart,
					GuiConfig.getAbridgedConfigPath(ConfigTalismans.config
							.toString()));
		}
	}

	// Blood Magic
	public static class TMBloodMagic extends CategoryEntry {

		public TMBloodMagic(GuiConfig owningScreen,
				GuiConfigEntries owningEntryList, IConfigElement configElement)
		{
			super(owningScreen, owningEntryList, configElement);
		}

		@Override
		protected GuiScreen buildChildScreen()
		{
			return new GuiConfig(this.owningScreen,
					(new ConfigElement(ConfigTalismans.config
							.getCategory(ConfigTalismans.CATEGORY_BLOODMAGIC)))
							.getChildElements(), this.owningScreen.modID,
					Configuration.CATEGORY_GENERAL,
					this.configElement.requiresWorldRestart()
							|| this.owningScreen.allRequireWorldRestart,
					this.configElement.requiresMcRestart()
							|| this.owningScreen.allRequireMcRestart,
					GuiConfig.getAbridgedConfigPath(ConfigTalismans.config
							.toString()));
		}
	}

	public static class TMTC extends CategoryEntry {

		public TMTC(GuiConfig owningScreen, GuiConfigEntries owningEntryList,
				IConfigElement configElement)
		{
			super(owningScreen, owningEntryList, configElement);
		}

		@Override
		protected GuiScreen buildChildScreen()
		{
			return new GuiConfig(this.owningScreen,
					(new ConfigElement(ConfigTalismans.config
							.getCategory(ConfigTalismans.CATEGORY_THAUMCRAFT)))
							.getChildElements(), this.owningScreen.modID,
					Configuration.CATEGORY_GENERAL,
					this.configElement.requiresWorldRestart()
							|| this.owningScreen.allRequireWorldRestart,
					this.configElement.requiresMcRestart()
							|| this.owningScreen.allRequireMcRestart,
					GuiConfig.getAbridgedConfigPath(ConfigTalismans.config
							.toString()));
		}
	}

	public static class TMRecipes extends CategoryEntry {

		public TMRecipes(GuiConfig owningScreen,
				GuiConfigEntries owningEntryList, IConfigElement configElement)
		{
			super(owningScreen, owningEntryList, configElement);
		}

		@Override
		protected GuiScreen buildChildScreen()
		{
			return new GuiConfig(this.owningScreen,
					(new ConfigElement(ConfigTalismans.config
							.getCategory(ConfigTalismans.CATEGORY_RECIPES)))
							.getChildElements(), this.owningScreen.modID,
					Configuration.CATEGORY_GENERAL,
					this.configElement.requiresWorldRestart()
							|| this.owningScreen.allRequireWorldRestart,
					this.configElement.requiresMcRestart()
							|| this.owningScreen.allRequireMcRestart,
					GuiConfig.getAbridgedConfigPath(ConfigTalismans.config
							.toString()));
		}
	}

	// Botania
	public static class TMBotania extends CategoryEntry {

		public TMBotania(GuiConfig owningScreen,
				GuiConfigEntries owningEntryList, IConfigElement configElement)
		{
			super(owningScreen, owningEntryList, configElement);
		}

		@Override
		protected GuiScreen buildChildScreen()
		{
			return new GuiConfig(this.owningScreen,
					(new ConfigElement(ConfigTalismans.config
							.getCategory(ConfigTalismans.CATEGORY_BOTANIA)))
							.getChildElements(), this.owningScreen.modID,
					Configuration.CATEGORY_GENERAL,
					this.configElement.requiresWorldRestart()
							|| this.owningScreen.allRequireWorldRestart,
					this.configElement.requiresMcRestart()
							|| this.owningScreen.allRequireMcRestart,
					GuiConfig.getAbridgedConfigPath(ConfigTalismans.config
							.toString()));
		}
	}

}
