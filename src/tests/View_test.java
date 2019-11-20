package tests;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.*;
import org.mockito.*;
import org.mockito.Mockito.*;

public class View_test {

	private view.IView view_1;
	private model.Player player_1;
	private model.Game game_1;
	
	// System readings
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final ByteArrayInputStream inContent = new ByteArrayInputStream("p".getBytes());
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	private final InputStream originalIn = System.in;
	
	@Before
	public void setUp() {
		player_1 = Mockito.mock(model.Player.class);
		game_1 = Mockito.mock(model.Game.class);
		view_1 = new view.EnglishView();
		
		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
	    System.setIn(inContent);	}
	
	/**
	 * Testing if the welcome message is correct
	 */
	@Test
	public void shouldReturnCorrectWelcomeMessage() {
		view_1.printWelcomeMessage();
		assertEquals("Welcome to my Dice Game", outContent.toString());
	}
	
	/**
	 * Testing if the win message is correct
	 */
	@Test
	public void shouldReturnCorrectWinMessage() {
		view_1.printResult(true);
		assertEquals("You won!", outContent.toString());
	}
	
	/**
	 * Testing if the lost message is correct
	 */
	@Test
	public void shouldReturnCorrectLoseMessage() {
		view_1.printResult(false);
		assertEquals("You lost! try again...", outContent.toString());
	}
	
	/**
	 * Testing if the goodbye message is correct
	 */
	@Test
	public void shouldReturnCorrectGoodbyeMessage() {
		view_1.printGoodByeMessage();
		assertEquals("Farewell player!", outContent.toString());
	}
	
	/**
	 * Reseting streams so that we can run tests multiple times
	 */
	
	@Test
	public void shouldReturnCorrectUserInput() {
		EnglishViewStub viewStub = new EnglishViewStub();
		assertEquals("p" , viewStub.getUserInput(inContent));
	}
	
	@After
	public void restoreStreams() {
		System.setOut(originalOut);
	    System.setErr(originalErr);
	    System.setIn(originalIn);
	}
}

/**
 * Stub class to test that the view can handle user inputs
 

class EnglishViewStub implements view.IView {

	// Creating a different version of getUserInput to be able to
	// "fake" user input by managing my own InputStream
	public String getUserInput(InputStream in) {
		Scanner userKeyboard = new Scanner(in);
		String input = userKeyboard.nextLine();
		userKeyboard.close();
		
		return input;
	}
	
	public void printWelcomeMessage() {}
	public void printGoodByeMessage() {	}
	public void printResult(boolean b) {	}
	public String getUserInput() {return null;}
	
}
*/
