package arima.anotherpack.gyroscooter;

import arima.anotherpack.core.Main;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.Facing;
import net.minecraft.world.World;

public class ItemGyroscooter extends MultiItem {

    public int minecartType;
	
	public ItemGyroscooter(int par1, int par2, String name) {
		super(par1, par2);
		this.maxStackSize = 1;
        this.setUnlocalizedName(name);
        //this.setCreativeTab(Main.tabAPFan);
        GameRegistry.registerItem(this, name);
	}

	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10) {
	      if(par3World.isRemote) {
	         return true;
	      } else {
	         if(par1ItemStack.stackTagCompound == null) {
	            par1ItemStack.stackTagCompound = new NBTTagCompound();
	         }

	         Long id;
	         if(!par1ItemStack.stackTagCompound.hasKey("Hashid")) {
	            id = Long.valueOf(Long.parseLong(System.currentTimeMillis() + "" + par3World.rand.nextInt(99)));
	            par1ItemStack.stackTagCompound.setLong("Hashid", id.longValue());
	         } else {
	            id = Long.valueOf(par1ItemStack.stackTagCompound.getLong("Hashid"));
	         }

	         if(Main.LavaEntityID.contains(id)) {
	            return false;
	         } else {
	            int i1 = par3World.getBlockId(par4, par5, par6);
	            par4 += Facing.offsetsXForSide[par7];
	            par5 += Facing.offsetsYForSide[par7];
	            par6 += Facing.offsetsZForSide[par7];
	            double d0 = 0.0D;
	            if(par7 == 1 && Block.blocksList[i1] != null && Block.blocksList[i1].getRenderType() == 11) {
	               d0 = 0.5D;
	            }

	            EntityGyroscooter entity = new EntityGyroscooter(par3World);
	            entity.OwnerPlayer = par2EntityPlayer.getEntityName();
	            entity.EntityID = id;
	            entity.EntityColor = (byte)par1ItemStack.getItemDamage();
	          //Vmesto posX & cameraPitch nado drugoe
	            if(par2EntityPlayer.posX < (double)par5) {
	               return false;
	            } else {
	               entity.setLocationAndAngles((double)par4 + 0.5D, (double)par5 + d0, (double)par6 + 0.5D, par2EntityPlayer.rotationYaw - 180.0F, 0.0F);
	               entity.cameraPitch = entity.rotationYaw;
	               if(par3World.spawnEntityInWorld(entity)) {
	                  Main.LavaEntityID.add(id);
	               }

	               return true;
	            }
	         }
	      }
	   }
	}