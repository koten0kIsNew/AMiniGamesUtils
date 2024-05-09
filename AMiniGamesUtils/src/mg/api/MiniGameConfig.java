package mg.api;

import java.io.File;
import java.io.IOException;
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
		this.cfg = YamlConfiguration.loadConfiguration(this.file);
		try {
			this.file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
