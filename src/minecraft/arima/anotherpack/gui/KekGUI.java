package arima.anotherpack.gui;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;

public class KekGUI extends GuiScreen {
	public void drawScreen(int x, int y, float ticks) {
		mc.renderEngine.bindTexture("/gui/13r.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		drawTexturedQuadFit(0, 0, this.width, this.height, 0);
		super.drawScreen(x, y, ticks);
	}

	public void initGui() {
		GuiButton submitButton = new GuiButton(1, this.width / 2 - 60, this.height - 60, 100, 20, "Выход");
		this.buttonList.clear();
		this.buttonList.add(submitButton);

	}

	public static void drawTexturedQuadFit(double x, double y, double width, double height, double zLevel) {
		Tessellator tessellator = Tessellator.instance;
		tessellator.startDrawingQuads();
		tessellator.addVertexWithUV(x + 0, y + height, zLevel, 0, 1);
		tessellator.addVertexWithUV(x + width, y + height, zLevel, 1, 1);
		tessellator.addVertexWithUV(x + width, y + 0, zLevel, 1, 0);
		tessellator.addVertexWithUV(x + 0, y + 0, zLevel, 0, 0);
		tessellator.draw();
	}

	protected void actionPerformed(GuiButton par1GuiButton) {

		switch (par1GuiButton.id) {
		case 1:
			this.mc.displayGuiScreen(null);
			break;
		}
	}

}
