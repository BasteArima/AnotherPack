package arima.anotherpack.common.blocks;

import java.util.List;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class OtherBlocks extends Block {

	private int count;
	private Icon[] icon;
	private String texture;

	public OtherBlocks(int id, String name, String texture, int count) {
		super(id, Material.rock);
		this.setUnlocalizedName(name);
		this.texture = "anotherpack:other/" + texture;
		this.setCreativeTab(Main.tabAPDesignBlocks);
		this.setHardness(2.0F);
		this.setResistance(5F);
		this.setStepSound(soundStoneFootstep);
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
