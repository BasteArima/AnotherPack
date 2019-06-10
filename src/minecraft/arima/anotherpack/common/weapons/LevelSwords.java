package arima.anotherpack.common.weapons;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.lwjgl.opengl.GL11;

import com.google.common.collect.Lists;

import arima.anotherpack.core.AllItems;
import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class LevelSwords extends Item implements ItemRenderInterface {
	private int weaponDamage;
	private final EnumToolMaterial toolMaterial;
	private final String texture;
	final Random random = new Random();
	public int level;

	public LevelSwords(int id, String texture, String name) {
		super(id);
		this.toolMaterial = null;
		this.maxStackSize = 1;
		this.setMaxDamage(1500);
		this.texture = texture;
		this.setCreativeTab(Main.tabAPWeaponAndArmor);
		this.weaponDamage = 7;
		this.setUnlocalizedName(name);
		GameRegistry.registerItem(this, name);
	}

	@Override
	public void renderSpecial() {
		GL11.glScalef(1.5F, 1.5F, 1.0F);
		GL11.glTranslatef(0.19F, 0.0F, 0.1F);
	}

	public int getSwordsLevel() {
		return this.level;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List info, boolean par4) {
		info.add("§2Уровень: §6" + this.level);
		info.add("§2Урон: §6" + this.weaponDamage);
		if (level == 1)
			info.add("Ваш меч норм (лвл 1");
		else if (level == 2)
			info.add("Ваш меч получше (лвл 2)");
		else if (level == 3)
			info.add("Ваш меч топовее многих (лвл 3)");
		else if (level == 4)
			info.add("Ваш меч почти близок к расцвету (лвл 4)");
		else if (level == 5)
			info.add("Вы получили максимальный уровень (лвл 5)");
		else if (level == 6)
			info.add("Ваш меч легендарен, как и вы (лвл 6)");
		
		if (par1ItemStack.hasTagCompound() && par1ItemStack.getTagCompound().hasKey("Uses"))
	    {
			info.add("Ударов: "+Integer.toString(par1ItemStack.getTagCompound().getInteger("Uses")));
	    }
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(this.texture);
	}

	public int func_82803_g() {
		return this.toolMaterial.getDamageVsEntity();
	}

	public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block) {
		if (par2Block.blockID == Block.web.blockID) {
			return 15.0F;
		} else {
			Material material = par2Block.blockMaterial;
			return material != Material.plants && material != Material.vine && material != Material.coral
					&& material != Material.leaves && material != Material.pumpkin ? 1.0F : 1.5F;
		}
	}

	public boolean hitEntity(ItemStack item, EntityLiving par2EntityLiving, EntityLiving enemyEntity) {
		if (level<6)
			level+=1;
		NBTTagCompound nbt;
	    if (item.hasTagCompound())
	    {
	        nbt = item.getTagCompound();
	    }
	    else
	    {
	        nbt = new NBTTagCompound();
	    }
	 
	    if (nbt.hasKey("Uses"))
	    {
	        nbt.setInteger("Uses", nbt.getInteger("Uses") + 1);
	    }
	    else
	    {
	        nbt.setInteger("Uses", 1);
	    }
	    item.setTagCompound(nbt);
		
		int armoriD;
		ArrayList<Integer> ArmorsID = Lists.newArrayList();
		ArmorsID.add(30171);
		ArmorsID.add(30172);
		ArmorsID.add(30173);
		ArmorsID.add(30174);
		ArmorsID.add(30473);
		ArmorsID.add(30483);
		ArmorsID.add(30832);
		ArmorsID.add(30833);
		ArmorsID.add(30760);
		ArmorsID.add(30761);
		ArmorsID.add(30762);
		ArmorsID.add(30763);
		ArmorsID.add(30770);
		ArmorsID.add(30771);
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < ArmorsID.size(); k++) {
				armoriD = ArmorsID.get(k);
				ItemStack armor = ((EntityPlayer) enemyEntity).inventory.armorInventory[i];
				if (armor == new ItemStack(armoriD, 1, 1)) {
					if (this.level == 1)
						this.weaponDamage = 100000;
					else if (level == 2)
						this.weaponDamage = 200000;
					else if (level == 3)
						this.weaponDamage = 300000;
					else if (level == 4)
						this.weaponDamage = 400000;
					else if (level == 5)
						this.weaponDamage = 500000;
					else if (level == 6)
						this.weaponDamage = 1000000;
					else
						this.weaponDamage = 7;
				}

			}
		}
		
		//Minecraft.getMinecraft().thePlayer.sendChatToPlayer("" + this.weaponDamage);
		item.damageItem(1, enemyEntity);
		return true;
	}

	public boolean onBlockDestroyed(ItemStack par1ItemStack, World par2World, int par3, int par4, int par5, int par6,
			EntityLiving par7EntityLiving) {
		if ((double) Block.blocksList[par3].getBlockHardness(par2World, par4, par5, par6) != 0.0D) {
			par1ItemStack.damageItem(2, par7EntityLiving);
		}

		return true;
	}

	public int getDamageVsEntity(Entity par1Entity) {
		return this.weaponDamage;
	}

	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.block;
	}

	public int getMaxItemUseDuration(ItemStack par1ItemStack) {
		return 72000;
	}

	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
		return par1ItemStack;
	}

	public boolean canHarvestBlock(Block par1Block) {
		return par1Block.blockID == Block.web.blockID;
	}

	public int getItemEnchantability() {
		return 0;
	}

	public String getToolMaterialName() {
		return this.toolMaterial.toString();
	}

	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack) {
		return false;
	}
}
