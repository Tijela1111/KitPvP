package me.TijelaPvP.kits;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;

import me.TijelaPvP.Uteis.KitAPI;

public class Fisherman implements Listener {
	
	@EventHandler
	  public void Pescar(PlayerFishEvent e)
	  {
	    Player p = e.getPlayer();
	    if (((e.getCaught() instanceof Player)) && (KitAPI.getkit(p) == "Fisherman"))
	    {
	      Player t = (Player)e.getCaught();
	      t.teleport(p);
	      e.setCancelled(false);
	    }
	  }
	}


