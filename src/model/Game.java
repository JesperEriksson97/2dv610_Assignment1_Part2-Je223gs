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
			return false; // test
		}
	}
	
	public boolean playerWinsDoubles() {
		if (player.getDice1Val() == player.getDice2Val()) {
			return true;
		} else {
			return false; // test
		}
	}

	public void playerRollDices() {
		player.rollDices();
	}

	public int getPlayerDiceValues() {
		return player.getDiceValues();
	}

	public int getPlayerDice1Value() {
		return player.getDice1Val();
	}

	public int getPlayerDice2Value() {
		return player.getDice2Val();
	}
	
}
