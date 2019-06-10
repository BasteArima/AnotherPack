package arima.anotherpack.core;

import arima.anotherpack.common.weapons.DrillSword;
import arima.anotherpack.common.weapons.LevelSwords;
import arima.anotherpack.common.weapons.RF_Swords;
import arima.anotherpack.common.weapons.RainbowWeapons;
import arima.anotherpack.common.weapons.Scythes;
import arima.anotherpack.fan.tools;
import arima.anotherpack.gyroscooter.ItemGyroscooter;
import arima.anotherpack.items.Amulets;
import arima.anotherpack.items.EnderBag;
import arima.anotherpack.items.EpicGoldApple;
import arima.anotherpack.items.FoodEffect;
import arima.anotherpack.items.IceKingArmor;
import arima.anotherpack.items.Instruments;
import arima.anotherpack.items.ItemScythe;
import arima.anotherpack.items.Items;
import arima.anotherpack.items.ItemsDoor;
import arima.anotherpack.items.ItemsPickaxe;
import arima.anotherpack.items.LootBox;
import arima.anotherpack.items.MusicDisc;
import arima.anotherpack.items.QuantDrill;
import arima.anotherpack.items.Runes;
import arima.anotherpack.items.TinCanFilled;
import arima.anotherpack.items.spinner;
import arima.anotherpack.items.sword1;
import arima.anotherpack.items.sword2;
import arima.anotherpack.items.xenobladeOn;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraftforge.common.EnumHelper;

public class AllItems {
	public static Item firstItem, secondItem, thirdItem, fourthItem, coin, dollarBadge, plusBadge, minusBadge, qmark,
			rune1, rune2, rune3, rune4, rune5, rune6, rune7, rune8, rune9, rune10, cherry, apple, pineapple, watermelon,
			strawberry, TinCan, TinCanFilled, box1, box2, box3;
	public static Item StandFotoelement, FotosolQuater, TaumCellEmpty, Akvamarin, Amethyst, Dark_ingot, Demonic_ingot,
			Granat, Ice_ingot, Malahit, Mox_ingot, Oc1, Oc2, Oc3, Oc4, Pluton_ingot, Tanzanit, Topaz, Uran_ingot, Map,
			Book1, Book2, Book3, Book4, Circuit1, Circuit2, Circuit3, Holst, Fire_sanarium, Demonic_ruby, Dark_mox,
			Dark_spirit, Materia, red_materia, Vis_materia, Sun_materia, Magic_materia, Fire_materia, Live_materia,
			Sky_materia, Dark_materia, Aer_Materia, Entropy_Materia, Ordo_Materia, Outline, Realm_quantum, Recipe1,
			Recipe2, Recipe3, Recipe4, Recipe5, Powder1, Powder2, Powder3, Powder4, Powder5, Powder6, Powder7, Powder8,
			Powder9, Powder10, Powder11, Powder12, Powder13, Powder14, Dye1, Dye2, Dye3, Dye4, Dye5, Dye6, Dye7, Dye8,
			Dye9, Dye10, Dye11, Dye12, Dye13, EnderBag;
	public static Item rune11, book1, amulet1, amulet2, amulet3, amulet4, amulet5, amulet6, amulet7, amulet8, amulet9,
			amulet10, amulet11, cosa, cosa2, cosa3, cyb_sw, tes_sw, neon_sw, p_sw, str_sw, y_sw, sword1, sword2,
			chrysaor, xenobladeOff, xenobladeOn, AlphaSword, ColorSword_Diamond, ColorSword_Iron, ColorSword_Gold,
			ColorSword_Stone, ColorSword_Wood, EpicGoldApple, spinner_1, spinner_2;

	public static Item Vace_Materia, IridiumPlate2, quantCore, quantCore2, quantCore3, quantCore4, quantCore5, jijaCase,
			itemCarbonPlate, itemRedstonePlate, cyber_upgrade, cyber_upgrade2, cyber_upgrade3, cyber_upgrade4,
			cyber_upgrade5, cyber_upgrade6;
	public static Item PrivateWand, PrivateInfo, runebox, swordbox, amuletbox, halloweenbox;
	public static Item ItemScythePart_a, ItemScythePart_b, ItemScythePart_c, ItemScythePart_d, ItemScythePart_e,
			ItemScythePart_f, ItemScytheFireDustAmmo;

	public static Item Scythe_1, Scythe_2, bullet_shell, ScytheModuleWither, ScytheModuleRegeneration,
			quantCoreModuleScythe, bullet, bdsmWhip, WorldSensorCard, RF_Sword_1, RF_Sword_2, RF_Sword_3, RF_Sword_4;
	
	
	public static final EnumToolMaterial ScytheMat = EnumHelper.addToolMaterial("Scythe", 3, 500, 3.0F, 50, 14);
	public static final EnumToolMaterial ImpDrillMat = EnumHelper.addToolMaterial("ImpDrillMat", 3, -1, 35.0F, 1, 10);
	public static EnumArmorMaterial ICEKINGARMOR = EnumHelper.addArmorMaterial("ICEKING", 40, new int[] {10,6,4,2}, 25);
	
	public static Item hardGlassPlate, itemPhotoElement_1, itemPhotoElement_2, itemPhotoElement_3, itemPhotoElement_4,
			PickAxe3x3, bdsmWhip2, QuantDrill, chickenSword, BigHammer, Rainbow_Pika, Rainbow_Sword, Rainbow_Heal,
			Rainbow_Blaster;
	public static Item BoxArmor, BoxInstr, BoxMechanism, BoxCoins, BoxComponent, BoxRes, BoxCharge, BoxGif, BoxCNPCs,
			BoxRainbowWeapon, BoxCases, BoxVote, Migalka, RainbowCore, Steampunk_Sword, DrillSword, ItemMagicStick,
			KeyForGifCase;

