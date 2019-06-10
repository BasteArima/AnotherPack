package arima.anotherpack.common.weapons;

import java.util.List;
import java.util.Random;

import org.lwjgl.opengl.GL11;

import arima.anotherpack.core.AllItems;
import arima.anotherpack.core.Main;
import arima.anotherpack.items.ItemNpcWeaponInterface;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;

public class RainbowWeapons extends ItemSword implements ItemRenderInterface {

	final Random random = new Random();
	private int weaponDamage;
	private String texture, weaponName;

	public RainbowWeapons(int id, EnumToolMaterial material, String texture, String name) {
		super(id, AllItems.ScytheMat);
		this.setCreativeTab(Main.tabAPWeaponAndArmor);
		this.setMaxDamage(-1);
		this.texture = texture;
		this.weaponName = name;
		this.setUnlocalizedName(name);
		if (weaponName == "Rainbow_Sword") {
			this.weaponDamage = 40;
		} else if (weaponName == "Rainbow_Pika") {
			this.weaponDamage = 40;
		} else if (weaponName == "Rainbow_Heal") {
			this.weaponDamage = 10;
		} else if (weaponName == "Rainbow_Gun") {
			this.weaponDamage = 15;
		} else if (weaponName == "BigHammer") {
			this.weaponDamage = 25;
		} else if (weaponName == "Steampunk_Sword") {
			this.weaponDamage = 35;
		}
		GameRegistry.registerItem(this, name);
		this.setFull3D();
	}
	
    public int getItemEnchantability()
    {
        return 0;
    }
    
    public boolean isBookEnchantable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return true;
    }

	@Override
	public void renderSpecial() {
		GL11.glScalef(1.0F, 1.0F, 1.0F);
		GL11.glTranslatef(0.0F, 0.0F, 0.15F);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(this.texture);
	}

	@Override
	public int getMaxItemUseDuration(ItemStack p_77626_1_) {
		return 72000;
	}

	public int getDamageVsEntity(Entity par1Entity) {
		return this.weaponDamage;
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		if (this.weaponName == "Rainbow_Gun" || this.weaponName == "Rainbow_Pika")
			return EnumAction.bow;
		else
			return EnumAction.block;
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {

		return false;
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLiving entity, EntityLiving player) {
		int i = 1 + random.nextInt(10);
		if (i == 1 || i == 2 || i == 3) {
			if (weaponName == "BigHammer") {
				entity.attackEntityFrom(DamageSource.outOfWorld, (int) 6.0F);
			}

			if (weaponName == "Rainbow_Sword") {
				entity.attackEntityFrom(DamageSource.outOfWorld, (int) 2.0F);
			}

			if (weaponName == "Rainbow_Pika") {
				entity.attackEntityFrom(DamageSource.outOfWorld, (int) 2.0F);
				((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.wither.id, 200));
			}

			if (weaponName == "Rainbow_Heal") {
				entity.attackEntityFrom(DamageSource.outOfWorld, (int) 1.0F);
				((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.regeneration.id, 60, 3, false));
			}
		} else {
			if (weaponName == "BigHammer") {
				entity.attackEntityFrom(DamageSource.outOfWorld, (int) 1.0F);
			}

			if (weaponName == "Rainbow_Sword") {
				entity.attackEntityFrom(DamageSource.outOfWorld, (int) 1.0F);
			}

			if (weaponName == "Rainbow_Pika") {
				entity.attackEntityFrom(DamageSource.outOfWorld, (int) 2.0F);
				((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.wither.id, 200));
			}
		}
		return true;
	}

	@Override
	public void onPlayerStoppedUsing(ItemStack p_77615_1_, World p_77615_2_, EntityPlayer player, int p_77615_4_) {
		int j = this.getMaxItemUseDuration(p_77615_1_) - p_77615_4_;

		ArrowLooseEvent event = new ArrowLooseEvent(player, p_77615_1_, j);
		MinecraftForge.EVENT_BUS.post(event);
		if (event.isCanceled()) {
			return;
		}
		j = event.charge;

		boolean flag = player.capabilities.isCreativeMode;
		if (this.weaponName == "Rainbow_Gun") {

			if (flag || player.inventory.hasItem(AllItems.bullet.itemID)) {

				p_77615_2_.playSoundAtEntity(player, "anotherpack:rwby", 0.7F, 0.95F);
				Vec3 look;
				EntityArrow fireball;
				look = player.getLookVec();
				player.motionX = -look.xCoord / 3.0D;
				player.motionZ = -look.zCoord / 3.0D;
				player.motionY = -look.yCoord / 3.0D;
				if (!p_77615_2_.isRemote) {
					fireball = new EntityArrow(p_77615_2_, player, 6.0F);
					fireball.canBePickedUp = 0;
					if (!player.capabilities.isCreativeMode) {
						player.inventory.consumeInventoryItem(AllItems.bullet.itemID);
					}

					p_77615_2_.spawnEntityInWorld(fireball);
					p_77615_1_.damageItem(1, player);
				}

			}
		}
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
		p_77624_3_.add("§9Урон: " + this.weaponDamage);
		if (this.weaponName != "Steampunk_Sword") {
			p_77624_3_.add("§9Отбирает половину сердца врага");
			p_77624_3_.add("§9Даёт эффекты Скорости II и Прыгучести III");
			if (this.weaponName == "Rainbow_Sword")
				p_77624_3_.add("§c30% шанс крита - при срабатывании §4-1§c сердце врага");
			else if (this.weaponName == "BigHammer")
				p_77624_3_.add("§c30% шанс крита - при срабатывании §4-3§c сердце врага");
			else if (this.weaponName == "Rainbow_Gun")
				p_77624_3_.add("§cПКМ для выстрела по врагу");
			else if (this.weaponName == "Rainbow_Heal") {
				p_77624_3_.add("§cНакладывает §4Восстановление 2§c на владельца");
				p_77624_3_.add("§cНакладывает §4Восстановление 4§c на 2 секунды на цель");
			} else if (this.weaponName == "Rainbow_Pika") {
				p_77624_3_.add("§c30% шанс крита - при срабатывании §4-1§c сердце врага");
				p_77624_3_.add("§cПКМ для броса копья(бета-тест, пока стрела)");
			}
		}
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		super.onUpdate(stack, world, entity, par4, par5);
		if (weaponName == "Rainbow_Sword" || weaponName == "Rainbow_Pika" || weaponName == "Rainbow_Heal"
				|| weaponName == "Rainbow_Gun" || weaponName == "BigHammer") {
			if (entity instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) entity;
				ItemStack equipped = player.getCurrentEquippedItem();
				if (equipped == stack) {
					player.addPotionEffect(new PotionEffect(Potion.jump.id, 2, 2, true));
					player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 2, 1, true));
					if (this.weaponName == "Rainbow_Heal") {
						player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 60, 1, false));
					}
				}
			}
		}
	}

}
