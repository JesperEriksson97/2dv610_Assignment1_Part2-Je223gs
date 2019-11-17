package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoRule;
import static org.mockito.Mockito.*;

class Player_tests {

	private model.Dice dice_1;
	private model.Dice dice_2;
	private model.Player player = new model.Player();
	
	@Before
	public void setUp() {

	}
	
	@Test
	public void testIfPlayerCanRoll() {
		player.rollDices();
		assertTrue(player.getDiceValues() > 1 && player.getDiceValues() < 13);
	}

}
