package arima.anotherpack.items;

import java.util.List;
import java.util.Random;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class EpicGoldApple extends ItemFood {
	private String texture;
	final Random random = new Random();

	public EpicGoldApple(int id, int healit, float sit, boolean isWolfsFavoriteMeat, String texture, String name) {
		super(id, healit, sit, isWolfsFavoriteMeat);
		this.setHasSubtypes(false);
		this.setUnlocalizedName(name);
		this.texture = texture;
		this.setCreativeTab(CreativeTabs.tabFood);
		maxStackSize = 64;
		this.canRepair = false;
		this.setAlwaysEdible();
		GameRegistry.registerItem(this, name);
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(this.texture);
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack p_77636_1_) {
		return p_77636_1_.getItemDamage() > 0;
	}

	public EnumRarity getRarity(ItemStack p_77613_1_) {
		return p_77613_1_.getItemDamage() == 0 ? EnumRarity.rare : EnumRarity.epic;
	}

	protected void onFoodEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) 
		{
		int rand = 1+ random.nextInt(4);
			
				if (!par2World.isRemote) {
					par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.id, 1200, 2));
					par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.id, 2400, 2));
					par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 2400, 1));
					par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.id, 400, 2));
					switch (rand) {
					case 1:
						par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.id, 1200, 1));
						break;
					case 2:
						par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.poison.id, 1200, 1));
						break;
					case 3:
						par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.weakness.id, 1200, 1));
						break;
					case 4:
						par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.blindness.id, 600, 1));
						break;
					}
					System.out.println(rand);
					
				}
			
		}
	
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_) {
		p_77624_3_.add("§9Даёт следующие эффекты:");
		p_77624_3_.add("§dСила III§9 на 20 секунд");
		p_77624_3_.add("§dВосстановление III§9 на 1 минуту");
		p_77624_3_.add("§dСопротивление III§9 на 2 минуты");
		p_77624_3_.add("§dОгнестойкость II§9 на 2 минуты");
	}
	

	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs, List par3List) {
		par3List.add(new ItemStack(par1, 0, 0));
	}
}