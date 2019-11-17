package tests;

import static org.junit.Assert.assertTrue;

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
		game_1 = new model.Game();
	}
	
	/**
	 * test to check if player wins when dice values = 7
	 */
	@Test
	public void checkIfplayerWinSeven() {
		Mockito.when(player_1.getDiceValues()).thenReturn(7);
		
		assertTrue(game_1.playerWinsSeven(player_1));
		
	}
	
	/**
	 * test to check if player wins when dice values are equal
	 */
	@Test
	public void checkIfplayerWinsDoubles() {
		Mockito.when(player_1.getDice1Val()).thenReturn(3);
		Mockito.when(player_1.getDice2Val()).thenReturn(3);
		
		assertTrue(game_1.playerWinsDoubles(player_1));
		
	}
	
	/*public boolean playerWinDoubles(model.Player player_1) {
		if (player_1.getDiceValues() == 7) {
			return true;
		} else {
			return false;
		}
	}*/
	
	

}
