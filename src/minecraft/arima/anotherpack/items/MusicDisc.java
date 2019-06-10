package arima.anotherpack.items;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import arima.anotherpack.core.AllItems;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockJukeBox;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class MusicDisc extends ItemRecord {
	/** List of all record items and their names. */
	private static final Map records = new HashMap();

	/** The name of the record. */
	public final String recordName;
	public int rare;

	public MusicDisc(int par1, String par2Str, int rare) {
		super(par1, par2Str);
		this.recordName = par2Str;
		this.maxStackSize = 1;
		this.canRepair = false;
		this.rare = rare;
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName("records");
		GameRegistry.registerItem(this, par2Str);
		if (rare == 3)
			LanguageRegistry.addName(this,
					"§dКассета");
		else
			LanguageRegistry.addName(this,
					"§bКассета");
		records.put(par2Str, this);
	}

	@SideOnly(Side.CLIENT)
	public Icon getIconFromDamage(int par1) {
		return this.itemIcon;
	}

	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4,
			int par5, int par6, int par7, float par8, float par9, float par10) {
		if (par3World.getBlockId(par4, par5, par6) == Block.jukebox.blockID
				&& par3World.getBlockMetadata(par4, par5, par6) == 0) {
			if (par3World.isRemote) {
				return true;
			} else {
				((BlockJukeBox) Block.jukebox).insertRecord(par3World, par4, par5, par6, par1ItemStack);
				par3World.playAuxSFXAtEntity((EntityPlayer) null, 1005, par4, par5, par6, this.itemID);
				--par1ItemStack.stackSize;
				return true;
			}
		} else {
			return false;
		}
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add(this.getRecordTitle());
	}

	@SideOnly(Side.CLIENT)
	public String getRecordTitle() {
		return "AnotherPack - " + this.recordName.substring(0, 1).toUpperCase() + this.recordName.substring(1);
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		if (this.rare == 1)
			return EnumRarity.rare;
		else if (this.rare == 2)
			return EnumRarity.rare;
		else
			return EnumRarity.epic;
	}

	@SideOnly(Side.CLIENT)
	public static MusicDisc getRecord(String par0Str) {
		return (MusicDisc) records.get(par0Str);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon("anotherpack:cassette");
	}
}
