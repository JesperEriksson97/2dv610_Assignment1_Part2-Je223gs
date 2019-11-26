package program;

public class Main {
		
	public static void main(String[] args) {
		model.Factory factory = new model.Factory();
		
		model.Dice dice_1 = factory.createDice(); // create dices with factory
		model.Dice dice_2 = factory.createDice();
		
		model.Player player = new model.Player(dice_1, dice_2);
		view.IView view = new view.EnglishView();
		model.Game game = new model.Game(player);
		controller.Player controller = new controller.Player(game, view);
		
		startUp(controller); // lauch game
	}
	
	public static void startUp(controller.Player controller) {
		controller.playGame();
	}
}
