package decorator;

public class SecureEmailDecorator extends EmailDecorator {

	private String content;

	public SecureEmailDecorator(Email basicEmail) {
		originalEmail = basicEmail;
	}

	@Override
	public String getBody() {
		content = this.encrypt(originalEmail.getBody());
		return content;
	}

	private String encrypt(String message) {
		return message + "\n Encryption Disclaimer";
	}

}
