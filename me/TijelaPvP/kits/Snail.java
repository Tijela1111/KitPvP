package me.TijelaPvP.kits;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.TijelaPvP.Uteis.KitAPI;

public class Snail implements Listener {
	
	 @EventHandler
	  public void Bater(EntityDamageByEntityEvent e)
	  {
	    if (((e.getEntity() instanceof Player)) && ((e.getDamager() instanceof Player)))
	    {
	      Player p = (Player)e.getEntity();
	      Player t = (Player)e.getDamager();
	      if ((KitAPI.getkit(t) == "Snail") && (t.getItemInHand().getType() == Material.STONE_SWORD) && 
	        (new Random().nextInt(100) <= 40)) {
	        p.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, 100, 0, true));
	      }
	    }
	  }
	}


