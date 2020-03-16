package me.TijelaPvP.kits;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.TijelaPvP.Uteis.KitAPI;

public class Swords implements Listener {
	
	@EventHandler
	  public void SwordsAlterner(PlayerInteractEvent e)
	  {
	    Player player = e.getPlayer();
	    if ((player.getItemInHand() != null) && (player.getItemInHand().getType() != Material.AIR))
	    {
	      ItemStack hand = player.getItemInHand();
	      if (KitAPI.getkit(player) == "Swords") {
	        if ((hand.hasItemMeta()) && (hand.getItemMeta().hasDisplayName()) && (hand.getItemMeta().getDisplayName().equals("Madeira")))
	        {
	          ItemStack Pedra = new ItemStack(Material.STONE_SWORD);
	          ItemMeta MetaPedra = Pedra.getItemMeta();
	          MetaPedra.setDisplayName("Pedra");
	          Pedra.setItemMeta(MetaPedra);
	          player.setItemInHand(Pedra);
	        }
	        else if ((hand.hasItemMeta()) && (hand.getItemMeta().hasDisplayName()) && (hand.getItemMeta().getDisplayName().equals("Pedra")))
	        {
	          ItemStack Gold = new ItemStack(Material.GOLD_SWORD);
	          ItemMeta MetaGold = Gold.getItemMeta();
	          MetaGold.setDisplayName("Ouro");
	          Gold.setItemMeta(MetaGold);
	          player.setItemInHand(Gold);
	        }
	        else if ((hand.hasItemMeta()) && (hand.getItemMeta().hasDisplayName()) && (hand.getItemMeta().getDisplayName().equals("Ouro")))
	        {
	          ItemStack Iron = new ItemStack(Material.IRON_SWORD);
	          ItemMeta MetaIron = Iron.getItemMeta();
	          MetaIron.setDisplayName("Ferro");
	          Iron.setItemMeta(MetaIron);
	          player.setItemInHand(Iron);
	        }
	        else if ((hand.hasItemMeta()) && (hand.getItemMeta().hasDisplayName()) && (hand.getItemMeta().getDisplayName().equals("Ferro")))
	        {
	          ItemStack Madeira = new ItemStack(Material.WOOD_SWORD);
	          ItemMeta MetaMadeira = Madeira.getItemMeta();
	          MetaMadeira.setDisplayName("Madeira");
	          Madeira.setItemMeta(MetaMadeira);
	          player.setItemInHand(Madeira);
	        }
	      }
	    }
	  }
	}

