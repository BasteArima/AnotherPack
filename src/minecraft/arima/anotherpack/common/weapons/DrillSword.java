package arima.anotherpack.common.weapons;

import java.util.List;
import java.util.Random;

import org.lwjgl.opengl.GL11;

import arima.anotherpack.core.AllItems;
import arima.anotherpack.core.Main;
import arima.anotherpack.utils.StackUtil;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class DrillSword extends ItemSword implements ItemRenderInterface {

	final Random random = new Random();
	private int weaponDamage;
	private String texture, weaponName;
	private Icon[] icon;
	private boolean mode;
	@SideOnly(Side.CLIENT)
	private Icon[] textures;

	public DrillSword(int id, EnumToolMaterial material, String texture, String name) {
		super(id, AllItems.ScytheMat);
		this.setCreativeTab(Main.tabAPWeaponAndArmor);
		this.setMaxDamage(-1);
		this.texture = texture;
		this.weaponName = name;
		this.setUnlocalizedName(name);
		this.weaponDamage = 10;
		this.mode = false;
		this.setFull3D();
		GameRegistry.registerItem(this, name);
	}

	@Override
	public void renderSpecial() {
		GL11.glScalef(1.0F, 1.0F, 1.0F);
		GL11.glTranslatef(0.0F, 0.0F, 0.15F);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.textures = new Icon[3];

		this.textures[0] = par1IconRegister.registerIcon(this.texture + "_off");
		this.textures[1] = par1IconRegister.registerIcon(this.texture + "_onAnim");
		this.textures[2] = par1IconRegister.registerIcon(this.texture + "_on");

	}

	@SideOnly(Side.CLIENT)
	public boolean requiresMultipleRenderPasses() {
		return true;
	}

	  @SideOnly(Side.CLIENT)
	  public Icon getIcon(ItemStack itemStack, int pass)
	  {
	    NBTTagCompound nbtData = StackUtil.getOrCreateNbtData(itemStack);
	    if (nbtData.getBoolean("active"))
	    {
	      return this.textures[2];
	    }
	    return this.textures[0];
	  }

	@Override
	public int getMaxItemUseDuration(ItemStack p_77626_1_) {
		return 72000;
	}

	public int getDamageVsEntity(Entity par1Entity) {
		return this.weaponDamage;
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.none;
	}
	

	  public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityplayer)
	  {
	    NBTTagCompound nbtData = StackUtil.getOrCreateNbtData(itemStack);
	    if (nbtData.getBoolean("active"))
	    {
	      nbtData.setBoolean("active", false);
	      this.weaponDamage = 10;
	    }
	    else
	    {
	      nbtData.setBoolean("active", true);
	      this.weaponDamage = 50;
	    }
	    entityplayer.addChatMessage(" Урон: " + weaponDamage + "\nРежим: " + nbtData.getBoolean("active"));
	    return itemStack;
	  }

	@Override
	public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int count) {
		
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
		p_77624_3_.add("§9Урон: " + this.weaponDamage);
	}

	@Override
	public void onUpdate(ItemStack stack, World world, Entity entity, int par4, boolean par5) {
		super.onUpdate(stack, world, entity, par4, par5);
	}

}
