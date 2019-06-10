package arima.anotherpack.common.blocks;

import java.util.List;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;

public class WoodenStairs extends BlockStairs {

	private int texture_meta;
	private Block block_t;

	public WoodenStairs(int id, String name, Block block, int meta) {
		super(id, block, 0);
		this.setUnlocalizedName(name);
		this.setCreativeTab(Main.tabAPWoodBlocks);
		this.setHardness(2.0F);
		this.setLightOpacity(0);
		this.setResistance(5F);
		this.setStepSound(soundWoodFootstep);
		this.texture_meta = meta;
		this.block_t = block;
		GameRegistry.registerBlock(this, ItemBlockMetadata.class, name);
	}
	
	   @SideOnly(Side.CLIENT)
	   public Icon getIcon(int side, int meta) {
	      return this.block_t.getIcon(1, this.texture_meta);
	   }

}
