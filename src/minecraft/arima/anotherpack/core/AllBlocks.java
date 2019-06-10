package arima.anotherpack.core;

import arima.anotherpack.blocks.BlockKislota;
import arima.anotherpack.blocks.BlockLavaFluid;
import arima.anotherpack.blocks.BlockMirrorRails;
import arima.anotherpack.blocks.BlockRadiation;
import arima.anotherpack.blocks.BlocksCloth;
import arima.anotherpack.blocks.BlocksFluid;
import arima.anotherpack.blocks.BlocksGrass;
import arima.anotherpack.blocks.BlocksLadder;
import arima.anotherpack.blocks.BlocksRails;
import arima.anotherpack.blocks.BlocksRope;
import arima.anotherpack.blocks.BlocksVine;
import arima.anotherpack.blocks.BlocksWeb;
import arima.anotherpack.blocks.FencesRock;
import arima.anotherpack.blocks.FencesWood;
import arima.anotherpack.blocks.FirstBlock;
import arima.anotherpack.blocks.Lampa;
import arima.anotherpack.blocks.basic_gif;
import arima.anotherpack.blocks.entityBlock;
import arima.anotherpack.blocks.entityBlockLightGhost;
import arima.anotherpack.blocks.hen_gif;
import arima.anotherpack.common.blocks.BlockAtlantisWater;
import arima.anotherpack.common.blocks.BlocksBox;
import arima.anotherpack.common.blocks.BlocksDoor;
import arima.anotherpack.common.blocks.BlocksLamp;
import arima.anotherpack.common.blocks.BlocksLeaves;
import arima.anotherpack.common.blocks.BlocksPortals;
import arima.anotherpack.common.blocks.BlocksTorch;
import arima.anotherpack.common.blocks.ComrsResBlocks;
import arima.anotherpack.common.blocks.IronBlocks;
import arima.anotherpack.common.blocks.OtherBlocks;
import arima.anotherpack.common.blocks.PortalBlocks;
import arima.anotherpack.common.blocks.PortalPane;
import arima.anotherpack.common.blocks.RedBeacon;
import arima.anotherpack.common.blocks.StoneBlocks;
import arima.anotherpack.common.blocks.StoneSlabs;
import arima.anotherpack.common.blocks.StoneStairs;
import arima.anotherpack.common.blocks.WoodenBlocks;
import arima.anotherpack.common.blocks.WoodenSlabs;
import arima.anotherpack.common.blocks.WoodenStairs;
import arima.anotherpack.common.blocks.ZTonesBlocks;
import arima.anotherpack.common.wu.WeaponUpdater;
import arima.anotherpack.fan.StAndrewsCross;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFluid;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;

public class AllBlocks {

	public static Block Fence_planks_oak, Fence_planks_spruce, Fence_wood_birch, Fence_wood_jungle, Fence_wood_oak,
			Fence_wood_spruce, Fence_stonebrick1, Fence_stonebrick2, Fence_stonebrick3, Lamp1, Lamp2, Lamp3, Lamp4,
			Lamp5, Lamp6, Ladder1, Ladder2, Cloth1, Cloth2, Cloth3, Rope1, Rope2, Rope3, Rope4, Rope5, Rope6, Chain1,
			Chain2, Chain3, Log_spruce, Log_jungle, Log_oak, Chain_rail, rails1, rails2, rails3, rails4, rails5, rails6,
			rails7, Rope_rail, Grid_rail, Barrel, Box1, Box2, Box3, Box4, Box5, Box6, Box7, Bookshelf, Shelf, Tnt,
			Torch_fire, Torch_ice, lampa1, lampa1_top, lampa2_top, lampa2, blacMosaicFence, whiteFence;
	public static Block entityBlock, blockRadiation;
	public static Block cloth_axe, cloth_shovel, cloth_web, cloth_bita, whiteSlab;
	public static Block grass1, grass2, grass3, grass4, Provolka, cl_fish, cl_chicken;

	public static Block vityajka, rods1, rods1_p, rods2, rods2_p, rods3, rods4;
	public static Block graffiti_01, graffiti_02, graffiti_03, graffiti_04, graffiti_05, graffiti_06;
	public static Block laza, rail_Gilzi1, rail_Gilzi2, rail_Gilzi3, rail_blaze_powder, rail_bread, rail_charcoal,
			rail_chicken_cooked, rail_axe, rail_ingot, rail_halberd, rail_leather, rail_melon, rail_paper,
			rail_break_glass, rail_paper_2, rail_gold;

	public static BlockFluid BloodWater, lava_still, kislota;

	public static Block Stairs_IronPlate1, Stairs_block_future_1, Stairs_Stone44, Stairs_Stone54, Stairs_Stone57,
			Stairs_Iron5, Stairs_Iron7, Stairs_Iron8, Stairs_Iron11, Stairs_Iron12, Stairs_Iron19, Stairs_Iron20;

	public static Block emptySlab, red_pyat, whiteStair, entityBlockLightGhost;

	public static Block StAndrewsCross_01, StAndrewsCross_02, StAndrewsCross_03, StAndrewsCross_04, StAndrewsCross_05,
			StAndrewsCross_06, graffiti_open_1, graffiti_open_2, graffiti_welcome_1, graffiti_welcome_2;

