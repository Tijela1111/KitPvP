package me.TijelaPvP.Uteis;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class SomNosComandos
  implements Listener
{
  @EventHandler
  public void digitarComando(PlayerCommandPreprocessEvent a)
  {
    float tmp17_16 = 1.0F;a.getPlayer().playSound(a.getPlayer().getLocation(), Sound.LEVEL_UP, tmp17_16, tmp17_16);
  }
}
