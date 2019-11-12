package composite;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class MessengerTest {
	private ByteArrayOutputStream stdOutBuffer = new ByteArrayOutputStream();

	private final PrintStream realStdOut = System.out;

	@BeforeEach
	public void setUp() {
		this.stdOutBuffer = new ByteArrayOutputStream();
		System.setOut(new PrintStream(stdOutBuffer));
	}

	@AfterEach
	public void tearDown() {
		System.setOut(realStdOut);
	}

	@Test
	public void testMessageFromOrcs() {
		final Messenger messenger = new Messenger();
		testMessage(messenger.messageFromOrcs(), "Where there is a whip there is a way.");
	}

	@Test
	public void testMessageFromElves() {
		final Messenger messenger = new Messenger();
		testMessage(messenger.messageFromElves(), "Much wind pours from your mouth.");
	}

	private void testMessage(final LetterComposite composedMessage, final String message) {
		final String[] words = message.split(" ");
		Assertions.assertNotNull(composedMessage);
		Assertions.assertEquals(words.length, composedMessage.count());

		composedMessage.print();

		Assertions.assertEquals(message, new String(this.stdOutBuffer.toByteArray()).trim());
	}

}
