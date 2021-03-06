package arima.anotherpack.common.wu;

import java.util.ArrayList;
import java.util.List;

import arima.anotherpack.core.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public final class WURecipeHandler {
	// The item input to deconstructor
	public Item theItem = null;

	public WUAdjustedRecipes weaponupdaterAdjustedRecipes = new WUAdjustedRecipes();

	public WURecipeHandler() {

	}

	public ItemStack[] getDeconstructResults(ItemStack parItemStack) {
		// DEBUG
		System.out.println("Поиск рецепта прокачки для " + parItemStack.getItemName());

		// Allow recipes for some vanilla items that normally don't have recipes
		theItem = parItemStack.getItem();
		if (WUAddedRecipes.shouldAddRecipe(theItem)) {
			return WUAddedRecipes.getCraftingGrid(theItem);
		}

		// check all recipes for recipe for Itemstack
		List<?> listAllRecipes = CraftingManager.getInstance().getRecipeList();

		for (int i = 0; i < listAllRecipes.size(); i++) {
			IRecipe recipe = (IRecipe) listAllRecipes.get(i);
			if (recipe != null) {
				ItemStack recipeKeyItemStack = recipe.getRecipeOutput();
				if (recipeKeyItemStack != null) {
					if (recipeKeyItemStack.getItemName().equals(parItemStack.getItemName())) {
						return getCraftingGrid(recipe);
					}
				}
			}
		}
		return null;
	}

	public ItemStack[] getCraftingGrid(IRecipe parRecipe) {
		// Initialize the result array
		ItemStack[] resultItemStackArray = new ItemStack[9];
		for (int j = 0; j < resultItemStackArray.length; j++) {
			resultItemStackArray[j] = null;
		}

		if (parRecipe instanceof ShapedRecipes) {
			// DEBUG
			System.out.println("getCraftingGrid for shaped recipe");
			ShapedRecipes shaped = (ShapedRecipes) parRecipe;
			for (int j = 0; j < shaped.recipeItems.length; j++) {
				resultItemStackArray[j] = shaped.recipeItems[j];
			}
		}

		if (parRecipe instanceof ShapelessRecipes) {
			// DEBUG
			System.out.println("getCraftingGrid for shapeless recipe");
			ShapelessRecipes shapeless = (ShapelessRecipes) parRecipe;
			for (int j = 0; j < shapeless.recipeItems.size(); j++) {
				resultItemStackArray[j] = (ItemStack) shapeless.recipeItems.get(j);
			}
		}

		if (parRecipe instanceof ShapedOreRecipe) {
			// DEBUG
			System.out.println("getCraftingGrid for shaped ore recipe");
			ShapedOreRecipe shaped = (ShapedOreRecipe) parRecipe;
			for (int j = 0; j < shaped.getInput().length; j++) {
				if (shaped.getInput()[j] instanceof ItemStack) {
					resultItemStackArray[j] = (ItemStack) shaped.getInput()[j];
				} else if (shaped.getInput()[j] instanceof List) {
					Object o = ((List) shaped.getInput()[j]).get(0);
					if (o instanceof ItemStack) {
						resultItemStackArray[j] = (ItemStack) o;
					}
				}
			}
		}

		if (parRecipe instanceof ShapelessOreRecipe) {
			ArrayList shapelessArray = ((ShapelessOreRecipe) parRecipe).getInput();
			// DEBUG
			System.out.println(
					"getCraftingGrid for shapeless ore recipe with input array size = " + shapelessArray.size());
			for (int j = 0; j < shapelessArray.size(); j++) {
				if (shapelessArray.get(j) instanceof ItemStack) {
					resultItemStackArray[j] = (ItemStack) shapelessArray.get(j);
				} else if (shapelessArray.get(j) instanceof List) {
					Object o = ((List) shapelessArray.get(j)).get(0);
					if (o instanceof ItemStack) {
						resultItemStackArray[j] = (ItemStack) o;
					} else {
						// DEBUG
						System.out.println("But list element is not an ItemStack");
					}
				}
			}
		}

		if (Main.allowPartialweaponupdater) {
			return weaponupdaterAdjustedRecipes.adjustOutputQuantities(resultItemStackArray,
					parRecipe.getRecipeOutput());
		} else {
			return resultItemStackArray;
		}
	}
}