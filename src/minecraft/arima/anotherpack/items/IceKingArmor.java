package arima.anotherpack.items;

import java.util.List;

import arima.anotherpack.core.AllItems;
import arima.anotherpack.core.Main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.IArmorTextureProvider;

public class IceKingArmor extends ItemArmor implements IArmorTextureProvider {

	String armorFile, textureItem;

	public IceKingArmor(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4, String armorFile,
			String textureItem) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		this.armorFile = armorFile;
		this.setCreativeTab(Main.tabAPWeaponAndArmor);
		this.textureItem = textureItem;
	}

	@SideOnly(Side.CLIENT)
	public String getArmorTextureFile(ItemStack itemstack) {
		 if (armorFile == null)
	            return null;
	        return ("/mods/anotherpack/textures/armor/" + armorFile + ".png");
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon("anotherpack:armor/" + this.textureItem);
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
		p_77624_3_.add("§cКарона Караля");
		p_77624_3_.add("§cДаёт Божественные силы");
	}
	
	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		super.onUpdate(stack, world, entity, par4, par5);
		if (entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entity;
			ItemStack equipped = player.getCurrentEquippedItem();
			
			if (player.getCurrentArmor(0) != null) {
				System.out.println("ТУТ");
				ItemStack helm = player.getCurrentArmor(0);
				if (helm.getItem() == AllItems.BasteCrown) {
					player.addPotionEffect(new PotionEffect(Potion.jump.id, 2, 2, true));
					player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 2, 1, true));
				}
			}
			
			if (equipped == stack) {
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 2, 2, true));
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 2, 1, true));
			}
		}
		
		

	}
	
}
