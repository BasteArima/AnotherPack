package arima.anotherpack.utils;

import java.util.EnumSet;

import arima.anotherpack.core.AllItems;
import arima.anotherpack.items.IceKingArmor;
import cpw.mods.fml.common.ITickHandler;
import cpw.mods.fml.common.TickType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class CommonTickHandler implements ITickHandler {
	
	public IceKingArmor event;
	public World world;
	public EntityPlayer player;
	
	@Override
	public void tickStart(EnumSet<TickType> type, Object... tickData) {
		playerTick((EntityPlayer) tickData[0]);
	}
	
	public void playerTick(EntityPlayer player) {
		if (player.getCurrentArmor(0) != null) {
			ItemStack helm = player.getCurrentArmor(0);
			if (helm.getItem() == AllItems.BasteCrown) {
				player.addPotionEffect((new PotionEffect((Potion.resistance.id), 200, 3)));
			}
		}
	}
	
	public void onTickArmor(EntityPlayer player, World world,
			ItemStack itemStack, IceKingArmor event) {
		ItemStack helmet = player.inventory.armorItemInSlot(3);
		ItemStack chestplate = player.inventory.armorItemInSlot(2);
		ItemStack leggings = player.inventory.armorItemInSlot(1);
		ItemStack boots = player.inventory.armorItemInSlot(0);
		if (helmet.itemID == AllItems.BasteCrown.itemID) {
			System.out.println("ТУТ");
			player.addPotionEffect((new PotionEffect((Potion.resistance.id), 200, 3)));
		}
	}


	@Override
	public void tickEnd(EnumSet<TickType> type, Object... tickData) {
	}

	@Override
	public EnumSet<TickType> ticks() {
		return EnumSet.of(TickType.PLAYER);
	}

	@Override
	public String getLabel() {
		return null;
	}
	


}