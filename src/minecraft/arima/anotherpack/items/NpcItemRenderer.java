package arima.anotherpack.items;

import org.lwjgl.opengl.GL11;

import arima.anotherpack.common.weapons.ItemRenderInterface;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraftforge.client.IItemRenderer;

public class NpcItemRenderer implements IItemRenderer {

	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return type == ItemRenderType.EQUIPPED;
	}

	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}

	public void renderItem(ItemRenderType type, ItemStack par2ItemStack, Object... data) {
		if (par2ItemStack.getItem() instanceof ItemRenderInterface) {
			GL11.glTranslatef(0.9375F, 0.0625F, 0.0F);
			GL11.glRotatef(-315.0F, 0.0F, 0.0F, 1.0F);
			((ItemRenderInterface) par2ItemStack.getItem()).renderSpecial();
			GL11.glRotatef(-20.0F, 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(-50.0F, 0.0F, 1.0F, 0.0F);
			GL11.glTranslatef(-0.09375F, 0.0625F, 0.0F);
			this.renderItem3d((EntityLiving) data[1], par2ItemStack);
		}
	}

	public void renderItem3d(EntityLiving par1EntityLiving, ItemStack par2ItemStack) {
		Minecraft mc = Minecraft.getMinecraft();
		byte par3 = 0;
		Tessellator tessellator = Tessellator.instance;
		Icon icon = par1EntityLiving.getItemIcon(par2ItemStack, par3);
		if (icon != null) {
			float f = icon.getMinU();
			float f1 = icon.getMaxU();
			float f2 = icon.getMinV();
			float f3 = icon.getMaxV();
			float f4 = 0.0F;
			float f5 = 0.3F;
			GL11.glEnable('\u803a');
			GL11.glTranslatef(-f4, -f5, 0.0F);
			float f6 = 1.5F;
			GL11.glScalef(f6, f6, f6);
			GL11.glRotatef(50.0F, 0.0F, 1.0F, 0.0F);
			GL11.glRotatef(335.0F, 0.0F, 0.0F, 1.0F);
			GL11.glTranslatef(-0.9375F, -0.0625F, 0.0F);
			ItemRenderer.renderItemIn2D(tessellator, f1, f2, f, f3, icon.getSheetWidth(), icon.getSheetHeight(),
					0.0625F);
			if (par2ItemStack != null && par2ItemStack.hasEffect() && par3 == 0) {
				GL11.glDepthFunc(514);
				GL11.glDisable(2896);
				mc.renderEngine.bindTexture("%blur%/misc/glint.png");
				GL11.glEnable(3042);
				GL11.glBlendFunc(768, 1);
				float f7 = 0.76F;
				GL11.glColor4f(0.5F * f7, 0.25F * f7, 0.8F * f7, 1.0F);
				GL11.glMatrixMode(5890);
				GL11.glPushMatrix();
				float f8 = 0.125F;
				GL11.glScalef(f8, f8, f8);
				float f9 = (float) (Minecraft.getSystemTime() % 3000L) / 3000.0F * 8.0F;
				GL11.glTranslatef(f9, 0.0F, 0.0F);
				GL11.glRotatef(-50.0F, 0.0F, 0.0F, 1.0F);
				ItemRenderer.renderItemIn2D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
				GL11.glPopMatrix();
				GL11.glPushMatrix();
				GL11.glScalef(f8, f8, f8);
				f9 = (float) (Minecraft.getSystemTime() % 4873L) / 4873.0F * 8.0F;
				GL11.glTranslatef(-f9, 0.0F, 0.0F);
				GL11.glRotatef(10.0F, 0.0F, 0.0F, 1.0F);
				ItemRenderer.renderItemIn2D(tessellator, 0.0F, 0.0F, 1.0F, 1.0F, 256, 256, 0.0625F);
				GL11.glPopMatrix();
				GL11.glMatrixMode(5888);
				GL11.glDisable(3042);
				GL11.glEnable(2896);
				GL11.glDepthFunc(515);
			}

			GL11.glDisable('\u803a');
		}
	}
}
