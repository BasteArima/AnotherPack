package arima.anotherpack.tabs;

import arima.anotherpack.core.AllItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class TabAPItems extends CreativeTabs {

	public TabAPItems(int position, String tabID) {
		super(position, tabID);
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return AllItems.Book2.itemID;
	}

	public String getTranslatedTabLabel()
	{
		return "Another Pack - Предметы";
	}
}
