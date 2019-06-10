package arima.anotherpack.fan;

import java.util.List;
import java.util.Random;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class tools extends ItemSword {

	private String texture, name;
	final Random random = new Random();
	private int damage;

	public tools(int par1, EnumToolMaterial par2EnumToolMaterial, String name, String texture, int damage) {
		super(par1, EnumToolMaterial.WOOD);
		this.setUnlocalizedName(name);
		this.texture = texture;
		this.damage = damage;
		this.name = name;
		this.setMaxDamage(-1);
		this.setCreativeTab(Main.tabAPFan);
		GameRegistry.registerItem(this, name);
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(this.texture);
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		int whip = 1 + random.nextInt(5);

		if (this.name == "bdsmWhip") {
			player.worldObj.playSoundAtEntity(player, "anotherpack:whip" + whip + "_", 0.6F, 1.0F);
			int i = 1 + random.nextInt(30);
			if (i == 29) {
				int pa1 = 1 + random.nextInt(4);
				switch (pa1) {
				case (1):
					player.worldObj.playSoundAtEntity(player, "anotherpack:Phass_happy_09_ru", 0.7F, 1.0F);
					break;
				case (2):
					player.worldObj.playSoundAtEntity(player, "anotherpack:Phass_happy_08_ru", 0.7F, 1.0F);
					break;
				case (3):
					player.worldObj.playSoundAtEntity(player, "anotherpack:Phass_anger_04_ru", 0.7F, 1.0F);
					break;
				}
			}
			if (i == 28 || i == 27) {
				int pa2 = 1 + random.nextInt(9);
				player.worldObj.playSoundAtEntity(player, "anotherpack:Phass_pain_0" + pa2 + "_ru", 0.6F, 1.0F);
			}
			if (i == 26 || i == 25) {
				int ta1 = 1 + random.nextInt(8);
				player.worldObj.playSoundAtEntity(player, "anotherpack:Temp_pain_0" + ta1 + "_ru", 0.6F, 1.0F);
			}
			if (i == 8) {
				player.worldObj.playSoundAtEntity(player, "anotherpack:yula" + (1 + random.nextInt(2)) + "_", 2.0F,
						1.0F);
			}
		}

		if (this.name == "bdsmWhip2") {
			player.worldObj.playSoundAtEntity(player, "anotherpack:whip" + whip + "_", 0.6F, 1.0F);
			int i = 1 + random.nextInt(71);
			player.worldObj.playSoundAtEntity(player, "anotherpack:nastya_ (" + i + ")", 1.0F, 1.0F);
			if (i == 67 || i == 68 || i == 69) 
				player.addChatMessage("§bРедкость! Звук §eVertexit§b #" + i);
		}

		if (this.name == "chickenSword") {
			int pa5 = 1 + random.nextInt(2);
			switch (pa5) {
			case (1):
				player.worldObj.playSoundAtEntity(player, "mob.chicken.say", 0.7F, 1.0F);
				break;
			case (2):
				player.worldObj.playSoundAtEntity(player, "mob.chicken.hurt", 0.7F, 1.0F);
				break;
			}
		}
		return false;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
		if (this.name == "bdsmWhip") {
			p_77624_3_.add("§eПри ударах, цель издаёт §cженские стоны");
			p_77624_3_.add("§c0.13% §eшанс стонов девушки");
			p_77624_3_.add("§c0.03% §eшанс стонов женщины");
			p_77624_3_.add("§c0.03% §eшанс стонов §cЮли(Mercurie)");
		} else if (this.name == "bdsmWhip2") {
			p_77624_3_.add("§eПри ударах, цель издаёт §cзвуки Кисы");
			p_77624_3_.add("§c70§e звуковых дорожек");
			p_77624_3_.add("§c100%§e шанс озвучки каждой (временно)");
			p_77624_3_.add("§eЕсть §c3 озвучки стонов§e от §cVertexit");
			p_77624_3_.add("§eЕсть §c1 озвучка§e от §cBaste");
		} else if (this.name == "chickenSword") {
			p_77624_3_.add("§ejoni на палочке");
		}
	}

	public int getDamageVsEntity(Entity par1Entity) {
		return this.damage;
	}

}
