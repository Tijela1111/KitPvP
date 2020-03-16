package me.TijelaPvP.Menus;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.craftbukkit.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class WarpsAPI implements Listener {
	
	public static ArrayList<String> Segundos = new ArrayList<>();
	
	@EventHandler
	public void Andou(PlayerMoveEvent e) {
		Player p = e.getPlayer();
		if(Segundos.contains(p.getName())) {
			Segundos.remove(p.getName());
			p.sendMessage("§aKITPVP: §c§lTeleporte cancelado");
		}
	}

	public static void Set(Player p,String w) {
		me.TijelaPvP.Main.getInstance().warps.set("warps." + w + ".X", p.getLocation().getX());
		me.TijelaPvP.Main.getInstance().warps.set("warps." + w + ".Y", p.getLocation().getY());
		me.TijelaPvP.Main.getInstance().warps.set("warps." + w + ".Z", p.getLocation().getZ());
		me.TijelaPvP.Main.getInstance().warps.set("warps." + w + ".Pitch", p.getLocation().getPitch());
		me.TijelaPvP.Main.getInstance().warps.set("warps." + w + ".Yaw", p.getLocation().getYaw());
		me.TijelaPvP.Main.getInstance().warps.set("warps." + w + ".World", p.getLocation().getWorld().getName());
		me.TijelaPvP.Main.getInstance().save();
	}
	
	public static void Ir(Player p,String w) {
		if(me.TijelaPvP.Main.getInstance().warps.contains("warps." + w)) {
			Double X = me.TijelaPvP.Main.getInstance().warps.getDouble("warps." + w + ".X");
			Double Y = me.TijelaPvP.Main.getInstance().warps.getDouble("warps." + w + ".Y");
			Double Z = me.TijelaPvP.Main.getInstance().warps.getDouble("warps." + w + ".Z");
			float Pitch = (float)me.TijelaPvP.Main.getInstance().warps.getDouble("warps." + w + ".Pitch");
			float Yaw = (float)me.TijelaPvP.Main.getInstance().warps.getDouble("warps." + w + ".Yaw");
		    World world = Bukkit.getWorld(me.TijelaPvP.Main.getInstance().warps.getString("warps." + w + ".World"));
		    Location loc = new Location(world, X, Y, Z, Yaw, Pitch);
		    p.teleport(loc);
		} else {
			p.sendMessage("§b§lSosa§4§lPvP §7: §cAinda nao foi setado.");
		}
	}
}
