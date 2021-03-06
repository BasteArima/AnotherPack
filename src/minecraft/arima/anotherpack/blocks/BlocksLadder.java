package arima.anotherpack.blocks;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlocksLadder extends BlockLadder {
	private String texture;

	   public BlocksLadder(int par1, String name, String texture) {
		   super(par1);
	      this.texture = texture;
	      this.setCreativeTab(Main.tabAPDesignBlocks);
	      this.setHardness(3.0F);
	      this.setStepSound(soundLadderFootstep);
	      GameRegistry.registerBlock(this,name);
	   }
	   public void registerIcons(IconRegister par1IconRegister)
	   {
	       this.blockIcon = par1IconRegister.registerIcon(this.texture);
	   }
}
