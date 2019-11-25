package test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.*;

public class View_test {

	private view.IView view_1;
	
	// Streams set up
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final ByteArrayInputStream inContent = new ByteArrayInputStream("p".getBytes());
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	private final InputStream originalIn = System.in;
	
	@Before
	public void setUp() {
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
		assertEquals("Welcome to my Dice Game! p to play, q to quit", outContent.toString());
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
		assertEquals("You lost! Try again...", outContent.toString());
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
	 * Tests if getUserInput() actually returns the user input given
	 */
	@Test
	public void shouldReturnCorrectUserInput() {
		EnglishViewStub viewStub = new EnglishViewStub();
		assertEquals("p" , viewStub.getUserInput(inContent));
	}
	
	/**
	 * Restoring streams
	 */
	@After
	public void restoreStreams() {
		System.setOut(originalOut);
	    System.setErr(originalErr);
	    System.setIn(originalIn);
	}
}

/**
 * Stub class to test that the view can handle user inputs
 */

class EnglishViewStub implements view.IView {

	// Creating a replica with code from the "correct" implementation with the exception
	// that getUserInput takes an InputStream as a argument.
	// This allows us to test user input by "faking" input and then see if the function can
	// handle it as intended.
	
	public String getUserInput(InputStream in) {
		Scanner inKeyboard = new Scanner(in);
		String input = inKeyboard.nextLine();
		inKeyboard.close();
		
		return input;
	}
	
	public void printWelcomeMessage() {}
	public void printGoodByeMessage() {}
	public void printResult(boolean b) {}
	public String getUserInput() {return null;}
	public String getPlayButton() {return null;}
	public String getQuitButton() {return null;}

	
}
