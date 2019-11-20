package model;

public class Player {

	private Dice dice_1;
	private Dice dice_2;
	
	public Player(Dice dice_1, Dice dice_2) {
		this.dice_1 = dice_1;
		this.dice_2 = dice_2;
	}
	
	public void rollDices() {
		dice_1.roll();
		dice_2.roll();
	}
	
	public int getDiceValues() {
		return dice_1.getVal() + dice_2.getVal();
	}
	
	public int getDice1Val() {
		return dice_1.getVal();
	}
	
	public int getDice2Val() {
		return dice_1.getVal();
	}
}
