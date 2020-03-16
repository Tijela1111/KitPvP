package me.TijelaPvP.Uteis;

import java.util.ArrayList;
import org.bukkit.Effect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class Jumps
  implements Listener
{
  public static ArrayList<String> jump = new ArrayList();
  ArrayList<String> nofalldamage = new ArrayList();
  ArrayList<String> nofalldamagewait = new ArrayList();
  
  @EventHandler(priority=EventPriority.MONITOR)
  public void onPlayerJump1(PlayerMoveEvent e)
  {
    Player p = e.getPlayer();
    if (e.getTo().getBlock().getRelative(BlockFace.DOWN).getType() == Material.DIAMOND_BLOCK)
    {
      jump.remove(p.getName());
      
      Vector sponge = p.getLocation().getDirection().multiply(0).setY(5);
      p.setVelocity(sponge);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      jump.add(p.getName());
      jump.remove(p.getName());
      jump.add(p.getName());
      return;
    }
  }
  
  @EventHandler
  public void onPlayerDamageCoisaBugada(EntityDamageEvent e)
  {
    if (!(e.getEntity() instanceof Player)) {
      return;
    }
    Player p = (Player)e.getEntity();
    if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
      return;
    }
    if (jump.contains(p.getName()))
    {
      jump.remove(p.getName());
      return;
    }
  }
  
  @EventHandler(priority=EventPriority.HIGHEST)
  public void onEntityDamageSponge(EntityDamageEvent event)
  {
    if ((event.getEntity() instanceof Player))
    {
      Player player = (Player)event.getEntity();
      Location loc = player.getLocation();
      Location below = loc.subtract(0.0D, 3.0D, 0.0D);
      Block blockBelow = below.getBlock();
      if (event.getCause() == EntityDamageEvent.DamageCause.FALL)
      {
        if (blockBelow.getType() == Material.DIAMOND_BLOCK)
        {
          jump.add(player.getName());
          event.setCancelled(true);
          return;
        }
        return;
      }
      return;
    }
  }
  
  @EventHandler(priority=EventPriority.MONITOR)
  public void onPlayerJump111(PlayerMoveEvent e)
  {
    Player p = e.getPlayer();
    if (e.getTo().getBlock().getRelative(BlockFace.DOWN).getType() == Material.SPONGE)
    {
      jump.remove(p.getName());
      
      Vector sponge = p.getLocation().getDirection().multiply(0).setY(1);
      p.setVelocity(sponge);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      jump.add(p.getName());
      jump.remove(p.getName());
      jump.add(p.getName());
      return;
    }
  }
  
  @EventHandler
  public void onPlayerDamageCoisaBugada111(EntityDamageEvent e)
  {
    if (!(e.getEntity() instanceof Player)) {
      return;
    }
    Player p = (Player)e.getEntity();
    if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
      return;
    }
    if (jump.contains(p.getName()))
    {
      jump.remove(p.getName());
      return;
    }
  }
  
  @EventHandler(priority=EventPriority.HIGHEST)
  public void onEntityDamageSponge11(EntityDamageEvent event)
  {
    if ((event.getEntity() instanceof Player))
    {
      Player player = (Player)event.getEntity();
      Location loc = player.getLocation();
      Location below = loc.subtract(0.0D, 3.0D, 0.0D);
      Block blockBelow = below.getBlock();
      if (event.getCause() == EntityDamageEvent.DamageCause.FALL)
      {
        if (blockBelow.getType() == Material.DIAMOND_BLOCK)
        {
          jump.add(player.getName());
          event.setCancelled(true);
          return;
        }
        return;
      }
      return;
    }
  }
  
  @EventHandler(priority=EventPriority.MONITOR)
  public void onPlayerJump1a(PlayerMoveEvent e)
  {
    Player p = e.getPlayer();
    if (e.getTo().getBlock().getRelative(BlockFace.DOWN).getType() == Material.SPONGE)
    {
      jump.remove(p.getName());
      
      Vector sponge = p.getLocation().getDirection().multiply(0).setY(2);
      p.setVelocity(sponge);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      jump.add(p.getName());
      jump.remove(p.getName());
      jump.add(p.getName());
      p.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
      return;
    }
  }
  
  @EventHandler
  public void onPlayerDamageCoisaBugada1(EntityDamageEvent e)
  {
    if (!(e.getEntity() instanceof Player)) {
      return;
    }
    Player p = (Player)e.getEntity();
    if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
      return;
    }
    if (jump.contains(p.getName()))
    {
      jump.remove(p.getName());
      return;
    }
  }
  
  @EventHandler(priority=EventPriority.HIGHEST)
  public void onEntityDamageSpongea(EntityDamageEvent event)
  {
    if ((event.getEntity() instanceof Player))
    {
      Player player = (Player)event.getEntity();
      Location loc = player.getLocation();
      Location below = loc.subtract(0.0D, 3.0D, 0.0D);
      Block blockBelow = below.getBlock();
      if (event.getCause() == EntityDamageEvent.DamageCause.FALL)
      {
        if (blockBelow.getType() == Material.SPONGE)
        {
          jump.add(player.getName());
          event.setCancelled(true);
          return;
        }
        return;
      }
      return;
    }
  }
  
  @EventHandler(priority=EventPriority.MONITOR)
  public void onPlayerJump1a1111(PlayerMoveEvent e)
  {
    Player p = e.getPlayer();
    if (e.getTo().getBlock().getRelative(BlockFace.DOWN).getType() == Material.IRON_BLOCK)
    {
      jump.remove(p.getName());
      
      Vector sponge = p.getLocation().getDirection().multiply(0).setY(3);
      p.setVelocity(sponge);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      p.getWorld().playSound(p.getLocation(), Sound.HORSE_SOFT, 2.0F, 2.0F);
      jump.add(p.getName());
      jump.remove(p.getName());
      jump.add(p.getName());
      p.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
      return;
    }
  }
  
  @EventHandler
  public void onPlayerDamageCoisaBugada11111(EntityDamageEvent e)
  {
    if (!(e.getEntity() instanceof Player)) {
      return;
    }
    Player p = (Player)e.getEntity();
    if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
      return;
    }
    if (jump.contains(p.getName()))
    {
      jump.remove(p.getName());
      return;
    }
  }
  
  @EventHandler(priority=EventPriority.HIGHEST)
  public void onEntityDamageSpongea111111(EntityDamageEvent event)
  {
    if ((event.getEntity() instanceof Player))
    {
      Player player = (Player)event.getEntity();
      Location loc = player.getLocation();
      Location below = loc.subtract(0.0D, 3.0D, 0.0D);
      Block blockBelow = below.getBlock();
      if (event.getCause() == EntityDamageEvent.DamageCause.FALL)
      {
        if (blockBelow.getType() == Material.SPONGE)
        {
          jump.add(player.getName());
          event.setCancelled(true);
          return;
        }
        return;
      }
      return;
    }
  }
  
  @EventHandler(priority=EventPriority.MONITOR)
  public void onPlayerSpongeDamage(EntityDamageEvent e)
  {
    if (!(e.getEntity() instanceof Player)) {
      return;
    }
    Player p = (Player)e.getEntity();
    if (e.getCause() == EntityDamageEvent.DamageCause.FALL)
    {
      if (jump.contains(p.getName()))
      {
        jump.remove(p.getName());
        e.setCancelled(true);
        return;
      }
      return;
    }
  }
  
  @EventHandler
  public void onPlayerFrente(PlayerMoveEvent e)
  {
    Player p = e.getPlayer();
    if (e.getTo().getBlock().getRelative(BlockFace.DOWN).getType() == Material.REDSTONE_BLOCK)
    {
      Location loc = e.getTo().getBlock().getLocation();
      p.playSound(loc, Sound.ENDERDRAGON_HIT, 6.0F, 1.0F);
      p.playEffect(loc, Effect.MOBSPAWNER_FLAMES, null);
      Vector sponge = p.getLocation().getDirection().multiply(3.5D).setY(0.35D);
      p.setVelocity(sponge);
      jump.add(p.getName());
      return;
    }
  }
  
  @EventHandler
  public void onPlayerDamageSponge1(EntityDamageEvent e)
  {
    if (!(e.getEntity() instanceof Player)) {
      return;
    }
    Player p = (Player)e.getEntity();
    if (e.getCause() == EntityDamageEvent.DamageCause.FALL) {
      return;
    }
    if (jump.contains(p.getName()))
    {
      jump.remove(p.getName());
      return;
    }
  }
  
  @EventHandler(priority=EventPriority.HIGHEST)
  public void onEntityDamageSponge1(EntityDamageEvent event)
  {
    if ((event.getEntity() instanceof Player))
    {
      Player player = (Player)event.getEntity();
      Location loc = player.getLocation();
      Location below = loc.subtract(0.0D, 1.0D, 0.0D);
      Block blockBelow = below.getBlock();
      if (event.getCause() == EntityDamageEvent.DamageCause.FALL)
      {
        if (blockBelow.getType() == Material.SPONGE)
        {
          jump.add(player.getName());
          event.setDamage(0.0D);
          event.setCancelled(true);
          return;
        }
        return;
      }
      return;
    }
  }
  
  @EventHandler
  public void onPlayerJumpBaixo(PlayerMoveEvent e)
  {
    Player p = e.getPlayer();
    if (e.getTo().getBlock().getRelative(BlockFace.DOWN).getType() == Material.PISTON_BASE)
    {
      Vector sponge = p.getLocation().getDirection().multiply(0).setY(1);
      p.getWorld().playEffect(p.getLocation(), Effect.SMOKE, 1);
      p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 100, 999));
      p.getWorld().playSound(p.getLocation(), Sound.SLIME_WALK, 1.0F, 1.0F);
      p.getWorld().playSound(p.getLocation(), Sound.SLIME_WALK, 1.0F, 1.0F);
      p.getWorld().playSound(p.getLocation(), Sound.SLIME_WALK, 1.0F, 1.0F);
      p.getWorld().playSound(p.getLocation(), Sound.SLIME_WALK, 1.0F, 1.0F);
      p.getWorld().playSound(p.getLocation(), Sound.SLIME_WALK, 1.0F, 1.0F);
      p.getWorld().playSound(p.getLocation(), Sound.SLIME_WALK, 1.0F, 1.0F);
      p.setVelocity(sponge);
      if (!this.nofalldamage.contains(p.getName())) {
        this.nofalldamage.add(p.getName());
      }
      return;
    }
  }
  
  @EventHandler
  public void onEntityDamage(EntityDamageEvent event)
  {
    if ((event.getEntity() instanceof Player))
    {
      Player player = (Player)event.getEntity();
      if ((this.nofalldamage.contains(player.getName())) && 
        (event.getCause().equals(EntityDamageEvent.DamageCause.FALL)))
      {
        event.setCancelled(true);
        this.nofalldamage.remove(player.getName());
      }
    }
  }
}
