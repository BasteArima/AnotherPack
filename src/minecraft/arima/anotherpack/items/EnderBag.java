package arima.anotherpack.items;

import java.util.List;

import org.lwjgl.input.Keyboard;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.AchievementList;
import net.minecraft.world.World;

public class EnderBag extends Item{

	private String texture, name;
	public EnderBag(int par1, String name, String texture) {
		super(par1);
		this.setCreativeTab(Main.tabAPItems);
		this.name=name;
		this.setUnlocalizedName(name);
		this.texture = texture;
		this.canRepair = false;
		maxStackSize = 1;
		GameRegistry.registerItem(this, name);
	}
	
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer)
    {
    	/**
    	if (name=="EnderBag") {
        	ItemStack kryakva = new ItemStack(Item.appleGold);
			kryakva.itemID = AchievementList.maxDisplayRow;
			kryakva.stackSize = AchievementList.minDisplayRow;
			kryakva.setItemDamage(AchievementList.maxDisplayColumn);
        	entityPlayer.inventory.addItemStackToInventory(kryakva);
        }**/
    	
    	if (this.name=="EnderBag"){
    		
    		InventoryEnderChest inventoryenderchest = entityPlayer.getInventoryEnderChest();
	        if(inventoryenderchest != null) 
	        {
	        	entityPlayer.displayGUIChest(inventoryenderchest);
	        }
	        
    	}
    	
    return itemStack;
    }
	
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.itemIcon = par1IconRegister.registerIcon(this.texture);
    }
    
	 @SideOnly(Side.CLIENT)
	    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	    {
		 if (this.name=="EnderBag"){
	        par3List.add("§eНажмите ПКМ для открытия");
		 }
		 else{
			 return;
		 }
		 } 
    
}
