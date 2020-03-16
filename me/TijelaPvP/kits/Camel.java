package me.TijelaPvP.kits;

import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import me.TijelaPvP.Uteis.KitAPI;

public class Camel implements Listener {
	
	@EventHandler
	  public void Andar(PlayerMoveEvent e)
	  {
	    Player p = e.getPlayer();
	    if (((e.getTo().getBlock().getRelative(BlockFace.DOWN).getType() == Material.SAND) || (e.getTo().getBlock().getRelative(BlockFace.DOWN).getType() == Material.SANDSTONE)) && 
	      (KitAPI.getkit(p) == "Camel"))
	    {
	      p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 80, 0));
	      p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 80, 0));
	      return;
	    }
	  }
	}
