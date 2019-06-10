package arima.anotherpack.blocks;

import static net.minecraftforge.common.ForgeDirection.EAST;
import static net.minecraftforge.common.ForgeDirection.NORTH;
import static net.minecraftforge.common.ForgeDirection.SOUTH;
import static net.minecraftforge.common.ForgeDirection.WEST;

import java.util.Random;

import arima.anotherpack.core.Main;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;

public class Lampa extends BlockTorch {
	
	private String texture;

   public Lampa(int par1, String name, String texture) {
	  super(par1);
	  this.texture = texture;
	  this.setUnlocalizedName(name);
      this.setCreativeTab(Main.tabAPDesignBlocks);
      this.setLightOpacity(255);
      this.setLightValue(1.0F);
      this.setHardness(1.0F);
   }
   
   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister)
   {
       this.blockIcon = par1IconRegister.registerIcon(this.texture);
   }

   @SideOnly(Side.CLIENT)
   public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        int l = par1World.getBlockMetadata(par2, par3, par4);
        double d0 = (double)((float)par2 + 0.5F);
        double d1 = (double)((float)par3 + 0.7F);
        double d2 = (double)((float)par4 + 0.5F);
        double d3 = 0.2199999988079071D;
        double d4 = 0.27000001072883606D;
    }
   
   
}
