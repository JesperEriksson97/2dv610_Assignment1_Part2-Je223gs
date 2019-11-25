package model;

public class Game {

	private Player player;
	
	public Game(Player player) {
		this.player = player;
	}
	
	public boolean playerWinsSeven(model.Player player_1) {
		if (player_1.getDiceValues() == 7) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean playerWinsDoubles(model.Player player_1) {
		if (player_1.getDice1Val() == player_1.getDice2Val()) {
			return true;
		} else {
			return false;
		}
	}

	public void playerRollDices() {
		player.rollDices();
	}

	public int getPlayerDiceValues() {
		return player.getDiceValues();
	}
	
}
