package arima.anotherpack.blocks;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockLadder;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.world.IBlockAccess;

public class basic_gif extends BlockLadder{
	
	private String texture;
	
	public basic_gif(int par1, String name, String texture) {
		  super(par1);
		  this.texture = texture;
		  this.setUnlocalizedName(name);
	      this.setCreativeTab(Main.tabAPFan);
	      this.setResistance(-1);
	      this.setHardness(0.5F);
	      GameRegistry.registerBlock(this, name);
	   }

	   public boolean isLadder(IBlockAccess world, int x, int y, int z, EntityLiving entity) {
	      return false;
	   }
	   public void registerIcons(IconRegister par1IconRegister)
	   {
	       this.blockIcon = par1IconRegister.registerIcon(this.texture);
	   }
}

