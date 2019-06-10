package arima.anotherpack.tabs;

import arima.anotherpack.core.AllBlocks;
import arima.anotherpack.core.Main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class tabAPIronBlocks extends CreativeTabs {
	public tabAPIronBlocks(int position, String tabID) {
		super(position, tabID);
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return AllBlocks.IronBlock_1.blockID;
	}

	public String getTranslatedTabLabel()
	{
		return "Another Pack - Железные блоки";
	}
}
