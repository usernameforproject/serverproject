package me.hipsteruser.killingfloor;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class MainClass extends JavaPlugin {

	Logger log;

	public void onEnable() {
		log.info("enabled.");
	}

	public void onDisable() {
		log.info("disabled.");
	}
}