	public static Item recordVK1 = (new MusicDisc(2013, "vk1", 1));
	public static Item recordVK2 = (new MusicDisc(2014, "vk2", 1));
	public static Item recordVK3 = (new MusicDisc(2015, "vk3", 1));
	public static Item recordVK4 = (new MusicDisc(2016, "vk4", 1));
	public static Item recordVK5 = (new MusicDisc(2017, "vk5", 1));
	public static Item recordVK6 = (new MusicDisc(2018, "vk6", 1));
	public static Item recordVK7 = (new MusicDisc(2019, "vk7", 1));
	public static Item recordVK8 = (new MusicDisc(2020, "vk8", 1));
	public static Item recordVK9 = (new MusicDisc(2021, "vk9", 1));
	public static Item recordVK10 = (new MusicDisc(2022, "vk10", 1));
	public static Item recordVK11 = (new MusicDisc(2023, "vk11", 1));
	public static Item recordMeme1 = (new MusicDisc(2024, "meme1", 2));
	public static Item recordMeme2 = (new MusicDisc(2025, "meme2", 2));
	public static Item recordMeme3 = (new MusicDisc(2026, "meme3", 2));
	public static Item recordMeme4 = (new MusicDisc(2027, "meme4", 2));
	public static Item recordMeme5 = (new MusicDisc(2028, "meme5", 2));
	public static Item recordArima1 = (new MusicDisc(2029, "arima1", 3));
	public static Item recordArima2 = (new MusicDisc(2030, "arima2", 3));
	public static Item recordArima3 = (new MusicDisc(2031, "arima3", 3));
	public static Item recordArima4 = (new MusicDisc(2032, "arima4", 3));
	public static Item recordArima5 = (new MusicDisc(2033, "arima5", 3));
	public static Item recordArima6 = (new MusicDisc(2034, "arima6", 3));
	public static Item recordArima7 = (new MusicDisc(2035, "arima7", 3));
	public static Item recordArima8 = (new MusicDisc(2036, "arima8", 3));
	public static Item recordArima9 = (new MusicDisc(2037, "arima9", 3));
	public static Item recordArima10 = (new MusicDisc(2038, "arima10", 3));
	public static Item recordArima11 = (new MusicDisc(2039, "arima11", 3));
	public static Item recordArima12 = (new MusicDisc(2040, "arima12", 3));
	public static Item recordArima13 = (new MusicDisc(2041, "arima13", 3));
	public static Item Gyroscooter = new ItemGyroscooter(2042, 0, "Gyroscooter_1").setCreativeTab(Main.tabAPFan);
	public static Item EffFood_1 = new FoodEffect(1315, 4, false, "EffFood_1", "pivo");
	public static Item EffFood_2 = new FoodEffect(1316, 8, false, "EffFood_2", "bento");
	public static Item EffFood_3 = new FoodEffect(1317, 20, false, "EffFood_3", "byrger");
	public static Item EffFood_4 = new FoodEffect(1318, 10, false, "EffFood_4", "byter");
	public static Item EffFood_5 = new FoodEffect(1319, 6, false, "EffFood_5", "hotdog");
	public static Item EffFood_6 = new FoodEffect(1320, 8, false, "EffFood_6", "kompot");
	public static Item EffFood_7 = new FoodEffect(1321, 12, false, "EffFood_7", "kompot2");
	public static Item EffFood_8 = new FoodEffect(1322, 17, false, "EffFood_8", "konfeta");
	public static Item EffFood_9 = new FoodEffect(1323, 14, false, "EffFood_9", "kyr");
	public static Item EffFood_10 = new FoodEffect(1324, 7, false, "EffFood_10", "laim");
	public static Item EffFood_11 = new FoodEffect(1325, 19, false, "EffFood_11", "limonad");
	public static Item EffFood_12 = new FoodEffect(1326, 15, false, "EffFood_12", "morozka");
	public static Item EffFood_13 = new FoodEffect(1327, 12, false, "EffFood_13", "nozka");
	public static Item EffFood_14 = new FoodEffect(1328, 9, false, "EffFood_14", "piza");
	public static Item EffFood_15 = new FoodEffect(1329, 11, false, "EffFood_15", "ramen");
	public static Item EffFood_16 = new FoodEffect(1330, 16, false, "EffFood_16", "samogon");
	public static Item EffFood_17 = new FoodEffect(1331, 18, false, "EffFood_17", "shokolad");
	public static Item EffFood_18 = new FoodEffect(1332, 14, false, "EffFood_18", "sir");
	public static Item EffFood_19 = new FoodEffect(1333, 13, false, "EffFood_19", "vafelka");
	
	
	public static Item BasteCrown = new IceKingArmor(20548, ICEKINGARMOR, Main.proxy.addArmor(ICEKINGARMOR.name()), 0, "BasteCrown", "BasteCrown").setUnlocalizedName("BasteCrown");
	public static Item IceKingHelm = new IceKingArmor(472, ICEKINGARMOR, Main.proxy.addArmor(ICEKINGARMOR.name()), 0, "IceKingCrown_1", "Ice_Crown").setUnlocalizedName("IceKingHelm");
	public static Item SnowMaidenHelmet = new IceKingArmor(473, ICEKINGARMOR, Main.proxy.addArmor(ICEKINGARMOR.name()), 0, "SnowMaiden_1", "SnowMaidenHelmet").setUnlocalizedName("SnowMaidenHelmet");
	public static Item SnowMaidenPlate = new IceKingArmor(476, ICEKINGARMOR, Main.proxy.addArmor(ICEKINGARMOR.name()), 1, "SnowMaiden_1", "SnowMaidenPlate").setUnlocalizedName("SnowMaidenPlate");
	public static Item SnowMaidenBoots = new IceKingArmor(477, ICEKINGARMOR, Main.proxy.addArmor(ICEKINGARMOR.name()), 3, "SnowMaiden_1", "SnowMaidenBoots").setUnlocalizedName("SnowMaidenBoots");
	public static Item SnowMaidenPants = new IceKingArmor(478, ICEKINGARMOR, Main.proxy.addArmor(ICEKINGARMOR.name()), 2, "SnowMaiden_2", "SnowMaidenPants").setUnlocalizedName("SnowMaidenPants");
	
	
	public static Item ItemDoorAcacia, ItemDoorBirch, ItemDoorDarkOak, ItemDoorIron, ItemDoorJungle, ItemDoorSpruce, ItemDoorGlass, ItemDoorIronBars,
	ItemDoorNetherBricks, ItemDoorObsidian, ItemDoorFactory, ItemDoorJail, ItemDoorLabaratory, ItemDoorShoji, ItemDoorSlidingIron,
	ItemDoorSlidingWood;

