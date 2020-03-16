package me.TijelaPvP.kits;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.util.Vector;

import me.TijelaPvP.Uteis.KitAPI;

public class Kangaroo implements Listener {
	public static ArrayList<Player> kangaroo = new ArrayList();
	  
	  @EventHandler
	  public void onInteract(PlayerInteractEvent event)
	  {
	    Player p = event.getPlayer();
	    if (p.getItemInHand().getType() == Material.FIREWORK)
	    {
	      if ((event.getAction() == Action.LEFT_CLICK_AIR) || 
	        (event.getAction() == Action.LEFT_CLICK_BLOCK) || 
	        (event.getAction() == Action.RIGHT_CLICK_BLOCK) || 
	        (event.getAction() == Action.RIGHT_CLICK_AIR)) {
	        event.setCancelled(true);
	      }
	      if ((KitAPI.getkit(p) == "Kangaroo") && 
	        (!kangaroo.contains(p)))
	      {
	        if (!p.isSneaking())
	        {
	          p.setFallDistance(-5.0F);
	          Vector vector = p.getEyeLocation().getDirection();
	          vector.multiply(0.6F);
	          vector.setY(1.2F);
	          p.setVelocity(vector);
	        }
	        else
	        {
	          p.setFallDistance(-5.0F);
	          Vector vector = p.getEyeLocation().getDirection();
	          vector.multiply(1.2F);
	          vector.setY(0.8D);
	          p.setVelocity(vector);
	        }
	        kangaroo.add(p);
	      }
	    }
	  }
	  
	  @EventHandler
	  public void onMove(PlayerMoveEvent event)
	  {
	    Player p = event.getPlayer();
	    if (kangaroo.contains(p))
	    {
	      Block b = p.getLocation().getBlock();
	      if ((b.getType() != Material.AIR) || 
	        (b.getRelative(BlockFace.DOWN).getType() != Material.AIR))
	      {
	        kangaroo.remove(p);
	        
	        return;
	      }
	    }
	  }
	  
	  @EventHandler
	  public void onDamage(EntityDamageEvent event)
	  {
	    Entity e = event.getEntity();
	    if ((e instanceof Player))
	    {
	      Player player = (Player)e;
	      if (((event.getEntity() instanceof Player)) && 
	        (event.getCause() == EntityDamageEvent.DamageCause.FALL) && 
	        (player.getInventory().contains(Material.FIREWORK)) && 
	        (event.getDamage() >= 6.5D)) {
	        event.setDamage(6.5D);
	      }
	    }
	  }
	}
