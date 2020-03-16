package me.TijelaPvP.events;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffectType;

public class Methodos {
	
	public static void Itens(Player p) {
		
		ItemStack kits = new ItemStack(Material.ENDER_CHEST);
		ItemMeta kitsmeta = kits.getItemMeta();
		kitsmeta.setDisplayName("§6Kits");
		kits.setItemMeta(kitsmeta);
		
		ItemStack warps = new ItemStack(Material.PAPER);
		ItemMeta warpsmeta = warps.getItemMeta();
		warpsmeta.setDisplayName("§bWarps");
		warps.setItemMeta(warpsmeta);
		
		ItemStack loja = new ItemStack(Material.EMERALD);
		ItemMeta lojameta = loja.getItemMeta();
		lojameta.setDisplayName("§aLoja");
		loja.setItemMeta(lojameta);
		
		p.getInventory().setItem(2, kits);
		p.getInventory().setItem(4, warps);
		p.getInventory().setItem(6, loja);
		
	}
	
	@SuppressWarnings("deprecation")
	public static void LimparCoisas(Player p) {
		  p.removePotionEffect(PotionEffectType.ABSORPTION);
		  p.removePotionEffect(PotionEffectType.BLINDNESS);
		  p.removePotionEffect(PotionEffectType.CONFUSION);
		  p.removePotionEffect(PotionEffectType.DAMAGE_RESISTANCE);
		  p.removePotionEffect(PotionEffectType.FAST_DIGGING);
		  p.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
		  p.removePotionEffect(PotionEffectType.HARM);
		  p.removePotionEffect(PotionEffectType.HEAL);
		  p.removePotionEffect(PotionEffectType.HEALTH_BOOST);
		  p.removePotionEffect(PotionEffectType.HUNGER);
		  p.removePotionEffect(PotionEffectType.INCREASE_DAMAGE);
		  p.removePotionEffect(PotionEffectType.INVISIBILITY);
		  p.removePotionEffect(PotionEffectType.JUMP);
		  p.removePotionEffect(PotionEffectType.NIGHT_VISION);
		  p.removePotionEffect(PotionEffectType.POISON);
		  p.removePotionEffect(PotionEffectType.REGENERATION);
		  p.removePotionEffect(PotionEffectType.SATURATION);
		  p.removePotionEffect(PotionEffectType.SLOW);
		  p.removePotionEffect(PotionEffectType.SLOW_DIGGING);
		  p.removePotionEffect(PotionEffectType.SPEED);
		  p.removePotionEffect(PotionEffectType.WATER_BREATHING);
		  p.removePotionEffect(PotionEffectType.WEAKNESS);
		  p.removePotionEffect(PotionEffectType.WITHER);
		  p.getInventory().clear();
		  p.getInventory().setArmorContents(null);
		  p.setExp(0);
		  p.setLevel(0);
		  p.setNoDamageTicks(0);
		  p.setGameMode(GameMode.ADVENTURE);
		  p.setHealth(20);
		  p.setHealthScale(20);
	}
	
}
