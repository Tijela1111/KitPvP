package me.TijelaPvP.kits;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class KitManager implements Listener{
	
	public static void darSopas(Player p) {
        for (int x = 0; x < 35; x++) {
          p.getInventory().addItem(new ItemStack[] { new ItemStack(Material.MUSHROOM_SOUP) });
        
	}
	}
	
	public static void darItemEnchant(Player p, Material mat, int quantidade, String nome, int lugar, Enchantment enchant, int level, boolean trueorfalse)
	  {
	    ItemStack item = new ItemStack(mat, quantidade);
	    ItemMeta itemmeta = item.getItemMeta();
	    itemmeta.addEnchant(enchant, level, trueorfalse);
	    itemmeta.setDisplayName(nome);
	    item.setItemMeta(itemmeta);
	    p.getInventory().setItem(lugar, item);
	  }
	
	public static void darItem(Player p, Material mat, int quantidade, String nome, int lugar)
	  {
	    ItemStack item = new ItemStack(mat, quantidade);
	    ItemMeta itemmeta = item.getItemMeta();
	    itemmeta.setDisplayName(nome);
	    item.setItemMeta(itemmeta);
	    p.getInventory().setItem(lugar, item);
	  }
	public static void darRecraft(Player p) {
		
		ItemStack Pote = new ItemStack(Material.BOWL, 64);
        ItemMeta PoteMeta = Pote.getItemMeta();
        PoteMeta.setDisplayName("§3Pote");
        Pote.setItemMeta(PoteMeta);
        
        ItemStack Cogu = new ItemStack(Material.BROWN_MUSHROOM, 64);
        ItemMeta kCogu = Cogu.getItemMeta();
        kCogu.setDisplayName("§7Fedido");
        Cogu.setItemMeta(kCogu);
        
        ItemStack Vermelho = new ItemStack(Material.RED_MUSHROOM, 64);
        ItemMeta kVermelho = Vermelho.getItemMeta();
        kVermelho.setDisplayName("§cCheroso");
        Vermelho.setItemMeta(kVermelho);
        
        p.getInventory().setItem(13, Pote);
        p.getInventory().setItem(14, Cogu);
        p.getInventory().setItem(15, Vermelho);
	}
	public static void darPeito(Player p) {
		
		ItemStack peito = new ItemStack(Material.LEATHER_CHESTPLATE);
        ItemMeta kpeito = peito.getItemMeta();
        kpeito.setDisplayName("§c§lPele de ONCA");
        peito.setItemMeta(kpeito);
        p.getInventory().setChestplate(peito);
	}
}


