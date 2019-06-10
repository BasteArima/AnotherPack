package arima.anotherpack.blocks;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class BlocksStone extends Block{
	private String field_94402_c;
	
	   public BlocksStone(int par1, String name, String par2Str) {
		      super(par1, Material.rock);
		      this.setUnlocalizedName(name);
		      this.field_94402_c = par2Str;
		      this.setCreativeTab(Main.tabAPStoneBlocks);
		      this.setHardness(3.0F);
		      this.setStepSound(soundStoneFootstep);
		      GameRegistry.registerBlock(this, name);

		   }
	   
	   public void registerIcons(IconRegister par1IconRegister)
	   {
	       this.blockIcon = par1IconRegister.registerIcon(this.field_94402_c);
	   }
	   
}
