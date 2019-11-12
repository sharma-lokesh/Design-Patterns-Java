package decorator;

public abstract class EmailDecorator implements Email {
	private String recipent;

	public Email originalEmail;

	public String getRecipent() {
		return this.recipent;
	}

	@Override
	public void setRecipent(String recipent) {
		this.recipent = recipent;
	}

}
