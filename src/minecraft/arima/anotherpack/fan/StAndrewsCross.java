package arima.anotherpack.fan;

import java.util.Random;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLadder;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class StAndrewsCross extends BlockLadder {

	private String texture;
	final Random random = new Random();

	int k = 1+ random.nextInt(5);

	public StAndrewsCross(int par1, String name, String texture) {
		super(par1);
		this.texture = texture;
		this.setUnlocalizedName(name);
		this.setCreativeTab(Main.tabAPFan);
		this.setResistance(-1);
		this.setHardness(1.0F);
		GameRegistry.registerBlock(this, name);
	}

	public boolean isLadder(IBlockAccess world, int x, int y, int z, EntityLiving entity) {
		return false;
	}

	public void registerIcons(IconRegister par1IconRegister) {
		this.blockIcon = par1IconRegister.registerIcon(this.texture);
	}

	@SideOnly(Side.CLIENT)
	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer player, int par6,
			float par7, float par8, float par9) {
		player.capabilities.setPlayerWalkSpeed(0.0F);
		player.addChatMessage("§8Вы в оковах.");
		player.addChatMessage("§8Что выбраться, кликайте по кресту §cстолько раз§8, пока сообщение не отправиться §cв глобал.");
		if (k == 2) {
			Minecraft.getMinecraft().thePlayer.sendChatMessage("!&4Накажите меня, &eХозяин!");
			player.capabilities.setPlayerWalkSpeed(0.1F);
		} else {
			Minecraft.getMinecraft().thePlayer.sendChatMessage("Накажите меня, Хозяин!");
		}
		player.setPositionAndRotation(par2 + 0.3D, par3 + 1, par4 + 0.3D, player.getRotationYawHead() + 180,
				player.cameraPitch);
		player.setSneaking(true);

		return true;
	}

	@Override
	public boolean isLadder(World world, int x, int y, int z, EntityLiving entity) {
		return true;
	}
}