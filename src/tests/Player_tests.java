package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class Player_tests {

	private model.Player player;
	private model.Dice mockDice_1;
	private model.Dice mockDice_2;
	
	/**
	 * Using mocked Dices because 
	 */
	@BeforeEach
	public void setUp() {
		mockDice_1 = Mockito.mock(model.Dice.class);
		mockDice_2 = Mockito.mock(model.Dice.class);
		player = new model.Player(mockDice_1, mockDice_2);
	}
	
	/**
	 * checking if the dice values changes when rolled.
	 */
	
	@Test
	public void verifiesThatDicesAreBeingRolled() {
		
		player.rollDices();
		
		Mockito.verify(mockDice_1, times(1)).roll();
		Mockito.verify(mockDice_2, times(1)).roll();
		
	}
	

}