	public static Block WeaponUpdater, ColorStairWhite;
	public static Block Stair_planks_oak, Stair_planks_spruce, Stair_wood_birch, Stair_wood_jungle, Stair_wood_oak,
			Stair_wood_spruce, Stair_asphalt, Stair_cobblestone, Stair_stonebrick1, Stair_stonebrick2,
			Stair_stonebrick3, Stairs_iron33, Stairs_Kamni, Stairs_Linoleum, Stairs_Kirpich, Stairs_Keramika,
			Stairs_LinoleumDirt, Stairs_LinoleumClear, StairStoneBlock_34;
	// NEW
	public static Block IronBlock_1, IronBlock_2, IronBlock_3;
	public static Block IronSlabs_1, IronSlabs_2, IronSlabs_3, SlabStone3_1;
	public static Block IronStairs_1;
	public static Block WoodenBlock_1, WoodenBlock_2;
	public static Block StoneBlocks_1, StoneBlocks_2, StoneBlocks_3, StoneBlocks_4, StoneBlocks_5, StoneBlocks_6,
			VoidBlock, MarbleBlock_1, MarbleBlock_2, BrazeBlock, PortalBlock, ColorBlock, ComrsResBlocks_1,
			ComrsResBlocks_2, Stairs_Wood3, Stairs_Wood5, Stairs_Stone5, Stairs_Stone48;
	public static Block asuka_gif_1, asuka_gif_2, asuka_gif_3, asuka_gif_4, asuka_gif_5, asuka_gif_6,
			DarlingInFranx_gif, NyaGif_1, NyaGif_2, ZeroTwo_1, ZeroTwo_2, ZeroTwo_3, ZeroTwo_4, Yuri_meme,
			MeMeMe_Bunny_1, MeMeMe_Bunny_2, MeMeMe_Bunny_3, MeMeMe_Bunny_4, MeMeMe_Bunny_5, MeMeMe_Bunny_6, Eva_head,
			Megumin_1, Megumin_2, SakuraAndKubi, EroMangaH, AkameH, AssH;
	public static Block SakuraLeaves, BlockSakuraLog, lanterns_blue, lanterns_black, lanterns_orange, OsBricks;
	public static Block agon, aurora, azur, bitt, booster, glaxx, iszm, lave, myst, reds, sols, tank, zone, ztyl;
	public static Block ColorPortal_1, ColorPortal_2, ColorPortal_3, BlockColorPortal;

	public static Block DoorAcacia, DoorBirch, DoorDarkOak, DoorIron, DoorJungle, DoorSpruce, DoorGlass, DoorIronBars,
			DoorNetherBricks, DoorObsidian, DoorFactory, DoorJail, DoorLabaratory, DoorShoji, DoorSlidingIron,
			DoorSlidingWood, RedBeacon, AtlantisWater;

