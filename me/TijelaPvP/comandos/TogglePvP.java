package me.TijelaPvP.comandos;

import java.util.HashMap;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class TogglePvP
  implements CommandExecutor, Listener
{
  public HashMap<String, ItemStack[]> a = new HashMap();
  public HashMap<String, ItemStack[]> b = new HashMap();
  
  public boolean a(String s)
  {
    try
    {
      Integer.parseInt(s);
      return true;
    }
    catch (NumberFormatException localNumberFormatException) {}
    return false;
  }
  
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
  {
    if (!(sender instanceof Player))
    {
      sender.sendMessage(ChatColor.RED + "Somente jogadores podem executar este comando!");
      return true;
    }
    Player p = (Player)sender;
    if ((cmd.getName().equalsIgnoreCase("togglepvp")) && (
      (p.hasPermission("kitpvp.staff")) || (p.isOp())))
    {
      if (p.getWorld().getPVP())
      {
        p.getWorld().setPVP(false);
        Bukkit.getServer().broadcastMessage(ChatColor.DARK_RED + "O PvP global foi desativado");
        return true;
      }
      p.getWorld().setPVP(true);
      Bukkit.getServer().broadcastMessage(ChatColor.DARK_GREEN + "O PvP global foi ativado");
      return true;
    }
    return false;
  }
}
