package arima.anotherpack.common.blocks;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlocksBox extends Block {

	@SideOnly(Side.CLIENT)
	private Icon iconTop;

	private String texture;

	public BlocksBox(int per1, String name, String texture) {
		super(per1, Material.wood);
		this.setUnlocalizedName(name);
		this.texture = texture;
		this.setCreativeTab(Main.tabAPDesignBlocks);
		this.setHardness(3.0F);
		GameRegistry.registerBlock(this, name);
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2) {
		return par1 == 1 ? this.iconTop : (par1 == 0 ? this.blockIcon : this.blockIcon);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon(this.texture);
		this.iconTop = par1IconRegister.registerIcon(this.texture + "_top");
	}

}
