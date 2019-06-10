package arima.anotherpack.blocks;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.BlockLadder;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.IBlockAccess;

public class BlocksCloth extends BlockLadder {

	private String texture;
	
	   public BlocksCloth(int par1, String name, String texture) {
		   super(par1);
	      this.setUnlocalizedName(name);
	      this.texture = texture;
	      this.setCreativeTab(Main.tabAPDesignBlocks);
	      this.setHardness(1.0F);
			GameRegistry.registerBlock(this, name);

	   }

	   public boolean isLadder(IBlockAccess world, int x, int y, int z) {
	      return false;
	   }
	   public void registerIcons(IconRegister par1IconRegister)
	   {
	       this.blockIcon = par1IconRegister.registerIcon(this.texture);
	   }
}
