package me.TijelaPvP.Uteis;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Pl implements CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String Label,String[] arg3) {
		Player p = (Player)sender;
		if (Label.equalsIgnoreCase("pl")) {
			p.sendMessage("§b§lPlugin Criado Por:§7_SosaBubble");
			return true;
		}
		return false;
	}
	

}
