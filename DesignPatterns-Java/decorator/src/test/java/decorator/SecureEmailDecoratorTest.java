package decorator;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.internal.verification.VerificationModeFactory.times;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SecureEmailDecoratorTest {

	@Test
	public void testSecureEmail() throws Exception {
		final Email simpleEmail = spy(new EmailImpl("Hello", "ram@gmail.com"));

		final Email secureEmail = new SecureEmailDecorator(simpleEmail);
		Assertions.assertTrue(secureEmail.getBody().contains("Encryption Disclaimer"));
		verify(simpleEmail, times(1)).getBody();

	}
}
