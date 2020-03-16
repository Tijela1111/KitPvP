package me.TijelaPvP.kits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import me.TijelaPvP.Main;
import me.TijelaPvP.Uteis.KitAPI;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.util.Vector;

public class Deshfire implements Listener {
	
	 public int boost = Integer.valueOf(6).intValue();
	  public static ArrayList<String> sonic = new ArrayList<String>();
	  ArrayList<String> fall = new ArrayList<String>();
	  public static List<Player> cooldownm = new ArrayList<Player>();
	  public static HashMap<String, ItemStack[]> Armadura = new HashMap<String, ItemStack[]>();
	  
	  @EventHandler
	  public void VelotrolClick(PlayerInteractEvent e)
	  {
	    final Player p = e.getPlayer();
	    if ((e.getPlayer().getItemInHand().getType() == Material.REDSTONE_BLOCK) && (KitAPI.getkit(p) == "Deshfire"))
	    {
	      if ((e.getAction() == Action.LEFT_CLICK_AIR) || (e.getAction() == Action.LEFT_CLICK_BLOCK) || (e.getAction() == Action.RIGHT_CLICK_BLOCK) || (e.getAction() == Action.RIGHT_CLICK_AIR))
	      {
	        e.setCancelled(true);
	        p.playSound(p.getLocation(), Sound.LAVA_POP, 2.0F, 2.0F);
	      }
	      if (cooldownm.contains(p))
	      {
	        p.sendMessage("§aKITPVP:§c§lKit em Cooldown.");
	        return;
	      }
	      cooldownm.add(p);
	      p.setVelocity(p.getEyeLocation().getDirection().multiply(this.boost).add(new Vector(0, 0, 0)));
	      p.getPlayer().getWorld().playEffect(p.getPlayer().getLocation(), Effect.MOBSPAWNER_FLAMES, 10, 0);
	      p.getLocation();
	      for (Entity pertos : p.getNearbyEntities(8.0D, 8.0D, 8.0D)) {
	        if ((pertos instanceof Player))
	        {
	          ((Player)pertos).damage(10.0D);
	          pertos.setVelocity(new Vector(0.1D, 0.0D, 0.1D));
	          ((Player)pertos).setFireTicks(150);
	        }
	      }
	      ItemStack Capacete = new ItemStack(Material.LEATHER_HELMET);
	      LeatherArmorMeta kCapacete = (LeatherArmorMeta)Capacete.getItemMeta();
	      kCapacete.setColor(Color.RED);
	      Capacete.setItemMeta(kCapacete);
	      
	      ItemStack Peitoral = new ItemStack(Material.LEATHER_CHESTPLATE);
	      LeatherArmorMeta kPeitoral = (LeatherArmorMeta)Peitoral.getItemMeta();
	      kPeitoral.setColor(Color.RED);
	      Peitoral.setItemMeta(kPeitoral);
	      
	      ItemStack Calca = new ItemStack(Material.LEATHER_LEGGINGS);
	      LeatherArmorMeta kCalca = (LeatherArmorMeta)Calca.getItemMeta();
	      kCalca.setColor(Color.RED);
	      Calca.setItemMeta(kCalca);
	      
	      ItemStack Bota = new ItemStack(Material.LEATHER_BOOTS);
	      LeatherArmorMeta kBota = (LeatherArmorMeta)Capacete.getItemMeta();
	      kBota.setColor(Color.RED);
	      Bota.setItemMeta(kBota);
	      
	      Armadura.put(p.getName(), p.getInventory().getArmorContents());
	      
	      p.getInventory().setHelmet(Capacete);
	      p.getInventory().setChestplate(Peitoral);
	      p.getInventory().setLeggings(Calca);
	      p.getInventory().setBoots(Bota);
	      p.updateInventory();
	      
	      Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
	      {
	        public void run()
	        {
	          p.getInventory().setHelmet(null);
	          p.getInventory().setChestplate(null);
	          p.getInventory().setLeggings(null);
	          p.getInventory().setBoots(null);
	          p.updateInventory();
	        }
	      }, 50L);
	      
	      Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.getInstance(), new Runnable()
	      {
	        public void run()
	        {
	          Deshfire.cooldownm.remove(p);
	          p.sendMessage("§aKITPVP:§a§lVoce ja pode usar o kit novamente.");
	          p.getWorld().playSound(p.getLocation(), Sound.LEVEL_UP, 5.0F, 5.0F);
	        }
	      }, 700L);
	    }
	  }
	  
	  @EventHandler
	  public void onPlayerDamageSponge(EntityDamageEvent e)
	  {
	    if (!(e.getEntity() instanceof Player)) {
	      return;
	    }
	    Player p = (Player)e.getEntity();
	    if ((e.getCause() == EntityDamageEvent.DamageCause.FALL) && (this.fall.contains(p.getName())))
	    {
	      this.fall.remove(p.getName());
	      e.setDamage(6.5D);
	      return;
	    }
	  }
	}

