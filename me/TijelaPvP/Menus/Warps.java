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

public class Warps implements Listener {
	
	@EventHandler
	public void Clicar(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if(((e.getAction() == Action.RIGHT_CLICK_AIR) ||(e.getAction() == Action.RIGHT_CLICK_BLOCK))
				&& p.getItemInHand().getType() == Material.PAPER && p.getItemInHand().getItemMeta().getDisplayName() == "§bWarps") {
			InvWarps(p);
		}

}
	public static void InvWarps(Player p) {
		Inventory warps = Bukkit.createInventory(p, 27, "§bWarps");
		
		ItemStack vidro = new ItemStack(Material.THIN_GLASS);
		ItemMeta vidrometa = vidro.getItemMeta();
		vidrometa.setDisplayName(" ");
		vidro.setItemMeta(vidrometa);
		
		ItemStack cake = new ItemStack(Material.CAKE);
		ItemMeta cakemeta = cake.getItemMeta();
		cakemeta.setDisplayName("§dRdm");
		cake.setItemMeta(cakemeta);
		
		ItemStack baude = new ItemStack(Material.WATER_BUCKET);
		ItemMeta baudemeta = baude.getItemMeta();
		baudemeta.setDisplayName("§9Mlg ");
		baude.setItemMeta(baudemeta);
		
		ItemStack baudelava = new ItemStack(Material.LAVA_BUCKET);
		ItemMeta baudelavameta = baudelava.getItemMeta();
		baudelavameta.setDisplayName("§cChallenger");
		baudelava.setItemMeta(baudelavameta);
		
		ItemStack blaze = new ItemStack(Material.BLAZE_ROD);
		ItemMeta blazemeta = blaze.getItemMeta();
		blazemeta.setDisplayName("§61v1");
		blaze.setItemMeta(blazemeta);
		
		ItemStack stick = new ItemStack(Material.STICK);
		ItemMeta stickmeta = stick.getItemMeta();
		stickmeta.setDisplayName("§5Knock");
		stick.setItemMeta(stickmeta);
		
		ItemStack vidroblock = new ItemStack(Material.GLASS);
		ItemMeta vidroblockmeta = vidroblock.getItemMeta();
		vidroblockmeta.setDisplayName("§bFPS");
		vidroblock.setItemMeta(vidroblockmeta);
		
		ItemStack espada = new ItemStack(Material.DIAMOND_SWORD);
		ItemMeta espadameta = espada.getItemMeta();
		espadameta.setDisplayName("§2Main");
		espada.setItemMeta(espadameta);
		
		warps.setItem(0, vidro);
		warps.setItem(1, vidro);
		warps.setItem(2, vidro);
		warps.setItem(3, vidro);
		warps.setItem(4, vidro);
		warps.setItem(5, vidro);
		warps.setItem(6, vidro);
		warps.setItem(7, vidro);
		warps.setItem(8, vidro);
		warps.setItem(9, vidro);
		warps.setItem(10, cake);
		warps.setItem(11, baude);
		warps.setItem(12, baudelava);
		warps.setItem(13, blaze);
		warps.setItem(14, stick);
		warps.setItem(15, vidroblock);
		warps.setItem(16, espada);
		warps.setItem(17, vidro);
		warps.setItem(18, vidro);
		warps.setItem(19, vidro);
		warps.setItem(20, vidro);
		warps.setItem(21, vidro);
		warps.setItem(22, vidro);
		warps.setItem(23, vidro);
		warps.setItem(24, vidro);
		warps.setItem(25, vidro);
		warps.setItem(26, vidro);
		
		p.openInventory(warps);
	}
	 @EventHandler
	   public void onInteracts(InventoryClickEvent e) {
		   Player p = (Player) e.getWhoClicked(); 
		   if(e.getInventory().getName().equalsIgnoreCase("§bWarps")) {
			   if(e.getCurrentItem().getType() == Material.CAKE) {
			   p.closeInventory();
			   p.chat("/rdm");
			   p.closeInventory();
			   }
			   if(e.getCurrentItem().getType() == Material.WATER_BUCKET) {
				   p.closeInventory();
				   p.chat("/mlg");
				   p.closeInventory();
				   }
			   if(e.getCurrentItem().getType() == Material.LAVA_BUCKET) {
				   p.closeInventory();
				   p.chat("/challenge");
				   p.closeInventory();
				   }
			   if(e.getCurrentItem().getType() == Material.BLAZE_ROD) {
				   p.closeInventory();
				   p.chat("/1v1");
				   p.closeInventory();
				   }
			   if(e.getCurrentItem().getType() == Material.STICK) {
				   p.closeInventory();
				   p.chat("/knock");
				   p.closeInventory();
				   }
			   if(e.getCurrentItem().getType() == Material.GLASS) {
				   p.closeInventory();
				   p.chat("/fps");
				   p.closeInventory();
				   }
			   if(e.getCurrentItem().getType() == Material.DIAMOND_SWORD) {
				   p.closeInventory();
				   p.chat("/main");
				   p.closeInventory();
				   }
		   }
	 }
}