package arima.anotherpack.utils;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public final class StackUtil
{
  
  public static List<IInventory> getAdjacentInventories(TileEntity source) {
	return null;
}
 
  
  public static int distribute(TileEntity source, ItemStack itemStack, boolean simulate)
  {
    int transferred = 0;
    for (IInventory inventory : getAdjacentInventories(source))
    {
      int amount = putInInventory(inventory, itemStack, simulate);
      
      transferred += amount;
      itemStack.stackSize -= amount;
      if (itemStack.stackSize == 0) {
        break;
      }
    }
    itemStack.stackSize += transferred;
    
    return transferred;
  }
  
  public static ItemStack fetch(TileEntity source, ItemStack itemStack, boolean simulate)
  {
    ItemStack ret = null;
    for (IInventory inventory : getAdjacentInventories(source))
    {
      ItemStack transferred = getFromInventory(inventory, itemStack, simulate);
      if (transferred != null)
      {
        if (ret == null) {
          ret = transferred;
        } else {
          ret.stackSize += transferred.stackSize;
        }
        if (ret.stackSize == itemStack.stackSize) {
          break;
        }
      }
    }
    return ret;
  }
  
  public static void distributeDrop(TileEntity source, List<ItemStack> itemStacks)
  {
    for (Iterator<ItemStack> it = itemStacks.iterator(); it.hasNext();)
    {
      ItemStack itemStack = (ItemStack)it.next();
      
      int amount = distribute(source, itemStack, false);
      if (amount == itemStack.stackSize) {
        it.remove();
      } else {
        itemStack.stackSize -= amount;
      }
    }
    for (ItemStack itemStack : itemStacks) {
      dropAsEntity(source.worldObj, source.xCoord, source.yCoord, source.zCoord, itemStack);
    }
    itemStacks.clear();
  }
  
  public static ItemStack getFromInventory(IInventory inventory, ItemStack itemStackDestination, boolean simulate)
  {
    ItemStack ret = null;
    int toTransfer = itemStackDestination.stackSize;
    for (int i = 0; i < inventory.getSizeInventory(); i++)
    {
      ItemStack itemStack = inventory.getStackInSlot(i);
      if ((itemStack != null) && (isStackEqual(itemStack, itemStackDestination)))
      {
        if (ret == null) {
          ret = copyWithSize(itemStack, 0);
        }
        int transfer = Math.min(toTransfer, itemStack.stackSize);
        if (!simulate)
        {
          itemStack.stackSize -= transfer;
          if (itemStack.stackSize == 0) {
            inventory.setInventorySlotContents(i, null);
          }
        }
        toTransfer -= transfer;
        ret.stackSize += transfer;
        if (toTransfer == 0) {
          return ret;
        }
      }
    }
    return null;
  }
  
  public static int putInInventory(IInventory inventory, ItemStack itemStackSource, boolean simulate)
  {
    int transferred = 0;
    for (int i = 0; i < inventory.getSizeInventory(); i++) {
      if (inventory.isStackValidForSlot(i, itemStackSource))
      {
        ItemStack itemStack = inventory.getStackInSlot(i);
        if ((itemStack != null) && (itemStack.isItemEqual(itemStackSource)))
        {
          int transfer = Math.min(itemStackSource.stackSize - transferred, itemStack.getMaxStackSize() - itemStack.stackSize);
          if (!simulate) {
            itemStack.stackSize += transfer;
          }
          transferred += transfer;
          if (transferred == itemStackSource.stackSize) {
            return transferred;
          }
        }
      }
    }
    for (int i = 0; i < inventory.getSizeInventory(); i++) {
      if (inventory.isStackValidForSlot(i, itemStackSource))
      {
        ItemStack itemStack = inventory.getStackInSlot(i);
        if (itemStack == null)
        {
          int transfer = Math.min(itemStackSource.stackSize - transferred, itemStackSource.getMaxStackSize());
          if (!simulate)
          {
            ItemStack dest = copyWithSize(itemStackSource, transfer);
            inventory.setInventorySlotContents(i, dest);
          }
          transferred += transfer;
          if (transferred == itemStackSource.stackSize) {
            return transferred;
          }
        }
      }
    }
    return transferred;
  }
  
  public static void dropAsEntity(World world, int x, int y, int z, ItemStack itemStack)
  {
    if (itemStack == null) {
      return;
    }
    double f = 0.7D;
    double dx = world.rand.nextFloat() * f + (1.0D - f) * 0.5D;
    double dy = world.rand.nextFloat() * f + (1.0D - f) * 0.5D;
    double dz = world.rand.nextFloat() * f + (1.0D - f) * 0.5D;
    
    EntityItem entityItem = new EntityItem(world, x + dx, y + dy, z + dz, itemStack.copy());
    entityItem.delayBeforeCanPickup = 10;
    world.spawnEntityInWorld(entityItem);
  }
  
  public static ItemStack copyWithSize(ItemStack itemStack, int newSize)
  {
    ItemStack ret = itemStack.copy();
    ret.stackSize = newSize;
    return ret;
  }
  
  public static NBTTagCompound getOrCreateNbtData(ItemStack itemStack)
  {
    NBTTagCompound ret = itemStack.getTagCompound();
    if (ret == null)
    {
      ret = new NBTTagCompound("tag");
      
      itemStack.setTagCompound(ret);
    }
    return ret;
  }
  
  public static boolean isStackEqual(ItemStack stack1, ItemStack stack2)
  {
    return (stack1 != null) && (stack2 != null) && (stack1.itemID == stack2.itemID) && (((!stack1.getHasSubtypes()) && (!stack1.isItemStackDamageable())) || ((stack1.getItemDamage() == stack2.getItemDamage()) && (ItemStack.areItemStackTagsEqual(stack1, stack2))));
  }
  
  public static boolean damageItemStack(ItemStack itemStack, int amount)
  {
    if (itemStack.attemptDamageItem(amount, random))
    {
      itemStack.stackSize -= 1;
      itemStack.setItemDamage(0);
      
      return itemStack.stackSize <= 0;
    }
    return false;
  }
  
  private static final Random random = new Random();
}
