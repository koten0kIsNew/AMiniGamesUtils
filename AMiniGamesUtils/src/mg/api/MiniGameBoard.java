package mg.api;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

public class MiniGameBoard {
	
	private Scoreboard board;
	private Team team;
	private Objective objective;
	
	public MiniGameBoard(DisplaySlot type, String team, String obj_name, String criteria) {
		this.board = Bukkit.getScoreboardManager().getNewScoreboard();
		this.team = board.registerNewTeam(team);
	    this.objective = board.registerNewObjective(obj_name, criteria);
	    this.objective.setDisplaySlot(type);
	    this.team.setCanSeeFriendlyInvisibles(false);
	    this.team.setAllowFriendlyFire(true);
	}

	public Scoreboard getBoard() {
		return board;
	}

	public void setBoard(Scoreboard board) {
		this.board = board;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Objective getObjective() {
		return objective;
	}

	public void setObjective(Objective objective) {
		this.objective = objective;
	}
	
	public void addLine(String text, int slot) {
		Score score = this.objective.getScore(text);
		score.setScore(slot);
	}
	
	public void clear(Player player) {
		player.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
	}
	
	public void load(Player player) {
		player.setScoreboard(this.board);
	}
	
	public void setTitle(String title) {
		title = ChatColor.translateAlternateColorCodes('&', title);
		this.objective.setDisplayName(title);
	}
}
