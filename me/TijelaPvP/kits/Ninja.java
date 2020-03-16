package me.TijelaPvP.kits;

import java.text.DecimalFormat;
import java.util.HashMap;

import me.TijelaPvP.Main;
import me.TijelaPvP.Uteis.KitAPI;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class Ninja implements Listener {
	
	public HashMap<Player, Player> a = new HashMap();
	  public HashMap<Player, Long> b = new HashMap();
	  
	  @EventHandler
	  public void a(EntityDamageByEntityEvent paramEntityDamageByEntityEvent)
	  {
	    if (((paramEntityDamageByEntityEvent.getDamager() instanceof Player)) && ((paramEntityDamageByEntityEvent.getEntity() instanceof Player)))
	    {
	      final Player localPlayer1 = (Player)paramEntityDamageByEntityEvent.getDamager();
	      Player localPlayer2 = (Player)paramEntityDamageByEntityEvent.getEntity();
	      if (KitAPI.getkit(localPlayer1) == "Ninja")
	      {
	        this.a.put(localPlayer1, localPlayer2);
	        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
	        {
	          public void run()
	          {
	            Backpacker.cooldownbk.remove(localPlayer1);
	          }
	        }, 100L);
	      }
	    }
	  }
	  
	  @EventHandler
	  public void a(PlayerToggleSneakEvent paramPlayerToggleSneakEvent)
	  {
	    Player localPlayer1 = paramPlayerToggleSneakEvent.getPlayer();
	    if ((paramPlayerToggleSneakEvent.isSneaking()) && (KitAPI.getkit(localPlayer1) == "Ninja") && (this.a.containsKey(localPlayer1)))
	    {
	      Player localPlayer2 = (Player)this.a.get(localPlayer1);
	      if ((localPlayer2 != null) && (!localPlayer2.isDead()))
	      {
	        String str = null;
	        if (this.b.get(localPlayer1) != null)
	        {
	          long l = ((Long)this.b.get(localPlayer1)).longValue() - System.currentTimeMillis();
	          DecimalFormat localDecimalFormat = new DecimalFormat("##");
	          int i = (int)l / 1000;
	          str = localDecimalFormat.format(i);
	        }
	        if ((this.b.get(localPlayer1) == null) || (((Long)this.b.get(localPlayer1)).longValue() < System.currentTimeMillis()))
	        {
	          if (localPlayer1.getLocation().distance(localPlayer2.getLocation()) < 100.0D)
	          {
	            localPlayer1.teleport(localPlayer2.getLocation());
	            localPlayer1.sendMessage("§aKITPVP:§a§lTeleportado para §c§l"  + localPlayer2.getName());
	            this.b.put(localPlayer1, Long.valueOf(System.currentTimeMillis() + 10000L));
	          }
	          else
	          {
	            localPlayer1.sendMessage("§aKITPVP:§c§lO Jogador Esta Muito Longe");
	          }
	        }
	        else {
	          localPlayer1.sendMessage("§aKITPVP:§c§lKit em Cooldown.");
	        }
	      }
	    }
	  }
	}


