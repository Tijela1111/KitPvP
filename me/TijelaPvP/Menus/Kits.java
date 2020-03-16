package me.TijelaPvP.Menus;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Kits implements Listener {
	
	@EventHandler
	public void Clicar(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		if(((e.getAction() == Action.RIGHT_CLICK_AIR) ||(e.getAction() == Action.RIGHT_CLICK_BLOCK))
				&& p.getItemInHand().getType() == Material.ENDER_CHEST && p.getItemInHand().getItemMeta().getDisplayName() == "§6Kits") {
			e.setCancelled(true);
			InvKits(p);
		}
	}

	public static void InvKits(Player p) {
		
		Inventory kits = Bukkit.createInventory(p, 54, "§6Kits");
		
		ItemStack vidro = new ItemStack(Material.THIN_GLASS);
		ItemMeta vidrometa = vidro.getItemMeta();
		vidrometa.setDisplayName(" ");
		vidro.setItemMeta(vidrometa);
		
		ItemStack vidro2 = new ItemStack(Material.STAINED_GLASS_PANE);
		ItemMeta vidro2meta = vidro2.getItemMeta();
		vidro2meta.setDisplayName(" ");
		vidro2.setItemMeta(vidro2meta);
		
		ItemStack sosa = new ItemStack(Material.CAKE);
		ItemMeta sosameta = sosa.getItemMeta();
		sosameta.setDisplayName("§bSosa§4PvP");
		sosa.setItemMeta(sosameta);
		
		ItemStack pvp = new ItemStack(Material.STONE_SWORD);
		ItemMeta pvpmeta = pvp.getItemMeta();
		pvpmeta.setDisplayName("§c>> §bPvP");
		pvp.setItemMeta(pvpmeta);
		
		ItemStack viper = new ItemStack(Material.SPIDER_EYE);
		ItemMeta vipermeta = viper.getItemMeta();
		vipermeta.setDisplayName("§c>> §bViper");
		viper.setItemMeta(vipermeta);
		
		ItemStack snail = new ItemStack(Material.FERMENTED_SPIDER_EYE);
		ItemMeta snailmeta = snail.getItemMeta();
		snailmeta.setDisplayName("§c>> §bSnail");
		snail.setItemMeta(snailmeta);
		
		ItemStack Specialist = new ItemStack(Material.EXP_BOTTLE);
		ItemMeta Specialistmeta = Specialist.getItemMeta();
		Specialistmeta.setDisplayName("§c>> §bSpecialist");
		Specialist.setItemMeta(Specialistmeta);
		
		ItemStack Kangaroo = new ItemStack(Material.FIREWORK);
		ItemMeta Kangaroometa = Kangaroo.getItemMeta();
		Kangaroometa.setDisplayName("§c>> §bKangaroo");
		Kangaroo.setItemMeta(Kangaroometa);
		
		ItemStack gladiator = new ItemStack(Material.IRON_FENCE);
		ItemMeta gladiatormeta = gladiator.getItemMeta();
		gladiatormeta.setDisplayName("§c>> §bGladiator");
		gladiator.setItemMeta(gladiatormeta);
		
		ItemStack c4 = new ItemStack(Material.WOOD_BUTTON);
		ItemMeta c4meta = c4.getItemMeta();
		c4meta.setDisplayName("§c>> §bC4");
		c4.setItemMeta(c4meta);
		
		ItemStack camel = new ItemStack(Material.SAND);
		ItemMeta camelmeta = camel.getItemMeta();
		camelmeta.setDisplayName("§c>> §bCamel");
		camel.setItemMeta(camelmeta);
		
		ItemStack Phantom = new ItemStack(Material.FEATHER);
		ItemMeta Phantommeta = Phantom.getItemMeta();
		Phantommeta.setDisplayName("§c>> §bPhantom");
		Phantom.setItemMeta(Phantommeta);
		
		ItemStack Swords = new ItemStack(Material.GOLD_SWORD);
		ItemMeta Swordsmeta = Swords.getItemMeta();
		Swordsmeta.setDisplayName("§c>> §bSwords");
		Swords.setItemMeta(Swordsmeta);
		
		ItemStack Avatar = new ItemStack(Material.WOOL);
		ItemMeta Avatarmeta = Avatar.getItemMeta();
		Avatarmeta.setDisplayName("§c>> §bAvatar");
		Avatar.setItemMeta(Avatarmeta);
		
		ItemStack magma = new ItemStack(Material.MAGMA_CREAM);
		ItemMeta magmameta = magma.getItemMeta();
		magmameta.setDisplayName("§c>> §bMagma");
		magma.setItemMeta(magmameta);
		
		ItemStack endermage = new ItemStack(Material.NETHER_BRICK_ITEM);
		ItemMeta endermagemeta = endermage.getItemMeta();
		endermagemeta.setDisplayName("§c>> §bEndermage");
		endermage.setItemMeta(endermagemeta);
		
		ItemStack backpacker = new ItemStack(Material.NETHER_STAR);
		ItemMeta backpackermeta = backpacker.getItemMeta();
		backpackermeta.setDisplayName("§c>> §bBackpacker");
		backpacker.setItemMeta(backpackermeta);
		
		ItemStack ninja = new ItemStack(Material.COAL_BLOCK);
		ItemMeta ninjameta = ninja.getItemMeta();
		ninjameta.setDisplayName("§c>> §bNinja");
		ninja.setItemMeta(ninjameta);
		
		ItemStack stomper = new ItemStack(Material.IRON_BOOTS);
		ItemMeta stompermeta = stomper.getItemMeta();
		stompermeta.setDisplayName("§c>> §bStomper");
		stomper.setItemMeta(stompermeta);
		
		ItemStack anchor = new ItemStack(Material.ANVIL);
		ItemMeta anchormeta = anchor.getItemMeta();
		anchormeta.setDisplayName("§c>> §bAnchor");
		anchor.setItemMeta(anchormeta);
		
		ItemStack hulk = new ItemStack(Material.SADDLE);
		ItemMeta hulkmeta = hulk.getItemMeta();
		hulkmeta.setDisplayName("§c>> §bHulk");
		hulk.setItemMeta(hulkmeta);
		
		ItemStack deshfire = new ItemStack(Material.REDSTONE_BLOCK);
		ItemMeta deshfiremeta = deshfire.getItemMeta();
		deshfiremeta.setDisplayName("§c>> §bDeshfire");
		deshfire.setItemMeta(deshfiremeta);
		
		ItemStack fisherman = new ItemStack(Material.FISHING_ROD);
		ItemMeta fishermanmeta = fisherman.getItemMeta();
		fishermanmeta.setDisplayName("§c>> §bFisherman");
		fisherman.setItemMeta(fishermanmeta);
		
		ItemStack switcher = new ItemStack(Material.SNOW_BALL);
		ItemMeta switchermeta = switcher.getItemMeta();
		switchermeta.setDisplayName("§c>> §bSwitcher");
		switcher.setItemMeta(switchermeta);
		
		kits.setItem(0, vidro);
		kits.setItem(1, vidro);
		kits.setItem(2, vidro);
		kits.setItem(3, vidro);
		kits.setItem(4, sosa);
		kits.setItem(5, vidro);
		kits.setItem(6, vidro);
		kits.setItem(7, vidro);
		kits.setItem(8, vidro);
		kits.setItem(9, vidro2);
		kits.setItem(10, vidro2);
		kits.setItem(11, fisherman);
		kits.setItem(12, viper);
		kits.setItem(13, pvp);
		kits.setItem(14, Kangaroo);
		kits.setItem(15, endermage);
		kits.setItem(16, vidro2);
		kits.setItem(17, vidro2);
		kits.setItem(18, vidro2);
		kits.setItem(19, vidro2);
		kits.setItem(20, vidro2);
		kits.setItem(21, vidro2);
		kits.setItem(22, vidro2);
		kits.setItem(23, vidro2);
		kits.setItem(24, vidro2);
		kits.setItem(25, vidro2);
		kits.setItem(26, vidro2);
		kits.setItem(27, vidro2);
		kits.setItem(28, hulk);
		kits.setItem(29, c4);
		kits.setItem(30, snail);
		kits.setItem(31, gladiator);
		kits.setItem(32, Specialist);
		kits.setItem(33, Avatar);
		kits.setItem(34, deshfire);
		kits.setItem(35, vidro2);
		kits.setItem(36, vidro2);
		kits.setItem(37, Phantom);
		kits.setItem(38, Swords);
		kits.setItem(39, magma);
		kits.setItem(40, backpacker);
		kits.setItem(41, ninja);
		kits.setItem(42, stomper);
		kits.setItem(43, anchor);
		kits.setItem(44, vidro2);
		kits.setItem(45, vidro2);
		kits.setItem(46, vidro2);
		kits.setItem(47, camel);
		kits.setItem(48, vidro2);
		kits.setItem(49, vidro2);
		kits.setItem(50, vidro2);
		kits.setItem(51, switcher);
		kits.setItem(52, vidro2);
		kits.setItem(53, vidro2);
		
		p.openInventory(kits);
		
		}
	   @EventHandler
	   public void onInteracts(InventoryClickEvent e) {
		   Player p = (Player) e.getWhoClicked(); 
		   if(e.getInventory().getName().equalsIgnoreCase("§6Kits")) {
			   if(e.getCurrentItem().getType() == Material.STONE_SWORD) {
			   p.closeInventory();
			   p.chat("/kit pvp");
		   }
			   if(e.getCurrentItem().getType() == Material.SPIDER_EYE) {
				   p.closeInventory();
				   p.chat("/kit viper");
			   }
			   if(e.getCurrentItem().getType() == Material.FERMENTED_SPIDER_EYE) {
				   p.closeInventory();
				   p.chat("/kit snail");
			   }
			   if(e.getCurrentItem().getType() == Material.EXP_BOTTLE) {
				   p.closeInventory();
				   p.chat("/kit specialist");
			   }
			   if(e.getCurrentItem().getType() == Material.FIREWORK) {
				   p.closeInventory();
				   p.chat("/kit kangaroo");
			   }
			   if(e.getCurrentItem().getType() == Material.IRON_FENCE) {
				   p.closeInventory();
				   p.chat("/kit gladiator");
			   }
			   if(e.getCurrentItem().getType() == Material.WOOD_BUTTON) {
				   p.closeInventory();
				   p.chat("/kit c4");
			   }
			   if(e.getCurrentItem().getType() == Material.SAND) {
				   p.closeInventory();
				   p.chat("/kit camel");
			   }
			   if(e.getCurrentItem().getType() == Material.GOLD_SWORD) {
				   p.closeInventory();
				   p.chat("/kit swords");
			   }
			   if(e.getCurrentItem().getType() == Material.WOOL) {
				   p.closeInventory();
				   p.chat("/kit avatar");
			   }
			   if(e.getCurrentItem().getType() == Material.FEATHER) {
				   p.closeInventory();
				   p.chat("/kit phantom");
			   }
			   if(e.getCurrentItem().getType() == Material.MAGMA_CREAM) {
				   p.closeInventory();
				   p.chat("/kit magma");
			   }
			   if(e.getCurrentItem().getType() == Material.NETHER_BRICK_ITEM) {
				   p.closeInventory();
				   p.chat("/kit endermage");
			   }
			   if(e.getCurrentItem().getType() == Material.NETHER_STAR) {
				   p.closeInventory();
				   p.chat("/kit backpacker");
			   }
			   if(e.getCurrentItem().getType() == Material.COAL_BLOCK) {
				   p.closeInventory();
				   p.chat("/kit ninja");
			   }
			   if(e.getCurrentItem().getType() == Material.IRON_BOOTS) {
				   p.closeInventory();
				   p.chat("/kit stomper");
			   }
			   if(e.getCurrentItem().getType() == Material.ANVIL) {
				   p.closeInventory();
				   p.chat("/kit anchor");
			   }
			   if(e.getCurrentItem().getType() == Material.SADDLE) {
				   p.closeInventory();
				   p.chat("/kit hulk");
			   }
			   if(e.getCurrentItem().getType() == Material.REDSTONE_BLOCK) {
				   p.closeInventory();
				   p.chat("/kit deshfire");
			   }
			   if(e.getCurrentItem().getType() == Material.FISHING_ROD) {
				   p.closeInventory();
				   p.chat("/kit fisherman");
			   }
			   if(e.getCurrentItem().getType() == Material.SNOW_BALL) {
				   p.closeInventory();
				   p.chat("/kit switcher");
			   }
	   }
		   
		   
	}

}
