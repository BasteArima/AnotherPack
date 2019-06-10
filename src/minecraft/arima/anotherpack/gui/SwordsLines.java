package arima.anotherpack.gui;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiShareToLan;
import net.minecraft.client.gui.GuiSmallButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.achievement.GuiAchievements;
import net.minecraft.client.gui.achievement.GuiStats;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.stats.StatFileWriter;
import net.minecraft.stats.StatList;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.AchievementPage;

public class SwordsLines extends GuiScreen {
public void drawScreen(int x, int y, float ticks){
mc.renderEngine.bindTexture("/gui/swlines.png");
GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
drawTexturedQuadFit(95, 50, this.width - 190, this.height - 150, 1);
super.drawScreen(x, y, ticks);
}

public void initGui()
{
	GuiButton exit = new GuiButton(1, this.width / 2 - 60, this.height - 60, 100, 20, "Выход"); 
	GuiButton back = new GuiButton(2, this.width / 2 - 60, this.height - 90, 100, 20, "Обратно в меню"); 
	this.buttonList.clear(); 
	this.buttonList.add(exit); 
	this.buttonList.add(back); 
}

public static void drawTexturedQuadFit(double x,double y,double width,double height,double zLevel){
    Tessellator tessellator = Tessellator.instance;
    tessellator.startDrawingQuads();
    tessellator.addVertexWithUV(x + 0, y + height, zLevel, 0, 1);
    tessellator.addVertexWithUV(x + width, y + height, zLevel, 1, 1);
    tessellator.addVertexWithUV(x + width, y + 0, zLevel, 1, 0);
    tessellator.addVertexWithUV(x + 0, y + 0, zLevel, 0, 0);
    tessellator.draw();
}

protected void actionPerformed(GuiButton par1GuiButton)
{
	
    switch (par1GuiButton.id)
    {
        case 1:
            this.mc.displayGuiScreen(null);
            break;
        case 2:
        	this.mc.displayGuiScreen(new SwordsGUI());
        	break;
    }
}


}
