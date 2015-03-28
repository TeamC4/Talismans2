package Talismans2.client.gui;

import org.lwjgl.opengl.GL11;

import Talismans2.block.ContainerTalismanCrafter;
import Talismans2.block.TileTalismanCrafter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.util.ResourceLocation;

public class GuiTalismanCrafter extends GuiContainer{

	public static final ResourceLocation texture = new ResourceLocation(
			"talismans 2", "textures/gui/talisman_crafter.png");
	public TileTalismanCrafter tile;

	public GuiTalismanCrafter(InventoryPlayer inventoryPlayer, TileTalismanCrafter entity) 
	{
		super(new ContainerTalismanCrafter(inventoryPlayer, entity));
		this.tile = entity;
		xSize = 176;
		ySize = 187;
	}
	
	@Override
	public void drawGuiContainerForegroundLayer(int x, int y) {}

	
	@Override
	public void drawGuiContainerBackgroundLayer(float f, int i, int j) 
	{
		GL11.glColor4f(1F, 1F, 1F, 1F);
		Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
		drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
		double w = 48;
	}


}
