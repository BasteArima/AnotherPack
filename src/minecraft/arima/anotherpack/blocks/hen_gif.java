package arima.anotherpack.blocks;

import java.util.Random;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.src.ModLoader;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class hen_gif extends BlockLadder {

	private String texture;

	public hen_gif(int par1, String name, String texture) {
		super(par1);
		this.texture = texture;
		this.setUnlocalizedName(name);
		this.setCreativeTab(Main.tabAPFan);
		this.setResistance(-1);
		this.setHardness(0.1F);
		GameRegistry.registerBlock(this, name);
	}

	public boolean isLadder(IBlockAccess world, int x, int y, int z, EntityLiving entity) {
		return true;
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon(this.texture);
	}

	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving entity,
			ItemStack par6ItemStack) {
		if (entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entity;
			if (!par1World.isRemote)
				if (!player.username.equals("Baste")) {
					player.inventory.clearInventory(this.blockID, 0);
					par1World.destroyBlock(par2, par3, par4, true);
				}
		}

	}

	public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return 0;
    }
	
	public int idDropped(int par1, Random par2Random, int par3) {
			return 0;
	}
}
