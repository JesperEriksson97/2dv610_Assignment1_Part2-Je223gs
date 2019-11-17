package model;

public class Game {

	
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
}
