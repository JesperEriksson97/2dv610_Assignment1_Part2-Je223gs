package test;

import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

public class Factory_tests {

	private model.Factory factory;
	
	@Before
	public void setUp() {
		factory = new model.Factory();
	}
	
	@Test
	public void shouldReturnObjectOfTypeDice() {
		Object actual = factory.createDice();
		model.Dice expected = new model.Dice();
		
		assertSame(expected.getClass(), actual.getClass());
	}
}
