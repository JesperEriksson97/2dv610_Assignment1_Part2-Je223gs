package model;

/**
 * Player class
 * @author Jesper
 */

public class Player {

	private Dice dice_1;
	private Dice dice_2;
	
	/**
	 * Constructor of Player class
	 * @param dice_1 Dice
	 * @param dice_2 Dice
	 */
	
	public Player(Dice dice_1, Dice dice_2) {
		this.dice_1 = dice_1;
		this.dice_2 = dice_2;
	}
	
	/**
	 * Rolls the dices
	 */
	
	public void rollDices() {
		dice_1.roll();
		dice_2.roll();
	}
	
	/**
	 * getter for dice values
	 * @return int
	 */
	
	public int getDiceValues() {
		return dice_1.getVal() + dice_2.getVal();
	}
	
	/**
	 * gets the first dice value
	 * @return int
	 */
	
	public int getDice1Val() {
		return dice_1.getVal();
	}
	
	/**
	 * gets the second dice value
	 * @return int
	 */
	
	public int getDice2Val() {
		return dice_2.getVal();
	}
}
