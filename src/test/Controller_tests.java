package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class Controller_tests {

	private controller.Player pc_1;
	private model.Game game_1;
	private view.EnglishView view_1;
	
	@Before
	public void setUp() {
		game_1 = Mockito.mock(model.Game.class);
		view_1 = Mockito.mock(view.EnglishView.class);
		pc_1 = new controller.Player(game_1, view_1);
	}
	
	/**
	 * The three following test cases are made to check that the views methods are actually being
	 * called by the controller. We're are mocking the view becuase it's being tested in another
	 * test suite.
	 */
	
	// ---------------------------------------- VIEW TESTS BEGIN ----------------------------------------
	@Test
	public void shouldPrintWelcomeMessage() {
		pc_1.printWelcomeMessage();
		Mockito.verify(view_1, times(1)).printWelcomeMessage();
	}
	
	@Test
	public void shouldPrintGoodByeMessage() {
		pc_1.printGoodByeMessage();
		Mockito.verify(view_1, times(1)).printGoodByeMessage();
	}
	
	@Test
	public void shouldPrintResultWithBooleanSetToFalse() {
		pc_1.printResult(false);
		Mockito.verify(view_1, times(1)).printResult(false);
	}
	
	@Test
	public void shouldPrintResultWithBooleanSetToTrue() {
		pc_1.printResult(true);
		Mockito.verify(view_1, times(1)).printResult(true); // adding a true method aswell to get 100% branch coverage
	}
	
	// ----------------------------------------  VIEW TESTS END  ----------------------------------------
	
	/**
	 * Checking that all components of the game is actually being called in the PlayGame method of controller.
	 * This tests makes sure that everything works out as intended when the player wins on a seven value.
	 */
	
	@Test
	public void shouldPlayGameWinningOnSeven() {
		
		mockWhenUserInput();
		Mockito.when(view_1.getPlayButton()).thenReturn("p");
		Mockito.when(view_1.getQuitButton()).thenReturn("q");
		
		pc_1.playGame();
		
		checkVerifies();
		Mockito.verify(view_1, times(1)).printResult(game_1.playerWinsSeven());
		
		
	}
	
	/**
	 * Checking that all components of the game is actually being called in the PlayGame method of controller.
	 * This tests makes sure that everything works out as intended when the player wins on a doubles.
	 */
	
	@Test
	public void shouldPlayGameWinningOnDoubles() {
		
		mockWhenUserInput();
		Mockito.when(view_1.getPlayButton()).thenReturn("p");
		Mockito.when(view_1.getQuitButton()).thenReturn("q");
		Mockito.when(game_1.getPlayerDice1Value()).thenReturn(3);
		Mockito.when(game_1.getPlayerDice2Value()).thenReturn(3);
		
		pc_1.playGame();
	
		checkVerifies();
		Mockito.verify(game_1, times(1)).playerWinsDoubles();
		Mockito.verify(view_1, times(1)).printResult(game_1.playerWinsSeven());
		
		
	}
	
	/**
	 * Checking that everything works as intended when the player is losing.
	 */
	
	@Test
	public void shouldPlayGameInLosingState() {
		
		Mockito.when(view_1.getPlayButton()).thenReturn("p");
		Mockito.when(view_1.getQuitButton()).thenReturn("q");
		Mockito.when(view_1.getUserInput()).thenReturn("p");
		Mockito.when(game_1.getPlayerDiceValues()).thenReturn(8);
		Mockito.when(game_1.getPlayerDice1Value()).thenReturn(3);
		Mockito.when(game_1.getPlayerDice2Value()).thenReturn(5);
		
		pc_1.playGame();
		
		checkVerifies();
		Mockito.verify(game_1, times(1)).playerWinsDoubles();
		Mockito.verify(view_1, times(1)).printResult(false);
		
		
	}
	
	private void checkVerifies() {
		Mockito.verify(view_1, times(1)).printWelcomeMessage();
		Mockito.verify(view_1, times(1)).getUserInput();
		
		Mockito.verify(game_1, times(1)).playerRollDices();
		Mockito.verify(game_1, times(1)).playerWinsSeven();
	}
	
	private void mockWhenUserInput() {
		Mockito.when(view_1.getUserInput()).thenReturn("p");
		Mockito.when(game_1.getPlayerDiceValues()).thenReturn(7);
	}
}
