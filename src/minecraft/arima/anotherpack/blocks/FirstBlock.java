package arima.anotherpack.blocks;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class FirstBlock extends Block {
	


private String field_94402_c;



public FirstBlock(int par1, String par2Str, Material par2Material, String name) {

  super(par1, par2Material);
  this.field_94402_c = par2Str;
  this.setCreativeTab(Main.tabAPDesignBlocks);
  GameRegistry.registerBlock(this, name);
  this.setHardness(2.0F);
  this.setUnlocalizedName(name);
  }



public void registerIcons(IconRegister par1IconRegister)
{
    this.blockIcon = par1IconRegister.registerIcon(this.field_94402_c);
}


}
