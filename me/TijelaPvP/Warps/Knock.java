package me.TijelaPvP.Warps;

import me.TijelaPvP.Menus.WarpsAPI;
import me.TijelaPvP.Uteis.KitAPI;
import me.TijelaPvP.events.Methodos;
import me.TijelaPvP.kits.KitManager;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

public class Knock extends WarpsAPI implements CommandExecutor{

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
						p.sendMessage("§aKITPVP §7: §aVoce foi teletransportado para a Warp Knock.");
						Ir(p, "Knock");
						Segundos.remove(p.getName());
						Methodos.LimparCoisas(p);
						KitAPI.RemoveKit(p);
						KitAPI.setKit(p, "Warp");
						KitManager.darItemEnchant(p, Material.STICK, 1, "§cBate nas Inimiga", 0, Enchantment.KNOCKBACK, 1, true);
						KitManager.darSopas(p);
					}
				}
			},5 * 20);
			
		} else {
			if(args[0].equalsIgnoreCase("set")) {
				if(p.hasPermission("kitpvp.set")) {
					Set(p, "Knock");
					p.sendMessage("§aKITPVP §7: §a§l Voce setou a Warp Knock.");
				}
			}
		}
		return false;
		
	}
	

}
