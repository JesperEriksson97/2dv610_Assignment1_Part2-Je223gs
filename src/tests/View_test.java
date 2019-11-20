package tests;

import org.junit.*;
import org.mockito.*;
import org.mockito.Mockito.*;

public class View_test {

	private view.IView view_1;
	private model.Player player_1;
	private model.Game game_1;
	
	@Before
	public void setUp() {
		player_1 = Mockito.mock(model.Player.class);
		game_1 = Mockito.mock(model.Game.class);
		view_1 = new view.IView();
	}
	
	@Test
	public void checkWelcomeMessage() {
		assertTrue(view_1.getWelcomeMessage().matches("Welcome to this Dice Game"));
	}
	
	@Test
	public void checkWinMessage() {
		Mockito.when(player_1.getDice1Val()).thenReturn(3);
		Mockito.when(player_1.getDice1Val()).thenReturn(3);
		
		Mockito.when(game_1.playerWinsDoubles(player_1)).thenReturn(true);
		
		assertEquals(view_1.getPrintWinMessage(game_1.playerWinsDoubles(player_1));
		
		
	}
}
