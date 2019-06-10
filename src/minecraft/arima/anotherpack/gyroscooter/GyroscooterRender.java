package arima.anotherpack.gyroscooter;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class GyroscooterRender implements IItemRenderer {

   public static GyroscooterItemModel model = new GyroscooterItemModel();


   public boolean handleRenderType(ItemStack item, ItemRenderType type) {
      return true;
   }

   public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
      return true;
   }

   public void renderItem(ItemRenderType type, ItemStack item, Object ... data) {
      GL11.glPushMatrix();
      int i = item.getItemDamage();
      if(type.equals(ItemRenderType.ENTITY)) {
         GL11.glTranslatef(0.0F, 1.6F, 0.0F);
      } else {
         GL11.glTranslatef(0.5F, 1.6F, 0.5F);
      }

      GL11.glScalef(1.0F, 1.0F, 1.0F);
      GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
      Minecraft.getMinecraft().renderEngine.bindTexture("/mods/anotherpack/textures/gyroscooter/gyroscooter.png");
      model.render(i);
      GL11.glPopMatrix();
   }

}
