package me.TijelaPvP.kits;

import java.util.ArrayList;

import me.TijelaPvP.Main;
import me.TijelaPvP.Uteis.KitAPI;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.util.Vector;

public class Stomper implements Listener {
	
	 public static ArrayList<Player> cooldown = new ArrayList();
	  
	  @EventHandler
	  public static void pulou(EntityDamageEvent e)
	  {
	    if ((e.getEntity() instanceof Player))
	    {
	      Player p = (Player)e.getEntity();
	      if ((KitAPI.getkit(p) == "Stomper") && (e.getCause() == EntityDamageEvent.DamageCause.FALL))
	      {
	        p.damage(1);
	        if (e.getDamage() > 6.0D)
	        {
	          for (Entity s : p.getNearbyEntities(4.5D, 1.0D, 4.5D))
	          {
	            e.setDamage(1.0D);
	            if ((s instanceof Player))
	            {
	              Player t = (Player)s;
	              if (!t.isSneaking())
	              {
	                t.damage(999999, p);
	                e.setDamage(1.0D);
	              }
	              else
	              {
	                t.damage(4, p);
	                e.setDamage(1.0D);
	              }
	            }
	          }
	          e.setDamage(1.0D);
	        }
	      }
	    }
	  }
	  
	  @EventHandler
	  public void stomperApple(PlayerInteractEvent event)
	  {
	    final Player p = event.getPlayer();
	    if ((event.getPlayer().getItemInHand().getType() == Material.GOLDEN_APPLE) && 
	      (KitAPI.getkit(p) == "Stomper") && (
	      (event.getAction() == Action.LEFT_CLICK_AIR) || 
	      (event.getAction() == Action.LEFT_CLICK_BLOCK) || 
	      (event.getAction() == Action.RIGHT_CLICK_BLOCK) || 
	      (event.getAction() == Action.RIGHT_CLICK_AIR)))
	    {
	      event.setCancelled(true);
	      if (cooldown.contains(p))
	      {
	        p.sendMessage("§aKITPVP:§c§lKit em cooldown!");
	      }
	      else
	      {
	        Vector vector = p.getEyeLocation().getDirection();
	        vector.multiply(0.0F);
	        vector.setY(6.0F);
	        p.setVelocity(vector);
	        Location loc = p.getLocation();
	        p.getWorld().playSound(loc, Sound.ENDERMAN_TELEPORT, 5.0F, -5.0F);
	        cooldown.add(p);
	        Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
	        {
	          public void run()
	          {
	            if (Stomper.cooldown.contains(p))
	            {
	              Stomper.cooldown.remove(p);
	              p.playSound(p.getLocation(), Sound.LEVEL_UP, 1F, 1F);
	              p.sendMessage("§aKITPVP:§a§lVoce ja pode usar o kit novamente!");
	            }
	          }
	        }, 700L);
	      }
	    }
	  }
	}

