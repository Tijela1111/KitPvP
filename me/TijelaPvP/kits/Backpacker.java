package me.TijelaPvP.kits;

import java.util.ArrayList;
import java.util.List;

import me.TijelaPvP.Main;
import me.TijelaPvP.Uteis.KitAPI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Backpacker implements Listener {
	
	static List<String> cooldownbk = new ArrayList();
	  
	  @EventHandler
	  public void backpackerKit(PlayerInteractEvent event)
	  {
	    final Player p = event.getPlayer();
	    ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
	    ItemMeta sopas = sopa.getItemMeta();
	    sopas.setDisplayName("§eSopas");
	    sopa.setItemMeta(sopas);
	    if ((p.getItemInHand().getType() == Material.NETHER_STAR) && (KitAPI.getkit(p) == "Backpacker"))
	    {
	      if ((event.getAction() == Action.RIGHT_CLICK_BLOCK) || (event.getAction() == Action.RIGHT_CLICK_AIR)) {
	        event.setCancelled(true);
	      }
	      if (cooldownbk.contains(p))
	      {
	        p.sendMessage("§c§lAguarde o Cooldown!");
	        return;
	      }
	      cooldownbk.add(p.getName());
	      Inventory v = Bukkit.createInventory(null, 27, "§eBackpacker");
	      for (int i = 0; i < 27; i++) {
	        v.addItem(new ItemStack[] { new ItemStack(sopa) });
	      }
	      event.getPlayer().openInventory(v);
	      cooldownbk.add(p.getName());
	      Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
	      {
	        public void run()
	        {
	          Backpacker.cooldownbk.remove(p);
	        }
	      }, 750L);
	    }
	  }
	}


