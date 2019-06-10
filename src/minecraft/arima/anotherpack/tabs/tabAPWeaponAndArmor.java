package arima.anotherpack.tabs;

import arima.anotherpack.core.AllItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class tabAPWeaponAndArmor extends CreativeTabs {

	public tabAPWeaponAndArmor(int position, String tabID) {
		super(position, tabID);
	}
	
	@SideOnly(Side.CLIENT)
	public int getTabIconItemIndex()
	{
		return AllItems.ColorSword_Diamond.itemID;
	}

	public String getTranslatedTabLabel()
	{
		return "Another Pack - Оружие/Броня/Руны";
	}
}
