package arima.anotherpack.common.weapons;

import org.lwjgl.opengl.GL11;

import arima.anotherpack.gyroscooter.ModelGyroscooter;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

public class RenderBullet extends Render
{
    private ModelBase model;

    public RenderBullet()
    {
        model = new ModelGyroscooter();
    }


    @Override
    public void doRender(Entity entity, double x, double y, double z, float yaw, float partialTick)
    {
        GL11.glPushMatrix();
        Minecraft.getMinecraft().renderEngine.bindTexture("/mods/anotherpack/textures/items/Scythes/bullet_shell.png");
        GL11.glTranslated(x, y - 1.25D, z);
        model.render(entity, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0625F);
        GL11.glPopMatrix();
    }
}
