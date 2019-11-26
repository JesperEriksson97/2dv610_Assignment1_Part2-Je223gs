package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Factory_tests {

	private model.Factory factory;
	
	@Before
	public void setUp() {
		factory = new model.Factory();
	}
	
	@Test
	public void shouldReturnDice() {
		Object actual = factory.createDice();
		model.Dice expected = new model.Dice();
		
		assertEquals(expected, actual);
	}
}
