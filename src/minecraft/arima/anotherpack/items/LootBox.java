package arima.anotherpack.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.google.common.collect.Lists;
import com.google.common.eventbus.Subscribe;

import arima.anotherpack.core.AllBlocks;
import arima.anotherpack.core.AllItems;
import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;

public class LootBox extends Item {

	final Random random = new Random();
	private String texture;
	private String BoxName;

	private int[] boxInstr50proc = { 270, 274, 257, 285, 278 };
	private int[] boxInstr30proc = { 30235, 30234, 30478, 30233, 30479, 30482 };

	private int[] boxArmor40proc = { 298, 299, 300, 301, 302, 303, 304, 305 };
	private int[] boxArmor30proc = { 310, 311, 312, 313 };
	private int[] boxArmor20proc = { 30175, 30176, 30177, 30178 };
	private int[] boxArmor9proc = { 30171, 30172, 30173, 30174 };

	private int[] boxMech20proc = { 2790, 20872, 194 };

	private int[] boxСoins9proc = { 26976, 26977, 26978 };

	private int[] boxRes75proc = { 3, 263 };
	private int[] boxRes25proc = { 224, 152, 22, 41, 42, 57, 30188 };

	private int[] boxComp40proc = { 20786, 20787, 20864, 20863, 20868, 20860, 20866 };
	private int[] boxComp30proc = { 20817, 20819, 20820 };
	private int[] boxComp20proc = { 20811, 20812, 20815, 20814, 20813 };

	private int[] boxCharge40proc = { 72, 70, 148, 147 };

	private int[] boxCNPCs40proc = { 26957, 26959, 26961, 26962 };
	private int[] boxCNPCs30proc = { 26969, 26964, 26967 };
	private int[] boxCNPCs20proc = { 27011, 27012, 27021, 27022, 27031, 27032 };
	private int[] boxCNPCs10proc = { 27038, 27039, 27051, 27052, 27054, 27101, 27102 };

	private int[] boxGif40proc = { 631, 632, 633, 634 };
	private int[] boxGif30proc = { 741, 742, 743, 721, 720 };
	private int[] boxGif20proc = { 517, 518, 519, 520, 1699 };
	private int[] boxGif9proc = { 750, 751, 752, 753, 754, 755, 712, 713, 714, 715, 716, 717 };
	private int[] boxGif1proc = { 735, 736, 737, 738, 739, 740, 719 };

	private int[] boxRainbow = { 1001, 1002, 1003, 1004, 1005 };

	private int[] boxCases = { 1928, 1929, 1930, 1931, 1932, 1933, 1934, 1935, 1936, 1937 };

	private int[] boxVote0_5proc = { 1001, 1002, 1003, 1004, 1005 };
	private int[] boxVote1_5proc = { 989, 988 }; // eshe 2790:3, 194:2, 30473
	private int[] boxVote5proc = { 30174, 30173, 30172, 30171, 1946, 1947, 1948, 30477 }; // ku4a drugih
	private int[] boxVote22proc = { 30178, 30177, 30176, 30175, 30483, 838, 30478, 30479, 1929, 1933, 1936, 1934, 1928,
			1932, 20786, 20787, 20810, 20812, 20813, 20872, 20873, 20874, 20875, 194 };
	private int[] boxVote31proc = { 27901, 2790, 30482, 30233, 30234, 27902 };
	private int[] boxVote40proc = { 331, 30247, 266, 30256, 30150, 265, 30248, 264, 1889, 1112, 1113, 1114 };

