package me.TijelaPvP.Uteis;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class NaoExplodirOMapa
  implements Listener
{
  @EventHandler
  public void semExplosao(EntityExplodeEvent e)
  {
    e.setCancelled(true);
  }
}
