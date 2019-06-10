package arima.anotherpack.items;

import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.MinecraftForgeClient;
import arima.anotherpack.common.weapons.ItemRenderInterface;
import arima.anotherpack.core.Main;
import arima.anotherpack.items.NpcItemRenderer;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import org.lwjgl.opengl.GL11;

public class ItemNpcWeaponInterface extends ItemSword implements ItemRenderInterface {

   public ItemNpcWeaponInterface(int par1, EnumToolMaterial material) {
      super(par1, material);
      this.setCreativeTab(Main.tabAPWeaponAndArmor);
   }

   @SideOnly(Side.CLIENT)
   public void renderSpecial() {
      GL11.glScalef(0.66F, 0.66F, 0.66F);
      GL11.glTranslatef(0.0F, 0.3F, 0.0F);
   }
}