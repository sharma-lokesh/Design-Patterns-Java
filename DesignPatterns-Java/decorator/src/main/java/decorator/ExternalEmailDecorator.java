package decorator;

public class ExternalEmailDecorator extends EmailDecorator {
	private String content;

	public ExternalEmailDecorator(Email basicEmail) {
		originalEmail = basicEmail;
	}

	@Override
	public String getBody() {
		content = this.addDisclaimer(originalEmail.getBody());
		return content;
	}

	private String addDisclaimer(String message) {
		return message + "\n Company Disclaimer";
	}

}
