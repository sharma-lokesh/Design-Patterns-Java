package builder;

public enum Drink {

	COKE("Coke"), Coffee("Coffee"), JUICE("Juice"), ICE_CREAM_SHAKE("Ice Cream Shake");

	private String title;

	Drink(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
