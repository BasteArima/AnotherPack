package arima.anotherpack.blocks;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class FencesWood extends BlockFence {
	private String texture;
	   public FencesWood(int par1, String name, String par2Str) {
	      super(par1, par2Str, Material.wood);
	      this.texture = par2Str;
	      this.setUnlocalizedName(name);
	      this.setCreativeTab(Main.tabAPWoodBlocks);
	      this.setStepSound(soundWoodFootstep);
	      this.setHardness(3.0F);
	      GameRegistry.registerBlock(this,name);
	   }
	   
	   public void registerIcons(IconRegister par1IconRegister)
	   {
	       this.blockIcon = par1IconRegister.registerIcon(this.texture);
	   }
}
