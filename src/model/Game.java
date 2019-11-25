package model;

public class Game {

	private Player player;
	
	public Game(Player player) {
		this.player = player;
	}
	
	public boolean playerWinsSeven() {
		if (player.getDiceValues() == 7) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean playerWinsDoubles() {
		if (player.getDice1Val() == player.getDice2Val()) {
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
