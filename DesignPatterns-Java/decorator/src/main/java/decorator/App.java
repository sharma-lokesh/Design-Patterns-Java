package decorator;

public class App {
	public static void main(String[] args) {
		App test = new App();
		test.sendEmail(new EmailImpl("Hello", "aayush.sethi@hsc.com"));
	}

	public void sendEmail(Email email) {
		// read the email to-address, to see if it's going outside of the
		// company
		// if so decorate it
		if (email.getRecipent().contains("hsc.com")) {
			ExternalEmailDecorator external = new ExternalEmailDecorator(email);
			external.getBody();
		} else {
			SecureEmailDecorator secure = new SecureEmailDecorator(email);
			secure.getBody();
		}
	}
}
