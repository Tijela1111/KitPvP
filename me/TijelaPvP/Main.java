package me.TijelaPvP;

import java.io.File;
import java.io.IOException;

import me.TijelaPvP.Menus.GUIInteracts;
import me.TijelaPvP.Menus.Kits;
import me.TijelaPvP.Menus.LojaGUI;
import me.TijelaPvP.Menus.Warps;
import me.TijelaPvP.Menus.WarpsAPI;
import me.TijelaPvP.Uteis.Events;
import me.TijelaPvP.Uteis.Jumps;
import me.TijelaPvP.Uteis.Motd;
import me.TijelaPvP.Uteis.NaoExplodirOMapa;
import me.TijelaPvP.Uteis.Pl;
import me.TijelaPvP.Uteis.Placas;
import me.TijelaPvP.Uteis.SomNosComandos;
import me.TijelaPvP.Warps.Challenge;
import me.TijelaPvP.Warps.Fps;
import me.TijelaPvP.Warps.Knock;
import me.TijelaPvP.Warps.Mlg;
import me.TijelaPvP.Warps.Rdm;
import me.TijelaPvP.Warps.Spawn;
import me.TijelaPvP.comandos.Build;
import me.TijelaPvP.comandos.Gamemode;
import me.TijelaPvP.comandos.Ip;
import me.TijelaPvP.comandos.Kit;
import me.TijelaPvP.comandos.Ping;
import me.TijelaPvP.comandos.Report;
import me.TijelaPvP.comandos.TogglePvP;
import me.TijelaPvP.comandos.Youtuber;
import me.TijelaPvP.comandos.bc;
import me.TijelaPvP.events.Join;
import me.TijelaPvP.events.Nerfs;
import me.TijelaPvP.events.Sair;
import me.TijelaPvP.events.Sopa;
import me.TijelaPvP.kits.Anchor;
import me.TijelaPvP.kits.Avatar;
import me.TijelaPvP.kits.Backpacker;
import me.TijelaPvP.kits.C4L;
import me.TijelaPvP.kits.Camel;
import me.TijelaPvP.kits.Deshfire;
import me.TijelaPvP.kits.Endermage;
import me.TijelaPvP.kits.Fisherman;
import me.TijelaPvP.kits.Gladiator;
import me.TijelaPvP.kits.Hulk;
import me.TijelaPvP.kits.Kangaroo;
import me.TijelaPvP.kits.Magma;
import me.TijelaPvP.kits.Ninja;
import me.TijelaPvP.kits.Phantom;
import me.TijelaPvP.kits.Snail;
import me.TijelaPvP.kits.Specialist;
import me.TijelaPvP.kits.Stomper;
import me.TijelaPvP.kits.Switcher;
import me.TijelaPvP.kits.Swords;
import me.TijelaPvP.kits.Viper;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static Plugin plugin;
	public static Main instance;
	public static Main getInstance() {
		return instance;
	}
	public File warps1;
	public YamlConfiguration warps;
	
	public void onEnable() {
		plugin = this;
		instance = this;
		saveConfig();
		instance = this;
		saveDefaultConfig();
		File warps = new File(getDataFolder(), "warps.yml");
		if (!warps.exists())
			saveResource("warps.yml", false);
		warps1 = new File(getDataFolder(), "warps.yml");
		this.warps = YamlConfiguration.loadConfiguration(warps1);
		
		Bukkit.getServer().getConsoleSender().sendMessage("§aTijelaPlugin §fKitPvP Ligado.");
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new Join(), this);
		pm.registerEvents(new Sair(), this);
		pm.registerEvents(new WarpsAPI(), this);
		pm.registerEvents(new Jumps(), this);
		pm.registerEvents(new NaoExplodirOMapa(), this);
		pm.registerEvents(new SomNosComandos(), this);
		pm.registerEvents(new Placas(), this);
		pm.registerEvents(new Sopa(), this);
		pm.registerEvents(new Events(), this);
		pm.registerEvents(new Motd(), this);
		pm.registerEvents(new Kits(), this);
		pm.registerEvents(new Warps(), this);
		pm.registerEvents(new LojaGUI(), this);
		pm.registerEvents(new Nerfs(), this);
		pm.registerEvents(new GUIInteracts(), this);
		pm.registerEvents(new Gamemode(), this);
		pm.registerEvents(new Build(), this);
		
		
		
		pm.registerEvents(new Specialist(), this);
		pm.registerEvents(new Kangaroo(), this);
		pm.registerEvents(new Viper(), this);
		pm.registerEvents(new Snail(), this);
		pm.registerEvents(new Gladiator(), this);
		pm.registerEvents(new C4L(this), this);
		pm.registerEvents(new Endermage(this), this);
		pm.registerEvents(new Camel(), this);
		pm.registerEvents(new Phantom(), this);
		pm.registerEvents(new Swords(), this);
		pm.registerEvents(new Avatar(), this);
		pm.registerEvents(new Magma(), this);
		pm.registerEvents(new Backpacker(), this);
		pm.registerEvents(new Ninja(), this);
		pm.registerEvents(new Stomper(), this);
		pm.registerEvents(new Anchor(), this);
		pm.registerEvents(new Hulk(), this);
		pm.registerEvents(new Deshfire(), this);
		pm.registerEvents(new Fisherman(), this);
		pm.registerEvents(new Switcher(), this);



		getCommand("pl").setExecutor(new Pl());
		getCommand("spawn").setExecutor(new Spawn());
		getCommand("mlg").setExecutor(new Mlg());
		getCommand("main").setExecutor(new me.TijelaPvP.Warps.Main());
		getCommand("fps").setExecutor(new Fps());
		getCommand("knock").setExecutor(new Knock());
		getCommand("rdm").setExecutor(new Rdm());
		getCommand("challenge").setExecutor(new Challenge());
		getCommand("gm").setExecutor(new Gamemode());
		getCommand("kit").setExecutor(new Kit());
		getCommand("bc").setExecutor(new bc());
		getCommand("build").setExecutor(new Build());
		getCommand("ping").setExecutor(new Ping());
		getCommand("report").setExecutor(new Report());
		getCommand("togglepvp").setExecutor(new TogglePvP());
		getCommand("youtuber").setExecutor(new Youtuber());
		getCommand("ip").setExecutor(new Ip());


	}

	public void save() {
		try {
			this.warps.save(this.warps1);

	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
