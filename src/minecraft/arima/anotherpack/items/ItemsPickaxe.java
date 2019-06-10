package arima.anotherpack.items;

import java.util.List;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemsPickaxe extends ItemPickaxe {

	private String texture;

	public ItemsPickaxe(int par1, EnumToolMaterial par2EnumToolMaterial, String name, String texture, int k) {
		super(par1, par2EnumToolMaterial);
		this.setUnlocalizedName(name);
		this.texture = texture;
		this.setCreativeTab(CreativeTabs.tabTools);
		maxStackSize = 1;
		this.setMaxDamage(k);
		GameRegistry.registerItem(this, name);
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(this.texture);
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List info, boolean par4) {
		info.add("§bПрочность "+(2000-this.getDamage(par1ItemStack)));
	}

}
