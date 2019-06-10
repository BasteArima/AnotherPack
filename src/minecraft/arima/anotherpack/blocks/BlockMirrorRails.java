package arima.anotherpack.blocks;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockRail;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockMirrorRails extends BlockRail {
	
	 @SideOnly(Side.CLIENT)
	    private Icon theIcon;
	
	private String texture;
	   public BlockMirrorRails(int par1, String name, String texture) {
		   	  super(par1);
		      this.setUnlocalizedName(name);
		      this.texture = texture;
		      this.setCreativeTab(Main.tabAPDesignBlocks);
		      this.setHardness(1.0F);
		      GameRegistry.registerBlock(this, name);
	   }

	    public Icon getIcon(int par1, int par2)
	    {
	        return par2 >= 6 ? this.theIcon : this.blockIcon;
	    }
	   
	   public void registerIcons(IconRegister par1IconRegister)
	   {
	       this.blockIcon = par1IconRegister.registerIcon(this.texture);
	       this.theIcon = par1IconRegister.registerIcon(this.texture);
	   }
	   

	    
}
