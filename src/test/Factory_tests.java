package test;

/**
 * Test case for the Factory class
 */

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

public class Factory_tests {

	private model.Factory factory;
	
	/**
	 * Set up class
	 */
	@Before
	public void setUp() {
		factory = new model.Factory();
	}
	
	/**
	 * Checks that crateDice() in factory actually returns a dice object.
	 */
	@Test
	public void shouldReturnObjectOfTypeDice() {
		model.Dice actual = factory.createDice();
		model.Dice expected = new model.Dice();
		
		assertSame(expected.getClass(), actual.getClass());
	}
}
