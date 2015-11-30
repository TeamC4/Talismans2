package Talismans2.client;

import org.lwjgl.opengl.GL11;

import Talismans2.item.ItemTalismanBauble;
import baubles.common.container.InventoryBaubles;
import baubles.common.lib.PlayerHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class BaubleRender 
{
	@SubscribeEvent
	public void onPlayerRender(RenderPlayerEvent.Specials.Post event)
	{
		EntityPlayer player = event.entityPlayer;
		InventoryBaubles inv = PlayerHandler.getPlayerBaubles(player);
		
		float yaw = player.prevRotationYawHead + (player.rotationYawHead - player.prevRotationYawHead) * event.partialRenderTick;
		float yawOffset = player.prevRenderYawOffset + (player.renderYawOffset - player.prevRenderYawOffset) * event.partialRenderTick;
		float pitch = player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch) * event.partialRenderTick;
//		renderTalisman(event);
		GL11.glPushMatrix();
		GL11.glRotatef(yawOffset, 0, -1, 0);
		GL11.glRotatef(yaw - 270, 0, 1, 0);
		GL11.glRotatef(pitch, 0, 0, 1);
		GL11.glPopMatrix();
	}
	
	private void renderTalisman(RenderPlayerEvent event) 
	{
		//TODO fix this no more getIcon
		EntityPlayer player = event.entityPlayer;
		InventoryBaubles inv = PlayerHandler.getPlayerBaubles(player);
		boolean renderedOne = false;
			ItemStack stack = inv.getStackInSlot(0);
			if(stack != null && stack.getItem() instanceof ItemTalismanBauble && !player.isInvisible())
			{
				Item item = stack.getItem();
				GL11.glPushMatrix();
//				Minecraft.getMinecraft().renderEngine.bindTexture(TextureMap.locationItemsTexture);
				boolean armor = event.entityPlayer.getCurrentArmor(2) != null;
				GL11.glRotatef(180F, 1F, 0F, 0F);
				GL11.glRotatef(0F, 0F, 1F, 10F);
				GL11.glTranslatef(-0.14F, -0.35F, renderedOne ? armor ? 0.1F : 0.1F : armor ? 0.2F : 0.15F);
				GL11.glScalef(0.25F, 0.25F, 0.25F);

				GL11.glColor3f(1F, 1F, 1F);
				int light = 15728880;
				int lightmapX = light % 65536;
				int lightmapY = light / 65536;
				OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lightmapX, lightmapY);
				for(int j = 0; j < 2; j++)
				{
//					IIcon icon = item.getIcon(stack, j);
//					float f = icon.getMinU();
//					float f1 = icon.getMaxU();
//					float f2 = icon.getMinV();
//					float f3 = icon.getMaxV();
//					ItemRenderer.renderItemIn2D(Tessellator.instance, f1, f2, f, f3, icon.getIconWidth(), icon.getIconHeight(), 1F / 16F);
				}
				GL11.glPopMatrix();
			}
		}

	public static void initialize()
	{
		BaubleRender playerRenderHandler = new BaubleRender();
		FMLCommonHandler.instance().bus().register(playerRenderHandler);
		MinecraftForge.EVENT_BUS.register(playerRenderHandler);
	}
}
