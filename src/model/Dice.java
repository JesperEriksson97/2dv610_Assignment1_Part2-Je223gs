package model;

/**
 * Dice class 
 * @author Jesper
 */

public class Dice {

	private int val; // dice value
	
	/**
	 * rolls the dice
	 */
	
	public void roll() {
		val = (int) (Math.random()*6+1);
	}
	
	/**
	 * Getter for dice value
	 * @return
	 */
	
	public int getVal() {
		return val;
	}
}
