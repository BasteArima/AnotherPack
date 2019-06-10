package arima.anotherpack.gui;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.EnumGameType;

public class SwordsGUI extends GuiScreen {
	int count_d = 0;
	public static String Gui = "Gui";
	
	public void drawScreen(int x, int y, float ticks) {
		mc.renderEngine.bindTexture("/gui/m4.png");
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		drawTexturedQuadFit(0, 10, this.width, this.height - 20, 0);
		super.drawScreen(x, y, ticks);
	}

	public void initGui() {
		GuiButton submitButton = new GuiButton(1, this.width / 2 - 60, this.height - 60, 100, 20, "Выход");
		GuiButton levelsup = new GuiButton(2, this.width / 2 - 60, this.height - 90, 100, 20, "Поднять уровень");
		/**
		
		GuiButton repair = new GuiButton(3, this.width / 2 + 45, this.height - 60, 140, 20, "Починить оружие");
		GuiButton points = new GuiButton(4, this.width / 2 + 45, this.height - 90, 140, 20, "Узнать количество очков");
		GuiButton swordslines = new GuiButton(5, this.width / 2 - 155, this.height - 90, 90, 20, "Уровни мечей");
		GuiButton scytheslines = new GuiButton(6, this.width / 2 - 155, this.height - 60, 90, 20, "Уровни кос");
		this.buttonList.clear();
		
		
		this.buttonList.add(repair);
		this.buttonList.add(points);
		this.buttonList.add(swordslines);
		this.buttonList.add(scytheslines);
		**/
		this.buttonList.add(levelsup);
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
		case 2:
			//this.mc.displayGuiScreen(new LoLGui());
			mc.thePlayer.sendChatMessage("/menu");
			break;
		case 3:
			mc.thePlayer.sendChatMessage("/srep");
			break;
		case 4:
			mc.thePlayer.sendChatMessage("/cpoint");
			break;
		case 5:
			this.mc.displayGuiScreen(new SwordsLines());
			break;
		case 6:
			this.mc.displayGuiScreen(new ScythesLines());
			break;
		}
	}
}
