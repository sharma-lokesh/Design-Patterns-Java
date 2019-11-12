package builder;

public class Meal {

	private Main main;
	private Drink drink;
	private Dessert dessert;
	private String name;

	public Meal(Builder builder) {
		this.name = builder.name;
		this.dessert = builder.dessert;
		this.drink = builder.drink;
		this.main = builder.main;
	}

	public Main getMain() {
		return this.main;
	}

	public Drink getDrink() {
		return this.drink;
	}

	public Dessert getDessert() {
		return this.dessert;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Meal is ready for " + name + " with ");
		if (main != null) {
			sb.append(" Main option as " + main.toString());
		}
		if (drink != null) {
			sb.append(" Drink as " + drink.toString());
		}
		if (dessert != null) {
			sb.append(" Dessert as " + dessert.toString());
		}
		sb.append(".");
		return sb.toString();
	}

	public static class Builder {

		private Main main;
		private Drink drink;
		private Dessert dessert;
		private String name;

		/**
		 * Constructor
		 */
		public Builder(Main main, String name) {
			if (main == null || name == null) {
				throw new IllegalArgumentException("Main and name can not be null");
			}
			this.main = main;
			this.name = name;
		}

		public Builder withDrink(Drink drink) {
			this.drink = drink;
			return this;
		}

		public Builder withDessert(Dessert dessert) {
			this.dessert = dessert;
			return this;
		}

		public Meal build() {
			return new Meal(this);
		}
	}
}
