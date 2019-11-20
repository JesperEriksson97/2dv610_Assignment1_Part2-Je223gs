package view;

import java.util.Scanner;

public class EnglishView implements IView {

	public String getUserInput() {
		Scanner inKeyboard = new Scanner(System.in);
		String input = inKeyboard.nextLine();
		inKeyboard.close();
		return input;
	}

	public void printWelcomeMessage() {
		System.out.print("Welcome to my Dice Game! p to play, q to quit");
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

}
