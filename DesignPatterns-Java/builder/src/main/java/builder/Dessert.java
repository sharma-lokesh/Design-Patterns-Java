package builder;

public enum Dessert {

	ICE_CREAM("Ice Cream"), PAN_CAKE("Pan Cake"), PASTRY("Pastry"), MUFFIN("Muffin");

	private String title;

	Dessert(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
