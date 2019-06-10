package arima.anotherpack.gyroscooter;

import arima.anotherpack.core.Main;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntityGyroscooter extends EntityCreature {

	private final EntityAIControlledByPlayerAI aiControlledByPlayer;
	   public String OwnerPlayer;
	   public Long EntityID;
	   public byte EntityColor;
	   private byte flag = 0;


	   public EntityGyroscooter(World par1World) {
	      super(par1World);
	      super.texture = "/mods/anotherpack/textures/gyroscooter/gyroscooter.png";
	     // this.a(0.9F, 1.1F);
	      //this.aC().setAvoidsWater(true);
	      super.tasks.addTask(0, this.aiControlledByPlayer = new EntityAIControlledByPlayerAI(this, 0.36F));
	   }
	   
	   public boolean shouldRiderFaceForward(EntityPlayer player) {
		      return true;
		   }
/**
	   protected void o(Entity par1Entity) {}

	   public boolean L() {
	      return false;
	   }

	   

	   public void c() {
	      if(this.EntityColor != this.flag) {
	         this.flag = this.EntityColor;
	         this.setColor();
	      }

	      super.c();
	   }

	   @SideOnly(Side.SERVER)
	   private void onLivingUpdateServer() {
	      this.c();
	   }

	  

	   protected void aS() {
	      this.w();
	   }

	   protected boolean bm() {
	      return true;
	   }

	   public void w() {
	      Main.LavaEntityID.remove(this.EntityID);
	      super.M = true;
	   }

	   public boolean bh() {
	      return true;
	   }

	   public int aW() {
	      return 1;
	   }

	   protected void bo() {
	      super.bo();
	   }

	   public boolean bL() {
	      return true;
	   }

	   protected void a() {
	      super.a();
	      super.ah.addObject(16, Byte.valueOf(this.EntityColor));
	   }

	   public byte getColor() {
	      return super.ah.getWatchableObjectByte(16);
	   }

	   public void setColor() {
	      super.ah.updateObject(16, Byte.valueOf(this.EntityColor));
	   }

	   

	   protected String bb() {
	      return "";
	   }

	   protected String bc() {
	      return "";
	   }

	   protected String bd() {
	      return "";
	   }

	   protected void a(int par1, int par2, int par3, int par4) {}

	   public boolean a_(EntityPlayer par1EntityPlayer) {
	      if(!par1EntityPlayer.getEntityName().equals(this.OwnerPlayer)) {
	         return false;
	      } else if(super.a_(par1EntityPlayer)) {
	         return true;
	      } else if(!super.q.isRemote && (super.n == null || super.n == par1EntityPlayer)) {
	         par1EntityPlayer.mountEntity(this);
	         this.aA().setMoveTo(super.u + 0.1D, super.v, super.w, 0.36F);
	         return true;
	      } else {
	         return false;
	      }
	   }

	   protected void a(boolean par1, int par2) {}

	   

	   protected void a(float par1) {
	      super.a(par1);
	      if(par1 > 5.0F && super.n instanceof EntityPlayer) {
	         ((EntityPlayer)super.n).triggerAchievement(AchievementList.killEnemy);
	      }

	   }

	  **/
	   public void onStruckByLightning(EntityLightningBolt par1EntityLightningBolt) {}
	   
	   public boolean attackEntityFrom(DamageSource par1DamageSource, int par2) {
		      Entity entity = par1DamageSource.getEntity();
		      if(entity != null) {
		         if(super.entityToAttack != null) {
		            super.entityToAttack.attackEntityFrom(par1DamageSource, par2);
		            return false;
		         }

		         if(entity instanceof EntityPlayer && !entity.getEntityName().equals(this.OwnerPlayer)) {
		            return false;
		         }
		      }

		      return super.attackEntityFrom(par1DamageSource, par2);
		   }
	   
	   public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
		      super.writeEntityToNBT(par1NBTTagCompound);
		      par1NBTTagCompound.setString("OwnerPlayer", this.OwnerPlayer);
		      par1NBTTagCompound.setLong("EntityID", this.EntityID.longValue());
		      par1NBTTagCompound.setByte("EntityColor", this.EntityColor);
		   }

		   public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
		      super.readEntityFromNBT(par1NBTTagCompound);
		      this.OwnerPlayer = par1NBTTagCompound.getString("OwnerPlayer");
		      this.EntityID = Long.valueOf(par1NBTTagCompound.getLong("EntityID"));
		      this.EntityColor = par1NBTTagCompound.getByte("EntityColor");
		   }
	   
	   public boolean isBreedingItem(ItemStack par1ItemStack) {
		      return false;
		   }

		   public EntityAIControlledByPlayerAI getAIControlledByPlayer() {
		      return this.aiControlledByPlayer;
		   }

		   public EntityAgeable createChild(EntityAgeable par1EntityAgeable) {
		      return null;
		   }

	@Override
	public int getMaxHealth() {
		// TODO Auto-generated method stub
		return 1;
	}
	}