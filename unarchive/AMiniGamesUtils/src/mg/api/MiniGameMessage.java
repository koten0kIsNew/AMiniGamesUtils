package mg.api;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

public class MiniGameMessage {
	
	public MiniGameMessage() {}
	
	public void broadcastPlayers(String text, List<Player> players) {
		for (Player player : players) {
			player.sendMessage(text);
		}
	}
	
	public void broadcast(String text, List<String> players) {
		for (String player : players) {
			Bukkit.getPlayer(player).sendMessage(text);
		}
	}
	
	public void broadcastPlayers(String title, String subtitle, int a, int b, int c, List<Player> players) {
		for (Player player : players) {
			player.sendTitle(title,subtitle,a,b,c);
		}
	}
	
	public void broadcast(String title, String subtitle, int a, int b, int c, List<String> players) {
		for (String player : players) {
			Bukkit.getPlayer(player).sendTitle(title,subtitle,a,b,c);
		}
	}
	
	public void sendBossbar(Player player, String text, BarColor color, BarStyle style) {
		BossBar bar = Bukkit.getServer().createBossBar("", color, style);
		bar.setTitle(text);
		bar.addPlayer(player);
	}
}
