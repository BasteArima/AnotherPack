package arima.anotherpack.items;

import java.util.List;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Runes  extends Item
{
	private String texture, procent, name;
	
	public Runes(int i, String par2Str, String name)
	{
			super(i);
			maxStackSize=1;
			this.texture = par2Str;
			this.setMaxDamage(800);
			this.setUnlocalizedName(name);
			this.setCreativeTab(Main.tabAPWeaponAndArmor);
			this.canRepair = false;
			GameRegistry.registerItem(this, name);
	}
	
	 @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("§2Требуется для улучшения меча");
    } 
	
    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(this.texture);
	}
}