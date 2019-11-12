package decorator;

import static org.mockito.Mockito.spy;
import static org.mockito.internal.verification.VerificationModeFactory.times;
import static org.mockito.Mockito.verify;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ExternalEmailDecoratorTest {

	@Test
	public void testExternalEmail() throws Exception {
		final Email simpleEmail = spy(new EmailImpl("Hello", "ram@hsc.com"));

		final Email externalEmail = new ExternalEmailDecorator(simpleEmail);
		Assertions.assertTrue(externalEmail.getBody().contains("Company Disclaimer"));
		verify(simpleEmail, times(1)).getBody();

	}
}
