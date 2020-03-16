package me.TijelaPvP.comandos;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.TijelaPvP.Uteis.KitAPI;

public class Kit implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)) {
			sender.sendMessage("Somente Players Podem fazer isso.");
			return true;
		}
		Player p = (Player)sender;
		if(args.length == 0) {
			p.sendMessage("§aUse /kit (nome do kit).");
			return true;
		}else{
			if(args[0].equalsIgnoreCase("pvp")) {
				if(p.hasPermission("kit.pvp")) {
					if(KitAPI.getkit(p) == "Sem Classe") {
						KitAPI.PvP(p);
						p.sendMessage("§aKITPVP: §a§lVoce escolheu o kit §c§lPvP");
					}else{
						p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
					}
				}else{
					p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
				}
			}
		}
		if(args[0].equalsIgnoreCase("Specialist")) {
			if(p.hasPermission("kit.specialist")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Specialist(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lSpecialist");
				}else{
					p.sendMessage("§aKITPVP:§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("Kangaroo")) {
			if(p.hasPermission("kit.kangaroo")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Kangaroo(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lKangaroo");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("Snail")) {
			if(p.hasPermission("kit.snail")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Snail(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lSnail");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("Viper")) {
			if(p.hasPermission("kit.viper")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Viper(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lViper");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("Gladiator")) {
			if(p.hasPermission("kit.gladiator")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Gladiator(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lGladiator");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("C4")) {
			if(p.hasPermission("kit.c4")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.C4(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lC4");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("camel")) {
			if(p.hasPermission("kit.camel")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Camel(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lCamel");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("phantom")) {
			if(p.hasPermission("kit.phantom")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Phantom(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lPhantom");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("Swords")) {
			if(p.hasPermission("kit.swords")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Swords(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lSwords");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("Avatar")) {
			if(p.hasPermission("kit.avatar")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Avatar(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lAvatar");
					p.sendMessage("§c§l>>§a§lUse primeiro o Elemento AR para Liberar os Outros");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("magma")) {
			if(p.hasPermission("kit.magma")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Magma(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lMagma");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("endermage")) {
			if(p.hasPermission("kit.endermage")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Endermage(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lEndermage");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("ninja")) {
			if(p.hasPermission("kit.ninja")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Ninja(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lNinja");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("backpacker")) {
			if(p.hasPermission("kit.backpacker")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Backpacker(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lBackpacker");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("stomper")) {
			if(p.hasPermission("kit.stomper")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Stomper(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lStomper");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("anchor")) {
			if(p.hasPermission("kit.anchor")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Anchor(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lAnchor");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("hulk")) {
			if(p.hasPermission("kit.hulk")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Hulk(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lHulk");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("deshfire")) {
			if(p.hasPermission("kit.deshfire")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Deshfire(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lDeshfire");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("fisherman")) {
			if(p.hasPermission("kit.fisherman")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Fisherman(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lFisherman");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		if(args[0].equalsIgnoreCase("switcher")) {
			if(p.hasPermission("kit.switcher")) {
				if(KitAPI.getkit(p) == "Sem Classe") {
					KitAPI.Switcher(p);
					p.sendMessage("§aKITPVP:§a§lVoce escolheu o kit §c§lSwitcher");
				}else{
					p.sendMessage("§aKITPVP :§c§lSomente um Kit Por Vida");
				}
			}else{
				p.sendMessage("§aKITPVP:§c§lVoce nao pode usar esse kit");
			}
		}
		return false;
	}
}
