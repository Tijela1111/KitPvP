package me.TijelaPvP.comandos;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Youtuber
implements CommandExecutor
{
public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)
{
  Player player = (Player)sender;
  if (commandLabel.equalsIgnoreCase("Youtuber"))
  {
    player.sendMessage(ChatColor.GRAY + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    player.sendMessage(ChatColor.YELLOW + "Para Conseguir Tag Youtuber");
    player.sendMessage(ChatColor.GREEN + "Voce Precisa Ter 500 Subs E Gravar Um Video Do Server");
    player.sendMessage(ChatColor.GRAY + "-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    return true;
  }
  return false;
}
}
