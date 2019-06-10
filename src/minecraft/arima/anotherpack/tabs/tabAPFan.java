package arima.anotherpack.tabs;

import arima.anotherpack.core.AllBlocks;
import arima.anotherpack.core.AllItems;
import arima.anotherpack.core.Main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class tabAPFan extends CreativeTabs {
	public tabAPFan(int position, String tabID) {
		super(position, tabID);
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return AllBlocks.DarlingInFranx_gif.blockID;
	}

	public String getTranslatedTabLabel()
	{
		return "Another Pack - Фан";
	}
}
