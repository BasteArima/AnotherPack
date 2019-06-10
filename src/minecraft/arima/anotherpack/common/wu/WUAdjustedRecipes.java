package arima.anotherpack.common.wu;

import arima.anotherpack.core.AllItems;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class WUAdjustedRecipes {
	// Counters to allow fractional deconstruction
	public int divideByTwoCounter = 1;
	public int divideByThreeCounter = 2;
	public int divideByFourCounter = 3;
	public int divideByEightCounter = 7;

	// The item and meta data input to deconstructor
	public Item theItem = null;
	public int theMetadata = 0;

	public WUAdjustedRecipes() {

	}

	// Adjust those cases where the recipe can be divided down (e.g. one door
	// gives back two blocks)
	public ItemStack[] adjustOutputQuantities(ItemStack[] parOutputItemStackArray, ItemStack parInputItemStack) {
		theItem = parInputItemStack.getItem();
		theMetadata = theItem.getMetadata(parInputItemStack.itemID);
		// Тут рецептики типа
		if (theItem == AllItems.sword1) {
			return outputSingle(AllItems.sword1);
		} else if (theItem == Item.appleRed)
			return outputSingle(Item.reed);
		else if (theItem == Item.stick)
			return outputSingle(Block.planks);
		else if (theItem == AllItems.amulet1)
			return outputSingle(AllItems.amulet2);

		return parOutputItemStackArray;
	}

	private ItemStack[] outputSingle(Block parBlock) {
		return new ItemStack[] { new ItemStack(parBlock), null, null, null, null, null, null, null, null };
	}

	private ItemStack[] outputSingle(Item parItem) {
		return new ItemStack[] { new ItemStack(parItem), null, null, null, null, null, null, null, null };
	}

	private ItemStack[] outputSingle(Block parBlock, int parMetadata) {
		return new ItemStack[] { new ItemStack(parBlock, 1, parMetadata), null, null, null, null, null, null, null,
				null };
	}

	private ItemStack[] outputSingle(Item parItem, int parMetadata) {
		return new ItemStack[] { new ItemStack(parItem, 1, parMetadata), null, null, null, null, null, null, null,
				null };
	}

	private ItemStack[] outputForHardenedClay() {
		if (divideByEightCounter != 3) {
			decrementDivideByEightCounter();
			return new ItemStack[] { new ItemStack(Item.clay, 1, 0), null, null, null, null, null, null, null, null };
		} else {
			// DEBUG
			System.out.println("Should output a dye");
			decrementDivideByEightCounter();
			return new ItemStack[] { new ItemStack(Item.clay, 1, 0),
					new ItemStack(Item.dyePowder, 1, convertClayMetaToDyeMeta(theMetadata)), null, null, null, null,
					null, null, null };
		}
	}

	private int convertClayMetaToDyeMeta(int parClayMeta) {
		// for some reason dye and clay have reversed sequence of meta data values
		return 15 - parClayMeta;
	}

	private void decrementDivideByTwoCounter() {
		divideByTwoCounter--;
		if (divideByTwoCounter < 0) {
			divideByTwoCounter = 1;
		}
	}

	private void decrementDivideByThreeCounter() {
		divideByThreeCounter--;
		if (divideByThreeCounter < 0) {
			divideByThreeCounter = 2;
		}
	}

	private void decrementDivideByFourCounter() {
		divideByFourCounter--;
		if (divideByFourCounter < 0) {
			divideByFourCounter = 3;
		}
	}

	private void decrementDivideByEightCounter() {
		divideByEightCounter--;
		if (divideByEightCounter < 0) {
			divideByEightCounter = 7;
		}
	}

	private ItemStack[] initItemStackArray() {
		ItemStack[] resultItemStackArray = new ItemStack[9];
		for (int j = 0; j < resultItemStackArray.length; j++) {
			resultItemStackArray[j] = null;
		}
		return resultItemStackArray;
	}
}