package arima.anotherpack.common.weapons;

import java.util.List;
import java.util.Random;

import org.lwjgl.opengl.GL11;

import arima.anotherpack.core.AllItems;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;

public class Scythes extends ItemSword implements ItemRenderInterface {

	final Random random = new Random();
	private int weaponDamage;
	private String texture, ScytheName;

	public Scythes(int id, EnumToolMaterial material, String texture, String name) {
		super(id, AllItems.ScytheMat);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setMaxDamage(-1);
		this.texture = texture;
		this.ScytheName = name;
		this.setUnlocalizedName(name);
		GameRegistry.registerItem(this, name);
		this.setFull3D();
		this.weaponDamage = 50 + random.nextInt(60);
	}

	@Override
	public void renderSpecial() {
		GL11.glScalef(1.5F, 1.5F, 1.0F);
		GL11.glTranslatef(0.19F, 0.0F, 0.1F);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(this.texture);
	}

	@Override
	public int getMaxItemUseDuration(ItemStack p_77626_1_) {
		return 72000;
	}

	public static boolean get_Crescent_Rose_State(ItemStack itemstack) {
		return itemstack.hasTagCompound() ? itemstack.getTagCompound().getBoolean("Crescent_Rose") : false;
	}

	public static void set_Crescent_Rose_State(ItemStack itemstack, boolean flag) {
		if (!itemstack.hasTagCompound()) {
			itemstack.setTagCompound(new NBTTagCompound());
		}

		itemstack.getTagCompound().setBoolean("Crescent_Rose", flag);
	}

	public int getDamageVsEntity(Entity par1Entity) {
		return this.weaponDamage;
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.bow;
	}

	@Override
	public void onUsingItemTick(ItemStack stack, EntityPlayer player, int count) {
		set_Crescent_Rose_State(stack, true);

	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		int i = 1 + random.nextInt(10);
		int x = 1 + random.nextInt(3);
		if (i == 10) {
			player.worldObj.playSoundAtEntity(player, "anotherpack:Coup_de_Grace", 0.8F, 1.0F);
			this.weaponDamage = 70 + (random.nextInt(30));
			if (this.ScytheName == "Scythe_1") {
				((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.wither.id, 200));
			} else {
				((EntityLiving) player).addPotionEffect(new PotionEffect(Potion.regeneration.id, 60, 3, false));
			}
		} else {
			this.weaponDamage = 40 + random.nextInt(10);
			player.worldObj.playSoundAtEntity(player, "anotherpack:scythe_hit_" + x + "_", 0.2F, 1.0F);
		}
		return false;
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
		if (this.ScytheName == "Scythe_1") {

			if (flag || player.inventory.hasItem(AllItems.bullet.itemID)) {

				p_77615_2_.playSoundAtEntity(player, "anotherpack:rwby", 0.7F, 0.95F);
				Vec3 look;
				EntityArrow fireball;
				look = player.getLookVec();
				player.motionX = -look.xCoord / 1.5D;
				player.motionZ = -look.zCoord / 1.5D;
				player.motionY = -look.yCoord / 1.5D;
				player.motionX = -look.xCoord / 1.5D;
				player.motionZ = -look.zCoord / 1.5D;
				if (!p_77615_2_.isRemote) {
					fireball = new EntityArrow(p_77615_2_, player, 5.0F);
					fireball.canBePickedUp = 0;
					if (!player.capabilities.isCreativeMode) {
						player.inventory.consumeInventoryItem(AllItems.bullet.itemID);
					}

					p_77615_2_.spawnEntityInWorld(fireball);
					p_77615_1_.damageItem(1, player);
				}
				set_Crescent_Rose_State(p_77615_1_, false);

			} else {
				set_Crescent_Rose_State(p_77615_1_, false);
			}
		} else {

			if (flag || player.inventory.hasItem(AllItems.bullet_shell.itemID)) {

				float f = (float) j / 20.0F;
				f = (f * f + f * 2.0F) / 3.0F;

				if ((double) f < 0.1D) {
					return;
				}

				if (f > 1.0F) {
					f = 1.0F;
				}
				EntityArrow entityarrow = new EntityArrow(p_77615_2_, player, f * 4.0F);
				EntityArrow entityarrow1 = new EntityArrow(p_77615_2_, player, f * 4.0F);
				entityarrow1.motionY += 0.14999999664723873D;
				entityarrow1.motionX += 0.02500000037252903D;
				EntityArrow entityarrow2 = new EntityArrow(p_77615_2_, player, f * 4.0F);
				entityarrow2.motionY -= 0.14999999664723873D;
				entityarrow2.motionX -= 0.02500000037252903D;
				EntityArrow entityarrow3 = new EntityArrow(p_77615_2_, player, f * 4.0F);
				entityarrow3.motionY -= 0.06999999664723873D;
				entityarrow3.motionX -= 0.14500000037252903D;
				EntityArrow entityarrow4 = new EntityArrow(p_77615_2_, player, f * 4.0F);
				entityarrow4.motionY -= 0.06999999664723873D;
				entityarrow4.motionX -= -0.22500000037252903D;

				if (f == 1.0F) {
					entityarrow.setIsCritical(true);
					entityarrow1.setIsCritical(true);
					entityarrow2.setIsCritical(true);
					entityarrow3.setIsCritical(true);
					entityarrow4.setIsCritical(true);
				}

				p_77615_1_.damageItem(1, player);
				p_77615_2_.playSoundAtEntity(player, "anotherpack:Stifling_Dagger", 0.7F, 0.95F);

				if (!p_77615_2_.isRemote) {
					entityarrow.canBePickedUp = 0;
					entityarrow1.canBePickedUp = 0;
					entityarrow2.canBePickedUp = 0;
					entityarrow3.canBePickedUp = 0;
					entityarrow4.canBePickedUp = 0;
				}
				if (!flag) {
					player.inventory.consumeInventoryItem(AllItems.bullet_shell.itemID);
				} else {

				}

				if (!p_77615_2_.isRemote) {
					p_77615_2_.spawnEntityInWorld(entityarrow);
					p_77615_2_.spawnEntityInWorld(entityarrow1);
					p_77615_2_.spawnEntityInWorld(entityarrow2);
					p_77615_2_.spawnEntityInWorld(entityarrow3);
					p_77615_2_.spawnEntityInWorld(entityarrow4);
				}
			}

		}

	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
		p_77624_3_.add("§9Урон 40-50");
		p_77624_3_.add("§9Зажать ПКМ для стрельбы из орудия(нужны пули)");
		p_77624_3_.add("§9Даёт эффекты Скорости II и Прыгучести III");
		p_77624_3_.add("§cШанс крита §410%§c, урон вырастет до 70-100");
		if (this.ScytheName == "Scythe_1") {
			p_77624_3_.add("§cПри крите, на цель накладывается эффект §8Иссушения§c на §410 секунд");
		} else if (this.ScytheName == "Scythe_2") {
			p_77624_3_.add("§cПри крите, на владельца накладывается эффект §4Восстановления 4§c на §42 секунды");
		}
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		super.onUpdate(stack, world, entity, par4, par5);
		if (entity instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) entity;
			ItemStack equipped = player.getCurrentEquippedItem();
			if (equipped == stack) {
				player.addPotionEffect(new PotionEffect(Potion.jump.id, 2, 2, true));
				player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 2, 1, true));
			}
		}

	}

}
