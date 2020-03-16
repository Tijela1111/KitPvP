package me.TijelaPvP.comandos;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class Gamemode 
implements Listener, CommandExecutor
{
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		    if (!(sender instanceof Player)) {
		      return false;
		    }
	    Player p = (Player)sender;
	    if ((cmd.getName().equalsIgnoreCase("gm")) && (sender.hasPermission("kitpvp.staff")))
	    {
	      if (args.length != 1){
	        p.sendMessage("§aKITPVP » §cUse /gm [0/1]");
	        return true;
	      }
	      if (args.length == 1){
	        if (args[0].equalsIgnoreCase("0")){
	          p.setGameMode(GameMode.SURVIVAL);
	          p.sendMessage("§aKITPVP » §aGameMode alterado para 0/Sobrevivencia");
	        }
	        if (args[0].equalsIgnoreCase("1")){
	          p.setGameMode(GameMode.CREATIVE);
	          p.sendMessage("§aKITPVP » §aGameMode alterado para 1/Criativo");
	        }
	        return true;
	      }
	    }
	    return false;
	  }
	}