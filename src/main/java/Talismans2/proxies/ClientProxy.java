package Talismans2.proxies;

import Talismans2.init.ModItems;
import Talismans2.keybinding.Keybindings;
import net.minecraftforge.fml.client.registry.ClientRegistry;

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
	
	@Override
	public void registerRender()
	{
		// Load textures for ModItems
		ModItems.registerRenders();
		// TODO fix Load Custum Renders
//		BaubleRender.initialize();
	}
}
