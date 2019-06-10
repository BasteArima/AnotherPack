package arima.anotherpack.blocks;

import java.util.List;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;

public class WallsRock extends BlockWall {
	
	   private Block n;
		
	   public WallsRock(int par1, String name, Block block) {
	      super(par1, Block.cobblestoneWall);
	      this.setUnlocalizedName(name);
	      this.setCreativeTab(Main.tabAPStoneBlocks);
	      this.setHardness(3.0F);
	      this.setStepSound(soundStoneFootstep);
	      this.n = block;
	   }

	   @SideOnly(Side.CLIENT)
	   public Icon getIcon(int side, int meta) {
	      return this.n.getIcon(side, meta);
	   }

	   @SideOnly(Side.CLIENT)
	   public void registerBlockIcons(Item id, CreativeTabs table, List list) {
	      list.add(new ItemStack(id, 1, 0));
	   }
}
