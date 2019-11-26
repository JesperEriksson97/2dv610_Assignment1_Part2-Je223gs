package model;

public class Dice {

	private int val;
	
	public void roll() {
		val = (int) (Math.random()*6+1);
	}
	
	public int getVal() {
		return val;
	}
}
