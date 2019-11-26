package model;

public class Factory {

	public Dice createDice() {
		model.Dice dice = new model.Dice();
		return dice;
	}

}
