package Talismans2.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.common.MinecraftForge;

import org.lwjgl.opengl.GL11;

import Talismans2.init.ModItems;
import Talismans2.lib.Uuids;
import Talismans2.util.RendererUtil;
import Talismans2.util.TalismanStacks;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class PlayerRenderHandler {
	public static EntityPlayer player;

	public static void initialize() {
		PlayerRenderHandler playerRenderHandler = new PlayerRenderHandler();
		FMLCommonHandler.instance().bus().register(playerRenderHandler);
		MinecraftForge.EVENT_BUS.register(playerRenderHandler);
	}

	private int clientTickCount;

	@SubscribeEvent
	public void onClientTick(TickEvent.ClientTickEvent event) {
		if (event.phase == TickEvent.Phase.START)
			return;
		clientTickCount++;
	}

	@SubscribeEvent
	public void onRenderLiving(RenderLivingEvent.Specials.Post event) {
		if (!(event.entity instanceof EntityPlayer))
        	return;
		ItemStack iS = TalismanStacks.talismanFlame;
		Minecraft mc = Minecraft.getMinecraft();
		IIcon icon = ModItems.FlameTalisman.getIconFromDamage(0); // This can

		// changed to
		// whatever you
		// want

		mc.getTextureManager().bindTexture(TextureMap.locationItemsTexture);
		// mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
		// Uncomment this if using a block texture

		final float yOffset = 0.65F; // Adjusts how far above the player to
										// render
		final float spinModifier = 30F; // Controls how fast the texture spins.
										// Lower number equals faster spin

		float spin = (((float) clientTickCount) / spinModifier)
				* (180F / (float) Math.PI);

		GL11.glPushMatrix();
		GL11.glTranslatef((float) event.x + 0.0F, (float) event.y
				+ event.entity.height + yOffset, (float) event.z);
		GL11.glNormal3f(0.0F, 1.0F, 0.0F);

		GL11.glRotatef(spin, 0, 1, 0);

		GL11.glScaled(0.5, 0.5, 0.5);

		RendererUtil.renderItemIn3d(iS);

		GL11.glPopMatrix();

		}
	 
}
