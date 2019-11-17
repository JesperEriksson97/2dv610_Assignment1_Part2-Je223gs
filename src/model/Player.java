package model;

public class Player {

	private Dice dice_1;
	private Dice dice_2;
	
	public Player() {
		dice_1 = new Dice();
		dice_2 = new Dice();
	}
	
	public void rollDices() {
		dice_1.roll();
		dice_2.roll();
	}
	
	public int getDiceValues() {
		return dice_1.getVal() + dice_2.getVal();
	}
}
