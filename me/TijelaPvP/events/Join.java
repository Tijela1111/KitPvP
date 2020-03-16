package me.TijelaPvP.events;


import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import me.TijelaPvP.Menus.WarpsAPI;

public class Join implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		WarpsAPI.Ir(p, "Spawn");
		e.setJoinMessage("§7[§2+§7]" + p.getDisplayName());
		for (int i = 0; i !=100; i++) {
			p.sendMessage(" ");
		}
		p.sendMessage("§7=-=-=-=§6Bem-Vindo ao §aKITPVP-GDD=-=-=-=");
		p.sendMessage("");
		p.playSound(p.getLocation(), Sound.FIREWORK_BLAST, 1.0F, 1.0F);
		Methodos.LimparCoisas(p);
		Methodos.Itens(p);
		
	}

}
