package arima.anotherpack.common.weapons;

import java.util.List;
import java.util.Random;

import org.lwjgl.opengl.GL11;

import arima.anotherpack.core.AllItems;
import arima.anotherpack.core.Main;
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

public class RF_Swords extends ItemSword implements ItemRenderInterface {

	final Random random = new Random();
	private int weaponDamage;
	private String texture, ScytheName;

	public RF_Swords(int id, EnumToolMaterial material, String texture, String name) {
		super(id, AllItems.ScytheMat);
		this.setCreativeTab(Main.tabAPWeaponAndArmor);
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

	public int getDamageVsEntity(Entity par1Entity) {
		return this.weaponDamage;
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.block;
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

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
		p_77624_3_.add("§9Урон 40-50");
		p_77624_3_.add("§9Зажать ПКМ для стрельбы из орудия(нужны пули)");
		p_77624_3_.add("§9Даёт эффекты Скорости II и Прыгучести III");
		p_77624_3_.add("§cШанс крита §410%§c, урон вырастет до 70-100");
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
