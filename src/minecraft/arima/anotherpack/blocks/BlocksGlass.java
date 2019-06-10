package arima.anotherpack.blocks;

import java.util.Random;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlocksGlass extends Block {

	private String texture;

	public BlocksGlass(int id, String texture, String name) {

		super(id, Material.glass);
		this.setCreativeTab(Main.tabAPDesignBlocks);
		this.setUnlocalizedName(name);
		this.texture = texture;
		this.setHardness(1.0F);
		this.setStepSound(soundGlassFootstep);
		GameRegistry.registerBlock(this, name);
	}

	@SideOnly(Side.CLIENT)
	public boolean isOpaqueCube() {
		return false;
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon(this.texture);
	}

	@SideOnly(Side.CLIENT)
	public int getRenderBlockPass() {
		return 1;
	}

}
