package arima.anotherpack.items;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class FoodEffect extends ItemFood {

	private String name;
	private String texture;

	public FoodEffect(int id, int healAmount, boolean wolf, String name, String texture) {
		super(id, healAmount, wolf);
		this.name = name;
		setCreativeTab(Main.tabAPItems);
		setAlwaysEdible();
		this.setHasSubtypes(true);
		this.texture = texture;
		setUnlocalizedName(name);
		GameRegistry.registerItem(this, name);
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon("anotherpack:Food/" + texture);
	}
	
	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		if (name == "EffFood_1" || name == "EffFood_6" || name == "EffFood_7" || name == "EffFood_11" || name == "EffFood_15" || name=="EffFood_16")
			return EnumAction.drink;
		else
			return EnumAction.eat;
	}
	
	public EnumRarity getRarity(ItemStack itemStack) {
		if (this.name == "EffFood_1") {
			return EnumRarity.epic;
			} else if (this.name == "EffFood_2") {
			return EnumRarity.rare;
			} else if (this.name == "EffFood_3") {
			return EnumRarity.rare;
			} else if (this.name == "EffFood_4") {
			return EnumRarity.epic;
			} else if (this.name == "EffFood_5") {
			return EnumRarity.rare;
			} else if (this.name == "EffFood_6") {
			return EnumRarity.rare;
			} else if (this.name == "EffFood_7") {
			return EnumRarity.epic;
			} else if (this.name == "EffFood_8") {
			return EnumRarity.epic;
			} else if (this.name == "EffFood_9") {
			return EnumRarity.rare;
			} else if (this.name == "EffFood_10") {
			return EnumRarity.epic;
			} else if (this.name == "EffFood_11") {
			return EnumRarity.rare;
			} else if (this.name == "EffFood_12") {
			return EnumRarity.rare;
			} else if (this.name == "EffFood_13") {
			return EnumRarity.epic;
			} else if (this.name == "EffFood_14") {
			return EnumRarity.rare;
			} else if (this.name == "EffFood_15") {
			return EnumRarity.epic;
			} else if (this.name == "EffFood_16") {
			return EnumRarity.rare;
			} else if (this.name == "EffFood_17") {
			return EnumRarity.epic;
			} else if (this.name == "EffFood_18") {
			return EnumRarity.rare;
			} else if (this.name == "EffFood_19") {
			return EnumRarity.rare;
			}
			else {
		return EnumRarity.common;
			}
		}
	

	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer player) {

		if (this.name == "EffFood_1") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 600, 2));
				player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 1200, 0));
			}
		} else if (this.name == "EffFood_2") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1200, 1));
			}
		} else if (this.name == "EffFood_3") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 800, 2));
			}
		} else if (this.name == "EffFood_4") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 3600, 1));
			}
		} else if (this.name == "EffFood_5") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 2400, 2));
			}
		} else if (this.name == "EffFood_6") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1200, 1));
			}
		} else if (this.name == "EffFood_7") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 3600, 2));
			}
		} else if (this.name == "EffFood_8") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 6000, 2));
			}
		} else if (this.name == "EffFood_9") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1200, 0));
			}
		} else if (this.name == "EffFood_10") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 800, 3));
			}
		} else if (this.name == "EffFood_11") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 2));
			}
		} else if (this.name == "EffFood_12") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 2400, 0));
				player.addPotionEffect(new PotionEffect(Potion.resistance.id, 2400, 1));
			}
		} else if (this.name == "EffFood_13") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 600, 0));
			}
		} else if (this.name == "EffFood_14") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 2400, 0));
			}
		} else if (this.name == "EffFood_15") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 2400, 1));
			}
		} else if (this.name == "EffFood_16") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 300, 4));
				player.addPotionEffect(new PotionEffect(Potion.confusion.id, 600, 0));
			}
		} else if (this.name == "EffFood_17") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 300, 1));
			}
		} else if (this.name == "EffFood_18") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1200, 0));
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 1200, 0));
			}
		} else if (this.name == "EffFood_19") {
			if (!world.isRemote) {
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 1200, 0));
			}
		}

		else {
			super.onFoodEaten(itemStack, world, player);
		}
	}
}
