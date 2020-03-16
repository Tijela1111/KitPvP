package me.TijelaPvP.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_7_R4.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Ping
implements CommandExecutor
{
public boolean onCommand(CommandSender sender, Command command, String c, String[] args)
{
  if ((sender instanceof Player))
  {
    Player p = (Player)sender;
    int ping = ((CraftPlayer)p).getHandle().ping;
    if (c.equalsIgnoreCase("ping")) {
      if (args.length == 0)
      {
        p.sendMessage("§a§lSeu Ping e de: §7" + ping + " §a§lMs");
      }
      else if (p.getServer().getPlayer(args[0]) != null)
      {
        String player2 = args[0];
        Player target = Bukkit.getServer().getPlayer(args[0]);
        int ping2 = ((CraftPlayer)target).getHandle().ping;
        p.sendMessage(ChatColor.AQUA + "O Jogador " + player2 + " tem um ping de: " + ChatColor.WHITE + ping2 + ChatColor.GREEN + " ms!");
      }
      else
      {
        String player2 = args[0];
        p.sendMessage(ChatColor.RED + player2 + " Nao esta Online!");
      }
    }
  }
  return false;
}
}
