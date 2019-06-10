package arima.anotherpack.blocks;

import java.util.Random;

import arima.anotherpack.core.AllBlocks;
import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class emptySlab extends BlockHalfSlab {
	private String texture;
	

	   public emptySlab(int par1, String name, String texture) {
		      super(par1, false, Material.rock);
		      this.setUnlocalizedName(name);
		      this.texture = texture;
		      this.setCreativeTab(Main.tabAPDesignBlocks);
		      this.setHardness(3.0F);
	   }

	public String func_150002_b(int p_150002_1_) {
	      return null;
	   }
	   
	   public void registerIcons(IconRegister par1IconRegister)
	   {
	       this.blockIcon = par1IconRegister.registerIcon(this.texture);
	   }

	@Override
	public String getFullSlabName(int i) {
		return null;
	}
	
	private static boolean isBlockSingleSlab(int par0)
 {
     return par0 == Block.stoneDoubleSlab.blockID || par0 == Block.stoneDoubleSlab.blockID;
 }
	
    public int quantityDropped(Random par1Random)
    {
        return 0;
    }

    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }


    public boolean isOpaqueCube()
    {
        return false;
    }


    public boolean renderAsNormalBlock()
    {
        return false;
    }
    
    protected boolean canSilkHarvest()
    {
        return false;
    }
    
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.blockID;
    }
	
}

