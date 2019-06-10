package arima.anotherpack.common.wu;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{

    @Override
    public Object getServerGuiElement(
          int ID, 
          EntityPlayer player, 
          World world, 
          int x, 
          int y, 
          int z
          ) 
    { 
    	TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
        //TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
/**
        if (tileEntity != null)
        {
            if (ID == Main.GUI_ENUM.GRINDER.ordinal())
            {
                return new ContainerGrinder(player.inventory, (IInventory)tileEntity);
            }
            if (ID == Main.GUI_ENUM.COMPACTOR.ordinal())
            {
                return new ContainerCompactor(player.inventory, (IInventory)tileEntity);
            }
            if (ID == Main.GUI_ENUM.TANNING_RACK.ordinal())
            {
                return new ContainerTanningRack(player.inventory, (IInventory)tileEntity);
            }
            if (ID == Main.GUI_ENUM.FORGE.ordinal())
            {
                return new ContainerForge(player.inventory, (IInventory)tileEntity);
            }
        }
        **/
        if (ID == Main.GUI_ENUM.DECONSTRUCTOR.ordinal())
        {
            return new WeaponUpdaterContainer(player.inventory, world, x, y, z);
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(
          int ID, 
          EntityPlayer player, 
          World world, 
          int x, 
          int y, 
          int z
          )
    {
    	TileEntity tileEntity = world.getBlockTileEntity(x, y, z);
    	/**  TileEntity tileEntity = world.getTileEntity(new BlockPos(x, y, z));
        
        if (tileEntity != null)
        {
            if (ID == Main.GUI_ENUM.GRINDER.ordinal())
            {
                return new GuiGrinder(player.inventory, (IInventory)tileEntity);
            }
            if (ID == Main.GUI_ENUM.COMPACTOR.ordinal())
            {
                return new GuiCompactor(player.inventory, (IInventory)tileEntity);
            }
            if (ID == Main.GUI_ENUM.TANNING_RACK.ordinal())
            {
                return new GuiTanningRack(player.inventory, (IInventory)tileEntity);
            }
            if (ID == Main.GUI_ENUM.FORGE.ordinal())
            {
                return new GuiForge(player.inventory, (IInventory)tileEntity);
            }
       }
       **/
        if (ID == Main.GUI_ENUM.DECONSTRUCTOR.ordinal())
        {
            return new WeaponUpdaterGUI(player.inventory, world, StatCollector.translateToLocal("Сборщик оружия"), x, y, z);
        }
        return null;
    }
}