package arima.anotherpack.common.blocks;

import java.util.List;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class WoodenFences extends BlockFence {
	
	private int count;
	private Icon[] icon;
	private String texture;

	public WoodenFences(int par1, String name, String par2Str, int count) {
		super(par1, par2Str, Material.wood);
		this.texture = par2Str;
		this.setUnlocalizedName(name);
		this.setCreativeTab(Main.tabAPWoodBlocks);
		this.setStepSound(soundWoodFootstep);
		this.setHardness(3.0F);
		this.count = count;
		GameRegistry.registerBlock(this, ItemBlockMetadata.class, name);
	}

	@Override
	public int damageDropped(int meta) {
		return meta;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.icon = new Icon[this.count];
		for (int i = 0; i < this.count; ++i) {
			this.icon[i] = par1IconRegister.registerIcon(this.texture + "_" + i);
		}
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2) {
		return this.icon[par2];
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		for (int i = 0; i < this.count; ++i) {
			par3List.add(new ItemStack(par1, 1, i));
		}
	}
}