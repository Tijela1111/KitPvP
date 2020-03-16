package me.TijelaPvP.comandos;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ip
implements CommandExecutor
{
public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)
{
  Player player = (Player)sender;
  if (commandLabel.equalsIgnoreCase("Ip"))
  {
    player.sendMessage(ChatColor.GREEN + "Ip: " + ChatColor.GRAY + "tijela.plugingdd.com");
    return true;
  }
  return false;
}
}
