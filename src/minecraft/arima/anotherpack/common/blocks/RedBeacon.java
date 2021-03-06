package arima.anotherpack.common.blocks;

import arima.anotherpack.core.Main;
import arima.anotherpack.tiles.TileEntityRedBeacon;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockBeacon;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class RedBeacon extends BlockBeacon
{
    @SideOnly(Side.CLIENT)
    private Icon theIcon;

    public RedBeacon(int par1)
    {
        super(par1);
        this.setHardness(3.0F);
        this.setLightValue(1.0F);
        this.setUnlocalizedName("RedBeacon");
        this.setCreativeTab(Main.tabAPDesignBlocks);
        GameRegistry.registerBlock(this, "RedBeacon");
    }

    /**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createNewTileEntity(World par1World)
    {
        return new TileEntityRedBeacon();
    }

    /**
     * Called upon block activation (right click on the block.)
     */
    public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer, int par6, float par7, float par8, float par9)
    {
    	if (!par1World.isRemote)
            return true;
    	else
    		return true;
    }
    
    public void displayGUIRedBeacon(TileEntityRedBeacon par1TileEntityBeacon) {}

    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    /**
     * The type of render function that is called for this block
     */
    public int getRenderType()
    {
        return 34;
    }

    @SideOnly(Side.CLIENT)

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
        super.registerIcons(par1IconRegister);
        this.theIcon = par1IconRegister.registerIcon("anotherpack:other/red_beacon");
    }

    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving, ItemStack par6ItemStack)
    {
        super.onBlockPlacedBy(par1World, par2, par3, par4, par5EntityLiving, par6ItemStack);

        if (par6ItemStack.hasDisplayName())
        {
            ((TileEntityRedBeacon)par1World.getBlockTileEntity(par2, par3, par4)).func_94047_a(par6ItemStack.getDisplayName());
        }
    }

    @SideOnly(Side.CLIENT)
    public Icon getBeaconIcon()
    {
        return this.theIcon;
    }
}
