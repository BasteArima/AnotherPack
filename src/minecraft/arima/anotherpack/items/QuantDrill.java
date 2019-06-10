package arima.anotherpack.items;

import java.util.List;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import ic2.api.item.ElectricItem;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;

public class QuantDrill extends ElectricItemDrillBase {
	private String texture;
	private int damageVsEntity;
	private boolean mode;
	private int operationEnergyCost;
	private float digSpeed = 1.0F;

	public QuantDrill(int id, EnumToolMaterial par2EnumToolMaterial, String texture, String name) {
		super(id, par2EnumToolMaterial);
		this.texture = texture;
		setUnlocalizedName(name);
		setCreativeTab(Main.tabAPWeaponAndArmor);
		damageVsEntity = 1;
		this.maxCharge = 45000;
		this.transferLimit = 500;
		this.operationEnergyCost = 160;
		this.tier = 2;
		GameRegistry.registerItem(this, name);
	}

	public int getDamageVsEntity(Entity par1Entity) {
		return this.damageVsEntity;
	}

	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {

		if (!world.isRemote)
			if (mode == false && player.isSneaking()) {
				player.addChatMessage(EnumChatFormatting.AQUA + "Включен режим бура 3х3");
				mode = true;
			} else if (mode == true && player.isSneaking()) {
				player.addChatMessage(EnumChatFormatting.AQUA + "Включен ускоренный режим");
				mode = false;
			}

		return stack;
	}
	
	@Override
	public boolean hitEntity(ItemStack par1ItemStack, EntityLiving par2EntityLiving, EntityLiving par3EntityLiving)
    {
		if (par1ItemStack.getItemDamage()>3) {
        par1ItemStack.damageItem(2, par3EntityLiving);
		}
		else
		{
			par1ItemStack.damageItem(0, par3EntityLiving);
		}
        return false;
    }

	@Override
	public float getStrVsBlock(ItemStack tool, Block block, int meta) {
		if (!ElectricItem.manager.canUse(tool, this.operationEnergyCost)) {
			return this.digSpeed = 1.0F;
		}

		if (ForgeHooks.isToolEffective(tool, block, meta)) {
			return this.digSpeed = 35.0F;
		}

		if (canHarvestBlock(block)) {
			return this.digSpeed = 35.0F;
		}

		if (canHarvestBlock(block)) {
			return this.digSpeed = 35.0F;
		}

		return this.digSpeed;
	}
	
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List info, boolean par4) {
		info.add("§5§oОбменять на активированный на /warp 3x3");
	}

	public boolean onBlockDestroyed(ItemStack stack, World world, int blockID, int x, int y, int z, EntityLiving entity) {
		if ((double) Block.blocksList[blockID].getBlockHardness(world, x, y, z) != 0.0D) {
			if (entity != null) {
				ElectricItem.manager.use(stack, this.operationEnergyCost, entity);
				ElectricItem.manager.chargeFromArmor(stack, entity);
			} else {
				ElectricItem.manager.discharge(stack, this.operationEnergyCost, this.tier, true, false);
				ElectricItem.manager.chargeFromArmor(stack, entity);
			}
		}
		return true;
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		this.itemIcon = par1IconRegister.registerIcon(this.texture);
	}

	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}
	
	public boolean canHarvestBlock(Block par1Block) {
		return par1Block == Block.obsidian ? this.toolMaterial.getHarvestLevel() == 3
				: (par1Block != Block.blockDiamond && par1Block != Block.oreDiamond
						? (par1Block != Block.oreEmerald && par1Block != Block.blockEmerald
								? (par1Block != Block.blockGold && par1Block != Block.oreGold
										? (par1Block != Block.blockIron && par1Block != Block.oreIron
												? (par1Block != Block.blockLapis && par1Block != Block.oreLapis
														? (par1Block != Block.oreRedstone
																&& par1Block != Block.oreRedstoneGlowing
																		? (par1Block.blockMaterial == Material.rock && par1Block != Block.sand
																				? true
																				: (par1Block.blockMaterial == Material.grass)
																						? true
																						: (par1Block.blockMaterial == Material.iron
																								? true
																								: (par1Block.blockMaterial == Material.ground)
																										? true
																												: (par1Block.blockMaterial == Material.snow)
																												? true
																										: par1Block.blockMaterial == Material.anvil))
																		: this.toolMaterial.getHarvestLevel() >= 2)
														: this.toolMaterial.getHarvestLevel() >= 1)
												: this.toolMaterial.getHarvestLevel() >= 1)
										: this.toolMaterial.getHarvestLevel() >= 2)
								: this.toolMaterial.getHarvestLevel() >= 2)
						: this.toolMaterial.getHarvestLevel() >= 2);
	}

}
