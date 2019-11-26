package model;

public class Factory {

	public Object createDice() {
		model.Dice dice = new model.Dice();
		return dice;
	}

}
