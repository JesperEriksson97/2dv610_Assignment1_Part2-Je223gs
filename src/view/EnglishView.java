package view;

import java.util.Scanner;

public class EnglishView implements IView {

	
	String playButton = "p";
	String quitButton = "q";
	
	public String getUserInput() {
		Scanner inKeyboard = new Scanner(System.in);
		String input = inKeyboard.nextLine();
		return input;
	}

	public void printWelcomeMessage() {
		System.out.print("Welcome to my Dice Game! " + playButton + " to play, " + quitButton + " to quit");
	}

	public void printGoodByeMessage() {
		System.out.print("Farewell player!");
	}

	public void printResult(boolean b) {
		if (b) {
			System.out.print("You won!");
		} else {
			System.out.print("You lost! Try again...");
		}
	}

	public String getPlayButton() {
		return playButton; // test
	}

	public String getQuitButton() {
		return quitButton; // test
	}

	@Override
	public void printDiceValues(int dice1_val, int dice2_val) {
		System.out.print("Dice#1: " + dice1_val + " Dice#2: " + dice2_val);
		
	}

}
