package me.TijelaPvP.Uteis;

import me.TijelaPvP.Main;
import me.TijelaPvP.Menus.WarpsAPI;
import me.TijelaPvP.events.Methodos;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.LeavesDecayEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.help.HelpTopic;

public class Events implements Listener {
	//Fome
	@EventHandler
	public void Fome(FoodLevelChangeEvent e) {
		e.setCancelled(true);
		e.setFoodLevel(20);
	}
	public void MsgDeath(PlayerDeathEvent e){
		e.setDeathMessage(null);
	}
	//Chuva
	@EventHandler
	public void SemChuva(WeatherChangeEvent e) {
		e.setCancelled(true);
		
	}
	//Folhas não somem
	@EventHandler
	public void Folhas(LeavesDecayEvent e) {
		e.setCancelled(true);
	}
	//Respawn
	@EventHandler
	public void Renacer(PlayerRespawnEvent e) {
		Player p = e.getPlayer();
		KitAPI.RemoveKit(p);
		WarpsAPI.Ir(p, "Spawn");
		Methodos.LimparCoisas(p);
		Methodos.Itens(p);
	}
	//Não Dropar ITENS
	@EventHandler
	  public void onDrop(PlayerDropItemEvent event)
	  {
	    if (event.getItemDrop().getItemStack().getType() == Material.STONE_SWORD)
	      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.WOOD_SWORD)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.IRON_SWORD)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.GOLD_SWORD)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.ENDER_CHEST)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.PAPER)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.EMERALD)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.WOOD_SWORD)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.WATER_BUCKET)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.DIAMOND_SWORD)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.BOOK)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.FIREWORK)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.WOOD_BUTTON)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.FEATHER)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.NETHER_STAR)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.NETHER_BRICK_ITEM)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.NETHER_BRICK)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.REDSTONE_BLOCK)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.GOLDEN_APPLE)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.FISHING_ROD)
		      event.setCancelled(true);
	    if (event.getItemDrop().getItemStack().getType() == Material.SNOW_BALL)
		      event.setCancelled(true);
	  }

	
	//Drops
	@EventHandler(priority=EventPriority.MONITOR)
	public void Drops(ItemSpawnEvent e) {
		Bukkit.getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable() {
			public void run() {
				e.getEntity().getWorld().playSound(e.getEntity().getLocation(), Sound.LAVA_POP, 1.0F, 1.0F);
				e.getEntity().getWorld().playEffect(e.getEntity().getLocation(), Effect.SMOKE, 10);
				e.getEntity().remove();
			}
		},10L);
	}
	@EventHandler(priority=EventPriority.NORMAL)
	  public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent e)
	  {
	    if (!e.isCancelled())
	    {
	      Player p = e.getPlayer();
	      String cmd = e.getMessage().split(" ")[0];
	      HelpTopic topic = Bukkit.getServer().getHelpMap().getHelpTopic(cmd);
	      if (topic == null)
	      {
	        p.sendMessage("§c§lComando Incorreto");
	        e.setCancelled(true);
	      }
	    }
	  }
	  

}
