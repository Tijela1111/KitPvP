package me.TijelaPvP.Menus;


import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class GUIInteracts implements Listener {
	
	@EventHandler
	public void Interagir(InventoryClickEvent e) {
		Inventory inv = e.getInventory();
		Player p = (Player)e.getWhoClicked();
		
		if(inv.getTitle() == "§6Kits" && e.getCurrentItem().getType() != Material.AIR) {
			e.setCancelled(true);
		}
		if(inv.getTitle() == "§bWarps" && e.getCurrentItem().getType() != Material.AIR) {
			e.setCancelled(true);
		}
		if(inv.getTitle() == "§aLoja" && e.getCurrentItem().getType() != Material.AIR) {
			e.setCancelled(true);
		}
	}

}
