package openblocks.client;

import java.io.File;
import java.util.Calendar;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.ForgeDirection;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.liquids.LiquidStack;
import openblocks.OpenBlocks;
import openblocks.OpenBlocks.Config;
import openblocks.client.fx.FXLiquidSpray;
import openblocks.client.renderer.BlockRenderingHandler;
import openblocks.client.renderer.ItemRendererTank;
import openblocks.client.renderer.tileentity.TileEntityBearTrapRenderer;
import openblocks.client.renderer.tileentity.TileEntityFlagRenderer;
import openblocks.client.renderer.tileentity.TileEntityGuideRenderer;
import openblocks.client.renderer.tileentity.TileEntityTankRenderer;
import openblocks.client.renderer.tileentity.TileEntityTargetRenderer;
import openblocks.client.renderer.tileentity.TileEntityTrophyRenderer;
import openblocks.common.CommonProxy;
import openblocks.common.entity.EntityGhost;
import openblocks.common.tileentity.TileEntityBearTrap;
import openblocks.common.tileentity.TileEntityFlag;
import openblocks.common.tileentity.TileEntityGuide;
import openblocks.common.tileentity.TileEntityTank;
import openblocks.common.tileentity.TileEntityTarget;
import openblocks.common.tileentity.TileEntityTrophy;
import openblocks.sync.SyncableManager;

public class ClientProxy extends CommonProxy {

	public ClientProxy() {
		OpenBlocks.syncableManager = new SyncableManager();
		MinecraftForge.EVENT_BUS.register(new SoundLoader());
	}

	public void registerRenderInformation() {

		OpenBlocks.renderId = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(new BlockRenderingHandler());

		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGuide.class, new TileEntityGuideRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTarget.class, new TileEntityTargetRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityFlag.class, new TileEntityFlagRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTank.class, new TileEntityTankRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTrophy.class, new TileEntityTrophyRenderer());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBearTrap.class, new TileEntityBearTrapRenderer());

		MinecraftForgeClient.registerItemRenderer(OpenBlocks.Config.blockTankId, new ItemRendererTank());

		assertItemHangGliderRenderer();

		TickRegistry.registerTickHandler(new ClientTickHandler(), Side.CLIENT);
		attachPlayerRenderer();

		MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
	}


	private void attachPlayerRenderer() {
		if (Config.tryHookPlayerRenderer) {
			// Get current renderer and check that it's Mojangs
			Render render = (Render)RenderManager.instance.entityRenderMap.get(EntityPlayer.class);
			if (render.getClass().equals(net.minecraft.client.renderer.entity.RenderPlayer.class)) {
			}
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if ((world instanceof WorldClient)) {
			TileEntity tile = world.getBlockTileEntity(x, y, z);

		}
		return null;
	}

	/* I'll just sneak this in here ;) -NeverCast */
	@ForgeSubscribe
	public void onEntityJoinWorld(EntityJoinWorldEvent event) {
		if (event.world != null && event.world.isRemote) {
			if (event.entity instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer)event.entity;
				Calendar cal = Calendar.getInstance();
				if (cal.get(Calendar.MONTH) == Calendar.AUGUST
						&& cal.get(Calendar.DATE) == 16) {
					player.sendChatToPlayer("Happy Birthday Mikee!! :)");
				}
			}
		}
	}

	@Override
	public File getWorldDir(World world) {
		return new File(OpenBlocks.getBaseDir(), "saves/"
				+ world.getSaveHandler().getWorldDirectoryName());
	}

	/**
	 * Is this the server
	 * 
	 * @return true if this is the server
	 */
	public boolean isServer() {
		return false;
	}

	/**
	 * Is this the client
	 * 
	 * @return true if this is the client
	 */
	public boolean isClient() {
		return true;
	}

	public void spawnLiquidSpray(World worldObj, LiquidStack water, double x, double y, double z, ForgeDirection direction, float angleRadians, float spread) {
		FXLiquidSpray spray = new FXLiquidSpray(worldObj, water, x, y, z, direction, angleRadians, spread);
		Minecraft.getMinecraft().effectRenderer.addEffect(spray);
	}
}
