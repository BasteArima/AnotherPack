package openblocks.common;

import java.lang.reflect.Method;
import java.util.HashMap;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import openblocks.OpenBlocks;
import openblocks.common.tileentity.TileEntityTrophy;
import openblocks.trophy.BlazeBehavior;
import openblocks.trophy.CaveSpiderBehavior;
import openblocks.trophy.CreeperBehavior;
import openblocks.trophy.EndermanBehavior;
import openblocks.trophy.ITrophyBehavior;
import openblocks.trophy.ItemDropBehavior;
import openblocks.trophy.MooshroomBehavior;
import openblocks.trophy.SkeletonBehavior;
import openblocks.trophy.SnowmanBehavior;
import openblocks.trophy.SquidBehavior;
import openblocks.utils.BlockUtils;

public class TrophyHandler {

	public static HashMap<Trophy, Entity> entityCache = new HashMap<Trophy, Entity>();

	public static Entity getEntityFromCache(Trophy trophy) {
		Entity entity = entityCache.get(trophy);
		if (entity == null) {
			entity = EntityList.createEntityByName(trophy.toString(), null);
			if (entity instanceof EntitySlime) {
				try {
					Method slimeSizeMethod = EntitySlime.class.getDeclaredMethod("setSlimeSize", int.class);
					if (slimeSizeMethod == null) {
						slimeSizeMethod = EntitySlime.class.getDeclaredMethod("func_70799_a", int.class);
					}
					if (slimeSizeMethod != null) {
						slimeSizeMethod.setAccessible(true);
						slimeSizeMethod.invoke(entity, 1);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			entityCache.put(trophy, entity);
		}
		return entity;
	}

	public enum Trophy {
		Wolf(), Chicken(), Cow(), Creeper(), Skeleton(), PigZombie(), Bat(1.0,
				-0.3), Zombie(), Witch(0.35), Villager(), Ozelot(), Sheep(), Blaze(), Silverfish(), Spider(), CaveSpider(), Slime(0.4), Ghast(0.1, 0.2), Enderman(),
				LavaSlime(0.8), Squid(), MushroomCow(), VillagerGolem(
				0.3), SnowMan(), Pig();

		private double scale = 0.4;
		private double verticalOffset = 0.0;
		private ITrophyBehavior behavior;

		Trophy() {}

		Trophy(ITrophyBehavior behavior) {
			this.behavior = behavior;
		}

		Trophy(double scale) {
			this.scale = scale;
		}

		Trophy(double scale, ITrophyBehavior behavior) {
			this.scale = scale;
			this.behavior = behavior;
		}

		Trophy(double scale, double verticalOffset) {
			this(scale);
			this.verticalOffset = verticalOffset;
		}

		Trophy(double scale, double verticalOffset, ITrophyBehavior behavior) {
			this(scale, verticalOffset);
			this.behavior = behavior;
		}

		public double getVerticalOffset() {
			return verticalOffset;
		}

		public double getScale() {
			return scale;
		}

		public Entity getEntity() {
			return getEntityFromCache(this);
		}

		public ItemStack getItemStack() {
			ItemStack stack = new ItemStack(OpenBlocks.Blocks.trophy, 1, ordinal());
			NBTTagCompound tag = new NBTTagCompound();
			tag.setString("entity", toString());
			stack.setTagCompound(tag);
			return stack;
		}

		public void playSound(World world, double x, double y, double z) {
			Entity e = getEntity();
			e.posX = x;
			e.posY = y;
			e.posZ = z;
			e.worldObj = world;
			if (e instanceof EntityLiving) {
				((EntityLiving)e).playLivingSound();
			}
		}

		public void executeActivateBehavior(TileEntityTrophy tile, EntityPlayer player) {
			if (behavior != null) {
				behavior.executeActivateBehavior(tile, player);
			}
		}

		public void executeTickBehavior(TileEntityTrophy tile) {
			if (behavior != null) {
				behavior.executeTickBehavior(tile);
			}
		}
	}

	@ForgeSubscribe
	public void onLivingDeath(LivingDeathEvent event) {
		if (!event.entity.worldObj.isRemote) {
			if (Math.random() < OpenBlocks.Config.trophyDropChance) {
				Entity entity = event.entity;
				String entityName = EntityList.getEntityString(entity);
				if (entityName != null && !entityName.isEmpty()) {
					Trophy mobTrophy = null;
					try {
						mobTrophy = Trophy.valueOf(EntityList.getEntityString(entity));
					} catch (Exception e) {}
					if (mobTrophy != null) {
						BlockUtils.dropItemStackInWorld(entity.worldObj, entity.posX, entity.posY, entity.posZ, mobTrophy.getItemStack());
					}
				}
			}
		}
	}

}
