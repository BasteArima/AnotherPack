package arima.anotherpack.common.wu;

import java.util.List;

import arima.anotherpack.core.AllItems;
import arima.anotherpack.core.Main;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class WUInputQuantity {
	public static int getStackSizeNeeded(ItemStack parItemStack) {
		Item theItem = parItemStack.getItem();
		// Create recipes for some things that don't normally have them
		if (theItem == Item.enchantedBook) {
			if (Main.allowWUEnchantedBooks) {
				return 1;
			} else {
				return 1;
			}
		}
		List<?> crafts = CraftingManager.getInstance().getRecipeList();
		for (int i = 0; i < crafts.size(); i++) {
			IRecipe recipe = (IRecipe) crafts.get(i);
			if (recipe != null) {
				ItemStack outputItemStack = recipe.getRecipeOutput();
				// if found matching recipe
				if (outputItemStack != null) {
					if (outputItemStack.getItemName().equals(parItemStack.getItemName())) {
						// DEBUG
						System.out.println("getStackSizeNeeded() found matching recipe");
						return adjustQuantity(theItem, outputItemStack.stackSize);
					}
				}
			}
		}
		// DEBUG
		System.out.println("No matching recipe found!");
		return 0; // no recipe found
	}

	public static int adjustQuantity(Item theItem, int parDefaultQuantity) {
		if (theItem == AllItems.sword1 || theItem == Item.paper || theItem == Item.stick || theItem == Item.enchantedBook
				|| theItem == Item.sign) {
			return 1;
		}
		return parDefaultQuantity;
	}
}