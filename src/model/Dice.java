package model;

public class Dice {

	private int val;
	
	public void roll() {
		val = (int) (Math.random()*6+1);
		System.out.println(val);
	}
	
	public int getVal() {
		return val;
	}
}
