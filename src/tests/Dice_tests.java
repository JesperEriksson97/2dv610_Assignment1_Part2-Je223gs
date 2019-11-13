package tests;

/**
 * Test suite for the Dice class
 * @author Jesper Eriksson
 * @version 1.0
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.junit.MockitoRule;
import static org.mockito.Mockito.*;

class Dice_tests {

	private model.Dice testDice;
	
	public Dice_tests() {
		this.testDice = new model.Dice();
	}
	
	@Test
	/** 
	 * Test to see that dice roll() function actually changes the value of the dice
	 */
	
	public void testIfDiceRolls() {
		testDice.roll();
		assertTrue(testDice.getVal() != 0);
	}
	
	@Test
	/**
	 * Tests that the range of the dice is correct (1-6)
	 */
	
	public void testIfDiceRollsInCorrectRange() {
		testDice.roll();
		assertTrue(testDice.getVal() < 7 && testDice.getVal() > 0);
	}
	
	@Test
	/**
	 * Checking if the outcome of roll() varies or if it's just returning the same number over and over again
	 */
	
	public void testIfDiceRollsVariy() {
		int[] arr = new int[10];
		boolean flag = true;
		testDice.roll();
		
		for (int x = 0; x < arr.length; x++) {
				testDice.roll();
				arr[x] = testDice.getVal();
		}
		
		
		int firstVal = arr[0]; // setting the first value
		for(int i = 1; i < arr.length; i++) {
		  if (arr[i] != firstVal) flag = false;
		}
		
		assertFalse(flag);
	}

}
