package view;

public interface IView {

	String getUserInput();
	void printWelcomeMessage();
	void printGoodByeMessage();
	void printResult(boolean b);
	String getPlayButton();
	String getQuitButton();
	void printDiceValues(int i, int j);
}
