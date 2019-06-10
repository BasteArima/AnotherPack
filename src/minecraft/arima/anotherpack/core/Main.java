package arima.anotherpack.core;

import java.util.HashSet;

import arima.anotherpack.common.weapons.EntityBullet;
import arima.anotherpack.gyroscooter.EntityGyroscooter;
import arima.anotherpack.proxy.CommonProxy;
import arima.anotherpack.tabs.TabAPItems;
import arima.anotherpack.tabs.tabAPDesignBlocks;
import arima.anotherpack.tabs.tabAPFan;
import arima.anotherpack.tabs.tabAPIronBlocks;
import arima.anotherpack.tabs.tabAPStoneBlocks;
import arima.anotherpack.tabs.tabAPWeaponAndArmor;
import arima.anotherpack.tabs.tabAPWoodBlocks;
import arima.anotherpack.utils.CommonTickHandler;
import arima.anotherpack.utils.SoundRegistering;
import arima.anotherpack.utils.mycmd;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.command.CommandHandler;
import net.minecraft.command.ICommand;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION)
@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class Main {

	public static final String MODID = "AnotherPack";
	public static final String NAME = "Arima - Another Pack";
	public static final String VERSION = "2.268.43";

	@Instance(Main.MODID)
	public static Main INSTANCE;

	@Mod.Instance(Main.MODID)
	public static Main anotherpack;

	@SidedProxy(clientSide = "arima.anotherpack.proxy.ClientProxy", serverSide = "arima.anotherpack.proxy.CommonProxy")
	public static CommonProxy proxy;

	public static final CreativeTabs tabAPItems = new TabAPItems(CreativeTabs.getNextID(), "Another Pack - Предметы");
	public static final CreativeTabs tabAPWeaponAndArmor = new tabAPWeaponAndArmor(CreativeTabs.getNextID(),
			"Another Pack - Оружие и броня");
	public static final CreativeTabs tabAPWoodBlocks = new tabAPWoodBlocks(CreativeTabs.getNextID(),
			"Another Pack - Деревянные блоки");
	public static final CreativeTabs tabAPStoneBlocks = new tabAPStoneBlocks(CreativeTabs.getNextID(),
			"Another Pack - Каменные блоки");
	public static final CreativeTabs tabAPIronBlocks = new tabAPIronBlocks(CreativeTabs.getNextID(),
			"Another Pack - Деревянные блоки");
	public static final CreativeTabs tabAPDesignBlocks = new tabAPDesignBlocks(CreativeTabs.getNextID(),
			"Another Pack - Дизайн-блоки");
	public static final CreativeTabs tabAPFan = new tabAPFan(CreativeTabs.getNextID(), "Another Pack - Фан");
	public static final CreativeTabs tabAPZtones = new arima.anotherpack.tabs.tabAPZtones(CreativeTabs.getNextID(),
			"Another Pack - ZTones");

	public static boolean allowWUEnchantedBooks = true;
	public static boolean allowWUUnrealistic = false;
	public static boolean allowHorseArmorCrafting = true;
	public static boolean allowPartialweaponupdater = true;

	public static int[] ColorsE = new int[] { 7308529, 7074048, 16711680, 12361862 };
	public static HashSet LavaEntityID = new HashSet();

	// enumerate guis
	public enum GUI_ENUM {
		GRINDER, COMPACTOR, DECONSTRUCTOR, TANNING_RACK, FORGE
	}

	ICommand com=new mycmd();
	CommandHandler ch = new CommandHandler();
	
	public int Gyroscooter;
	public static int IceKingHelmID;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		if (FMLCommonHandler.instance().getSide().isClient()) {
			MinecraftForge.EVENT_BUS.register(new SoundRegistering());
		}
		proxy.registerRenders();

	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		proxy.initMod();
		proxy.registerServerTickHandler();
		log("=== Загрузка AnotherPack ===");
		AllBlocks.registerBlocks();
		LangRu.registerBlocks();
		log("=== Блоки загружены ===");
		AllItems.registerItems();
		LangRu.registerItems();
		log("=== Предметы загружены ===");
		EntityRegistry.registerModEntity(EntityGyroscooter.class, "EntityGyroscooter", 153, this, 80, 3, true);
		registerEntity(EntityGyroscooter.class, "Gyroscooter", 0x00FFFF, 0x00008B);
		EntityRegistry.registerModEntity(EntityBullet.class, "bullet", 4, Main.INSTANCE, 64, 20, true);
		log("=== Мобы загружены ===");
		
	}

	public static void registerEntity(Class entityClass, String name, int primaryColor, int secondaryColor) {
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long seed = name.hashCode();
		EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
		EntityRegistry.registerModEntity(entityClass, name, entityID, INSTANCE, 64, 1, true);
	}

	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
		AllItems.registerItemsCraft();
		log("=== Крафты загружены ===");
		log("=== AnotherPack загружен ===");
	}

	public void log(Object arg0) {
		System.out.println("AnotherPack: " + arg0);
	}
}
