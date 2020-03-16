package me.TijelaPvP.Warps;

import me.TijelaPvP.Menus.WarpsAPI;
import me.TijelaPvP.Uteis.KitAPI;
import me.TijelaPvP.events.Methodos;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Mlg extends WarpsAPI implements CommandExecutor{

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("§bPrecisa ser um Player para usar esse comando.");
			return true;
		}
		final Player p = (Player)sender;
		if (args.length == 0) {
			Segundos.add(p.getName());
			p.sendMessage("§aKITPVP §7: §aNao se mova por 5 segundos.");
			Bukkit.getScheduler().scheduleAsyncDelayedTask(me.TijelaPvP.Main.instance, new Runnable() {
				
				@Override
				public void run() {
					if (Segundos.contains(p.getName())) {
						p.sendMessage("§aKITPVP §7: §aVoce foi teletransportado para a Warp Mlg.");
						Ir(p, "Mlg");
						Segundos.remove(p.getName());
						Methodos.LimparCoisas(p);
						KitAPI.RemoveKit(p);
						KitAPI.setKit(p, "Warp");
						p.setGameMode(GameMode.SURVIVAL);
						
						ItemStack baude = new ItemStack(Material.WATER_BUCKET);
						ItemMeta baudemeta = baude.getItemMeta();
						baudemeta.setDisplayName("§cMLG");
						baude.setItemMeta(baudemeta);
						
						p.getInventory().setItem(0, baude);
					}
				}
			},5 * 20);
			
		} else {
			if(args[0].equalsIgnoreCase("set")) {
				if(p.hasPermission("kitpvp.set")) {
					Set(p, "Mlg");
					p.sendMessage("§aKITPVP §7: §a§l Voce setou a warp MLG.");
				}
			}
		}
		return false;
		
	}
	

}
