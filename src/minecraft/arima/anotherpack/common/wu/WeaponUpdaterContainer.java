package arima.anotherpack.common.wu;

import arima.anotherpack.core.Main;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class WeaponUpdaterContainer extends Container {

	public static enum State {
		ERROR, READY
	}

	public InventoryCrafting inputInventory = new InventoryCrafting(this, 1, 1);
	public InventoryCrafting inputInventory1 = new InventoryCrafting(this, 1, 1);
	public InventoryCrafting inputInventory2 = new InventoryCrafting(this, 1, 1);
	public InventoryCrafting inputInventory3 = new InventoryCrafting(this, 1, 1);
	public int inputSlotNumberMain, inputSlotNumber1, inputSlotNumber2, inputSlotNumber3;
	public InventoryWUResult outputInventory = new InventoryWUResult();
	public WURecipeHandler weaponupdaterRecipeHandler;
	private final World worldObj;
	public InventoryPlayer playerInventory;
	public String resultString = "Готов к прокачке";
	public State weaponupdaterState = State.READY;
	public int x = 0;
	public int y = 0;
	public int z = 0;

	public WeaponUpdaterContainer(InventoryPlayer parPlayerInventory, World parWorld, int parX, int parY, int parZ) {
		x = parX;
		y = parY;
		z = parZ;
		worldObj = parWorld;

		weaponupdaterRecipeHandler = new WURecipeHandler();

		//for (int outputSlotIndexX = 0; outputSlotIndexX < 3; ++outputSlotIndexX) {
			//for (int outputSlotIndexY = 0; outputSlotIndexY < 3; ++outputSlotIndexY) {
				addSlotToContainer(new Slot(outputInventory, 1 + 1 * 3,
						134, 34));
			//}
		//}

		inputSlotNumberMain = addSlotToContainer(new Slot(inputInventory, 0, 52, 19)).slotNumber;
		inputSlotNumber1 = addSlotToContainer(new Slot(inputInventory1, 0, 12 + 15, 42)).slotNumber;
		inputSlotNumber2 = addSlotToContainer(new Slot(inputInventory2, 0, 37 + 15, 42)).slotNumber;
		inputSlotNumber3 = addSlotToContainer(new Slot(inputInventory3, 0, 62 + 15, 42)).slotNumber;

		for (int playerSlotIndexY = 0; playerSlotIndexY < 3; ++playerSlotIndexY) {
			for (int playerSlotIndexX = 0; playerSlotIndexX < 9; ++playerSlotIndexX) {
				addSlotToContainer(new Slot(parPlayerInventory, playerSlotIndexX + playerSlotIndexY * 9 + 9,
						8 + playerSlotIndexX * 18, 84 + playerSlotIndexY * 18));
			}
		}

		for (int hotbarSlotIndex = 0; hotbarSlotIndex < 9; ++hotbarSlotIndex) {
			addSlotToContainer(new Slot(parPlayerInventory, hotbarSlotIndex, 8 + hotbarSlotIndex * 18, 142));
		}

		playerInventory = parPlayerInventory;
	}

	@Override
	public void onCraftMatrixChanged(IInventory parInventory) {
		if (parInventory == inputInventory) {
			if (inputInventory.getStackInSlot(0) == null) {
				resultString = StatCollector.translateToLocal("Готов к прокачке");
				weaponupdaterState = State.READY;
				return;
			}
			int amountRequired = WUInputQuantity.getStackSizeNeeded(inputInventory.getStackInSlot(0));
			// DEBUG
			System.out.println("Требуемое количество = " + amountRequired);

			if (amountRequired > inputInventory.getStackInSlot(0).stackSize) {
				resultString = StatCollector.translateToLocal("Нужно больше элементов");
				weaponupdaterState = State.ERROR;
				return;
			}

			if (amountRequired <= 0) {
				resultString = StatCollector.translateToLocal("Прокачка невозможна");
				weaponupdaterState = State.ERROR;
				return;
			}

			ItemStack[] outputItemStackArray = weaponupdaterRecipeHandler
					.getDeconstructResults(inputInventory.getStackInSlot(0));

			if (outputItemStackArray == null) {
				resultString = StatCollector.translateToLocal("Прокачка невозможна");
				weaponupdaterState = State.ERROR;
				return;
			}

			// Loop while there is something in the input slot with sufficient amount
			while (inputInventory.getStackInSlot(0) != null && amountRequired > 0
					&& amountRequired <= inputInventory.getStackInSlot(0).stackSize) {
				if (outputInventory.getStackInSlot(amountRequired) != null) {
					for (int i = 0; i < outputInventory.getSizeInventory(); i++) {
						ItemStack itemStackInOutputSlot = outputInventory.getStackInSlot(i);

						if (itemStackInOutputSlot != null && outputItemStackArray[i] != null) {
							if (!itemStackInOutputSlot.isItemEqual(outputItemStackArray[i])) {
								if (!playerInventory.addItemStackToInventory(itemStackInOutputSlot)) {
									EntityItem entityItem = playerInventory.player.entityDropItem(itemStackInOutputSlot,
											0.5f);
									entityItem.posX = playerInventory.player.posX;
									entityItem.posY = playerInventory.player.posY;
									entityItem.posZ = playerInventory.player.posZ;
								}
								outputInventory.setInventorySlotContents(i, null);
							}
						}
					}
				}

				for (int i = 0; i < outputItemStackArray.length; i++) {
					ItemStack outputItemStack = outputItemStackArray[i];
					ItemStack currentStack = outputInventory.getStackInSlot(i);
					if (outputItemStack != null) {
						int metadata = outputItemStack.getItemDamage();
						if (metadata == 32767) {
							metadata = 0;
						}
						ItemStack newStack = null;
						if (currentStack != null && 1 + currentStack.stackSize <= outputItemStack.getMaxStackSize()) {
							newStack = new ItemStack(outputItemStack.getItem(), 1 + currentStack.stackSize, metadata);
						} else {
							if (currentStack != null && !playerInventory.addItemStackToInventory(currentStack)) {
								EntityItem entityItem = playerInventory.player.entityDropItem(currentStack, 0.5f);
								entityItem.posX = playerInventory.player.posX;
								entityItem.posY = playerInventory.player.posY;
								entityItem.posZ = playerInventory.player.posZ;
							}
							newStack = new ItemStack(outputItemStack.getItem(), 1, metadata);
						}
						outputInventory.setInventorySlotContents(i, newStack);
					}
				}

				/**
				 * playerInventory.player.addStat(Main.deconstructedItemsStat, amountRequired);
				 * playerInventory.player.triggerAchievement(Main.deconstructAny);
				 **/
				inputInventory.decrStackSize(0, amountRequired);
			}
		} else {
			resultString = StatCollector.translateToLocal("Прокачка невозможна");
			weaponupdaterState = State.ERROR;
		}
	}

	@Override
	public ItemStack slotClick(int parSlotId, int parMouseButtonId, int parClickMode, EntityPlayer parPlayer) {
		ItemStack clickItemStack = super.slotClick(parSlotId, parMouseButtonId, parClickMode, parPlayer);
		if (inventorySlots.size() > parSlotId && parSlotId >= 0) {
			if (inventorySlots.get(parSlotId) != null) {
				if (((Slot) inventorySlots.get(parSlotId)).inventory == inputInventory) {
					onCraftMatrixChanged(inputInventory);
				}
			}
		}
		return clickItemStack;
	}

	@Override
	public void onCraftGuiClosed(EntityPlayer parPlayer) {
		if (playerInventory.getItemStack() != null) {
			parPlayer.entityDropItem(playerInventory.getItemStack(), 0.5f);
		}
		if (!worldObj.isRemote) {
			ItemStack itemStack = inputInventory.getStackInSlotOnClosing(0);
			if (itemStack != null) {
				parPlayer.entityDropItem(itemStack, 0.5f);
			}

			for (int i = 0; i < outputInventory.getSizeInventory(); i++) {
				itemStack = outputInventory.getStackInSlotOnClosing(i);

				if (itemStack != null) {
					parPlayer.entityDropItem(itemStack, 0.5f);
				}
			}
		}
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return true;
	}

	/**
	 * Called when a player shift-clicks on a slot.
	 */
	@Override
	public ItemStack transferStackInSlot(EntityPlayer parPlayer, int parSlotIndex) {
		Slot slot = (Slot) inventorySlots.get(parSlotIndex);
		// If there is something in the stack to pick up
		if (slot != null && slot.getHasStack()) {
			// If the slot is one of the custom slots
			if (slot.inventory.equals(inputInventory) || slot.inventory.equals(outputInventory)) {
				// try to move to player inventory
				if (!playerInventory.addItemStackToInventory(slot.getStack())) {
					return null;
				}
				slot.putStack(null);
				slot.onSlotChanged();
			}
			// if the slot is a player inventory slot
			else if (slot.inventory.equals(playerInventory)) {
				// DEBUG
				System.out.println("Shift-clicked on player inventory slot");
				// Try to transfer to input slot
				if (!((Slot) inventorySlots.get(inputSlotNumberMain)).getHasStack() || !((Slot) inventorySlots.get(inputSlotNumber1)).getHasStack() || !((Slot) inventorySlots.get(inputSlotNumber2)).getHasStack() || !((Slot) inventorySlots.get(inputSlotNumber3)).getHasStack()) {
					((Slot) inventorySlots.get(inputSlotNumberMain)).putStack(slot.getStack());
					((Slot) inventorySlots.get(inputSlotNumber1)).putStack(slot.getStack());
					((Slot) inventorySlots.get(inputSlotNumber2)).putStack(slot.getStack());
					((Slot) inventorySlots.get(inputSlotNumber3)).putStack(slot.getStack());
					slot.putStack(null);
					slot.onSlotChanged();
				} else {
					// DEBUG
					System.out.println("There is already something in the input slot");
				}
			}
		}
		return null;
	}

	// @Override
	// public boolean canMergeSlot(ItemStack parItemStack, Slot parSlot)
	// {
	// return !parSlot.inventory.equals(outputInventory);
	// }
	
	@Override
    protected boolean mergeItemStack(ItemStack par1ItemStack, int par2, int par3, boolean par4)
    {
        boolean flag1 = false;
        int k = par2;

        if (par4)
        {
            k = par3 - 1;
        }

        Slot slot;
        ItemStack itemstack1;

        if (par1ItemStack.isStackable())
        {
            while (par1ItemStack.stackSize > 0 && (!par4 && k < par3 || par4 && k >= par2))
            {
                slot = (Slot)this.inventorySlots.get(k);
                itemstack1 = slot.getStack();

                if (itemstack1 != null && itemstack1.itemID == par1ItemStack.itemID && (!par1ItemStack.getHasSubtypes() || par1ItemStack.getItemDamage() == itemstack1.getItemDamage()) && ItemStack.areItemStackTagsEqual(par1ItemStack, itemstack1))
                {
                    int l = itemstack1.stackSize + par1ItemStack.stackSize;

                    if (l <= par1ItemStack.getMaxStackSize())
                    {
                        par1ItemStack.stackSize = 0;
                        itemstack1.stackSize = l;
                        slot.onSlotChanged();
                        flag1 = true;
                    }
                    else if (itemstack1.stackSize < par1ItemStack.getMaxStackSize())
                    {
                        par1ItemStack.stackSize -= par1ItemStack.getMaxStackSize() - itemstack1.stackSize;
                        itemstack1.stackSize = par1ItemStack.getMaxStackSize();
                        slot.onSlotChanged();
                        flag1 = true;
                    }
                }

                if (par4)
                {
                    --k;
                }
                else
                {
                    ++k;
                }
            }
        
        }
        if (par1ItemStack.stackSize > 0)
        {
            if (par4)
            {
                k = par3 - 1;
            }
            else
            {
                k = par2;
            }

            while (!par4 && k < par3 || par4 && k >= par2)
            {
                slot = (Slot)this.inventorySlots.get(k);
                itemstack1 = slot.getStack();

                if (itemstack1 == null)
                {
                    slot.putStack(par1ItemStack.copy());
                    slot.onSlotChanged();
                    par1ItemStack.stackSize = 0;
                    flag1 = true;
                    break;
                }

                if (par4)
                {
                    --k;
                }
                else
                {
                    ++k;
                }
            }
        }

        return flag1;
    }

	@Override
	public Slot getSlot(int parSlotIndex) {
		if (parSlotIndex >= inventorySlots.size())
			parSlotIndex = inventorySlots.size() - 1;
		return super.getSlot(parSlotIndex);
	}

}