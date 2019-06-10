package arima.anotherpack.tabs;

import arima.anotherpack.core.AllBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class tabAPWoodBlocks extends CreativeTabs {
	public tabAPWoodBlocks(int position, String tabID) {
		super(position, tabID);
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return AllBlocks.WoodenBlock_1.blockID;
	}

	public String getTranslatedTabLabel()
	{
		return "Another Pack - Деревянные блоки";
	}
}
