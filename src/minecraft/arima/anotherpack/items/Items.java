package arima.anotherpack.items;

import com.google.common.eventbus.Subscribe;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class Items extends Item {
	 private final String texture;
	 private String name;
	 
	   public Items(int par1, String name, String texture, int stacks) {
		  super(par1);
		  this.canRepair = false;
	      this.setUnlocalizedName(name);
	      this.name=name;
	      this.texture = texture;
	      this.setCreativeTab(Main.tabAPItems);
	      maxStackSize=stacks;
	      this.setMaxDamage(800);
	      GameRegistry.registerItem(this, name);
	   }
	    public void registerIcons(IconRegister par1IconRegister)
	    {
	        this.itemIcon = par1IconRegister.registerIcon(this.texture);
	    }
	    
	    @Subscribe
		public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player1) {
	    	if (this.name=="Migalka") {
	    	player1.worldObj.playSoundAtEntity(player1, "anotherpack:Migalka", 3.0F, 1.0F);}
	    	return itemStack;
	    }
	    
		@Override
		public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
			super.onUpdate(stack, world, entity, par4, par5);
			if (this.name == "RainbowCore") {
				if (entity instanceof EntityPlayer) {
					EntityPlayer player = (EntityPlayer) entity;
					ItemStack equipped = player.getCurrentEquippedItem();
					if (equipped == stack) {
						player.addPotionEffect(new PotionEffect(Potion.jump.id, 1, 1, true));
						player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1, 1, true));
						player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 2, 2, false));
					}
				}
			}
		}
	    
}
