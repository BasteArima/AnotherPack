package arima.anotherpack.common.blocks;

import java.awt.List;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class BlocksLogs extends BlockLog {
	@SideOnly(Side.CLIENT)
	private Icon icon;
	@SideOnly(Side.CLIENT)
	private Icon iconTop;
	@SideOnly(Side.CLIENT)
	private String texture;

	public BlocksLogs(int id, String name, String texture) {
		super(id);
		setUnlocalizedName(name);
		this.texture = texture;
		this.setCreativeTab(Main.tabAPWoodBlocks);
		this.setHardness(2.0F);
		GameRegistry.registerBlock(this, name);
	}

	@SideOnly(Side.CLIENT)
	protected Icon getIcon(int par1) {
		return this.icon;
	}

	@SideOnly(Side.CLIENT)
	protected Icon getTopIcon(int par1) {
		return this.iconTop;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.icon = par1IconRegister.registerIcon(this.texture);
		this.iconTop = par1IconRegister.registerIcon(this.texture + "_top");
	}
}
