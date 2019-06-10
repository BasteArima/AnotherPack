package arima.anotherpack.items;

import java.util.List;
import java.util.Random;

import com.google.common.eventbus.Subscribe;

import arima.anotherpack.core.AllBlocks;
import arima.anotherpack.core.AllItems;
import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class CandiePouch extends Item {

	final Random random = new Random();
	private String texture;

	public CandiePouch(int i, String name, String texture) {
		super(i);
		this.setUnlocalizedName(name);
		this.texture = texture;
		this.canRepair = false;
		this.setCreativeTab(Main.tabAPItems);
		maxStackSize = 1;
		this.setMaxDamage(1);
		GameRegistry.registerItem(this, name);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(this.texture);
	}

	@Subscribe
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player1) {
		int rand = random.nextInt(15) + 1;
		
		/**
		player1.inventory.addItemStackToInventory(new ItemStack(this.itemID, 1, 0));
		if (!world.isRemote) {
			switch (rand) {
			case 1:
				player1.entityDropItem(new ItemStack(AllBlocks.angel, 1), 0);
				break;
			case 2:
				player1.entityDropItem(new ItemStack(AllBlocks.ball_blue, 1), 0);
				break;
			case 3:
				player1.entityDropItem(new ItemStack(AllBlocks.ball_green, 1), 0);
				break;
			case 4:
				player1.entityDropItem(new ItemStack(AllBlocks.ball_red, 1), 0);
				break;
			case 5:
				player1.entityDropItem(new ItemStack(AllBlocks.bells, 1), 0);
				break;
			case 6:
				player1.entityDropItem(new ItemStack(AllBlocks.candle, 1), 0);
				break;
			case 7:
				player1.entityDropItem(new ItemStack(AllBlocks.wreath, 1), 0);
				break;
			case 8:
				player1.dropItem(30175, 1);
				break;
			case 9:
				player1.dropItem(30176, 1);
				break;
			case 10:
				player1.dropItem(30177, 1);
				break;
			case 11:
				player1.dropItem(30178, 1);
				break;
			case 12:
				player1.dropItem(310, 1);
				break;
			case 13:
				player1.dropItem(311, 1);
				break;
			case 14:
				player1.dropItem(312, 1);
				break;
			case 15:
				player1.dropItem(313, 1);
				break;
			} 
			player1.worldObj.playSoundAtEntity(player1, "random.levelup", 3.0F, 1.0F);
			itemStack.damageItem(2, player1);
		}**/
		return itemStack;
	}

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("§eНажмите ПКМ для открытия");

	}
	/** Код для лута прямо в инвентарь
	 * 
	 * player1.inventory.addItemStackToInventory(new ItemStack(AllItems.candie1, a, 4));
	 *	player1.inventory.addItemStackToInventory(new ItemStack(AllItems.candie2, b, 4));
	 *	player1.inventory.addItemStackToInventory(new ItemStack(AllItems.candie3, c, 4));
	 *	//player1.inventory.clearInventory(AllItems.candie4, 1); // очистка всех вещей подобного типа
	 * //world.playSoundAtEntity(player1, "random.levelup", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F)); //играть песню вокруг игрока
	 * Если выпадет конфета, то будет звук
	 *	if (c==1)
	 *	{
	 *	player1.worldObj.playSoundAtEntity(player1, "arima:item0", 3.0F, 1.0F);
	 *	}
	 */
}