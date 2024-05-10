package mg;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

import mg.world.WorldManager;

public class AMiniGamesUtils extends JavaPlugin{
	
	private Logger logger = getLogger();
	
	public void onEnable() {
		logger.log(Level.INFO, "§f===============");
		logger.log(Level.INFO, "§bAMiniGamesUtils");
		logger.log(Level.INFO, "§aПлагин включён!");
		logger.log(Level.INFO, "§f===============");
		getServer().getPluginManager().registerEvents(new WorldManager(), this);
		logger.log(Level.INFO, "§aКласс WorldManager успешно загружен!");
	}
	
	public void onDisable() {
		logger.log(Level.INFO, "§f===============");
		logger.log(Level.INFO, "§bAMiniGamesUtils");
		logger.log(Level.INFO, "§cПлагин выключен!");
		logger.log(Level.INFO, "§f===============");
	}
}
