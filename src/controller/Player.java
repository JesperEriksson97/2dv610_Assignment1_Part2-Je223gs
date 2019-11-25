package controller;




public class Player {
	
	private model.Game game_1;
	private view.IView view_1;
	private String in;

	public Player(model.Game game_1, view.IView view_1) {
		this.game_1 = game_1;
		this.view_1 = view_1;
	}

	public void printWelcomeMessage() {
		view_1.printWelcomeMessage();
		
	}

	public void printGoodByeMessage() {
		view_1.printGoodByeMessage();
	}

	public void printResult(boolean b) {
		view_1.printResult(b);
		
	}
	
	public String getUserInput() {
		return view_1.getUserInput();
	}

	public void playGame() {
		printWelcomeMessage();
		in = getUserInput();
		
		if(in.matches(view_1.getPlayButton())) { // Hidden dependancy #1 CHANGE THIS
			game_1.playerRollDices();
			
			if(game_1.playerWinsSeven()) {
				printResult(true);
			} else if(game_1.playerWinsDoubles()) {
				printResult(true);
			} else {
				printResult(false);
			}
		}
		
		if (in.matches(view_1.getQuitButton())) {  // Hidden dependancy #2 CHANGE THIS
			printGoodByeMessage();
			System.exit(0);
		} else {
			// playGame(); // disabled temporary, crashes the tests with a infinite loop. Should be always going in the actual game later on.
		}
				
		
		
	}

	
}
