package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class Game_tests {
	
	private model.Player player_1;
	private model.Game game_1;
	
	/**
	 * setting up test environment
	 */
	@Before
	public void SetUp() {
		player_1 = Mockito.mock(model.Player.class);
		game_1 = new model.Game(player_1);
	}
	
	/**
	 * test to check if player wins when dice values = 7
	 */
	@Test
	public void checkIfplayerWinSeven() {
		Mockito.when(player_1.getDiceValues()).thenReturn(7);
		
		assertTrue(game_1.playerWinsSeven());
		
	}
	
	/**
	 * test to check if playerWinsSeven() also returns false if the dice values is not seven.
	 */
	@Test
	public void checkIfplayerWinSevenReturnsFalseIfValueIsntSeven() {
		Mockito.when(player_1.getDiceValues()).thenReturn(6);
		
		assertFalse(game_1.playerWinsSeven());
		
	}
	
	/**
	 * test to check if player wins when dice values are equal
	 */
	@Test
	public void checkIfplayerWinsDoubles() {
		Mockito.when(player_1.getDice1Val()).thenReturn(3);
		Mockito.when(player_1.getDice2Val()).thenReturn(3);
		
		assertTrue(game_1.playerWinsDoubles());
		
	}
	
	/**
	 * test to check if player wins when dice values are equal
	 */
	@Test
	public void checkIfplayerWinsDoublesReturnsFalseIfDicesIsNotDoubles() {
		Mockito.when(player_1.getDice1Val()).thenReturn(3);
		Mockito.when(player_1.getDice2Val()).thenReturn(6);
		
		assertFalse(game_1.playerWinsDoubles());
		
	}
	
	/**
	 * test if game.playerRoll() actually rolls the dices of the player
	 */
	@Test
	public void rollDicesShouldReturnTwelve() {
		Mockito.when(player_1.getDiceValues()).thenReturn(12); // making sure that getDiceValues is actually being called
		game_1.playerRollDices();
		
		Assert.assertEquals(12, game_1.getPlayerDiceValues());	
	}
	
	/**
	 * test if game.getPlayerDice1Value() actually returns player_1.getDice1Val()
	 */
	@Test
	public void rollDice1ShouldReturn3() {
		Mockito.when(player_1.getDice1Val()).thenReturn(3);
		game_1.getPlayerDice1Value();
		
		Assert.assertEquals(3, game_1.getPlayerDice1Value());	
	}
	
	/**
	 * test if game.getPlayerDice1Value() actually returns player_1.getDice1Val()
	 */
	@Test
	public void rollDice2ShouldReturn3() {
		Mockito.when(player_1.getDice2Val()).thenReturn(3);
		game_1.getPlayerDice2Value();
		
		Assert.assertEquals(3, game_1.getPlayerDice2Value());	
	}
	


}
