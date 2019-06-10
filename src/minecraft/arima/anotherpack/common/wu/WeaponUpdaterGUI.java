package arima.anotherpack.common.wu;

import org.lwjgl.opengl.GL11;

import arima.anotherpack.common.wu.WeaponUpdaterContainer.State;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

@SideOnly(Side.CLIENT)
public class WeaponUpdaterGUI extends GuiContainer {

	public WeaponUpdaterContainer container;
	private final String blockName;

	public WeaponUpdaterGUI(InventoryPlayer playerInventory, World parWorld, String parBlockName, int parX, int parY,
			int parZ) {
		super(new WeaponUpdaterContainer(playerInventory, parWorld, parX, parY, parZ));
		container = (WeaponUpdaterContainer) inventorySlots;
		blockName = parBlockName;
	}

	@Override
	public void actionPerformed(GuiButton button) {
	}

	@Override
	public void drawScreen(int par1, int par2, float par3) {
		super.drawScreen(par1, par2, par3);
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int par1, int par2) {
		GL11.glDisable(GL11.GL_LIGHTING);

		fontRenderer.drawString(blockName, xSize / 2 - fontRenderer.getStringWidth(blockName) / 2 + 1, 5, 4210752);
		fontRenderer.drawString(StatCollector.translateToLocal("container.inventory"), 6, ySize - 96 + 2, 4210752);

		String string = container.resultString;
		if (string != null) {
			State msgType = container.weaponupdaterState;
			EnumChatFormatting format = EnumChatFormatting.GREEN;
			EnumChatFormatting shadowFormat = EnumChatFormatting.DARK_GRAY;
			if (msgType == WeaponUpdaterContainer.State.ERROR) {
				format = EnumChatFormatting.WHITE;
				shadowFormat = EnumChatFormatting.DARK_RED;
			}

			fontRenderer.drawString(shadowFormat + string + EnumChatFormatting.RESET, 6 + 1,
					ySize - 95 + 2 - fontRenderer.FONT_HEIGHT, 0);

			fontRenderer.drawString(format + string + EnumChatFormatting.RESET, 6,
					ySize - 96 + 2 - fontRenderer.FONT_HEIGHT, 0);
		}

		GL11.glEnable(GL11.GL_LIGHTING);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		GL11.glPushMatrix();
		GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);

		mc.renderEngine.bindTexture("/mods/anotherpack/textures/gui/WeaponUpdaterGUI.png");

		int k = width / 2 - xSize / 2;
		int l = height / 2 - ySize / 2;
		drawTexturedModalRect(k-1, l-1, 0, 0, xSize, ySize);
		GL11.glPopMatrix();
	}

}
