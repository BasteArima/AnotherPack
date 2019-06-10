package arima.anotherpack.items;

import java.awt.List;

import org.lwjgl.opengl.GL11;

import arima.anotherpack.core.AllItems;
import arima.anotherpack.core.Main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;

public class ItemScythe extends ItemNpcWeaponInterface {

	private String texture;

	public ItemScythe(int par1, String texture, EnumToolMaterial tool) {
		super(par1, tool);
		this.texture = texture;
		this.setCreativeTab(Main.tabAPWeaponAndArmor);

	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(this.texture);
	}

	@SideOnly(Side.CLIENT)
	public void renderSpecial() {
		GL11.glTranslatef(0.02F, 0.3F, 0.1F);
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		// par3List.add("§2Урон: §6" + this.weaponDamage);
		par3List.add("Наносит рассекающий урон по врагу.");
	}

	public boolean func_77629_n_() {
		return true;
	}
}