package me.TijelaPvP.Uteis;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Placas
implements Listener
{
@EventHandler
public void placadesopa(SignChangeEvent e)
{
  if (e.getLine(0).equalsIgnoreCase("sopas"))
  {
    e.setLine(0, "§e=-=-()-=-=");
    e.setLine(1, "§b§lSosa§4§lPvP");
    e.setLine(2, "§6Sopas");
    e.setLine(3, "§e=-=-()-=-=");
  }
}

@EventHandler
public void clicarnaplacadesopa(PlayerInteractEvent e)
{
  if ((e.getAction() == Action.RIGHT_CLICK_BLOCK) && (
    (e.getClickedBlock().getType() == Material.SIGN) || 
    (e.getClickedBlock().getType() == Material.SIGN_POST) || 
    (e.getClickedBlock().getType() == Material.WALL_SIGN)))
  {
    Sign sign = (Sign)e.getClickedBlock().getState();
    if (sign.getLine(1).equals("§b§lSosa§4§lPvP"))
    {
      Inventory inv = Bukkit.createInventory(null, 54, "§6Sopas");
      ItemStack Sopa = new ItemStack(Material.MUSHROOM_SOUP);
      ItemMeta SopaMeta = Sopa.getItemMeta();
      SopaMeta.setDisplayName("§6Sopas");
      Sopa.setItemMeta(SopaMeta);
      for (int i = 0; i < 54; i++) {
        inv.addItem(new ItemStack[] { new ItemStack(Sopa) });
      }
      e.getPlayer().openInventory(inv);
    }
  }
}
}