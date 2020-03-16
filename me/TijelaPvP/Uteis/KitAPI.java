package me.TijelaPvP.Uteis;

import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.TijelaPvP.kits.KitManager;

public class KitAPI {
	
	public static HashMap<String, String> Kit = new HashMap<>();
	
	public static void setKit(Player p,String kit) {
	    Kit.put(p.getName(), kit);
	}
	public static String getkit(Player p) {
		if(Kit.containsKey(p.getName())) {
			return Kit.get(p.getName());
		}else{
			return "Sem Classe";
		}
		
	}

	public static void RemoveKit(Player p) {
		Kit.remove(p.getName());
	}
	public static void PvP(Player p){
		p.getInventory().clear();
		setKit(p, "PvP");
		KitManager.darRecraft(p);
		KitManager.darItemEnchant(p, Material.STONE_SWORD, 1, "§cEspadao", 0, Enchantment.DAMAGE_ALL, 1, true);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Warp(Player p){
		p.getInventory().clear();
		setKit(p, "Warp");
	}
	public static void Specialist(Player p) {
		p.getInventory().clear();
		setKit(p, "Specialist");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		ItemStack enchant = new ItemStack(Material.BOOK);
	    ItemMeta enchantmeta = enchant.getItemMeta();
	    enchantmeta.setDisplayName("§bSpecialist");
	    enchant.setItemMeta(enchantmeta);
	    p.getInventory().setItem(1, enchant);
	    KitManager.darSopas(p);
	    KitManager.darPeito(p);
	}
	public static void Kangaroo(Player p) {
		p.getInventory().clear();
		setKit(p, "Kangaroo");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		ItemStack Kangaroo = new ItemStack(Material.FIREWORK);
	    ItemMeta Kangaroometa = Kangaroo.getItemMeta();
	    Kangaroometa.setDisplayName("§bKangaroo");
	    Kangaroo.setItemMeta(Kangaroometa);
	    p.getInventory().setItem(1, Kangaroo);
	    KitManager.darSopas(p);
	    KitManager.darPeito(p);
	}
	public static void Snail(Player p) {
		p.getInventory().clear();
		setKit(p, "Snail");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Viper(Player p) {
		p.getInventory().clear();
		setKit(p, "Viper");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Gladiator(Player p) {
		p.getInventory().clear();
		setKit(p, "Gladiator");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		ItemStack gladiator = new ItemStack(Material.IRON_FENCE);
	    ItemMeta gladiatormeta = gladiator.getItemMeta();
	    gladiatormeta.setDisplayName("§bGladiator");
	    gladiator.setItemMeta(gladiatormeta);
	    p.getInventory().setItem(1, gladiator);
	    KitManager.darSopas(p);
	    KitManager.darPeito(p);
	}
	public static void C4(Player p) {
		p.getInventory().clear();
		setKit(p, "C4");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darItem(p, Material.WOOD_BUTTON, 1, "§bC4", 1);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Camel(Player p) {
		p.getInventory().clear();
		setKit(p, "Camel");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Phantom(Player p) {
		p.getInventory().clear();
		setKit(p, "Phantom");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darItem(p, Material.FEATHER, 1, "§bPhantom", 1);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Swords(Player p) {
		p.getInventory().clear();
		setKit(p, "Swords");
		ItemStack swords = new ItemStack(Material.WOOD_SWORD);
	    ItemMeta swordsmeta = swords.getItemMeta();
	    swordsmeta.setDisplayName("Madeira");
	    swords.setItemMeta(swordsmeta);
	    p.getInventory().setItem(0, swords);
	    KitManager.darRecraft(p);
	    KitManager.darSopas(p);
	    KitManager.darPeito(p);
	}
	public static void Avatar(Player p) {
		p.getInventory().clear();
		setKit(p, "Avatar");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darItem(p, Material.WOOL, 1, "AR", 1);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Magma(Player p) {
		p.getInventory().clear();
		setKit(p, "Magma");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Endermage(Player p) {
		p.getInventory().clear();
		setKit(p, "Endermage");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darItem(p, Material.PORTAL, 1, null, 1);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Ninja(Player p) {
		p.getInventory().clear();
		setKit(p, "Ninja");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Backpacker(Player p) {
		p.getInventory().clear();
		setKit(p, "Backpacker");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darItem(p, Material.NETHER_STAR, 1, "§bBackpacker", 1);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Stomper(Player p) {
		p.getInventory().clear();
		setKit(p, "Stomper");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darItem(p, Material.GOLDEN_APPLE, 1, "§bStomper", 1);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Anchor(Player p) {
		p.getInventory().clear();
		setKit(p, "Anchor");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Hulk(Player p) {
		p.getInventory().clear();
		setKit(p, "Hulk");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Deshfire(Player p) {
		p.getInventory().clear();
		setKit(p, "Deshfire");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darItem(p, Material.REDSTONE_BLOCK, 1, "§cDeshfire", 1);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Fisherman(Player p) {
		p.getInventory().clear();
		setKit(p, "Fisherman");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darItem(p, Material.FISHING_ROD, 1, "§bFisherman", 1);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
	public static void Switcher(Player p) {
		p.getInventory().clear();
		setKit(p, "Switcher");
		KitManager.darRecraft(p);
		KitManager.darItem(p, Material.STONE_SWORD, 1, "§cEspada", 0);
		KitManager.darItem(p, Material.SNOW_BALL, 16, "§bSwitcher", 1);
		KitManager.darSopas(p);
		KitManager.darPeito(p);
	}
}