	public LootBox(int i, String name, String texture) {
		super(i);
		this.canRepair = false;
		this.BoxName = name;
		this.setUnlocalizedName(name);
		this.texture = texture;
		this.setCreativeTab(Main.tabAPItems);
		maxStackSize = 64;
		this.setMaxDamage(1);
		GameRegistry.registerItem(this, name);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(this.texture);
	}

	
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player1) {
		//try {
		int rand = random.nextInt(100 + 1);
		int rand2 = random.nextInt(100 + 1);
		// player1.addChatMessage("" + rand);

		if (!world.isRemote) {
			if (this.BoxName!="BoxGif") {
			if (this.BoxName == "BoxVote") {

				if (rand <= 40) {
					int r1 = random.nextInt(12);
					if (r1 == 0)
						player1.inventory.addItemStackToInventory(new ItemStack(351, 64, 4));
					else if (r1 > 0 && r1 < 5)
						player1.inventory.addItemStackToInventory(new ItemStack(boxVote40proc[r1], 64, 0));
					else if (r1 == 5)
						player1.inventory.addItemStackToInventory(new ItemStack(30150, 16, 0));
					else if (r1 > 5 && r1 < 8)
						player1.inventory.addItemStackToInventory(new ItemStack(boxVote40proc[r1], 64, 0));
					else if (r1 == 8)
						player1.inventory.addItemStackToInventory(new ItemStack(264, 16, 0));
					else if (r1 > 8 && r1 < 12)
						player1.inventory.addItemStackToInventory(new ItemStack(boxVote40proc[r1], 1, 0));
				}

				if (rand > 40 && rand <= 71) {
					int r1 = random.nextInt(boxVote31proc.length);
					player1.inventory.addItemStackToInventory(new ItemStack(boxVote31proc[r1], 1, 0));
				}

				if (rand > 71 && rand <= 93) {
					int r1 = random.nextInt(boxVote22proc.length);
					player1.inventory.addItemStackToInventory(new ItemStack(boxVote22proc[r1], 1, 0));
				}

				if (rand > 93 && rand <= 98) {
					int r1 = random.nextInt(12);
					if (r1 < 8)
						player1.inventory.addItemStackToInventory(new ItemStack(boxVote5proc[r1], 1, 0));
					else {
						int r2 = random.nextInt(4 + 1);
						switch (r2) {
						case 1:
							player1.inventory.addItemStackToInventory(new ItemStack(194, 1, 1));
							break;
						case 2:
							player1.inventory.addItemStackToInventory(new ItemStack(2790, 1, 2));
							break;
						case 3:
							player1.inventory.addItemStackToInventory(new ItemStack(3099, 1, 3));
							break;
						case 4:
							player1.inventory.addItemStackToInventory(new ItemStack(30475, 1, 3));
							break;
						}
					}
					player1.addChatMessage("§bВы получили §eредкий§b предмет!");
					player1.worldObj.playSoundAtEntity(player1, "anotherpack:Box_Leg_Open", 3.0F, 1.0F);
				}

				if (rand > 98) {
					int r5 = random.nextInt(4+1);
					if (r5 != 4) {
						int r2 = random.nextInt(3);
						if (r2 == 0)
							player1.inventory.addItemStackToInventory(new ItemStack(boxVote1_5proc[r2], 1, 0));
						else if (r2 == 1)
							player1.inventory.addItemStackToInventory(new ItemStack(2790, 1, 3));
						else if (r2 == 2)
							player1.inventory.addItemStackToInventory(new ItemStack(194, 1, 2));

						player1.addChatMessage("§bВы получили §eредчайший§b предмет!");
						player1.worldObj.playSoundAtEntity(player1, "anotherpack:Box_Leg_Open", 3.0F, 1.0F);
					} else {
						int r1 = random.nextInt(7);
						player1.inventory.addItemStackToInventory(new ItemStack(boxVote0_5proc[r1], 1, 0));
						player1.addChatMessage("§bВы получили §eлегендарный§b предмет!");
						player1.worldObj.playSoundAtEntity(player1, "anotherpack:Box_Leg_Open", 3.0F, 1.0F);
					}
				}

			}

			if (this.BoxName == "BoxInstr") {
				if (rand <= 50) {
					int r1 = random.nextInt(4);
					player1.inventory.addItemStackToInventory(new ItemStack(boxInstr50proc[r1], 1, 0));
				}
				if (rand > 50 && rand <= 80) {
					int r2 = random.nextInt(6);
					player1.inventory.addItemStackToInventory(new ItemStack(boxInstr30proc[r2], 1, 0));
				}

				if (rand > 80) {
					player1.inventory.addItemStackToInventory(new ItemStack(30478, 1, 0));
					player1.addChatMessage("§bВы получили §eредкий§b предмет!");
					player1.worldObj.playSoundAtEntity(player1, "anotherpack:Box_Leg_Open", 3.0F, 1.0F);
				}

			}

			if (this.BoxName == "BoxCases") {
				int r3 = random.nextInt(10);
				player1.inventory.addItemStackToInventory(new ItemStack(boxCases[r3], 1, 0));
			}

			if (this.BoxName == "BoxRainbowWeapon") {
				int r3 = random.nextInt(5);
				player1.inventory.addItemStackToInventory(new ItemStack(boxRainbow[r3], 1, 0));
			}

			if (this.BoxName == "BoxArmor") {
				if (rand <= 40) {
					int r3 = random.nextInt(8);
					player1.inventory.addItemStackToInventory(new ItemStack(boxArmor40proc[r3], 1, 0));
				}

				if (rand > 40 && rand <= 70) {
					int r3 = random.nextInt(4);
					player1.inventory.addItemStackToInventory(new ItemStack(boxArmor30proc[r3], 1, 0));
				}

				if (rand > 70 && rand <= 90) {
					int r3 = random.nextInt(4);
					player1.inventory.addItemStackToInventory(new ItemStack(boxArmor20proc[r3], 1, 0));
				}

				if (rand > 90 && rand <= 99) {
					int r4 = random.nextInt(4);
					player1.inventory.addItemStackToInventory(new ItemStack(boxArmor9proc[r4], 1, 0));
				}

				if (rand > 99) {
					player1.inventory.addItemStackToInventory(new ItemStack(30473, 1, 0));
					player1.addChatMessage("§bВы получили §eредкий§b предмет!");
					MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(),
							"say &aИгрок §c" + player1.username + "§a получил из кейса - "
									+ "§5Гравитационный Нагрудник");
					player1.worldObj.playSoundAtEntity(player1, "anotherpack:Box_Leg_Open", 3.0F, 1.0F);
				}
			}

			if (this.BoxName == "BoxMechanism") {
				if (rand <= 50) {
					int r1 = random.nextInt(2);
					if (r1 == 0)
						player1.inventory.addItemStackToInventory(new ItemStack(250, random.nextInt(11) + 1, 0));
					else
						player1.inventory.addItemStackToInventory(new ItemStack(246, 1, 3));
				}

				if (rand > 50 && rand <= 70) {
					int r3 = random.nextInt(3);
					player1.inventory.addItemStackToInventory(new ItemStack(boxMech20proc[r3], 1, 0));
				}

				if (rand > 70 && rand <= 85) {
					player1.inventory.addItemStackToInventory(new ItemStack(194, 1, 1));
				}

				if (rand > 85 && rand <= 95) {
					int r3 = random.nextInt(4);
					if (r3 == 0)
						player1.inventory.addItemStackToInventory(new ItemStack(2790, 1, 1));
					else if (r3 == 1)
						player1.inventory.addItemStackToInventory(new ItemStack(20873, 1, 0));
					else if (r3 == 2)
						player1.inventory.addItemStackToInventory(new ItemStack(20874, 1, 0));
					else if (r3 == 3)
						player1.inventory.addItemStackToInventory(new ItemStack(20875, 1, 0));
				}

				if (rand > 95) {
					int r3 = random.nextInt(3);
					if (r3 == 0) {
						player1.inventory.addItemStackToInventory(new ItemStack(2790, 1, 2));
						MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(),
								"say &aИгрок §c" + player1.username + "§a получил из кейса - " + "§52790:2");
					} else if (r3 == 1) {
						player1.inventory.addItemStackToInventory(new ItemStack(20873, 1, 3));
						MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(),
								"say &aИгрок §c" + player1.username + "§a получил из кейса - " + "§520873:3");
					} else if (r3 == 2) {
						player1.inventory.addItemStackToInventory(new ItemStack(194, 1, 2));
						MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(),
								"say &aИгрок §c" + player1.username + "§a получил из кейса - " + "§5194:2");
					}
					player1.addChatMessage("§bВы получили §eредкий§b предмет!");
					player1.worldObj.playSoundAtEntity(player1, "anotherpack:Box_Leg_Open", 3.0F, 1.0F);
				}
			}

			if (this.BoxName == "BoxCoins") {
				if (rand <= 40) {
					player1.inventory.addItemStackToInventory(new ItemStack(26973, 1, 0));
				}

				if (rand > 40 && rand <= 70) {
					player1.inventory.addItemStackToInventory(new ItemStack(26974, 1, 0));
				}

				if (rand > 70 && rand <= 90) {
					player1.inventory.addItemStackToInventory(new ItemStack(26975, 1, 0));
				}

				if (rand > 90 && rand <= 99) {
					int r1 = random.nextInt(3);
					player1.inventory.addItemStackToInventory(new ItemStack(boxСoins9proc[r1], 1, 0));
				}

				if (rand > 99) {
					player1.inventory.addItemStackToInventory(new ItemStack(26979, 1, 0));
					MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(),
							"say &aИгрок §c" + player1.username + "§a получил из кейса - " + "§5Эмеральдовую монету");
					player1.addChatMessage("§bВы получили §eредкий§b предмет!");
					player1.worldObj.playSoundAtEntity(player1, "anotherpack:Box_Leg_Open", 3.0F, 1.0F);
				}
			}

			if (this.BoxName == "BoxRes") {
				if (rand <= 75) {
					int r1 = random.nextInt(2);
					player1.inventory.addItemStackToInventory(new ItemStack(boxRes75proc[r1], 64, 0));
				}

				if (rand > 75) {
					int r1 = random.nextInt(8);
					player1.inventory.addItemStackToInventory(new ItemStack(boxRes25proc[r1], 64, 0));
				}
			}

			if (this.BoxName == "BoxComponent") {
				if (rand <= 40) {
					int r3 = random.nextInt(7);
					player1.inventory.addItemStackToInventory(new ItemStack(boxComp40proc[r3], 8, 0));
				}

				if (rand > 40 && rand <= 70) {
					int r3 = random.nextInt(3);
					player1.inventory.addItemStackToInventory(new ItemStack(boxComp30proc[r3], 4, 0));
				}

				if (rand > 70 && rand <= 90) {
					int r4 = random.nextInt(5);
					player1.inventory.addItemStackToInventory(new ItemStack(boxComp20proc[r4], 4, 0));
				}

				if (rand > 90) {
					player1.inventory.addItemStackToInventory(new ItemStack(20818, 4, 0));
					MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(),
							"say &aИгрок §c" + player1.username + "§a получил из кейса - "
									+ "§5Компонент высшего класса");
					player1.addChatMessage("§bВы получили §eредкий§b предмет!");
					player1.worldObj.playSoundAtEntity(player1, "anotherpack:Box_Leg_Open", 3.0F, 1.0F);
				}
			}

			if (this.BoxName == "BoxCharge") {
				if (rand <= 40) {
					int r3 = random.nextInt(4);
					player1.inventory.addItemStackToInventory(new ItemStack(boxCharge40proc[r3], 64, 0));
				}

				if (rand > 40 && rand <= 70) {
					int r3 = random.nextInt(2);
					if (r3 == 0)
						player1.inventory.addItemStackToInventory(new ItemStack(30125, 16, 0));
					else
						player1.inventory.addItemStackToInventory(new ItemStack(3099, 1, 0));
				}

				if (rand > 70 && rand <= 90) {
					player1.inventory.addItemStackToInventory(new ItemStack(3099, 1, 1));
				}

				if (rand > 90) {
					int r3 = random.nextInt(2);
					if (r3 == 0)
						player1.inventory.addItemStackToInventory(new ItemStack(3099, 1, 2));
					else
						player1.inventory.addItemStackToInventory(new ItemStack(3099, 1, 3));
					MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(),
							"say &aИгрок §c" + player1.username + "§a получил из кейса - "
									+ "§5Зарядка высшего класса");
					player1.addChatMessage("§bВы получили §eредкий§b предмет!");
					player1.worldObj.playSoundAtEntity(player1, "anotherpack:Box_Leg_Open", 3.0F, 1.0F);
				}
			}

			if (this.BoxName == "BoxCNPCs") {
				if (rand <= 40) {
					int r3 = random.nextInt(4);
					player1.inventory.addItemStackToInventory(new ItemStack(boxCNPCs40proc[r3], 1, 0));
				}

				if (rand > 40 && rand <= 70) {
					int r3 = random.nextInt(3);
					player1.inventory.addItemStackToInventory(new ItemStack(boxCNPCs30proc[r3], 1, 0));
				}

				if (rand > 70 && rand <= 90) {
					int r4 = random.nextInt(6);
					player1.inventory.addItemStackToInventory(new ItemStack(boxCNPCs20proc[r4], 1, 0));
				}

				if (rand > 90) {
					int r4 = random.nextInt(7);
					player1.inventory.addItemStackToInventory(new ItemStack(boxCNPCs10proc[r4], 1, 0));
					MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(),
							"say &aИгрок §c" + player1.username + "§a получил из кейса - " + "§5Высшее Оружие");
					player1.addChatMessage("§bВы получили §eредкий§b предмет!");
					player1.worldObj.playSoundAtEntity(player1, "anotherpack:Box_Leg_Open", 3.0F, 1.0F);
				}
			}
			
			player1.worldObj.playSoundAtEntity(player1, "random.levelup", 1.0F, 1.0F);
			itemStack.damageItem(2, player1);
			}
			else {

			if (player1.capabilities.isCreativeMode || player1.inventory.hasItem(AllItems.KeyForGifCase.itemID)) {
			if (this.BoxName == "BoxGif") {
				if (rand <= 40) {
					int r3 = random.nextInt(4);
					player1.inventory.addItemStackToInventory(new ItemStack(boxGif40proc[r3], 1, 0));
				}

				if (rand > 40 && rand <= 70) {
					int r3 = random.nextInt(5);
					player1.inventory.addItemStackToInventory(new ItemStack(boxGif30proc[r3], 1, 0));
				}

				if (rand > 70 && rand <= 90) {
					int r4 = random.nextInt(5);
					player1.inventory.addItemStackToInventory(new ItemStack(boxGif20proc[r4], 1, 0));
				}

				if (rand > 90 && rand <= 99) {
					int r4 = random.nextInt(12);
					player1.inventory.addItemStackToInventory(new ItemStack(boxGif9proc[r4], 1, 0));
					player1.addChatMessage("§bВы получили §eредкий§b предмет!");
					player1.worldObj.playSoundAtEntity(player1, "anotherpack:Box_Leg_Open", 3.0F, 1.0F);
				}

				if (rand > 99) {
					int r4 = random.nextInt(7);
					player1.inventory.addItemStackToInventory(new ItemStack(boxGif1proc[r4], 1, 0));
					player1.addChatMessage("§bВы получили §eлегендарный§b предмет!");
					player1.worldObj.playSoundAtEntity(player1, "anotherpack:Box_Leg_Open", 3.0F, 1.0F);
					
				}
				if (!player1.capabilities.isCreativeMode) {
					player1.inventory.consumeInventoryItem(AllItems.KeyForGifCase.itemID);
				}
				player1.worldObj.playSoundAtEntity(player1, "random.levelup", 1.0F, 1.0F);
				itemStack.damageItem(2, player1);
			}
			}  
			else if (!player1.inventory.hasItem(AllItems.KeyForGifCase.itemID)) {
				player1.addChatMessage("§bДля открытия вам нужен специальный §eключ§b!");
			}
		}
			//player1.addChatMessage(""+rand);
		}
		return itemStack;
	}

	private int[] boxVote22proc1 = { 30178, 30177, 30176, 30175, 30483, 838, 30478, 30479 };
	private int[] boxVote22proc2 = { 1929, 1933, 1936, 1934, 1928, 1932, 20786, 20787 };
	private int[] boxVote22proc3 = { 20810, 20812, 20813, 20872, 20873, 20874, 20875, 194 };

	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("§eНажмите ПКМ для открытия");
		if (this.BoxName == "BoxGif") {
			par3List.add("§bДля открытия нужен ключ!");
			par3List.add("§bШанс дропа " + Arrays.toString(boxGif40proc) + " - §a40%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxGif30proc) + " - §a30%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxGif20proc) + " - §a20%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxGif9proc) + " - §a9%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxGif1proc) + " - §a1%");
		}

		if (this.BoxName == "BoxVote") {
			par3List.add("§bШанс дропа " + Arrays.toString(boxVote40proc) + " - §a40%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxVote31proc) + " - §a31%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxVote22proc1) + " - §a22%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxVote22proc2) + " - §a22%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxVote22proc3) + " - §a22%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxVote5proc) + " - §a5%");
			par3List.add("§bШанс дропа [989, 988, 30473, 2790:3, 194:2] - §a1%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxVote0_5proc) + " - §a0.5%");
		}

		if (this.BoxName == "BoxCases") {
			par3List.add("§bШанс дропа 1 из любых кейсов - §a100%");
		}

		if (this.BoxName == "BoxInstr") {
			par3List.add("§bШанс дропа " + Arrays.toString(boxInstr50proc) + " - §a50%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxInstr30proc) + " - §a30%");
			par3List.add("§bШанс дропа [30478] - §a20%");
		}

		if (this.BoxName == "BoxCNPCs") {
			par3List.add("§bШанс дропа " + Arrays.toString(boxCNPCs40proc) + " - §a40%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxCNPCs30proc) + " - §a30%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxCNPCs20proc) + " - §a20%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxCNPCs10proc) + " - §a10%");
		}

		if (this.BoxName == "BoxComponent") {
			par3List.add("§bШанс дропа " + Arrays.toString(boxComp40proc) + " - §a40%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxComp30proc) + " - §a30%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxComp20proc) + " - §a20%");
			par3List.add("§bШанс дропа [20818:4] - §a10%");
		}

		if (this.BoxName == "BoxRes") {
			par3List.add("§bШанс дропа " + Arrays.toString(boxRes75proc) + " - §a75%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxRes25proc) + " - §a25%");
		}

		if (this.BoxName == "BoxCharge") {
			par3List.add("§bШанс дропа " + Arrays.toString(boxCharge40proc) + " - §a40%");
			par3List.add("§bШанс дропа [30125, 3099] - §a30%");
			par3List.add("§bШанс дропа [3099:1] - §a20%");
			par3List.add("§bШанс дропа [3099:2, 3099:3] - §a10%");
		}

		if (this.BoxName == "BoxMechanism") {
			par3List.add("§bШанс дропа [250, 246:3] - §a50%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxMech20proc) + " - §a20%");
			par3List.add("§bШанс дропа [194:1] - §a15%");
			par3List.add("§bШанс дропа [2790:1, 20873, 20874, 20875] - §a10%");
			par3List.add("§bШанс дропа [2790:2, 20873:3, 194:2] - §a5%");
		}

		if (this.BoxName == "BoxCoins") {
			par3List.add("§bШанс дропа [26973] - §a40%");
			par3List.add("§bШанс дропа [26974] - §a30%");
			par3List.add("§bШанс дропа [26975] - §a20%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxСoins9proc) + " - §a9%");
			par3List.add("§bШанс дропа [26979] - §a1%");
		}

		if (this.BoxName == "BoxRainbowWeapon") {
			par3List.add("§bШанс дропа любого " + Arrays.toString(boxRainbow) + " - §a100%");
		}

		if (this.BoxName == "BoxArmor") {
			par3List.add("§bШанс дропа " + Arrays.toString(boxArmor40proc) + " - §a40%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxArmor30proc) + " - §a30%");
			par3List.add("§bШанс дропа " + Arrays.toString(boxArmor20proc) + " - §a20%");
			par3List.add("§bШанс дропа грави.нагрудника - §a10%");
		}
		par3List.add("§cНе юзать при полном инвентаре!");
	}
}