package me.TijelaPvP.kits;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import me.TijelaPvP.Main;
import me.TijelaPvP.Uteis.KitAPI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class Phantom implements Listener {
	
	public static HashMap<String, Long> cooldownPhantom = new HashMap();
	  
	  @EventHandler
	  public void voar(PlayerInteractEvent e)
	  {
	    final Player p = e.getPlayer();
	    if ((e.getAction().name().contains("RIGHT")) && (p.getItemInHand().getType() == Material.FEATHER))
	    {
	      e.setCancelled(true);
	      p.updateInventory();
	      if (KitAPI.getkit(p) == "Phantom") {
	        if ((!cooldownPhantom.containsKey(p.getName())) || 
	          (((Long)cooldownPhantom.get(p.getName())).longValue() <= System.currentTimeMillis()))
	        {
	          p.setAllowFlight(true);
	          p.setFlying(true);
	          p.sendMessage("§aKITPVP:§a§lVoce ativou o kit !");
	          Bukkit.getScheduler().scheduleSyncDelayedTask(Main.plugin, new Runnable()
	          {
	            public void run()
	            {
	              p.setFlying(false);
	              p.setAllowFlight(false);
	              p.sendMessage("§aKITPVP:§c§lO efeito do Kit acabou.");
	            }
	          }, 100L);
	          cooldownPhantom.put(p.getName(), 
	            Long.valueOf(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(40L)));
	          p.playSound(p.getLocation(), Sound.LEVEL_UP, 20.0F, 1.0F);
	        }
	        else
	        {
	          p.sendMessage("§aKITPVP:§c§lKit em Cooldown.");
	        }
	      }
	    }
	  }
	}
