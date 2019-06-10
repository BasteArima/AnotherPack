package arima.anotherpack.utils;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.StringUtils;

public class SkinChange {
/**extends CommandBase {

	
	private String vremskin = "";

	@Override
	public int compareTo(Object arg0) {
		return 0;
	}

	@Override
	public String getCommandName() {
		return "sc";
	}

	@Override
	public String getCommandUsage(ICommandSender sender) {
		return "/sc <name|clear|stat> - сменить/очистить/текущий скин";
	}

	@Override
	public List getCommandAliases() {
		List<String> aliases = new ArrayList();
		aliases.add("sc");
		aliases.add("skinchange");

		return aliases;
	}

	@Override
	public void processCommand(ICommandSender sender, String[] args) {

		if (sender instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) sender;
			if (args[0].equals("clear")) {
				Minecraft.getMinecraft().thePlayer.skinUrl = "http://skins.mcskill.ru/MinecraftSkins/"
						+ StringUtils.stripControlCodes(player.username) + ".png";
				player.addChatMessage("§aОчистка скина прошла успешно!");
				vremskin = "";
			} else if (args[0].equals("stat")) {
				if (vremskin != "") {
					player.addChatMessage("Ваш текущий скин - " + vremskin);
				} else {
					player.addChatMessage("Ваш текущий скин - " + player.username);
				}

			} else {
				vremskin = args[0];
				Minecraft.getMinecraft().thePlayer.skinUrl = "http://skins.mcskill.ru/MinecraftSkins/"
						+ StringUtils.stripControlCodes(args[0]) + ".png";
				player.addChatMessage("§bВы сменили скин на " + args[0]);
			}
		}
	}

	@Override
	public boolean canCommandSenderUseCommand(ICommandSender sender) {
		return true;
	}

	@Override
	public List addTabCompletionOptions(ICommandSender sender, String[] args) {
		return null;
	}

	@Override
	public boolean isUsernameIndex(String[] args, int ints) {
		return false;
	}
	
	**/

}