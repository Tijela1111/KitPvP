package me.TijelaPvP.kits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import me.TijelaPvP.Main;
import me.TijelaPvP.Uteis.KitAPI;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class C4L
implements Listener
{
private ArrayList<Player> cooldown = new ArrayList();
public static Main plugin;
private Map<Player, Item> inbomb = new HashMap();

public C4L(Main main)
{
  plugin = main;
}

@EventHandler
public void a(PlayerInteractEvent e)
{
  final Player p = e.getPlayer();
  if (p.getItemInHand().getType() == Material.AIR) {
    return;
  }
  if (p.getInventory().getItemInHand().getType() != Material.WOOD_BUTTON) {
    return;
  }
  if (e.getAction().name().contains("RIGHT"))
  {
    if ((this.inbomb.containsKey(p)) && 
      (KitAPI.getkit(p) == "C4")) {
      return;
    }
    if (this.cooldown.contains(p))
    {
      p.sendMessage("§aKITPVP:§c§lKit em Cooldown");
      return;
    }
    Item C4bomb = p.getWorld().dropItem(p.getEyeLocation(), new ItemStack(Material.TNT));
    C4bomb.setVelocity(e.getPlayer().getEyeLocation().getDirection().multiply(0.6D));
    C4bomb.setPickupDelay(999999);
    C4bomb.getItemStack().getItemMeta().setDisplayName("§bC4");
    this.inbomb.put(p, C4bomb);
    this.cooldown.add(p);
  }
  else if (this.inbomb.containsKey(p))
  {
    Item C4bomb = (Item)this.inbomb.get(p);
    p.getWorld().createExplosion(C4bomb.getLocation(), 3.0F, true);
    this.inbomb.remove(p);
    C4bomb.remove();
    Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable()
    {
      public void run()
      {
        C4L.this.cooldown.remove(p);
        p.sendMessage("§aKITPVP:§a§lVoce ja pode usar o kit");
        p.playSound(p.getLocation(), Sound.LEVEL_UP, 20.0F, 1.0F);
      }
    }, 500L);
  }
  else
  {
    p.sendMessage("§aKITPVP:§c§lA Bomba ainda nao foi plantada");
  }
}
}
