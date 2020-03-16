package me.TijelaPvP.kits;

import me.TijelaPvP.Main;
import me.TijelaPvP.Uteis.KitAPI;

import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.util.Vector;

public class Anchor implements Listener {
	
	@EventHandler
	  private void habilidadeAnchor(EntityDamageByEntityEvent e)
	  {
	    if (!(e.getEntity() instanceof Player)) {
	      return;
	    }
	    if (!(e.getDamager() instanceof Player)) {
	      return;
	    }
	    final Player jogador = (Player)e.getEntity();
	    Player anchor = (Player)e.getDamager();
	    if (KitAPI.getkit(jogador) == "Anchor")
	    {
	      jogador.setVelocity(new Vector());
	      jogador.playSound(jogador.getLocation(), Sound.ANVIL_BREAK, 3.0F, 3.0F);
	      
	      Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
	      {
	        public final void run()
	        {
	          jogador.setVelocity(new Vector());
	        }
	      }, 1L);
	    }
	    if (KitAPI.getkit(jogador) == "Anchor")
	    {
	      anchor.playSound(anchor.getLocation(), Sound.ANVIL_BREAK, 3.0F, 3.0F);
	      jogador.setVelocity(new Vector());
	      
	      Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
	      {
	        public final void run()
	        {
	          jogador.setVelocity(new Vector());
	        }
	      }, 1L);
	    }
	  }
	}

