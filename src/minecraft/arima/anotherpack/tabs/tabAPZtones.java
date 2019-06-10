package arima.anotherpack.tabs;

import arima.anotherpack.core.AllBlocks;
import arima.anotherpack.core.AllItems;
import arima.anotherpack.core.Main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class tabAPZtones extends CreativeTabs {
	public tabAPZtones(int position, String tabID) {
		super(position, tabID);
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return AllBlocks.aurora.blockID;
	}

	public String getTranslatedTabLabel()
	{
		return "Another Pack - ZTones";
	}
}
