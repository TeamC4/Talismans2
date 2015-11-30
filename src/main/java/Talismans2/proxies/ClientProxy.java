package Talismans2.proxies;

import Talismans2.client.PlayerRenderHandler;
import Talismans2.init.ModItems;
import Talismans2.keybinding.Keybindings;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Loader;

/**
 * @author Gigabit101
 */

public class ClientProxy extends CommonProxy 
{
	@Override
	public void registerKeyBindings()
	{
		ClientRegistry.registerKeyBinding(Keybindings.craft);
	}

	public void registerPlayerRenderHandler()
	{
		PlayerRenderHandler.initialize();
	}
	
	@Override
	public void registerRender()
	{
		// Load textures for ModItems
		ModItems.registerRenders();
	}
}
