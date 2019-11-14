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
		dice_1 = Mockito.mock(model.Dice.class);
		dice_2 = Mockito.mock(model.Dice.class);
	}
	
	@Test
	public void testIfPlayerCanRoll() {
		player.rollDices();
		assertTrue(player.getDiceValues() != 0);
	}
	
	@Test
	public void testIfPlayerCanWinWithSeven() {
		doReturn(3).when(dice_1).getVal();
		doReturn(4).when(dice_2).getVal();
		
		assertTrue(player.isSeven(dice_1.getVal(), dice_2.getVal()));
	}
	
	@Test
	public void testIfPlayerCanWinWithDoubles() {
		doReturn(3).when(dice_1).getVal();
		doReturn(3).when(dice_2).getVal();
		
		assertTrue(player.isDoubles(dice_1.getVal(), dice_2.getVal()));
	}
	
	

}
