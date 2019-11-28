package model;

/**
 * Factory to create dices
 * @author Jesper
 *
 */

public class Factory {

	/**
	 * Creates a dice object
	 * @return Dice
	 */
	
	public Dice createDice() {
		model.Dice dice = new model.Dice();
		return dice;
	}

}
