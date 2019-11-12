package decorator;

public class EmailImpl implements Email {
	private String content;
	private String recipent;

	public EmailImpl(String content, String recipent) {
		this.content = content;
		this.recipent = recipent;
	}

	@Override
	public String getBody() {
		return content;
	}

	@Override
	public String getRecipent() {
		return recipent;
	}

	@Override
	public void setRecipent(String recipent) {
		this.recipent = recipent;
	}
}
