package arima.anotherpack.common.blocks;

import java.util.Random;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockAtlantisWater extends Block {
	
	private String texture, texture2;
	private static Icon[] theIcon;

	public BlockAtlantisWater(int id, Material Material, String name, String texture1, String texture2) {
		super(id, Material);
		this.texture = texture1;
		this.texture2 = texture2;
		this.setCreativeTab(Main.tabAPDesignBlocks);
		this.setUnlocalizedName(name);
		GameRegistry.registerBlock(this, name);
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.theIcon = new Icon[] { par1IconRegister.registerIcon(this.texture),
				par1IconRegister.registerIcon(this.texture2) };
	}

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public int getRenderType()
    {
        return 4;
    }
    
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return 0;
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 0;
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
	public Icon getIcon(int par1, int par2) {
		// return this.theIcon;
		return par1 != 0 && par1 != 1 ? this.theIcon[1] : this.theIcon[0];
	}

	@SideOnly(Side.CLIENT)
	public static Icon func_94424_b(String par0Str) {
		return par0Str == "atlantis_water_still" ? BlockAtlantisWater.theIcon[0]
				: (par0Str == "atlantis_water_flow" ? BlockAtlantisWater.theIcon[1] : null);
	}

	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4) {
		return null;
	}
}
