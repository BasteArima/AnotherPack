package arima.anotherpack.blocks;

import java.util.Random;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class entityBlockLightGhost extends Block {

	private String texture;
	private String sideTextureIndex;
	@SideOnly(Side.CLIENT)
	private Icon theIcon;

	public entityBlockLightGhost(int par1, String par2Str, String par3Str, Material par2Material) {

		super(par1, par2Material);
		this.texture = par2Str;
		this.sideTextureIndex = par3Str;
		this.setHardness(-1F);
		this.setCreativeTab(Main.tabAPDesignBlocks);
		this.setUnlocalizedName("entityBlockLightGhost");
		this.setLightValue(1.0F);
		GameRegistry.registerBlock(this, "entityBlockLightGhost");
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon(this.texture);
		this.theIcon = par1IconRegister.registerIcon(this.sideTextureIndex);
	}

	public int quantityDropped(Random par1Random) {
		return 0;
	}

	@SideOnly(Side.CLIENT)

	public int getRenderBlockPass() {
		return 0;
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		return null;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}

	protected boolean canSilkHarvest() {
		return true;
	}

}
