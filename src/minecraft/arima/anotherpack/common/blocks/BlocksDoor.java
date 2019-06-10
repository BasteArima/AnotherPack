package arima.anotherpack.common.blocks;

import java.util.Random;

import arima.anotherpack.core.AllItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IconFlipped;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlocksDoor extends BlockDoor {

	public Item placerItem;
	public Icon topDoorIcon;
	private String name;
	private String texture;
	public Icon[] flippedIcons = new Icon[2];

	public BlocksDoor(int par1, String name, String texture, Item placerItem) {
		super(par1, Material.wood);
		float f = 0.5F;
		float f1 = 1.0F;
		this.placerItem = placerItem;
		this.setLightOpacity(0);
		this.name = name;
		this.texture = texture;
		this.setHardness(2.0F);
		this.setResistance(10.0F);
		this.setStepSound(Block.soundStoneFootstep);
		this.setUnlocalizedName(name);
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f1, 0.5F + f);
		GameRegistry.registerBlock(this, name);
	}

	public boolean onBlockActivated(World par1World, int par2, int par3, int par4, EntityPlayer par5EntityPlayer,
			int par6, float par7, float par8, float par9) {

		int i1 = this.getFullMetadata(par1World, par2, par3, par4);
		int j1 = i1 & 7;
		j1 ^= 4;

		if ((i1 & 8) == 0) {
			par1World.setBlockMetadataWithNotify(par2, par3, par4, j1, 2);
			par1World.markBlockRangeForRenderUpdate(par2, par3, par4, par2, par3, par4);
		} else {
			par1World.setBlockMetadataWithNotify(par2, par3 - 1, par4, j1, 2);
			par1World.markBlockRangeForRenderUpdate(par2, par3 - 1, par4, par2, par3, par4);
		}

		par1World.playAuxSFXAtEntity(par5EntityPlayer, 1003, par2, par3, par4, 0);
		if (this.name=="DoorIron") {
		if (!par1World.isRemote)
			par5EntityPlayer.addChatMessage("Ты пидор!");
		}
		return true;
	}
    public void onPoweredBlockChange(World par1World, int par2, int par3, int par4, boolean par5)
    {
        int l = this.getFullMetadata(par1World, par2, par3, par4);
        boolean flag1 = (l & 4) != 0;

        if (flag1 != par5)
        {
            int i1 = l & 7;
            i1 ^= 4;

            if ((l & 8) == 0)
            {
                par1World.setBlockMetadataWithNotify(par2, par3, par4, i1, 2);
                par1World.markBlockRangeForRenderUpdate(par2, par3, par4, par2, par3, par4);
            }
            else
            {
                par1World.setBlockMetadataWithNotify(par2, par3 - 1, par4, i1, 2);
                par1World.markBlockRangeForRenderUpdate(par2, par3 - 1, par4, par2, par3, par4);
            }
            //if (this.name=="DoorIron") {
        		//if (!par1World.isRemote)
        		//Minecraft.getMinecraft().thePlayer.addChatMessage("Ты пидор!");
        		//}
            par1World.playAuxSFXAtEntity((EntityPlayer)null, 1003, par2, par3, par4, 0);
        }
    }

	private void setDoorRotation(int par1) {
		float f = 0.1875F;
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F);
		int j = par1 & 3;
		boolean flag = (par1 & 4) != 0;
		boolean flag1 = (par1 & 16) != 0;

		if (j == 0) {
			if (flag) {
				if (!flag1) {
					this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
				} else {
					this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
				}
			} else {
				this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
			}
		} else if (j == 1) {
			if (flag) {
				if (!flag1) {
					this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
				} else {
					this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
				}
			} else {
				this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
			}
		} else if (j == 2) {
			if (flag) {
				if (!flag1) {
					this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
				} else {
					this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
				}
			} else {
				this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
			}
		} else if (j == 3) {
			if (flag) {
				if (!flag1) {
					this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
				} else {
					this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
				}
			} else {
				this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
			}
		}
	}

	public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
		if (par5 == 1 || par5 == 0) {
			return this.blockIcon;
		}
		int meta = getFullMetadata(par1IBlockAccess, par2, par3, par4);
		boolean flag = (meta & 4) != 0;
		int halfMeta = meta & 3;
		boolean flipped = false;

		if (flag) {
			if (halfMeta == 0 && par5 == 2)
				flipped = !flipped;
			else if (halfMeta == 1 && par5 == 5)
				flipped = !flipped;
			else if (halfMeta == 2 && par5 == 3)
				flipped = !flipped;
			else if (halfMeta == 3 && par5 == 4)
				flipped = !flipped;
		} else {
			if (halfMeta == 0 && par5 == 5)
				flipped = !flipped;
			else if (halfMeta == 1 && par5 == 3)
				flipped = !flipped;
			else if (halfMeta == 2 && par5 == 4)
				flipped = !flipped;
			else if (halfMeta == 3 && par5 == 2)
				flipped = !flipped;
			if ((meta & 16) != 0)
				flipped = !flipped;
		}

		if (flipped)
			return flippedIcons[(meta != 0 ? 1 : 0)];
		else
			return (meta != 0 ? this.topDoorIcon : this.blockIcon);
	}

	public Icon getIcon(int par1, int par2) {
		return this.blockIcon;
	}

	@Override
	public void registerIcons(IconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(this.texture + "_lower");
		this.topDoorIcon = iconRegister.registerIcon(this.texture + "_upper");
		this.flippedIcons[0] = new IconFlipped(blockIcon, true, false);
		this.flippedIcons[1] = new IconFlipped(topDoorIcon, true, false);
	}

	public int idPicked(World par1World, int par2, int par3, int par4) {
		if (this.name == "DoorAcacia")
			return AllItems.ItemDoorAcacia.itemID;
		else if (this.name == "DoorBirch")
			return AllItems.ItemDoorBirch.itemID;
		else if (this.name == "DoorDarkOak")
			return AllItems.ItemDoorDarkOak.itemID;
		else if (this.name == "DoorIron")
			return AllItems.ItemDoorIron.itemID;
		else if (this.name == "DorrJungle")
			return AllItems.ItemDoorJungle.itemID;
		else if (this.name == "DoorSpruce")
			return AllItems.ItemDoorSpruce.itemID;
		else if (this.name == "DoorGlass")
			return AllItems.ItemDoorGlass.itemID;
		else if (this.name == "DoorIronBars")
			return AllItems.ItemDoorIronBars.itemID;
		else if (this.name == "DoorNetherBricks")
			return AllItems.ItemDoorNetherBricks.itemID;
		else if (this.name == "DoorObsidian")
			return AllItems.ItemDoorObsidian.itemID;
		else if (this.name == "DoorFactory")
			return AllItems.ItemDoorFactory.itemID;
		else if (this.name == "DoorJail")
			return AllItems.ItemDoorJail.itemID;
		else if (this.name == "DoorLabaratory")
			return AllItems.ItemDoorLabaratory.itemID;
		else if (this.name == "DoorShoji")
			return AllItems.ItemDoorShoji.itemID;
		else if (this.name == "DoorSlidingIron")
			return AllItems.ItemDoorSlidingIron.itemID;
		else if (this.name == "DoorSlidingWood")
			return AllItems.ItemDoorSlidingWood.itemID;
		else
			return Item.doorWood.itemID;
	}

	
	  public int idDropped(int par1, Random par2Random, int par3) {
		  if (this.name == "DoorAcacia")
				return AllItems.ItemDoorAcacia.itemID;
			else if (this.name == "DoorBirch")
				return AllItems.ItemDoorBirch.itemID;
			else if (this.name == "DoorDarkOak")
				return AllItems.ItemDoorDarkOak.itemID;
			else if (this.name == "DoorIron")
				return AllItems.ItemDoorIron.itemID;
			else if (this.name == "DorrJungle")
				return AllItems.ItemDoorJungle.itemID;
			else if (this.name == "DoorSpruce")
				return AllItems.ItemDoorSpruce.itemID;
			else if (this.name == "DoorGlass")
				return AllItems.ItemDoorGlass.itemID;
			else if (this.name == "DoorIronBars")
				return AllItems.ItemDoorIronBars.itemID;
			else if (this.name == "DoorNetherBricks")
				return AllItems.ItemDoorNetherBricks.itemID;
			else if (this.name == "DoorObsidian")
				return AllItems.ItemDoorObsidian.itemID;
			else if (this.name == "DoorFactory")
				return AllItems.ItemDoorFactory.itemID;
			else if (this.name == "DoorJail")
				return AllItems.ItemDoorJail.itemID;
			else if (this.name == "DoorLabaratory")
				return AllItems.ItemDoorLabaratory.itemID;
			else if (this.name == "DoorShoji")
				return AllItems.ItemDoorShoji.itemID;
			else if (this.name == "DoorSlidingIron")
				return AllItems.ItemDoorSlidingIron.itemID;
			else if (this.name == "DoorSlidingWood")
				return AllItems.ItemDoorSlidingWood.itemID;
			else
				return Item.doorWood.itemID;
		  }
	 

}
