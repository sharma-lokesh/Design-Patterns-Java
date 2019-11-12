package builder;

public class App {
	public static void main(String[] args) {
		Meal mealForMom = new Meal.Builder(Main.BURGER, "Mom's Meal").withDessert(Dessert.ICE_CREAM)
				.withDrink(Drink.COKE).build();
		System.out.println(mealForMom.toString());

		Meal mealForDad = new Meal.Builder(Main.PIZZA, "Dad's Meal").withDessert(Dessert.MUFFIN)
				.withDrink(Drink.ICE_CREAM_SHAKE).build();
		System.out.println(mealForDad.toString());

		Meal mealForMe = new Meal.Builder(Main.PIZZA, "My Meal").withDessert(Dessert.PAN_CAKE).withDrink(Drink.Coffee)
				.build();
		System.out.println(mealForMe.toString());
	}
}
