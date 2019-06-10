package arima.anotherpack.common.weapons;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import arima.anotherpack.models.RF_Sword_1;
import arima.anotherpack.models.RF_Sword_2;
import arima.anotherpack.models.RF_Sword_3;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;

public class RF_Swords_Renderer implements IItemRenderer {

	public String nameRF;
	protected RF_Sword_1 RF_Sword_Model_1 = new RF_Sword_1();
	protected RF_Sword_2 RF_Sword_Model_2 = new RF_Sword_2();
	protected RF_Sword_3 RF_Sword_Model_3 = new RF_Sword_3();

	public RF_Swords_Renderer(String name) {
		RF_Sword_Model_1 = new RF_Sword_1();
		RF_Sword_Model_2 = new RF_Sword_2();
		RF_Sword_Model_3 = new RF_Sword_3();
		this.nameRF = name;
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		switch (type) {
		case EQUIPPED:
			return true;
		case ENTITY:
			return false;
		case FIRST_PERSON_MAP:
			break;
		case INVENTORY:
			return false;
		default:
			return false;
		}
		return false;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		switch (type) {
		case EQUIPPED: {
			GL11.glPushMatrix();
			if (data[1] != null && data[1] instanceof EntityPlayer) {
				if (this.nameRF == "RF_Sword_1") {
					Minecraft.getMinecraft().renderEngine
							.bindTexture("/mods/anotherpack/textures/items/swords/RF_Sword_1.png");
					GL11.glRotatef(80.0F, 1.0F, 0.0F, 0.0F);
					GL11.glRotatef(-40.0F, 0.0F, 1.0F, 0.0F);
					GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
					GL11.glTranslatef(-0.1F, 0.5F, -0.7F);
					this.RF_Sword_Model_1.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
				}
				if (this.nameRF == "RF_Sword_2") {
					Minecraft.getMinecraft().renderEngine
							.bindTexture("/mods/anotherpack/textures/items/swords/RF_Sword_2.png");
					GL11.glRotatef(175.0F, 10.0F, 3.6F, 1.0F);
					GL11.glRotatef(1.0F, 1.0F, 0.0F, 350.0F);
					GL11.glTranslatef(0.7F, 0.1F, 0.1F);
					this.RF_Sword_Model_2.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
				}
				if (this.nameRF == "RF_Sword_3") {
					Minecraft.getMinecraft().renderEngine
							.bindTexture("/mods/anotherpack/textures/items/swords/RF_Sword_3.png");
					GL11.glRotatef(220.0F, 12.0F, 5.0F, 14.0F);
					GL11.glRotatef(3.0F, 1.0F, 3.0F, 0.0F);
					GL11.glTranslatef(-0.15F, 0.0F, 0.5F);
					this.RF_Sword_Model_3.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
				}
				if (this.nameRF == "RF_Sword_4") {
					Minecraft.getMinecraft().renderEngine
							.bindTexture("/mods/anotherpack/textures/items/swords/RF_Sword_4.png");
					GL11.glRotatef(80.0F, 1.0F, 0.0F, 0.0F);
					GL11.glRotatef(-40.0F, 0.0F, 1.0F, 0.0F);
					GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
					GL11.glTranslatef(-0.1F, 0.5F, -0.7F);
					this.RF_Sword_Model_1.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
				}

			} else {
				Minecraft.getMinecraft().renderEngine
						.bindTexture("/mods/anotherpack/textures/items/swords/RF_Sword_1.png");
				GL11.glRotatef(80.0F, 1.0F, 0.0F, 0.0F);
				GL11.glRotatef(-40.0F, 0.0F, 1.0F, 0.0F);
				GL11.glRotatef(-90.0F, 0.0F, 0.0F, 1.0F);
				GL11.glTranslatef(-0.1F, -0.5F, -0.7F);
				this.RF_Sword_Model_1.render((Entity) data[1], 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
			}
			GL11.glPopMatrix();
		}
		default:
			break;
		}

	}

}
