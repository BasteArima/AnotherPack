package arima.anotherpack.blocks;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class BlocksRope extends Block {
	
		private String texture;

	   public BlocksRope(int par1, String name, String texture) {
	      super(par1, Material.cloth);
	      this.setUnlocalizedName(name);
	      this.texture = texture;
	      this.setCreativeTab(Main.tabAPDesignBlocks);
	      this.setHardness(1.0F);
	      GameRegistry.registerBlock(this, name);
	   }

	   public void registerIcons(IconRegister par1IconRegister)
	   {
	       this.blockIcon = par1IconRegister.registerIcon(this.texture);
	   }
	   
	   public boolean isOpaqueCube() {
	      return false;
	   }

	   public int getRenderType() {
	      return 1;
	   }

	   public boolean renderAsNormalBlock() {
	      return false;
	   }

	   public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
	      return null;
	   }
	   
	    @Override
	    public boolean isLadder(World world, int x, int y, int z, EntityLiving entity)
	    {
	        return true;
	    }

	}
