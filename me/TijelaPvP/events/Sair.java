package me.TijelaPvP.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import me.TijelaPvP.Uteis.KitAPI;

public class Sair
implements Listener
{
@EventHandler
private void aoSair(PlayerQuitEvent e)
{
  Player p = e.getPlayer();
  KitAPI.RemoveKit(p);
  Methodos.LimparCoisas(p);
  e.setQuitMessage("§7[§c-§7]" + p.getDisplayName());
}
}
