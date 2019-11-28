package model;

/**
 * Class that represents a Game class.
 * @author Jesper
 *
 */

public class Game {

	private Player player; // the player playing the game.
	
	/**
	 * Constructor
	 * @param player This is the player that plays the game
	 */
	
	public Game(Player player) {
		this.player = player;
	}
	
	/**
	 * Checks if players dices is the value of seven
	 * @return boolean
	 */
	
	public boolean playerWinsSeven() {
		if (player.getDiceValues() == 7) {
			return true;
		} else {
			
			return false;
			
		}
	}
	
	/**
	 * Checks if the player dices are doubles
	 * @return boolean
	 */
	
	public boolean playerWinsDoubles() {
		if (player.getDice1Val() == player.getDice2Val()) {
			return true;
		} else {
			
			return false;
			
		}
	}

	/**
	 * Rolls the dices of the player
	 */
	
	public void playerRollDices() {
		player.rollDices();
	}

	/**
	 * Getter for the players dice values
	 * @return int
	 */
	
	public int getPlayerDiceValues() {
		return player.getDiceValues();
	}

	/**
	 * Gets the players first dice value (primarly used for testing purposes)
	 * @return int
	 */
	
	public int getPlayerDice1Value() {
		return player.getDice1Val();
	}

	/**
	 * Gets the players second dice value (primarly used for testing purposes
	 * @return
	 */
	
	public int getPlayerDice2Value() {
		return player.getDice2Val();
	}
	
}