	public static void registerItems() {
		ItemDoorAcacia = new ItemsDoor(1336, AllBlocks.DoorAcacia, "ItemDoorAcacia", "anotherpack:door/door_acacia");
		ItemDoorBirch = new ItemsDoor(1337, AllBlocks.DoorBirch, "ItemDoorBirch", "anotherpack:door/door_birch");
		ItemDoorDarkOak = new ItemsDoor(1338, AllBlocks.DoorDarkOak, "ItemDoorDarkOak", "anotherpack:door/door_dark_oak");
		ItemDoorIron = new ItemsDoor(1339, AllBlocks.DoorIron, "ItemDoorIron", "anotherpack:door/door_iron");
		ItemDoorJungle = new ItemsDoor(1340, AllBlocks.DoorJungle, "ItemDoorJungle", "anotherpack:door/door_jungle");
		ItemDoorGlass = new ItemsDoor(1341, AllBlocks.DoorGlass, "ItemDoorGlass", "anotherpack:door/doorGlass");
		ItemDoorIronBars = new ItemsDoor(1342, AllBlocks.DoorIronBars, "ItemDoorIronBars", "anotherpack:door/doorIronBars");
		ItemDoorSpruce = new ItemsDoor(1343, AllBlocks.DoorSpruce, "ItemDoorSpruce", "anotherpack:door/door_spruce");
		ItemDoorNetherBricks = new ItemsDoor(1344, AllBlocks.DoorNetherBricks, "ItemDoorNetherBricks", "anotherpack:door/doorNetherBricks");
		ItemDoorObsidian = new ItemsDoor(1345, AllBlocks.DoorObsidian, "ItemDoorObsidian", "anotherpack:door/doorObsidian");
		ItemDoorFactory = new ItemsDoor(1346, AllBlocks.DoorFactory, "ItemDoorFactory", "anotherpack:door/factory_door");
		ItemDoorJail = new ItemsDoor(1347, AllBlocks.DoorJail, "ItemDoorJail", "anotherpack:door/jail_door");
		ItemDoorLabaratory = new ItemsDoor(1348, AllBlocks.DoorLabaratory, "ItemDoorLabaratory", "anotherpack:door/laboratory_door");
		ItemDoorShoji = new ItemsDoor(1349, AllBlocks.DoorShoji, "ItemDoorShoji", "anotherpack:door/shoji_door");
		ItemDoorSlidingIron = new ItemsDoor(1350, AllBlocks.DoorSlidingIron, "ItemDoorSlidingIron", "anotherpack:door/sliding_door_iron");
		ItemDoorSlidingWood = new ItemsDoor(1351, AllBlocks.DoorSlidingWood, "ItemDoorSlidingWood", "anotherpack:door/sliding_door_wood");

		KeyForGifCase = new Items(729, "KeyForGifCase", "anotherpack:KeyForGifCase", 64);
		ItemMagicStick = new sword1(728, "anotherpack:ItemMagicStick", EnumToolMaterial.EMERALD)
				.setUnlocalizedName("ItemMagicStick");
		GameRegistry.registerItem(ItemMagicStick, "ItemMagicStick");
		BoxInstr = new LootBox(1672, "BoxInstr", "anotherpack:lootbox/LootBox_1");
		BoxArmor = new LootBox(1673, "BoxArmor", "anotherpack:lootbox/LootBox_1");
		BoxMechanism = new LootBox(1675, "BoxMechanism", "anotherpack:lootbox/mechbox");
		BoxCoins = new LootBox(1676, "BoxCoins", "anotherpack:chest/3");
		BoxComponent = new LootBox(1677, "BoxComponent", "anotherpack:lootbox/LootBox_1");
		BoxRes = new LootBox(1678, "BoxRes", "anotherpack:lootbox/runebox");
		BoxCharge = new LootBox(1679, "BoxCharge", "anotherpack:lootbox/LootBox_1");
		BoxGif = new LootBox(1680, "BoxGif", "anotherpack:lootbox/NYLootBox");
		BoxCNPCs = new LootBox(1681, "BoxCNPCs", "anotherpack:lootbox/swordbox");
		BoxRainbowWeapon = new LootBox(1682, "BoxRainbowWeapon", "anotherpack:lootbox/LootBox_1");
		BoxVote = new LootBox(1683, "BoxVote", "anotherpack:lootbox/LootBox_1");
		BoxCases = new LootBox(1684, "BoxCases", "anotherpack:lootbox/LootBox_1");

		RainbowCore = new Items(2044, "RainbowCore", "anotherpack:RainbowCore", 1)
				.setCreativeTab(Main.tabAPWeaponAndArmor);
		Migalka = new Items(2043, "Migalka", "anotherpack:Migalka", 1).setCreativeTab(Main.tabAPFan);
		firstItem = new Items(801, "firstItem", "anotherpack:lootbox/mechbox", 1);
		LanguageRegistry.addName(firstItem, "Набор с механизмами");
		secondItem = new Items(802, "secondItem", "anotherpack:secondItem", 1);
		LanguageRegistry.addName(secondItem, "Кейс с красителями");
		thirdItem = new Items(803, "thirdItem", "anotherpack:thirdItem", 1);
		LanguageRegistry.addName(thirdItem, "Третий кейс");
		fourthItem = new Items(804, "fourthItem", "anotherpack:fourthItem", 1);
		LanguageRegistry.addName(fourthItem, "Кейс с порошками");
		cherry = new Items(805, "cherry", "anotherpack:cherry", 64);
		LanguageRegistry.addName(cherry, "Вишня");
		apple = new Items(806, "apple", "anotherpack:apple", 64);
		LanguageRegistry.addName(apple, "Яблоко");
		pineapple = new Items(807, "pineapple", "anotherpack:pineapple", 64);
		LanguageRegistry.addName(pineapple, "Ананас");
		watermelon = new Items(808, "watermelon", "anotherpack:watermelon", 64);
		LanguageRegistry.addName(watermelon, "Арбуз");
		strawberry = new Items(809, "strawberry", "anotherpack:strawberry", 64);
		LanguageRegistry.addName(strawberry, "Клубника");
		coin = new Items(810, "coin", "anotherpack:coin", 64);
		LanguageRegistry.addName(coin, "Монета");
		dollarBadge = new Items(811, "dollarBadge", "anotherpack:dollarBadge", 64);
		LanguageRegistry.addName(dollarBadge, "Значок доллара");
		plusBadge = new Items(812, "plusBadge", "anotherpack:plusBadge", 1);
		LanguageRegistry.addName(plusBadge, "Значок плюса");
		minusBadge = new Items(813, "minusBadge", "anotherpack:minusBadge", 1);
		LanguageRegistry.addName(minusBadge, "Значок минуса");
		TinCan = new Items(814, "TinCan", "anotherpack:TinCan", 1);
		LanguageRegistry.addName(TinCan, "Консервная банка");
		TinCanFilled = new TinCanFilled(815, 64, false);
		LanguageRegistry.addName(TinCanFilled, "Консервы");
		Vace_Materia = new Items(20514, "Vace_materia", "anotherpack:vis_materia", 64);
		Sun_materia = new Items(20515, "Sun_materia", "anotherpack:sun_materia", 64);
		Magic_materia = new Items(20516, "Magic_materia", "anotherpack:magic_materia", 64);
		Fire_materia = new Items(20517, "Fire_materia", "anotherpack:fire_materia", 64);
		Live_materia = new Items(20518, "Live_materia", "anotherpack:live_materia", 64);
		Sky_materia = new Items(20519, "Sky_materia", "anotherpack:sky_materia", 64);
		Dark_materia = new Items(20520, "Dark_materia", "anotherpack:dark_materia", 64);
		Aer_Materia = new Items(20521, "Aer_Materia", "anotherpack:itemAerMaterium", 64);
		Entropy_Materia = new Items(20522, "Entropy_Materia", "anotherpack:itemEntropyMaterium", 64);
		Ordo_Materia = new Items(20523, "Ordo_Materia", "anotherpack:itemOrdoMaterium", 64);
		IridiumPlate2 = new Items(20524, "IridiumPlate2", "anotherpack:swords/comp/itemPartIridium2", 64);
		quantCore = new Items(20525, "quantCore", "anotherpack:swords/comp/quantCore", 64);
		LanguageRegistry.addName(quantCore, "Зеленое квантовое ядро");
		quantCore2 = new Items(20526, "quantCore2", "anotherpack:swords/comp/quantCore2", 64);
		LanguageRegistry.addName(quantCore2, "Желтое квантовое ядро");
		quantCore3 = new Items(20527, "quantCore3", "anotherpack:swords/comp/quantCore3", 64);
		LanguageRegistry.addName(quantCore3, "Оранжевое квантовое ядро");
		quantCore4 = new Items(20528, "quantCore4", "anotherpack:swords/comp/quantCore4", 64);
		LanguageRegistry.addName(quantCore4, "Фиолетовое квантовое ядро");
		quantCore5 = new Items(20529, "quantCore5", "anotherpack:swords/comp/quantCore5", 64);
		LanguageRegistry.addName(quantCore5, "Истинное квантовое ядро");
		itemCarbonPlate = new Items(20530, "itemCarbonPlate", "anotherpack:swords/comp/itemCarbonPlate", 64);
		LanguageRegistry.addName(itemCarbonPlate, "Карбоновая пластина");
		itemRedstonePlate = new Items(20531, "itemRedstonePlate", "anotherpack:swords/comp/itemRedstonePlate", 64);
		LanguageRegistry.addName(itemRedstonePlate, "Редстоун пластина");
		jijaCase = new Items(20532, "jijaCase", "anotherpack:swords/comp/jijaCase", 1);
		LanguageRegistry.addName(jijaCase, "Кейс с жижой");

		cyber_upgrade = new Items(20533, "cyber_upgrade", "anotherpack:swords/comp/cyber_upgrade", 64);
		LanguageRegistry.addName(cyber_upgrade, "Зеленый кибер апгрейд");
		cyber_upgrade2 = new Items(20534, "cyber_upgrade2", "anotherpack:swords/comp/cyber_upgrade2", 64);
		LanguageRegistry.addName(cyber_upgrade2, "Желтый кибер апгрейд");
		cyber_upgrade3 = new Items(20535, "cyber_upgrade3", "anotherpack:swords/comp/cyber_upgrade3", 64);
		LanguageRegistry.addName(cyber_upgrade3, "Оранжевый кибер апгрейд");
		cyber_upgrade4 = new Items(20536, "cyber_upgrade4", "anotherpack:swords/comp/cyber_upgrade4", 64);
		LanguageRegistry.addName(cyber_upgrade4, "Фиолетовый кибер апгрейд");
		cyber_upgrade5 = new Items(20537, "cyber_upgrade5", "anotherpack:swords/comp/cyber_upgrade5", 64);
		LanguageRegistry.addName(cyber_upgrade5, "Синий кибер апгрейд");

		box1 = new Items(823, "box1", "anotherpack:chest/20", 64);
		box2 = new Items(824, "box2", "anotherpack:chest/1", 64);
		box3 = new Items(825, "box3", "anotherpack:chest/21", 64);

		// sword1 = new sword1(850, "anotherpack:swords/sword1",
		// null).setUnlocalizedName("sword1");

		sword2 = new sword2(851, "anotherpack:swords/sword2", null).setUnlocalizedName("sword2");
		LanguageRegistry.addName(sword2, "Ледяная скорбь");
		xenobladeOff = new sword1(852, "anotherpack:xenobladeOff", null).setUnlocalizedName("xenobladeOff");
		LanguageRegistry.addName(xenobladeOff, "Xenoblade Off");
		xenobladeOn = new xenobladeOn(853, null).setUnlocalizedName("xenobladeOn");
		LanguageRegistry.addName(xenobladeOn, "Xenoblade On");
		AlphaSword = new sword1(854, "anotherpack:swords/AlphaSword", null).setUnlocalizedName("AlphaSword");
		LanguageRegistry.addName(AlphaSword, "Альфа Меч");
		chrysaor = new sword1(859, "anotherpack:swords/chrysaor", null).setUnlocalizedName("chrysaor");
		LanguageRegistry.addName(chrysaor, "Хрисаор");
		ColorSword_Diamond = new sword1(829, "anotherpack:swords/ColorSword_Diamond", null)
				.setUnlocalizedName("ColorSword_Diamond");
		GameRegistry.registerItem(ColorSword_Diamond, "ColorSword_Diamond");
		ColorSword_Iron = new sword1(830, "anotherpack:swords/ColorSword_Iron", null)
				.setUnlocalizedName("ColorSword_Iron");
		GameRegistry.registerItem(ColorSword_Iron, "ColorSword_Iron");
		ColorSword_Gold = new sword1(831, "anotherpack:swords/ColorSword_Gold", null)
				.setUnlocalizedName("ColorSword_Gold");
		GameRegistry.registerItem(ColorSword_Gold, "ColorSword_Gold");
		ColorSword_Stone = new sword1(832, "anotherpack:swords/ColorSword_Stone", null)
				.setUnlocalizedName("ColorSword_Stone");
		GameRegistry.registerItem(ColorSword_Stone, "ColorSword_Stone");

		cosa = (new ItemScythe(1608, "anotherpack:swords/cosa", EnumToolMaterial.WOOD)).setUnlocalizedName("cosa")
				.setFull3D().setMaxStackSize(1);
		cosa2 = (new ItemScythe(1609, "anotherpack:swords/cosa2", EnumToolMaterial.STONE)).setUnlocalizedName("cosa2")
				.setFull3D().setMaxStackSize(1);
		cosa3 = (new ItemScythe(1610, "anotherpack:swords/cosa3", EnumToolMaterial.EMERALD)).setUnlocalizedName("cosa3")
				.setFull3D().setMaxStackSize(1);
		GameRegistry.registerItem(cosa, "cosa");
		GameRegistry.registerItem(cosa2, "cosa2");
		GameRegistry.registerItem(cosa3, "cosa3");

		neon_sw = new sword1(1611, "anotherpack:swords/neon_sw", null).setUnlocalizedName("neon_sw");
		GameRegistry.registerItem(neon_sw, "neon_sw");
		cyb_sw = new sword1(1612, "anotherpack:swords/cyb_sw", null).setUnlocalizedName("cyb_sw");
		GameRegistry.registerItem(cyb_sw, "cyb_sw");
		tes_sw = new sword1(1613, "anotherpack:swords/tes_sw", null).setUnlocalizedName("tes_sw");
		GameRegistry.registerItem(tes_sw, "tes_sw");
		p_sw = new sword1(1614, "anotherpack:swords/p_sw", null).setUnlocalizedName("p_sw");
		GameRegistry.registerItem(p_sw, "p_sw");
		y_sw = new sword1(1615, "anotherpack:swords/y_sw", null).setUnlocalizedName("y_sw");
		GameRegistry.registerItem(y_sw, "y_sw");
		str_sw = new sword1(1616, "anotherpack:swords/str_sw", null).setUnlocalizedName("str_sw");
		GameRegistry.registerItem(str_sw, "str_sw");

		Recipe5 = new Items(1652, "Recipe5", "anotherpack:recipe5", 64);
		swordbox = new Items(1653, "swordbox", "anotherpack:lootbox/swordbox", 1);
		amuletbox = new Items(1654, "amuletbox", "anotherpack:lootbox/amuletbox", 1);
		runebox = new Items(1655, "runebox", "anotherpack:lootbox/runebox", 1);
		halloweenbox = new Items(1656, "halloweenbox", "anotherpack:lootbox/halloweenbox", 1);

		rune11 = new Runes(1617, "anotherpack:rune11", "rune11");
		LanguageRegistry.addName(rune11, "Легендарная руна");
		book1 = new Items(1618, "book1", "anotherpack:amulets/book1", 1);
		amulet1 = new Amulets(1619, "anotherpack:amulets/amulet1", "10% урона от меча", "amulet1");
		amulet2 = new Amulets(1620, "anotherpack:amulets/amulet2", "30% урона от меча", "amulet2");
		amulet3 = new Amulets(1621, "anotherpack:amulets/amulet3", "50% урона от меча", "amulet3");
		amulet4 = new Amulets(1622, "anotherpack:amulets/amulet4", "10% урона от косы", "amulet4");
		amulet5 = new Amulets(1623, "anotherpack:amulets/amulet5", "30% урона от косы", "amulet5");
		amulet6 = new Amulets(1624, "anotherpack:amulets/amulet6", "50% урона от косы", "amulet6");
		amulet7 = new Amulets(1625, "anotherpack:amulets/amulet7", "1 ед. чистого урона", "amulet7");
		amulet8 = new Amulets(1626, "anotherpack:amulets/amulet8", "1-2 ед. чистого урона", "amulet8");
		amulet9 = new Amulets(1627, "anotherpack:amulets/amulet9", "1-3 ед. чистого урона", "amulet9");
		amulet10 = new Amulets(1628, "anotherpack:amulets/amulet10",
				"30% урона от меча и косы, и 1-2 ед. чистого урона", "amulet10");
		amulet11 = new Amulets(1629, "anotherpack:amulets/amulet11", "Всё", "amulet11");

		PrivateWand = new Instruments(1630, "anotherpack:PrivateWand").setUnlocalizedName("PrivateWand")
				.setCreativeTab(CreativeTabs.tabTools);
		GameRegistry.registerItem(PrivateWand, "PrivateWand");
		PrivateInfo = new Items(1631, "PrivateInfo", "anotherpack:PrivateInfo", 1)
				.setCreativeTab(CreativeTabs.tabTools);
		red_materia = new Items(1632, "red_materia", "anotherpack:red_materia", 64);
		rune1 = new Runes(1633, "anotherpack:rune1", "rune1");

		qmark = new Items(855, "qmark", "anotherpack:qmark", 1);
		LanguageRegistry.addName(qmark, "Знак вопроса");
		rune2 = new Runes(856, "anotherpack:rune2", "rune2");
		LanguageRegistry.addName(rune2, "Руна 2 Уровня");
		rune3 = new Runes(857, "anotherpack:rune3", "rune3");
		LanguageRegistry.addName(rune3, "Руна 3 Уровня");
		rune4 = new Runes(858, "anotherpack:rune4", "rune4");
		LanguageRegistry.addName(rune4, "Руна 4 Уровня");
		rune5 = new Runes(20500, "anotherpack:rune5", "rune5");
		LanguageRegistry.addName(rune5, "Руна 5 Уровня");
		rune6 = new Runes(20501, "anotherpack:rune6", "rune6");
		LanguageRegistry.addName(rune6, "Руна 6 Уровня");
		rune7 = new Runes(20502, "anotherpack:rune7", "rune7");
		LanguageRegistry.addName(rune7, "Руна 7 Уровня");
		rune8 = new Runes(20503, "anotherpack:rune8", "rune8");
		LanguageRegistry.addName(rune8, "Руна 8 Уровня");
		rune9 = new Runes(20504, "anotherpack:rune9", "rune9");
		rune10 = new Runes(20505, "anotherpack:rune10", "rune10");

		Dye1 = new Items(20506, "Dye1", "anotherpack:dye1", 64);
		Dye2 = new Items(20507, "Dye2", "anotherpack:dye2", 64);
		Dye3 = new Items(20508, "Dye3", "anotherpack:dye3", 64);
		Dye4 = new Items(20509, "Dye4", "anotherpack:dye4", 64);
		Dye5 = new Items(20510, "Dye5", "anotherpack:dye5", 64);
		Dye6 = new Items(20511, "Dye6", "anotherpack:dye6", 64);
		Dye7 = new Items(20512, "Dye7", "anotherpack:dye7", 64);
		Dye8 = new Items(20513, "Dye8", "anotherpack:dye8", 64);
		Dye9 = new Items(624, "Dye9", "anotherpack:dye9", 64);
		Dye10 = new Items(625, "Dye10", "anotherpack:dye10", 64);
		Dye11 = new Items(626, "Dye11", "anotherpack:dye11", 64);
		Dye12 = new Items(627, "Dye12", "anotherpack:dye12", 64);
		Dye13 = new Items(628, "Dye13", "anotherpack:dye13", 64);

		Oc1 = new Items(20550, "Oc1", "anotherpack:oc1", 64);
		Oc2 = new Items(20551, "Oc2", "anotherpack:oc2", 64);
		Oc3 = new Items(20552, "Oc3", "anotherpack:oc3", 64);
		Oc4 = new Items(20553, "Oc4", "anotherpack:oc4", 64);
		Granat = new Items(20554, "Granat", "anotherpack:granat", 64);
		Tanzanit = new Items(20555, "Tanzanit", "anotherpack:tanzanit", 64);
		Topaz = new Items(20556, "Topaz", "anotherpack:topaz", 64);
		Malahit = new Items(20557, "Malahit", "anotherpack:malahit", 64);
		Akvamarin = new Items(20558, "Akvamarin", "anotherpack:akvamarin", 64);
		Amethyst = new Items(20559, "Amethyst", "anotherpack:amethyst", 64);
		Pluton_ingot = new Items(20560, "Pluton_ingot", "anotherpack:pluton_ingot", 64);
		Uran_ingot = new Items(20561, "Uran_ingot", "anotherpack:uran_ingot", 64);
		Mox_ingot = new Items(20562, "Mox_ingot", "anotherpack:mox_ingot", 64);
		Ice_ingot = new Items(20563, "Ice_ingot", "anotherpack:ice_ingot", 64);
		Dark_ingot = new Items(20564, "Dark_ingot", "anotherpack:dark_ingot", 64);
		Demonic_ingot = new Items(20565, "Demonic_ingot", "anotherpack:demonic_ingot", 64);
		Map = new Items(20566, "Map", "anotherpack:map", 64);
		Book1 = new Items(567, "Book1", "anotherpack:book1", 64);
		Book2 = new Items(568, "Book2", "anotherpack:book2", 64);
		Book3 = new Items(569, "Book3", "anotherpack:book3", 64);
		Book4 = new Items(570, "Book4", "anotherpack:book4", 64);
		Circuit1 = new Items(572, "Circuit1", "anotherpack:circuit1", 64);
		Circuit2 = new Items(573, "Circuit2", "anotherpack:circuit2", 64);
		Circuit3 = new Items(574, "Circuit3", "anotherpack:circuit3", 64);
		Holst = new Items(576, "Holst", "anotherpack:holst", 64);
		Fire_sanarium = new Items(20577, "Fire_sanarium", "anotherpack:fire_sanarium", 64);
		Demonic_ruby = new Items(20578, "Demonic_ruby", "anotherpack:demonic_ruby", 64);
		Dark_mox = new Items(20579, "Dark_mox", "anotherpack:dark_mox", 64);
		Dark_spirit = new Items(20580, "Dark_spirit", "anotherpack:dark_spirit", 64);
		Materia = new Items(583, "Materia", "anotherpack:materia", 64);

		Outline = new Items(594, "Outline", "anotherpack:outline", 64);
		Realm_quantum = new Items(595, "Realm_quantum", "anotherpack:realm_quantum", 64);
		Recipe1 = new Items(598, "Recipe1", "anotherpack:recipe1", 64);
		Recipe2 = new Items(599, "Recipe2", "anotherpack:recipe2", 64);
		Recipe3 = new Items(600, "Recipe3", "anotherpack:recipe3", 64);
		Recipe4 = new Items(601, "Recipe4", "anotherpack:recipe4", 64);
		Powder1 = new Items(602, "Powder1", "anotherpack:powder1", 64);
		Powder2 = new Items(603, "Powder2", "anotherpack:powder2", 64);
		Powder3 = new Items(20604, "Powder3", "anotherpack:powder3", 64);
		Powder4 = new Items(20605, "Powder4", "anotherpack:powder4", 64);
		Powder5 = new Items(20606, "Powder5", "anotherpack:powder5", 64);
		Powder6 = new Items(20607, "Powder6", "anotherpack:powder6", 64);
		Powder7 = new Items(20608, "Powder7", "anotherpack:powder7", 64);
		Powder8 = new Items(20609, "Powder8", "anotherpack:powder8", 64);
		Powder9 = new Items(20610, "Powder9", "anotherpack:powder9", 64);
		Powder10 = new Items(20611, "Powder10", "anotherpack:powder10", 64);
		Powder11 = new Items(20612, "Powder11", "anotherpack:powder11", 64);
		Powder12 = new Items(20613, "Powder12", "anotherpack:powder12", 64);
		Powder13 = new Items(20614, "Powder13", "anotherpack:powder13", 64);
		Powder14 = new Items(20615, "Powder14", "anotherpack:powder14", 64);
		EnderBag = new EnderBag(629, "EnderBag", "anotherpack:enderBag");
		EpicGoldApple = new EpicGoldApple(838, 4, 1.2F, false, "anotherpack:apple_golden", "EpicGoldApple");
		spinner_1 = new spinner(1606, "anotherpack:spinners/spinner_1_an", null).setCreativeTab(Main.tabAPItems)
				.setUnlocalizedName("spinner_1");
		spinner_2 = new spinner(1607, "anotherpack:spinners/spinner_2", null).setCreativeTab(Main.tabAPItems)
				.setUnlocalizedName("spinner_2");
		bullet_shell = new Items(734, "bullet_shell", "anotherpack:Scythes/bullet_shell", 64)
				.setCreativeTab(Main.tabAPWeaponAndArmor);
		bullet = new Items(1693, "bullet", "anotherpack:Scythes/item.bullet", 64)
				.setCreativeTab(Main.tabAPWeaponAndArmor);

		Scythe_1 = new Scythes(733, ScytheMat, "anotherpack:Scythes/scythe_1", "Scythe_1")
				.setCreativeTab(Main.tabAPWeaponAndArmor);
		Scythe_2 = new Scythes(732, ScytheMat, "anotherpack:Scythes/scythe_2", "Scythe_2")
				.setCreativeTab(Main.tabAPWeaponAndArmor);
		RF_Sword_1 = new RF_Swords(1432, ScytheMat, "anotherpack:Scythes/scythe_2", "RF_Sword_1");
		RF_Sword_2 = new RF_Swords(1433, ScytheMat, "anotherpack:Scythes/scythe_2", "RF_Sword_2");
		RF_Sword_3 = new RF_Swords(1434, ScytheMat, "anotherpack:Scythes/scythe_2", "RF_Sword_3");
		RF_Sword_4 = new RF_Swords(1435, ScytheMat, "anotherpack:Scythes/scythe_2", "RF_Sword_4");	

		QuantDrill = new QuantDrill(582, ImpDrillMat, "anotherpack:ImpDrill", "QuantDrill");
		ItemScythePart_a = new Items(1658, "ItemScythePart_a", "anotherpack:Scythes/item.crescent_rose_part_a", 64)
				.setCreativeTab(Main.tabAPWeaponAndArmor);
		ItemScythePart_b = new Items(1659, "ItemScythePart_b", "anotherpack:Scythes/item.crescent_rose_part_b", 64)
				.setCreativeTab(Main.tabAPWeaponAndArmor);
		ItemScythePart_c = new Items(1660, "ItemScythePart_c", "anotherpack:Scythes/item.crescent_rose_part_c", 64)
				.setCreativeTab(Main.tabAPWeaponAndArmor);
		ItemScythePart_d = new Items(1661, "ItemScythePart_d", "anotherpack:Scythes/item.crescent_rose_part_d", 64)
				.setCreativeTab(Main.tabAPWeaponAndArmor);
		ItemScythePart_e = new Items(1662, "ItemScythePart_e", "anotherpack:Scythes/item.crescent_rose_part_e", 64)
				.setCreativeTab(Main.tabAPWeaponAndArmor);
		ItemScythePart_f = new Items(1663, "ItemScythePart_f", "anotherpack:Scythes/item.crescent_rose_part_f", 64)
				.setCreativeTab(Main.tabAPWeaponAndArmor);
		ItemScytheFireDustAmmo = new Items(1664, "ItemScytheFireDustAmmo", "anotherpack:Scythes/item.fire_dust_ammo",
				64).setCreativeTab(Main.tabAPWeaponAndArmor);

		ScytheModuleWither = new Items(1690, "ScytheModuleWither", "anotherpack:Scythes/item.moduleWither", 64)
				.setCreativeTab(Main.tabAPWeaponAndArmor);
		ScytheModuleRegeneration = new Items(1691, "ScytheModuleRegeneration",
				"anotherpack:Scythes/item.fire_dust_crystals", 64).setCreativeTab(Main.tabAPWeaponAndArmor);
		quantCoreModuleScythe = new Items(1692, "quantCoreModuleScythe", "anotherpack:Scythes/quantCoreModuleScythe",
				64).setCreativeTab(Main.tabAPWeaponAndArmor);
		bdsmWhip = new tools(744, null, "bdsmWhip", "anotherpack:fan/whip", 1);
		bdsmWhip2 = new tools(597, null, "bdsmWhip2", "anotherpack:fan/whip", 1);
		chickenSword = new tools(596, null, "chickenSword", "anotherpack:fan/npcChickenSword", 1);

		BigHammer = new RainbowWeapons(745, ScytheMat, "anotherpack:weapons/BigHammer", "BigHammer");
		Rainbow_Sword = new RainbowWeapons(746, ScytheMat, "anotherpack:weapons/Rainbow_Sword", "Rainbow_Sword");
		Rainbow_Pika = new RainbowWeapons(747, ScytheMat, "anotherpack:weapons/Rainbow_Pika", "Rainbow_Pika");
		Rainbow_Heal = new RainbowWeapons(748, ScytheMat, "anotherpack:weapons/Rainbow_Heal", "Rainbow_Heal");
		Rainbow_Blaster = new RainbowWeapons(749, ScytheMat, "anotherpack:weapons/Rainbow_Gun", "Rainbow_Gun");
		Steampunk_Sword = new RainbowWeapons(877, ScytheMat, "anotherpack:weapons/Steampunk_Sword", "Steampunk_Sword");
		DrillSword = new DrillSword(720, ScytheMat, "anotherpack:weapons/DrillSword", "DrillSword");

		hardGlassPlate = new Items(575, "hardGlassPlate", "anotherpack:ncr/hardGlassPlate", 64);
		itemPhotoElement_1 = new Items(20616, "itemPhotoElement_1", "anotherpack:ncr/itemPhotoElement_1", 64);
		itemPhotoElement_2 = new Items(20617, "itemPhotoElement_2", "anotherpack:ncr/itemPhotoElement_2", 64);
		itemPhotoElement_3 = new Items(20618, "itemPhotoElement_3", "anotherpack:ncr/itemPhotoElement_3", 64);
		itemPhotoElement_4 = new Items(20619, "itemPhotoElement_4", "anotherpack:ncr/itemPhotoElement_4", 64);
		PickAxe3x3 = new ItemsPickaxe(571, EnumToolMaterial.EMERALD, "PickAxe3x3", "anotherpack:PickAxe3x3", 2000);
		WorldSensorCard = new Items(1700, "WorldSensorCard", "anotherpack:Scythes/WorldSensorCard", 64)
				.setCreativeTab(Main.tabAPWeaponAndArmor);

		sword1 = new LevelSwords(850, "anotherpack:swords/sword1", "sword1");
		LanguageRegistry.addName(sword1, "Меч Тесла");
	}

	public static void registerItemsCraft() {
	}

}
