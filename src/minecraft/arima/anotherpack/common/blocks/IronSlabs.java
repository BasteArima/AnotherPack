package arima.anotherpack.common.blocks;

import java.util.List;

import arima.anotherpack.core.AllBlocks;
import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHalfSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class IronSlabs extends BlockHalfSlab {

	private int count;
	private Icon[] icon;
	private String texture;
	private String name;

	public IronSlabs(int id, String name, String texture) {
		super(id, false, Material.iron);
		this.setUnlocalizedName(name);
		this.texture = "anotherpack:iron/" + texture;
		this.setCreativeTab(Main.tabAPIronBlocks);
		this.setHardness(3.0F);
		this.name=name;
		this.setResistance(10F);
		this.setStepSound(soundMetalFootstep);
		GameRegistry.registerBlock(this, ItemBlockMetadata.class, name);
	}

	   public void registerIcons(IconRegister par1IconRegister)
	   {
	       this.blockIcon = par1IconRegister.registerIcon(this.texture);
	   }

	@Override
	public String getFullSlabName(int i) {
		return null;
	}

    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return this.blockID;
    }

}
