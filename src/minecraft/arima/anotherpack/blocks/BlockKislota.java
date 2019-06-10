package arima.anotherpack.blocks;

import arima.anotherpack.core.Main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFluid;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;

public class BlockKislota extends BlockFluid{
	
	private String texture, texture2;
    protected static Icon[] theIcon;
	
	public BlockKislota(int par1, String par2, Material mat, String par4) {
		super(par1, mat);
		this.texture = par2;
		this.texture2 = par4;
		this.setCreativeTab(Main.tabAPDesignBlocks);
		this.setLightValue(1.0F);
	}
	
	   public void registerIcons(IconRegister par1IconRegister)
	   {
		   this.theIcon = new Icon[] {par1IconRegister.registerIcon(this.texture), par1IconRegister.registerIcon(this.texture2)};
	      // this.theIcon = par1IconRegister.registerIcon(this.texture);
	   }
	   
	    public Icon getIcon(int par1, int par2)
	    {
	        //return this.theIcon;
	    	 return par1 != 0 && par1 != 1 ? this.theIcon[1] : this.theIcon[0];
	    }
	    
	    @SideOnly(Side.CLIENT)
	    public static Icon func_94424_b(String par0Str)
	    {
	        return par0Str == "kislota_still" ? BlocksFluid.theIcon[0] : (par0Str == "kislota_flow" ? BlocksFluid.theIcon[1] : null);
	    }

}
