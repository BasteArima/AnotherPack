package arima.anotherpack.blocks;

import java.util.Random;

import arima.anotherpack.core.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlocksWeb extends Block
{
	private String texture;
    public BlocksWeb(int par1, String texture)
    {
        super(par1, Material.web);
        this.texture = texture;
        this.setCreativeTab(CreativeTabs.tabDecorations);
    }
    
	   public void registerIcons(IconRegister par1IconRegister)
	   {
	       this.blockIcon = par1IconRegister.registerIcon(this.texture);
	   }
	   
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        par5Entity.setInWeb();
        if(par5Entity instanceof EntityPlayer == false){
			par5Entity.attackEntityFrom(DamageSource.cactus, (int) 1.0F);
		}
    }


    public boolean isOpaqueCube()
    {
        return false;
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }

    public int getRenderType()
    {
        return 1;
    }


    public boolean renderAsNormalBlock()
    {
        return false;
    }


    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Item.silk.itemID;
    }


    protected boolean canSilkHarvest()
    {
        return true;
    }
}