	public static void registerBlocks() {
		RedBeacon = new RedBeacon(471);
		DoorAcacia = new BlocksDoor(455, "DoorAcacia", "anotherpack:door/door_acacia", AllItems.ItemDoorAcacia);
		DoorBirch = new BlocksDoor(456, "DoorBirch", "anotherpack:door/door_birch", AllItems.ItemDoorBirch);
		DoorDarkOak = new BlocksDoor(457, "DoorDarkOak", "anotherpack:door/door_dark_oak", AllItems.ItemDoorDarkOak);
		DoorIron = new BlocksDoor(458, "DoorIron", "anotherpack:door/door_iron", AllItems.ItemDoorIron);
		DoorJungle = new BlocksDoor(459, "DorrJungle", "anotherpack:door/door_jungle", AllItems.ItemDoorJungle);
		DoorSpruce = new BlocksDoor(460, "DoorSpruce", "anotherpack:door/door_spruce", AllItems.ItemDoorSpruce);
		DoorGlass = new BlocksDoor(461, "DoorGlass", "anotherpack:door/doorGlass", AllItems.ItemDoorGlass);
		DoorIronBars = new BlocksDoor(462, "DoorIronBars", "anotherpack:door/doorIronBars", AllItems.ItemDoorIronBars);
		DoorNetherBricks = new BlocksDoor(463, "DoorNetherBricks", "anotherpack:door/doorNetherBricks",
				AllItems.ItemDoorNetherBricks);
		DoorObsidian = new BlocksDoor(464, "DoorObsidian", "anotherpack:door/doorObsidian", AllItems.ItemDoorObsidian);
		DoorFactory = new BlocksDoor(465, "DoorFactory", "anotherpack:door/factory_door", AllItems.ItemDoorFactory);
		DoorJail = new BlocksDoor(466, "DoorJail", "anotherpack:door/jail_door", AllItems.ItemDoorJail);
		DoorLabaratory = new BlocksDoor(467, "DoorLabaratory", "anotherpack:door/laboratory_door",
				AllItems.ItemDoorLabaratory);
		DoorShoji = new BlocksDoor(468, "DoorShoji", "anotherpack:door/shoji_door", AllItems.ItemDoorShoji);
		DoorSlidingIron = new BlocksDoor(469, "DoorSlidingIron", "anotherpack:door/sliding_door_iron",
				AllItems.ItemDoorSlidingIron);
		DoorSlidingWood = new BlocksDoor(470, "DoorSlidingWood", "anotherpack:door/sliding_door_wood",
				AllItems.ItemDoorSlidingWood);

		agon = new ZTonesBlocks(1301, "agon", "agon", 5);
		aurora = new ZTonesBlocks(1302, "aurora", "aurora", 1);
		azur = new ZTonesBlocks(1303, "azur", "azur", 3);
		bitt = new ZTonesBlocks(1304, "bitt", "bitt", 7);
		booster = new ZTonesBlocks(1305, "booster", "booster", 2);
		glaxx = new ZTonesBlocks(1306, "glaxx", "glaxx", 12);
		iszm = new ZTonesBlocks(1307, "iszm", "iszm", 5);
		lave = new ZTonesBlocks(1308, "lave", "lave", 3);
		myst = new ZTonesBlocks(1309, "myst", "myst", 5);
		reds = new ZTonesBlocks(1310, "reds", "reds", 1);
		sols = new ZTonesBlocks(1311, "sols", "sols", 3);
		tank = new ZTonesBlocks(1312, "tank", "tank", 4);
		zone = new ZTonesBlocks(1313, "zone", "zone", 7);
		ztyl = new ZTonesBlocks(1314, "ztyl", "ztyl", 4);

		ColorPortal_1 = new PortalPane(496, "anotherpack:portals/colorPortal_0", "ColorPortal_1");
		ColorPortal_2 = new PortalPane(497, "anotherpack:portals/colorPortal_1", "ColorPortal_2");
		ColorPortal_3 = new PortalPane(498, "anotherpack:portals/colorPortal_2", "ColorPortal_3");
		BlockColorPortal = new BlocksPortals(499, "anotherpack:portals/colorPortal", "BlockColorPortal", 3);

		lanterns_blue = new BlocksTorch(724, "lanterns_blue", "anotherpack:lampsAndOthers/lanterns_blue");
		lanterns_black = new BlocksTorch(725, "lanterns_black", "anotherpack:lampsAndOthers/lanterns_black");
		lanterns_orange = new BlocksTorch(726, "lanterns_orange", "anotherpack:lampsAndOthers/lanterns_orange");
		SakuraLeaves = new BlocksLeaves(723, "BlocksLeaves", "sakura", 1);
		IronBlock_1 = new IronBlocks(701, "IronBlock_1", "iron", 16);
		IronBlock_2 = new IronBlocks(702, "IronBlock_2", "iron2", 16);
		IronBlock_3 = new IronBlocks(703, "IronBlock_3", "iron3", 16);
		WoodenBlock_1 = new WoodenBlocks(704, "WoodenBlock_1", "wood", 16);
		WoodenBlock_2 = new WoodenBlocks(705, "WoodenBlock_2", "wood2", 16);
		StoneBlocks_1 = new StoneBlocks(706, "StoneBlocks_1", "stone", 16);
		StoneBlocks_2 = new StoneBlocks(707, "StoneBlocks_2", "stone2", 16);
		StoneBlocks_3 = new StoneBlocks(708, "StoneBlocks_3", "stone3", 16);
		StoneBlocks_4 = new StoneBlocks(709, "StoneBlocks_4", "stone4", 16);
		StoneBlocks_5 = new StoneBlocks(711, "StoneBlocks_5", "stone5", 16);
		StoneBlocks_6 = new StoneBlocks(731, "StoneBlocks_6", "stone6", 14);
		VoidBlock = new StoneBlocks(766, "VoidBlock", "Void", 6);
		MarbleBlock_1 = new StoneBlocks(767, "MarbleBlock_1", "Marble", 16);
		MarbleBlock_2 = new StoneBlocks(768, "MarbleBlock_2", "Marble2", 3);
		BrazeBlock = new StoneBlocks(769, "BrazeBlock", "Braze", 10);
		OsBricks = new StoneBlocks(727, "OsBricks", "OsBricks/brick", 16);
		PortalBlock = new PortalBlocks(756, "PortalBlock", "portal_0", 9);
		ColorBlock = new OtherBlocks(757, "ColorBlock", "colorBlock", 15);
		ComrsResBlocks_1 = new ComrsResBlocks(758, "ComrsResBlocks_1", "comrsResBlock", 9, 1);
		ComrsResBlocks_2 = new ComrsResBlocks(759, "ComrsResBlocks_2", "comrsResBlockHard", 9, 2);
		ColorStairWhite = new StoneStairs(718, "ColorStairWhite", ColorBlock, 13);
		StairStoneBlock_34 = new StoneStairs(842, "StairStoneBlock_34", StoneBlocks_3, 1);

		Stair_planks_oak = new WoodenStairs(483, "Stair_planks_oak", WoodenBlock_1, 0);
		Stair_planks_spruce = new WoodenStairs(484, "Stair_planks_spruce", WoodenBlock_1, 1);
		Stair_wood_birch = new WoodenStairs(485, "Stair_wood_birch", WoodenBlock_1, 2);
		Stair_wood_jungle = new WoodenStairs(486, "Stair_wood_jungle", WoodenBlock_1, 3);
		Stair_wood_oak = new WoodenStairs(487, "Stair_wood_oak", WoodenBlock_1, 4);
		Stair_wood_spruce = new WoodenStairs(488, "Stair_wood_spruce", WoodenBlock_1, 5);
		Stair_asphalt = new StoneStairs(489, "Stair_asphalt", StoneBlocks_1, 0);
		Stair_cobblestone = new StoneStairs(490, "Stair_cobblestone", StoneBlocks_1, 6);
		Stair_stonebrick1 = new StoneStairs(491, "Stair_stonebrick1", StoneBlocks_4, 6);
		Stair_stonebrick2 = new StoneStairs(492, "Stair_stonebrick2", StoneBlocks_4, 7);
		Stair_stonebrick3 = new StoneStairs(493, "Stair_stonebrick3", StoneBlocks_4, 10);
		Stairs_IronPlate1 = new StoneStairs(1582, "Stairs_IronPlate1", IronBlock_3, 9)
				.setCreativeTab(Main.tabAPIronBlocks);
		Stairs_block_future_1 = new StoneStairs(1583, "Stairs_block_future_1", IronBlock_3, 15)
				.setCreativeTab(Main.tabAPIronBlocks);
		Stairs_Stone44 = new StoneStairs(1584, "Stairs_Stone44", StoneBlocks_4, 2);
		Stairs_Stone54 = new StoneStairs(1585, "Stairs_Stone54", StoneBlocks_4, 11);
		Stairs_Stone57 = new StoneStairs(1586, "Stairs_Stone57", StoneBlocks_4, 14);
		Stairs_Iron5 = new StoneStairs(1587, "Stairs_Iron5", IronBlock_1, 4).setCreativeTab(Main.tabAPIronBlocks);
		Stairs_Iron7 = new StoneStairs(1588, "Stairs_Iron7", IronBlock_1, 6).setCreativeTab(Main.tabAPIronBlocks);
		Stairs_Iron8 = new StoneStairs(1589, "Stairs_Iron8", IronBlock_1, 7).setCreativeTab(Main.tabAPIronBlocks);
		Stairs_Iron11 = new StoneStairs(1590, "Stairs_Iron11", IronBlock_1, 10).setCreativeTab(Main.tabAPIronBlocks);
		Stairs_Iron12 = new StoneStairs(1591, "Stairs_Iron12", IronBlock_1, 11).setCreativeTab(Main.tabAPIronBlocks);
		Stairs_Iron19 = new StoneStairs(1592, "Stairs_Iron19", IronBlock_2, 2).setCreativeTab(Main.tabAPIronBlocks);
		Stairs_Iron20 = new StoneStairs(1593, "Stairs_Iron20", IronBlock_2, 3).setCreativeTab(Main.tabAPIronBlocks);
		Stairs_iron33 = new StoneStairs(646, "Stairs_iron33", IronBlock_3, 0).setCreativeTab(Main.tabAPIronBlocks);
		Stairs_Kamni = new StoneStairs(647, "Stairs_Kamni", StoneBlocks_6, 6);
		Stairs_Linoleum = new StoneStairs(648, "Stairs_Linoleum", WoodenBlock_2, 13)
				.setCreativeTab(Main.tabAPWoodBlocks);
		Stairs_Kirpich = new StoneStairs(649, "Stairs_Kirpich", StoneBlocks_6, 10);
		Stairs_Keramika = new StoneStairs(800, "Stairs_Keramika", StoneBlocks_6, 1);
		Stairs_LinoleumDirt = new WoodenStairs(801, "Stairs_LinoleumDirt", WoodenBlock_2, 11)
				.setCreativeTab(Main.tabAPWoodBlocks);
		Stairs_LinoleumClear = new WoodenStairs(802, "Stairs_LinoleumClear", WoodenBlock_2, 12)
				.setCreativeTab(Main.tabAPWoodBlocks);
		Stairs_Wood3 = new WoodenStairs(836, "Stairs_Wood3", WoodenBlock_1, 8).setCreativeTab(Main.tabAPWoodBlocks);
		Stairs_Wood5 = new WoodenStairs(837, "Stairs_Wood5", WoodenBlock_1, 10).setCreativeTab(Main.tabAPWoodBlocks);
		Stairs_Stone5 = new StoneStairs(872, "Stairs_Stone5", StoneBlocks_1, 13);
		Stairs_Stone48 = new StoneStairs(873, "Stairs_Stone48", StoneBlocks_1, 6);

		SlabStone3_1 = new WoodenSlabs(1352, "SlabStone3_1", "stone3_1").setCreativeTab(Main.tabAPStoneBlocks);
		whiteSlab = new WoodenSlabs(1684, "whiteSlab", "colorBlock_13").setCreativeTab(Main.tabAPStoneBlocks);
		emptySlab = new WoodenSlabs(1667, "emptySlab", "entityBlock").setCreativeTab(Main.tabAPDesignBlocks);
		entityBlockLightGhost = new entityBlockLightGhost(1668, "anotherpack:old/entityBlock", "anotherpack:old/barier",
				Material.rock);

		graffiti_01 = new basic_gif(750, "graffiti_01", "anotherpack:gif/graffiti_01");
		LanguageRegistry.addName(graffiti_01, "Me! Me! Me! 1");
		graffiti_02 = new basic_gif(751, "graffiti_02", "anotherpack:gif/graffiti_02");
		LanguageRegistry.addName(graffiti_02, "Me! Me! Me! 2");
		graffiti_03 = new basic_gif(752, "graffiti_03", "anotherpack:gif/graffiti_03");
		LanguageRegistry.addName(graffiti_03, "Me! Me! Me! 3");
		graffiti_04 = new basic_gif(753, "graffiti_04", "anotherpack:gif/graffiti_04");
		LanguageRegistry.addName(graffiti_04, "Me! Me! Me! 4");
		graffiti_05 = new basic_gif(754, "graffiti_05", "anotherpack:gif/graffiti_05");
		LanguageRegistry.addName(graffiti_05, "Me! Me! Me! 5");
		graffiti_06 = new basic_gif(755, "graffiti_06", "anotherpack:gif/graffiti_06");
		LanguageRegistry.addName(graffiti_06, "Me! Me! Me! 6");

		asuka_gif_1 = new basic_gif(735, "asuka_gif_1", "anotherpack:gif/Asuka_1");
		asuka_gif_2 = new basic_gif(736, "asuka_gif_2", "anotherpack:gif/Asuka_2");
		asuka_gif_3 = new basic_gif(737, "asuka_gif_3", "anotherpack:gif/Asuka_3");
		asuka_gif_4 = new basic_gif(738, "asuka_gif_4", "anotherpack:gif/Asuka_4");
		asuka_gif_5 = new basic_gif(739, "asuka_gif_5", "anotherpack:gif/Asuka_5");
		asuka_gif_6 = new basic_gif(740, "asuka_gif_6", "anotherpack:gif/Asuka_6");
		DarlingInFranx_gif = new basic_gif(741, "DarlingInFranx_gif", "anotherpack:gif/DiF");
		NyaGif_1 = new basic_gif(742, "NyaGif_1", "anotherpack:gif/Nya_1");
		NyaGif_2 = new basic_gif(743, "NyaGif_2", "anotherpack:gif/Nya_2");
		ZeroTwo_1 = new basic_gif(517, "ZeroTwo_1", "anotherpack:gif/002_1");
		ZeroTwo_2 = new basic_gif(518, "ZeroTwo_2", "anotherpack:gif/002_2");
		ZeroTwo_3 = new basic_gif(519, "ZeroTwo_3", "anotherpack:gif/002_3");
		ZeroTwo_4 = new basic_gif(520, "ZeroTwo_4", "anotherpack:gif/002_4");
		Yuri_meme = new basic_gif(1699, "Yuri_meme", "anotherpack:gif/Yuri_meme");
		MeMeMe_Bunny_1 = new basic_gif(712, "MeMeMe_Bunny_1", "anotherpack:gif/mememe_bunny_01");
		MeMeMe_Bunny_2 = new basic_gif(713, "MeMeMe_Bunny_2", "anotherpack:gif/mememe_bunny_02");
		MeMeMe_Bunny_3 = new basic_gif(714, "MeMeMe_Bunny_3", "anotherpack:gif/mememe_bunny_03");
		MeMeMe_Bunny_4 = new basic_gif(715, "MeMeMe_Bunny_4", "anotherpack:gif/mememe_bunny_04");
		MeMeMe_Bunny_5 = new basic_gif(716, "MeMeMe_Bunny_5", "anotherpack:gif/mememe_bunny_05");
		MeMeMe_Bunny_6 = new basic_gif(717, "MeMeMe_Bunny_6", "anotherpack:gif/mememe_bunny_06");
		Eva_head = new basic_gif(719, "Eva_head", "anotherpack:gif/Eva_head");
		Megumin_1 = new basic_gif(720, "Megumin_1", "anotherpack:gif/Megumin_1");
		Megumin_2 = new basic_gif(721, "Megumin_2", "anotherpack:gif/Megumin_2");

		SakuraAndKubi = new hen_gif(512, "SakuraAndKubi", "anotherpack:gif/h/SakuraAndKubi").setCreativeTab(null);
		EroMangaH = new hen_gif(841, "EroMangaH", "anotherpack:gif/h/eromanga_h").setCreativeTab(null);
		AkameH = new hen_gif(760, "AkameH", "anotherpack:gif/h/Akame_h").setCreativeTab(null);
		AssH = new hen_gif(761, "AssH", "anotherpack:gif/h/ass_h").setCreativeTab(null);

		graffiti_open_1 = new basic_gif(631, "graffiti_open_1", "anotherpack:animated/open_1");
		graffiti_open_2 = new basic_gif(632, "graffiti_open_2", "anotherpack:animated/open_2");
		graffiti_welcome_1 = new basic_gif(633, "graffiti_welcome_1", "anotherpack:animated/welcome_1");
		graffiti_welcome_2 = new basic_gif(634, "graffiti_welcome_2", "anotherpack:animated/welcome_2");

		blockRadiation = new BlockRadiation(730, "anotherpack:old/entityBlock", Material.rock);
		entityBlock = new entityBlock(710, "anotherpack:old/entityBlock", "anotherpack:other/Barrier-0", Material.rock);

		rails1 = new BlocksRails(840, "rail1", "anotherpack:old/ansha/design/rails1");
		rails2 = new BlocksRails(651, "rails2", "anotherpack:old/ansha/design/rails2");
		rails3 = new BlocksRails(652, "rails3", "anotherpack:old/ansha/design/rails3");
		rails4 = new BlocksRails(653, "rails4", "anotherpack:old/ansha/design/rails4");
		rails5 = new BlocksRails(654, "rails5", "anotherpack:old/ansha/design/rails5");
		rails6 = new BlocksRails(655, "rails6", "anotherpack:old/ansha/design/rails6");
		rails7 = new BlocksRails(656, "rails7", "anotherpack:old/ansha/design/rails7");
		vityajka = new FirstBlock(658, "anotherpack:old/ansha/design/vityajka", Material.rock, "vityajka");
		grass1 = new BlocksGrass(659, "anotherpack:old/ansha/design/dead_plant1", "dead_plant1");
		grass2 = new BlocksGrass(660, "anotherpack:old/ansha/design/dead_plant2", "dead_plant2");
		grass3 = new BlocksGrass(661, "anotherpack:old/ansha/design/dead_plant3", "dead_plant3");
		grass4 = new BlocksGrass(662, "anotherpack:old/ansha/design/dead_plant4", "dead_plant4");

		whiteFence = new FencesWood(1436, "whiteFence", "anotherpack:other/colorBlock_13").setCreativeTab(Main.tabAPStoneBlocks);
		blacMosaicFence = new FencesWood(1437, "blacMosaicFence", "anotherpack:stone/stone3_1").setCreativeTab(Main.tabAPStoneBlocks);
		
		Fence_planks_oak = new FencesWood(505, "Fence_planks_oak", "anotherpack:old/wood/planks_oak");
		Fence_planks_spruce = new FencesWood(506, "Fence_planks_spruce", "anotherpack:old/wood/planks_spruce");
		Fence_wood_birch = new FencesWood(507, "Fence_wood_birch", "anotherpack:old/wood/wood_birch");
		Fence_wood_jungle = new FencesWood(508, "Fence_wood_jungle", "anotherpack:old/wood/wood_jungle");
		Fence_wood_oak = new FencesWood(509, "Fence_wood_oak", "anotherpack:old/wood/wood_oak");
		Fence_wood_spruce = new FencesWood(510, "Fence_wood_spruce", "anotherpack:old/wood/wood_spruce");
		Fence_stonebrick1 = new FencesRock(513, "Fence_stonebrick1", "anotherpack:stone/stone_13");
		Fence_stonebrick2 = new FencesRock(514, "Fence_stonebrick2", "anotherpack:stone/stone_6");
		Fence_stonebrick3 = new FencesRock(515, "Fence_stonebrick3", "anotherpack:stone/stone_8");
		Lamp1 = new BlocksLamp(516, "Lamp1", "anotherpack:lampsAndOthers/lamp", 6);
		Ladder1 = new BlocksLadder(521, "Ladder1", "anotherpack:old/ladder/ladder1").setUnlocalizedName("ladder1");
		Ladder2 = new BlocksLadder(522, "Ladder2", "anotherpack:old/ladder/ladder2").setUnlocalizedName("ladder2");
		Cloth1 = new BlocksCloth(523, "Cloth1", "anotherpack:old/cloth/cloth1");
		Cloth2 = new BlocksCloth(524, "Cloth2", "anotherpack:old/cloth/cloth2");
		Cloth3 = new BlocksCloth(525, "Cloth3", "anotherpack:old/cloth/cloth3");
		Rope1 = new BlocksRope(526, "Rope1", "anotherpack:old/rope/rope1");
		Rope2 = new BlocksRope(527, "Rope2", "anotherpack:old/rope/rope2");
		Rope3 = new BlocksRope(528, "Rope3", "anotherpack:old/rope/rope3");
		Chain1 = new BlocksRope(529, "Chain1", "anotherpack:old/rope/chain1");
		Chain2 = new BlocksRope(530, "Chain2", "anotherpack:old/rope/chain2");
		Chain3 = new BlocksRope(531, "Chain3", "anotherpack:old/rope/chain3");
		Rope_rail = new BlocksRails(532, "Rope_rail", "anotherpack:old/rope/rope1");
		Chain_rail = new BlocksRails(533, "Chain_rail", "anotherpack:old/rope/chain1");
		Grid_rail = new BlocksRails(534, "Grid_rail", "anotherpack:old/rope/grid");
		Barrel = new BlocksBox(535, "Barrel", "anotherpack:old/box/barrel");
		Box1 = new BlocksBox(536, "Box1", "anotherpack:old/box/box1");
		Box2 = new BlocksBox(537, "Box2", "anotherpack:old/box/box2");
		Box3 = new BlocksBox(538, "Box3", "anotherpack:old/box/box3");
		Box4 = new BlocksBox(539, "Box4", "anotherpack:old/box/box4");
		Box5 = new BlocksBox(540, "Box5", "anotherpack:old/box/box5");
		Box6 = new BlocksBox(541, "Box6", "anotherpack:old/box/box6");
		Box7 = new BlocksBox(542, "Box7", "anotherpack:old/box/box7");
		Bookshelf = new BlocksBox(543, "Bookshelf", "anotherpack:old/box/bookshelf");
		Shelf = new BlocksBox(544, "Shelf", "anotherpack:old/box/shelf");
		Tnt = new BlocksBox(545, "Tnt", "anotherpack:old/box/tnt");
		Torch_fire = new BlocksTorch(546, "Torch_fire", "anotherpack:old/torch/torch_fire");
		Torch_ice = new BlocksTorch(547, "Torch_ice", "anotherpack:old/torch/torch_ice");

		rods1 = new BlockPane(810, "anotherpack:old/ansha/design/rods1", "anotherpack:old/entityBlock", Material.glass,
				false).setStepSound(Block.soundMetalFootstep).setHardness(3.0F).setCreativeTab(Main.tabAPDesignBlocks)
						.setUnlocalizedName("rods1");
		GameRegistry.registerBlock(rods1, "rods1");
		LanguageRegistry.addName(rods1, "Прутья 1");
		rods1_p = new BlockPane(811, "anotherpack:old/ansha/design/rods1_p", "anotherpack:old/entityBlock",
				Material.glass, false).setStepSound(Block.soundMetalFootstep).setHardness(3.0F)
						.setCreativeTab(Main.tabAPDesignBlocks).setUnlocalizedName("rods1_p");
		GameRegistry.registerBlock(rods1_p, "rods1_p");
		LanguageRegistry.addName(rods1_p, "Перевернутые прутья 1");
		rods2 = new BlockPane(812, "anotherpack:old/ansha/design/rods2", "anotherpack:old/entityBlock", Material.glass,
				false).setStepSound(Block.soundMetalFootstep).setHardness(3.0F).setCreativeTab(Main.tabAPDesignBlocks)
						.setUnlocalizedName("rods2");
		GameRegistry.registerBlock(rods2, "rods2");
		LanguageRegistry.addName(rods2, "Прутья 2");
		rods2_p = new BlockPane(813, "anotherpack:old/ansha/design/rods2_p", "anotherpack:old/entityBlock",
				Material.glass, false).setStepSound(Block.soundMetalFootstep).setHardness(3.0F)
						.setCreativeTab(Main.tabAPDesignBlocks).setUnlocalizedName("rods2_p");
		GameRegistry.registerBlock(rods2_p, "rods2_p");
		LanguageRegistry.addName(rods2_p, "Перевернутые прутья 2");
		rods3 = new BlockPane(814, "anotherpack:old/ansha/design/rods3", "anotherpack:old/entityBlock", Material.glass,
				false).setStepSound(Block.soundMetalFootstep).setHardness(3.0F).setCreativeTab(Main.tabAPDesignBlocks)
						.setUnlocalizedName("rods3");
		GameRegistry.registerBlock(rods3, "rods3");
		LanguageRegistry.addName(rods3, "Прутья 3");
		rods4 = new BlockPane(815, "anotherpack:old/ansha/design/rods4", "anotherpack:old/entityBlock", Material.glass,
				false).setStepSound(Block.soundMetalFootstep).setHardness(3.0F).setCreativeTab(Main.tabAPDesignBlocks)
						.setUnlocalizedName("rods4");
		GameRegistry.registerBlock(rods4, "rods4");
		LanguageRegistry.addName(rods4, "Прутья 4");
		cl_fish = new BlocksCloth(816, "cl_fish", "anotherpack:old/ansha/design/cl_fish");
		cl_chicken = new BlocksCloth(817, "cl_chicken", "anotherpack:old/ansha/design/cl_chicken");
		Provolka = new BlocksWeb(818, "anotherpack:old/ansha/design/wire").setCreativeTab(Main.tabAPDesignBlocks)
				.setUnlocalizedName("Provolka");
		GameRegistry.registerBlock(Provolka, "Provolka");
		Rope4 = new BlocksRope(819, "Rope4", "anotherpack:old/ansha/design/rope4");
		Rope5 = new BlocksRope(820, "Rope5", "anotherpack:old/ansha/design/rope5");
		Rope6 = new BlocksRope(821, "Rope6", "anotherpack:old/ansha/design/rope6");
		lava_still = (BlockFluid) new BlockLavaFluid(822, "anotherpack:old/custom_lava_still", Material.lava,
				"anotherpack:old/custom_lava_flowing").setUnlocalizedName("lava_still");
		GameRegistry.registerBlock(lava_still, "lava_still");
		kislota = (BlockFluid) new BlockKislota(1429, "anotherpack:old/kislota_still", Material.lava,
				"anotherpack:old/kislota_flow").setUnlocalizedName("kislota");
		GameRegistry.registerBlock(kislota, "kislota");
		laza = new BlocksVine(1430, "anotherpack:old/ansha/design/laza").setCreativeTab(Main.tabAPDesignBlocks)
				.setHardness(1.0F).setResistance(1.0F).setUnlocalizedName("laza");
		GameRegistry.registerBlock(laza, "laza");
		AtlantisWater = new BlockAtlantisWater(765, Material.water, "AtlantisWater",
				"anotherpack:old/atlantis_water_still", "anotherpack:old/atlantis_water_flow");

		cloth_axe = new BlocksCloth(843, "cloth_axe", "anotherpack:old/cloth/cloth_axe");
		cloth_bita = new BlocksCloth(844, "cloth_bita", "anotherpack:old/cloth/cloth_bita");
		cloth_shovel = new BlocksCloth(845, "cloth_shovel", "anotherpack:old/cloth/cloth_shovel");
		cloth_web = new BlocksCloth(846, "cloth_web", "anotherpack:old/cloth/cloth_web");
		rail_axe = new BlockMirrorRails(847, "rail_axe", "anotherpack:old/ansha/rails/rail_axe");
		rail_blaze_powder = new BlockMirrorRails(848, "rail_blaze_powder",
				"anotherpack:old/ansha/rails/rail_blaze_powder");
		rail_bread = new BlockMirrorRails(849, "rail_bread", "anotherpack:old/ansha/rails/rail_bread");
		rail_break_glass = new BlockMirrorRails(860, "rail_break_glass",
				"anotherpack:old/ansha/rails/rail_break_glass");
		rail_charcoal = new BlockMirrorRails(861, "rail_charcoal", "anotherpack:old/ansha/rails/rail_charcoal");
		rail_chicken_cooked = new BlockMirrorRails(862, "rail_chicken_cooked",
				"anotherpack:old/ansha/rails/rail_chicken_cooked");
		rail_Gilzi1 = new BlockMirrorRails(863, "rail_Gilzi1", "anotherpack:old/ansha/rails/rail_Gilzi1");
		rail_Gilzi2 = new BlockMirrorRails(864, "rail_Gilzi2", "anotherpack:old/ansha/rails/rail_Gilzi2");
		rail_Gilzi3 = new BlockMirrorRails(865, "rail_Gilzi3", "anotherpack:old/ansha/rails/rail_Gilzi3");
		rail_gold = new BlockMirrorRails(866, "rail_gold", "anotherpack:old/ansha/rails/rail_gold");
		rail_halberd = new BlockMirrorRails(867, "rail_halberd", "anotherpack:old/ansha/rails/rail_halberd");
		rail_leather = new BlockMirrorRails(868, "rail_leather", "anotherpack:old/ansha/rails/rail_leather");
		rail_melon = new BlockMirrorRails(869, "rail_melon", "anotherpack:old/ansha/rails/rail_melon");
		rail_paper = new BlockMirrorRails(870, "rail_paper", "anotherpack:old/ansha/rails/rail_paper");
		rail_paper_2 = new BlockMirrorRails(871, "rail_paper_2", "anotherpack:old/ansha/rails/rail_paper_2");
		lampa1 = new Lampa(876, "lampa1", "anotherpack:old/torch/lampa_on");
		GameRegistry.registerBlock(lampa1, "lampa1");
		lampa2 = new Lampa(877, "lampa2", "anotherpack:old/torch/lampa_off").setLightValue(0.8F);
		GameRegistry.registerBlock(lampa2, "lampa2");
		lampa1_top = new BlockPane(878, "anotherpack:old/torch/lampa_on2", "anotherpack:old/entityBlock",
				Material.glass, false).setCreativeTab(Main.tabAPDesignBlocks).setHardness(1.0F)
						.setUnlocalizedName("lampa1_top").setLightValue(1.0F);
		GameRegistry.registerBlock(lampa1_top, "lampa1_top");
		lampa2_top = new BlockPane(879, "anotherpack:old/torch/lampa_off2", "anotherpack:old/entityBlock",
				Material.glass, false).setCreativeTab(Main.tabAPDesignBlocks).setHardness(1.0F)
						.setUnlocalizedName("lampa2_top").setLightValue(0.8F);
		GameRegistry.registerBlock(lampa2_top, "lampa2_top");
		BloodWater = (BlockFluid) new BlocksFluid(1431, "anotherpack:old/bloodwater", Material.water,
				"anotherpack:old/bloodwater_flow").setUnlocalizedName("BloodWater");
		GameRegistry.registerBlock(BloodWater, "BloodWater");

		WeaponUpdater = new WeaponUpdater(1701, "WeaponUpdater", "anotherpack:WeaponUpdater/WeaponUpdater");

		StAndrewsCross_01 = new StAndrewsCross(1693, "StAndrewsCross_01", "anotherpack:fan/StAndrewsCross_0");
		StAndrewsCross_02 = new StAndrewsCross(1694, "StAndrewsCross_02", "anotherpack:fan/StAndrewsCross_1");
		StAndrewsCross_03 = new StAndrewsCross(1695, "StAndrewsCross_03", "anotherpack:fan/StAndrewsCross_2");
		StAndrewsCross_04 = new StAndrewsCross(1696, "StAndrewsCross_04", "anotherpack:fan/StAndrewsCross_3");
		StAndrewsCross_05 = new StAndrewsCross(1697, "StAndrewsCross_05", "anotherpack:fan/StAndrewsCross_4");
		StAndrewsCross_06 = new StAndrewsCross(1698, "StAndrewsCross_06", "anotherpack:fan/StAndrewsCross_5");
	}
}
