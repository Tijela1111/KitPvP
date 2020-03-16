package me.TijelaPvP.comandos;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class bc implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args)
	  {
	    Player player = (Player)sender;
	    if (((commandLabel.equalsIgnoreCase("bc")) || (commandLabel.equalsIgnoreCase("say"))) && (player.hasPermission("kitpvp.staff")))
	    {
	      if (args.length >= 1)
	      {
	        String bcast = "";
	        for (int x = 0; x < args.length; x++) {
	          bcast = bcast + args[x] + " ";
	        }
	        bcast = ChatColor.translateAlternateColorCodes('&', bcast);
	        Bukkit.broadcastMessage("§aKITPVP:" + ChatColor.GRAY + bcast);
	      }
	      else
	      {
	        sender.sendMessage("§aUse: /bc <MSG>");
	        sender.sendMessage("§aUse: /say <MSG>");
	      }
	    }
	    else {
	      sender.sendMessage("§c§lVoce não tem permissao");
	    }
	    return false;
	  }
	}


