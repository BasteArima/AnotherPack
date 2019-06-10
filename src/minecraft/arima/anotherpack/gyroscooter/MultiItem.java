package arima.anotherpack.gyroscooter;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.List;

import arima.anotherpack.core.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MultiItem extends Item {

   int count = 0;


   public MultiItem(int par1, int count) {
      super(par1);
      this.count = count;
      this.setHasSubtypes(true);
      this.setMaxDamage(0);
      this.setMaxStackSize(64);
      this.setCreativeTab(Main.tabAPFan);
   }

   @SideOnly(Side.CLIENT)
   public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
      for(int x = 0; x < this.count; ++x) {
         par3List.add(new ItemStack(this, 1, x));
      }

   }

   public String d(ItemStack itemstack) {
      return this.getUnlocalizedName() + "." + itemstack.getItemDamage();
   }
}
