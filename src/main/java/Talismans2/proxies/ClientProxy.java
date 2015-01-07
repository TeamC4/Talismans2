package Talismans2.proxies;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import Talismans2.client.PlayerRenderHandler;
import Talismans2.keybinding.Keybindings;

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
