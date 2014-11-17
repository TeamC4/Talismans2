package Talismans2.proxies;

import Talismans2.client.PlayerRenderHandler;
import Talismans2.keybinding.Keybindings;
import cpw.mods.fml.client.registry.ClientRegistry;

/**
 * @author Gigabit101
 */

public class ClientProxy extends CommonProxy {

	@Override
	public void registerKeyBindings()
	{
		ClientRegistry.registerKeyBinding(Keybindings.craft);
	}

	public void registerPlayerRenderHandler()
	{
		PlayerRenderHandler.initialize();
	}

}
