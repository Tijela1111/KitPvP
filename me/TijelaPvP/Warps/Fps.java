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
import org.bukkit.inventory.meta.ItemMeta;

public class Fps extends WarpsAPI implements CommandExecutor{

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
						p.sendMessage("§aKITPVP §7: §aVoce foi teletransportado para a Warp FPS.");
						Ir(p, "Fps");
						Segundos.remove(p.getName());
						Methodos.LimparCoisas(p);
						KitAPI.RemoveKit(p);
						KitAPI.setKit(p, "Warp");
						KitManager.darItemEnchant(p, Material.STONE_SWORD, 1, "§bEspada", 0, Enchantment.DAMAGE_ALL, 1, true);
						p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
						
						ItemStack Pote = new ItemStack(Material.BOWL, 64);
				        ItemMeta PoteMeta = Pote.getItemMeta();
				        PoteMeta.setDisplayName("§3Pote");
				        Pote.setItemMeta(PoteMeta);
				        
				        ItemStack Cogu = new ItemStack(Material.BROWN_MUSHROOM, 64);
				        ItemMeta kCogu = Cogu.getItemMeta();
				        kCogu.setDisplayName("§7Fedido");
				        Cogu.setItemMeta(kCogu);
				        
				        ItemStack Vermelho = new ItemStack(Material.RED_MUSHROOM, 64);
				        ItemMeta kVermelho = Vermelho.getItemMeta();
				        kVermelho.setDisplayName("§cCheroso");
				        Vermelho.setItemMeta(kVermelho);
						
						p.getInventory().setItem(14, Pote);
						p.getInventory().setItem(15, Cogu);
						p.getInventory().setItem(16, Vermelho);
						KitManager.darSopas(p);
						
					}
				}
			},5 * 20);
			
		} else {
			if(args[0].equalsIgnoreCase("set")) {
				if(p.hasPermission("kitpvp.set")) {
					Set(p, "Fps");
					p.sendMessage("§aKITPVP §7: §a§l Voce setou a Warp FPS.");
				}
			}
		}
		return false;
		
	}
	

}
