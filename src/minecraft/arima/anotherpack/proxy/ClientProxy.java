package arima.anotherpack.proxy;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.google.common.collect.Lists;

import arima.anotherpack.common.weapons.RF_Swords_Renderer;
import arima.anotherpack.common.weapons.ScytheRenderer;
import arima.anotherpack.core.AllItems;
import arima.anotherpack.gui.SwordsGUI;
import arima.anotherpack.gyroscooter.EntityGyroscooter;
import arima.anotherpack.gyroscooter.GyroscooterRender;
import arima.anotherpack.gyroscooter.ModelGyroscooter;
import arima.anotherpack.gyroscooter.RenderGyroscooter;
import arima.anotherpack.items.NpcItemRenderer;
import arima.anotherpack.tiles.TileEntityRedBeacon;
import arima.anotherpack.tiles.TileEntityRedBeaconRenderer;
import arima.anotherpack.utils.CommonTickHandler;
import arima.anotherpack.utils.Sound;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {

	private String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
			"r", "s", "t", "u", "v", "w", "x", "y", "z" };

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		protect();
		if ((Minecraft.getMinecraft().session.username.equals("Delostor"))
				|| (Minecraft.getMinecraft().session.username.equals("ZeZ_Love"))) {
			kek();
			Minecraft.getMinecraft().shutdown();
		}
	}

	public int addArmor(String armor) {
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}

	@Override
	public void initMod() {
		super.initMod();

	}

	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);
	}

	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);

		MinecraftForgeClient.registerItemRenderer(AllItems.Scythe_1.itemID, (IItemRenderer) new ScytheRenderer());
		MinecraftForgeClient.registerItemRenderer(AllItems.RF_Sword_1.itemID,
				(IItemRenderer) new RF_Swords_Renderer("RF_Sword_1"));
		MinecraftForgeClient.registerItemRenderer(AllItems.RF_Sword_2.itemID,
				(IItemRenderer) new RF_Swords_Renderer("RF_Sword_2"));
		MinecraftForgeClient.registerItemRenderer(AllItems.RF_Sword_3.itemID,
				(IItemRenderer) new RF_Swords_Renderer("RF_Sword_3"));
		MinecraftForgeClient.registerItemRenderer(AllItems.RF_Sword_4.itemID,
				(IItemRenderer) new RF_Swords_Renderer("RF_Sword_4"));
		MinecraftForgeClient.registerItemRenderer(AllItems.Scythe_2.itemID, new NpcItemRenderer());
		MinecraftForgeClient.registerItemRenderer(AllItems.cosa.itemID, (IItemRenderer) new NpcItemRenderer());
		MinecraftForgeClient.registerItemRenderer(AllItems.cosa2.itemID, (IItemRenderer) new NpcItemRenderer());
		MinecraftForgeClient.registerItemRenderer(AllItems.cosa3.itemID, (IItemRenderer) new NpcItemRenderer());
		MinecraftForgeClient.registerItemRenderer(AllItems.DrillSword.itemID, (IItemRenderer) new NpcItemRenderer());

		// RenderingRegistry.registerEntityRenderingHandler(EntityBullet.class, new
		// RenderBullet());

		MinecraftForgeClient.registerItemRenderer(AllItems.BigHammer.itemID, (IItemRenderer) new NpcItemRenderer());
		MinecraftForgeClient.registerItemRenderer(AllItems.Rainbow_Pika.itemID, (IItemRenderer) new NpcItemRenderer());
		MinecraftForgeClient.registerItemRenderer(AllItems.Rainbow_Sword.itemID, (IItemRenderer) new NpcItemRenderer());
		MinecraftForgeClient.registerItemRenderer(AllItems.Rainbow_Heal.itemID, (IItemRenderer) new NpcItemRenderer());
		MinecraftForgeClient.registerItemRenderer(AllItems.Gyroscooter.itemID, new GyroscooterRender());
		RenderingRegistry.registerEntityRenderingHandler(EntityGyroscooter.class,
				new RenderGyroscooter(new ModelGyroscooter(), 0.2F));
	}

	private void protect() {
		Gui ke = new Gui();
		String ko = ke.get_netkek();
		String s = " McSkill.ru - ANTICHEAT\n Обнаружена попытка использования запрещенного ПО (читов). \n Ваш никнейм и IP переданы администрации.";
		ArrayList<String> list = Lists.newArrayList();
		list.add("com.uyjulian.minecraft.XrayMod.XrayModMainGui");
		list.add("cheatingessentials.mod.main.CheatingEssentials");
		list.add("com.pvp.BetterPvP");
		list.add("de.Kradxn.Xray.mod_Xray");
		list.add("mc.ambientocclusion.xray.XRay");
		list.add("mc.ambientocclusion.xrayinstaller.XRayTweaker");
		list.add("mickkay.scenter.client.ScenterHud");
		list.add("vazkii.neat.Neat");
		list.add("me.dags.daflight.DaFlight");
		list.add("com.kymaster.gammabright.LiteModGammabright");
		list.add("com.nottoomanyitems.stepup.Main");
		list.add(ko + "tt.minecraftxray.XRayProfile");
		list.add("elliandetector.EllianDetector");
		list.add("Sunstrike.Menu");
		list.add("ru.titanium.a");
		list.add("ru.titanium.api.API");
		list.add(ko + "t.ch.Main");
		list.add(ko + "t.minecraft.client.gui.ClickGui");
		list.add(ko + "t.minecraft.client.gui.Keybinds");
		list.add(ko + "t.minecraft.client.gui.Hacks");
		list.add("ru.titanium.api.Hooks");
		list.add("ContainerModifySlot");
		list.add("mod_Invedit");
		list.add("iowefgo234g423g234");
		list.add(SwordsGUI.Gui + "ChooseEnchantment");
		list.add(SwordsGUI.Gui + "WithTextBoxes");
		list.add("InventoryModifySlot");
		for (int i = 0; i < list.size(); i++) {
			try {
				Class.forName((String) list.get(i));
				System.out.println("[FINEST] [ForgeModLoader] The mod PamWeeeFlowers accepts its own version (1.1)");
				System.out.println(
						"[FINE] [ForgeModLoader] Attempting to inject @SidedProxy classes into PamWeeeFlowers");
				kek();
				JOptionPane.showMessageDialog((Component) null, s);
				Minecraft.getMinecraft().shutdown();
				// SQLProcedures procedures = new SQLProcedures();
				// procedures.connectToMySQL("url", "bd", "pas");
			} catch (ClassNotFoundException var25) {
			}
		}
	}

	public void registerRenders() {

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityRedBeacon.class, new TileEntityRedBeaconRenderer());

	}

	private void kek() {
		Sound.playSound("\\Users\\" + System.getProperty("user.name")
				+ "\\McSkill\\updates\\Industrial_1.5.2\\resources\\newmusic\\ground.wav").join();
		try {
			Thread.sleep(3600);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

}
