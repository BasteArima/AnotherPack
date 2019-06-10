package arima.anotherpack.items;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ic2.api.item.ElectricItem;
import ic2.api.item.IElectricItem;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

public class ElectricItemDrillBase extends ItemTool implements IElectricItem{

	
	public static final Block[] blocksEffectiveAgainst = new Block[] { Block.cobblestone, Block.stoneDoubleSlab,
			Block.stoneSingleSlab, Block.stone, Block.sandStone, Block.cobblestoneMossy, Block.oreIron, Block.blockIron,
			Block.oreCoal, Block.blockGold, Block.oreGold, Block.oreDiamond, Block.blockDiamond, Block.ice,
			Block.netherrack, Block.oreLapis, Block.blockLapis, Block.oreRedstone, Block.oreRedstoneGlowing, Block.rail,
			Block.railDetector, Block.railPowered, Block.railActivator, Block.dirt, Block.grass, Block.gravel };
	
	public int maxCharge;
	public int transferLimit;
	public int tier;
	
	public ElectricItemDrillBase(int id, EnumToolMaterial toolMaterial) {
		super(id, id, toolMaterial, blocksEffectiveAgainst);
		setMaxDamage(27);
		setMaxStackSize(1);
	}
	
	public boolean isRepairable()
	  {
	    return false;
	  }
	
	@Override
	public boolean canProvideEnergy(ItemStack itemStack) {
		return false;
	}
	@Override
	public int getChargedItemId(ItemStack itemStack) {
		return this.itemID;
	}
	@Override
	public int getEmptyItemId(ItemStack itemStack) {
		return this.itemID;
	}
	@Override
	public int getMaxCharge(ItemStack itemStack) {
		return this.maxCharge;
	}
	@Override
	public int getTier(ItemStack itemStack) {
		return this.tier;
	}
	@Override
	public int getTransferLimit(ItemStack itemStack) {
		return this.transferLimit;
	}
	

	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs CreativeTab, List itemList) {
		ItemStack itemStack = new ItemStack(this, 1);
		
		if (getChargedItemId(itemStack) == this.itemID) {
			ItemStack charged = new ItemStack(this, 1);
			ElectricItem.manager.charge(charged, 2147483647, 2147483647, true, false);
			itemList.add(charged);
		}
		
		if (getEmptyItemId(itemStack)== this.itemID) itemList.add(new ItemStack(this, 1, getMaxDamage()));
	}
	
}

