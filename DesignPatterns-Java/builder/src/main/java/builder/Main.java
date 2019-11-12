package builder;

public enum Main {

	BURGER("Burger"), PIZZA("Pizza"), WRAP("Wrap"), SANDWICH("Sandwich");

	private String title;

	Main(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
