package me.TijelaPvP.Uteis;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import me.TijelaPvP.Main;

public class Motd implements Listener {
	
	@EventHandler
	public void Motd(ServerListPingEvent e ) {
		e.setMotd(Main.getInstance().getConfig().getString("motd").replace("&", "§"));
	}

}
