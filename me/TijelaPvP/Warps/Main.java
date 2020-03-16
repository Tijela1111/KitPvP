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
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Main extends WarpsAPI implements CommandExecutor{

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
						p.sendMessage("§aKITPVP §7: §aVoce foi teletransportado para a Warp Main.");
						Ir(p, "Main");
						Segundos.remove(p.getName());
						Methodos.LimparCoisas(p);
						KitAPI.RemoveKit(p);
						KitAPI.setKit(p, "Warp");
						KitManager.darItemEnchant(p, Material.DIAMOND_SWORD, 1, "§b§lEspada", 0, Enchantment.DAMAGE_ALL, 2, true);
						p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
					    p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
					    p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
					    p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
					    p.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 999999999, 0));
					    p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 0));
					    KitManager.darSopas(p);
					}
				}
			},5 * 20);
			
		} else {
			if(args[0].equalsIgnoreCase("set")) {
				if(p.hasPermission("kitpvp.set")) {
					Set(p, "Main");
					p.sendMessage("§aKITPVP §7: §a§l Voce setou a Warp Main.");
				}
			}
		}
		return false;
		
	}
	

}
