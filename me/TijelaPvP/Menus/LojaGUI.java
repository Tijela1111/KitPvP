package me.TijelaPvP.Menus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class LojaGUI implements Listener {
	
	@EventHandler
	public void Clicar(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if(((e.getAction() == Action.RIGHT_CLICK_AIR) ||(e.getAction() == Action.RIGHT_CLICK_BLOCK))
				&& p.getItemInHand().getType() == Material.EMERALD && p.getItemInHand().getItemMeta().getDisplayName() == "§aLoja") {
			InvLoja(p);
		}

	}
	public void InvLoja(Player p) {
		Inventory loja = Bukkit.createInventory(p, 27, "§aLoja");
		
		ItemStack vidro = new ItemStack(Material.THIN_GLASS);
		ItemMeta vidrometa = vidro.getItemMeta();
		vidrometa.setDisplayName(" ");
		vidro.setItemMeta(vidrometa);
		
		ItemStack buycraft = new ItemStack(Material.EMERALD);
		ItemMeta buycraftmeta = buycraft.getItemMeta();
		buycraftmeta.setDisplayName("§c§lMANUTENCAO");
		buycraft.setItemMeta(buycraftmeta);
		
		ItemStack lojadekits = new ItemStack(Material.ENDER_CHEST);
		ItemMeta lojadekitsmeta = lojadekits.getItemMeta();
		lojadekitsmeta.setDisplayName("§c§lLoja De Kits");
		lojadekits.setItemMeta(lojadekitsmeta);
		
		loja.setItem(0, vidro);
		loja.setItem(1, vidro);
		loja.setItem(2, vidro);
		loja.setItem(3, vidro);
		loja.setItem(4, vidro);
		loja.setItem(5, vidro);
		loja.setItem(6, vidro);
		loja.setItem(7, vidro);
		loja.setItem(8, vidro);
		loja.setItem(9, vidro);
		loja.setItem(10, vidro);
		loja.setItem(11, vidro);
		loja.setItem(12, buycraft);
		loja.setItem(13, vidro);
		loja.setItem(14, lojadekits);
		loja.setItem(15, vidro);
		loja.setItem(16, vidro);
		loja.setItem(17, vidro);
		loja.setItem(18, vidro);
		loja.setItem(19, vidro);
		loja.setItem(20, vidro);
		loja.setItem(21, vidro);
		loja.setItem(22, vidro);
		loja.setItem(23, vidro);
		loja.setItem(24, vidro);
		loja.setItem(25, vidro);
		loja.setItem(26, vidro);
		p.openInventory(loja);
}
	@EventHandler
	   public void onInteracts(InventoryClickEvent e) {
		   Player p = (Player) e.getWhoClicked(); 
		   if(e.getInventory().getName().equalsIgnoreCase("§aLoja")) {
			   if(e.getCurrentItem().getType() == Material.EMERALD) {
			   p.closeInventory();
			   p.chat("/buy");
		   }
			   if(e.getCurrentItem().getType() == Material.ENDER_CHEST) {
				   p.closeInventory();
				   p.chat("/comprar");
				   p.sendMessage("§c§lEm Breve");
			   }
}
	}
}
