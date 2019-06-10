package arima.anotherpack.tabs;

import arima.anotherpack.core.AllBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class tabAPStoneBlocks extends CreativeTabs {
	public tabAPStoneBlocks(int position, String tabID) {
		super(position, tabID);
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return AllBlocks.StoneBlocks_1.blockID;
	}

	public String getTranslatedTabLabel()
	{
		return "Another Pack - Каменные блоки";
	}
}
