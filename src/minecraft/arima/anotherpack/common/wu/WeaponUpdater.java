package arima.anotherpack.common.wu;

import java.util.Random;

import arima.anotherpack.core.AllBlocks;
import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class WeaponUpdater extends Block {
	private Icon icons[] = new Icon[6];
	private String texture;

	public WeaponUpdater(int per1, String name, String texture) {
		super(per1, Material.iron);
		this.setUnlocalizedName(name);
		this.texture = texture;
		this.setCreativeTab(Main.tabAPDesignBlocks);
		this.setHardness(3.0F);
		GameRegistry.registerBlock(this, name);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.icons[0] = reg.registerIcon(this.texture + "_top");
		this.icons[1] = reg.registerIcon(this.texture + "_top1");
		for (int i = 2; i < 6; i++) {
			this.icons[i] = reg.registerIcon(this.texture);
		}
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int meta) {
		return this.icons[side];
	}

	@SideOnly(Side.CLIENT)
	public boolean onBlockActivated(World world, int par2, int par3, int par4, EntityPlayer player, int par6,
			float par7, float par8, float par9) {
		// if (!world.isRemote) {
		player.openGui(Main.INSTANCE, Main.GUI_ENUM.DECONSTRUCTOR.ordinal(), world, par2, par3, par4);
		// }
		return true;
	}

}