package me.TijelaPvP.comandos;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Report implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	  {
	    Player p = (Player)sender;
	    if (label.equalsIgnoreCase("report"))
	    {
	      if (args.length == 0)
	      {
	        p.sendMessage("§cUse: /report {Jogador} {Motivo}!");
	        return true;
	      }
	      if (args.length == 1)
	      {
	        p.sendMessage("§cUse: /report {Jogador} {Motivo}!");
	        return true;
	      }
	      if (args.length >= 2)
	      {
	        String alvo = args[0];
	        Player target = Bukkit.getPlayer(alvo);
	        if (target == null)
	        {
	          p.sendMessage("§4Jogador nao encontrado!");
	          return true;
	        }
	        StringBuilder sb = new StringBuilder();
	        for (int i = 1; i < args.length; i++)
	        {
	          sb.append(args[i]);
	          if (i < args.length) {
	            sb.append(" ");
	          }
	        }
	        p.sendMessage("§6Report feito com sucesso!");
	        Player[] arrayOfPlayer;
	        int j = (arrayOfPlayer = Bukkit.getOnlinePlayers()).length;
	        for (int i = 0; i < j; i++)
	        {
	          Player staff = arrayOfPlayer[i];
	          if ((staff.hasPermission("kitpvp.staff")) || (staff.isOp()))
	          {
	            staff.sendMessage("§b---===+§a[§3REPORT§a]+===---");
	            staff.sendMessage("§cDe: " + p.getName());
	            staff.sendMessage("§aReportado: " + target.getName());
	            staff.sendMessage("§bMotivo: " + sb.toString());
	            staff.playSound(staff.getLocation(), Sound.CHICKEN_HURT, 10.0F, 1.0F);
	          }
	        }
	      }
	    }
	    return false;
	  }
	}

