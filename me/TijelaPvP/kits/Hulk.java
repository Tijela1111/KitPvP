package me.TijelaPvP.kits;

import java.util.ArrayList;

import me.TijelaPvP.Main;
import me.TijelaPvP.Uteis.KitAPI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class Hulk implements Listener {
	

	  ArrayList<String> Hulk = new ArrayList();
	  ArrayList<String> Cooldown = new ArrayList();
	  
	  @EventHandler(priority=EventPriority.HIGHEST)
	  public void onHulk(PlayerInteractEntityEvent event)
	  {
	    final Player p = event.getPlayer();
	    if ((event.getRightClicked() instanceof Player))
	    {
	      Player d = (Player)event.getRightClicked();
	      if ((KitAPI.getkit(p) == "Hulk") && (p.getItemInHand().getType().equals(Material.AIR)))
	      {
	        if (this.Cooldown.contains(p.getName()))
	        {
	          event.setCancelled(true);
	          return;
	        }
	        if (p.getPassenger() == null)
	        {
	          p.setPassenger(d);
	          this.Cooldown.add(p.getName());
	        }
	      }
	    }
	    if (this.Cooldown.contains(p.getName())) {
	      Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
	      {
	        public void run()
	        {
	          Hulk.this.Cooldown.remove(p.getName());
	        }
	      }, 120L);
	    }
	  }
	}
