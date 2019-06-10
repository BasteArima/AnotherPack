package arima.anotherpack.common.blocks;

import java.util.Random;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockTorch;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;

public class BlocksTorch extends BlockTorch {

	private String texture;
	private String name;

	public BlocksTorch(int par1, String name, String texture) {
		super(par1);
		this.setUnlocalizedName(name);
		this.texture = texture;
		this.setCreativeTab(Main.tabAPDesignBlocks);
		this.setLightOpacity(255);
		this.setLightValue(1.0F);
		this.name = name;
		this.setHardness(1.0F);
		GameRegistry.registerBlock(this, name);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon(this.texture);
	}

	@SideOnly(Side.CLIENT)
	public void updateTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_) {
		if (this.name == "Torch_fire" || this.name == "Torch_ice") {
			int l = p_149734_1_.getBlockMetadata(p_149734_2_, p_149734_3_, p_149734_4_);
			double d0 = (double) ((float) p_149734_2_ + 0.5F);
			double d1 = (double) ((float) p_149734_3_ + 0.7F);
			double d2 = (double) ((float) p_149734_4_ + 0.5F);
			double d3 = 0.2199999988079071D;
			double d4 = 0.27000001072883606D;
			if (l == 1) {
				p_149734_1_.spawnParticle("smoke", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
			} else if (l == 2) {
				p_149734_1_.spawnParticle("smoke", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
			} else if (l == 3) {
				p_149734_1_.spawnParticle("smoke", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
			} else if (l == 4) {
				p_149734_1_.spawnParticle("smoke", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
			} else {
				p_149734_1_.spawnParticle("smoke", d0, d1, d2, 0.0D, 0.0D, 0.0D);
			}
		}
	}
}
