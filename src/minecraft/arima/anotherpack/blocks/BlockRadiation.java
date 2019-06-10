package arima.anotherpack.blocks;

import java.util.Random;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockRadiation extends Block {

	private String texture;

	public BlockRadiation(int par1, String texture, Material par2Material) {

		super(par1, par2Material);
		this.texture = texture;
		this.setCreativeTab(Main.tabAPDesignBlocks);
		this.setHardness(-1F);
		GameRegistry.registerBlock(this, "blockRadiation");
	}

	@SideOnly(Side.CLIENT)
	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	public int getRenterType() {
		return 0;
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		return null;
	}

	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
		if (par5Entity instanceof EntityPlayer == false) {
			par5Entity.attackEntityFrom(DamageSource.cactus, (int) 4.5F);
		}
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon(this.texture);
	}

	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4) {
		float f = 0.0000F;
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 0.0F, f, 0.0F);
	}

	public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random) {
		Random random = par1World.rand;
		double d0 = 0.0625D;

		for (int l = 0; l < 6; ++l) {
			double d1 = (double) ((float) par2 + random.nextFloat());
			double d2 = (double) ((float) par3 + random.nextFloat());
			double d3 = (double) ((float) par4 + random.nextFloat());

			if (l == 0 && !par1World.isBlockOpaqueCube(par2, par3 + 1, par4)) {
				d2 = (double) (par3 + 1) + d0;
			}

			if (l == 1 && !par1World.isBlockOpaqueCube(par2, par3 - 1, par4)) {
				d2 = (double) (par3 + 0) - d0;
			}

			if (l == 2 && !par1World.isBlockOpaqueCube(par2, par3, par4 + 1)) {
				d3 = (double) (par4 + 1) + d0;
			}

			if (l == 3 && !par1World.isBlockOpaqueCube(par2, par3, par4 - 1)) {
				d3 = (double) (par4 + 0) - d0;
			}

			if (l == 4 && !par1World.isBlockOpaqueCube(par2 + 1, par3, par4)) {
				d1 = (double) (par2 + 1) + d0;
			}

			if (l == 5 && !par1World.isBlockOpaqueCube(par2 - 1, par3, par4)) {
				d1 = (double) (par2 + 0) - d0;
			}

			if (d1 < (double) par2 || d1 > (double) (par2 + 1) || d2 < 0.0D || d2 > (double) (par3 + 1)
					|| d3 < (double) par4 || d3 > (double) (par4 + 1)) {
				par1World.spawnParticle("reddust", d1, d2, d3, 0.0D, 0.0D, 0.0D);
			}
		}
	}

}
