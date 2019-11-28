package test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito.*;

import program.Main;

import org.mockito.Mockito;
import static org.mockito.Mockito.*;

/**
 * class that tests the main class
 * @author Jesper
 *
 */

public class Main_tests {

	private controller.Player controller;
	
	/**
	 * set up class for main test cases
	 */
	@Before
	public void setUp() {
		controller = Mockito.mock(controller.Player.class);
	}
	
	/**
	 * tests that controller.playGame() is actually being called exactly one time.
	 * controller.playGame() should always be called once.
	 */
	@Test
	public void startMethodShouldCallplayGame() {
		Main.startUp(controller);
		Mockito.verify(controller, times(1)).playGame();
	}
	
}
