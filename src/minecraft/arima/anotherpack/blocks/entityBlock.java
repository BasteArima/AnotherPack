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

public class entityBlock extends Block {

	private String texture;
	private String IconTexture;
	@SideOnly(Side.CLIENT)
	private Icon theIcon;

	public entityBlock(int par1, String texture, String icon, Material par2Material) {

		super(par1, par2Material);
		this.texture = texture;
		this.IconTexture = icon;
		this.setHardness(-1F);
		this.setCreativeTab(Main.tabAPDesignBlocks);
		this.setUnlocalizedName("entityBlock");
		GameRegistry.registerBlock(this, "entityBlock");
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon(this.texture);
		this.theIcon = par1IconRegister.registerIcon(this.IconTexture);
	}

	public int quantityDropped(Random par1Random) {
		return 0;
	}
	
    @SideOnly(Side.CLIENT)
    public Icon getSideTextureIndex()
    {
        return this.theIcon;
    }

	@SideOnly(Side.CLIENT)

	public int getRenderBlockPass() {
		return 0;
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
