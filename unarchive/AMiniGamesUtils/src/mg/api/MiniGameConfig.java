package mg.api;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

public class MiniGameConfig {
	
	private File file;
	private FileConfiguration cfg;
	
	public MiniGameConfig(Plugin plugin, String folder) {
		folder = folder.replace("/", File.separator);
		String path = plugin.getDataFolder().getAbsolutePath()+File.separator+folder;
		this.file = new File(path);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				plugin.getLogger().log(Level.SEVERE, "§cПроизошла ошибка при создании файла!");
				plugin.getLogger().log(Level.SEVERE, "§cПуть: "+path);
				plugin.getLogger().log(Level.SEVERE, "§cСокращённый путь:"+folder);
				plugin.getLogger().log(Level.SEVERE, "§cПлагин: "+plugin);
				plugin.getLogger().log(Level.SEVERE, "§cЛокация ошибки: ");
				plugin.getLogger().log(Level.SEVERE, "§c	Класс: mg.api.MiniGameConfig");
				plugin.getLogger().log(Level.SEVERE, "§c	Строка: 22");
				plugin.getLogger().log(Level.SEVERE, "§c	Код: file.createNewFile()");
				plugin.getLogger().log(Level.SEVERE, "§cФайл не был создан!");
			}
		}
		this.cfg = YamlConfiguration.loadConfiguration(this.file);
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public FileConfiguration get() {
		return cfg;
	}
	
	public void saveConfig() {
		try {
			this.cfg.save(this.file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void reload() {
		this.cfg = YamlConfiguration.loadConfiguration(this.file);
	}
}
