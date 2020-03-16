package me.TijelaPvP.events;

import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Damageable;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Sopa implements Listener {
	
	@EventHandler(priority=EventPriority.MONITOR)
	private void tomarsopa(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		Damageable hp = p;
		
		ItemStack tigela = new ItemStack(Material.BOWL);
		ItemMeta tigelam = tigela.getItemMeta();
		tigelam.setDisplayName("§3Pote");
		tigela.setItemMeta(tigelam);
		
		if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) && p.getItemInHand().getType() == Material.MUSHROOM_SOUP) {
			if (hp.getHealth() !=hp.getMaxHealth()) {
				p.setHealth((hp.getHealth() + 7.0D > hp.getMaxHealth()) ? hp.getMaxHealth() : (hp.getHealth() + 7.0D));
				p.playSound(p.getLocation(), Sound.BURP, 1.0F, 1.0F);
				p.getItemInHand().setType(Material.BOWL);
				p.getItemInHand().setItemMeta(tigelam);
				
			}
			
		}
	}

}
