package arima.anotherpack.common.weapons;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneRepeater;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityBullet extends EntityThrowable
{
    int damage;

    public EntityBullet(World world)
    {
        super(world);
    }
    
    // Наш кастомный конструктор для пули
    // par1world  -  мир в котором будет пуля
    // par2EntityLivingBase - тот, кто осуществил выстрел
    // par3Velocity - скорость полёта пули
    // par4Accuracy - разброс при стрельбе
    // par5Damage - урон от попадания
    public EntityBullet(World par1world, EntityLiving par2EntityLiving, float par3Velocity, float par4Accuracy, int par5Damage)
    {
        super(par1world, par2EntityLiving);
        this.setThrowableHeading(this.motionX, this.motionY, this.motionZ, par3Velocity, par4Accuracy);
        this.damage = par5Damage;
    }

    @Override
    protected void onImpact(MovingObjectPosition par1MovingObjectPosition)
    {
        if (!this.worldObj.isRemote)
        {
            if (par1MovingObjectPosition.entityHit instanceof EntityLiving)
            {
                par1MovingObjectPosition.entityHit.attackEntityFrom(DamageSource.cactus, this.damage);
                par1MovingObjectPosition.entityHit.hurtResistantTime = 0;
            }
            this.setDead();
        }
    }
}
