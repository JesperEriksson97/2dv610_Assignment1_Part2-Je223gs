package test;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito.*;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class Main_tests {

	private program.Main main;
	private controller.Player controller;
	
	@Before
	public void setUp() {
		main = new program.Main();
		controller = Mockito.mock(controller.Player.class);
	}
	
	@Test
	public void startMethodShouldCallplayGame() {
		Mockito.verify(controller, times(1)).playGame();
	}
	
}
