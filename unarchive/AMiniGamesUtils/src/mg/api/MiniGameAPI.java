package mg.api;

import org.bukkit.scoreboard.DisplaySlot;

public class MiniGameAPI {
	
	private MiniGameMessage mgm;
	
	public MiniGameBoard createScoreBoard(String team, String objective, String title) {
		MiniGameBoard board = new MiniGameBoard(DisplaySlot.SIDEBAR, team, objective, "dummy");
		board.setTitle(title);
		return board;
	}
	
	public MiniGameMessage getMGM() {
		return this.mgm;
	}
}
