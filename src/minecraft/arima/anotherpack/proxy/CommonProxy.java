package arima.anotherpack.proxy;

import arima.anotherpack.common.wu.GuiHandler;
import arima.anotherpack.core.Main;
import arima.anotherpack.utils.CommonTickHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CommonProxy implements IGuiHandler {
	public void preInit(FMLPreInitializationEvent e) {

	}

	public void init(FMLInitializationEvent e) {
	}
	
	public void initMod() {

	}

	public int addArmor(String armor) {
		return 0;
	}

	public void registerRenders() {

	}
	
	public void registerServerTickHandler()
	{
	TickRegistry.registerTickHandler(new CommonTickHandler(), Side.SERVER);
	}


	public void postInit(FMLPostInitializationEvent e) {
		NetworkRegistry.instance().registerGuiHandler(Main.INSTANCE, new GuiHandler());
	}

	public void registerRenderInformation() {
	}

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		return null;
	}

	public void registerTiles() {
	}

	public void registerItems() {
	}
}
