package arima.anotherpack.common.wu;

import arima.anotherpack.core.AllItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class WUAddedRecipes {
	public static boolean shouldAddRecipe(Item parItem) {
		return (parItem == Item.enchantedBook || parItem == Item.axeIron || parItem == Item.axeGold
				|| parItem == Item.axeDiamond);
	}

	public static ItemStack[] getCraftingGrid(Item parItem) {
		// Initialize the result array
		ItemStack[] resultItemStackArray = new ItemStack[9];
		for (int j = 0; j < resultItemStackArray.length; j++) {
			resultItemStackArray[j] = null;
		}

		// Create weaponupdater recipes for things that don't have crafting recipes
		if (parItem == AllItems.sword1) {
			resultItemStackArray = new ItemStack[] {new ItemStack(Item.leather, 1, 0)};
		}
		// Even though horse armor has recipe, need to adjust the wool color when
		// deconstructed
		else if (parItem == Item.axeIron) {
			return new ItemStack[] { null, null, null, new ItemStack(Item.ingotIron, 1, 0),
					new ItemStack(Item.ingotIron, 1, 0), new ItemStack(Item.ingotIron, 1, 0),
					new ItemStack(Item.ingotIron, 1, 0), new ItemStack(Item.ingotIron, 1, 0),
					new ItemStack(Item.ingotIron, 1, 0) };
		} else if (parItem == Item.axeGold) {
			return new ItemStack[] { null, null, null, new ItemStack(Item.ingotGold, 1, 0),
					new ItemStack(Item.ingotGold, 1, 0), new ItemStack(Item.ingotGold, 1, 0),
					new ItemStack(Item.ingotGold, 1, 0), new ItemStack(Item.ingotGold, 1, 0),
					new ItemStack(Item.ingotGold, 1, 0) };
		} else if (parItem == Item.axeDiamond) {
			return new ItemStack[] { null, null, null, new ItemStack(Item.diamond, 1, 0),
					new ItemStack(Item.diamond, 1, 0), new ItemStack(Item.diamond, 1, 0),
					new ItemStack(Item.diamond, 1, 0), new ItemStack(Item.diamond, 1, 0),
					new ItemStack(Item.diamond, 1, 0) };
		}
		return resultItemStackArray;
	}
}
