package me.TijelaPvP.kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import me.TijelaPvP.Uteis.KitAPI;

public class Specialist implements Listener {
	
	@EventHandler
	  public void Clicar(PlayerInteractEvent e)
	  {
	    Player p = e.getPlayer();
	    if ((e.getMaterial() == Material.BOOK) && (e.getItem().getType() == Material.BOOK) && (KitAPI.getkit(p) == "Specialist")) {
	      p.openEnchanting(p.getLocation(), true);
	    }
	  }
	  
	  @EventHandler
	  public void Matar(PlayerDeathEvent e)
	  {
	    Player p = e.getEntity();
	    Player t = e.getEntity().getKiller();
	    if (((p instanceof Player)) && ((t instanceof Player)) && 
	      (KitAPI.getkit(t) == "Specialist"))
	    {
	      t.sendMessage("§aKITPVP:§fVoce ganhou Xp por matar: " + p.getName());
	      t.setLevel(1);
	    }
	  }
	}


