package builder;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MealTest {
	@Test
	public void testMissingMain() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> new Meal.Builder(null, "Null Meal"));
	}

	@Test
	public void testMissingName() throws Exception {
		assertThrows(IllegalArgumentException.class, () -> new Meal.Builder(Main.BURGER, null));
	}

	@Test
	public void testBuildMeal() throws Exception {
		String mealName = "Kid's Meal";

		Meal meal = new Meal.Builder(Main.BURGER, mealName).withDessert(Dessert.PASTRY).withDrink(Drink.Coffee).build();

		assertNotNull(meal);
		assertNotNull(meal.toString());
		assertEquals(Main.BURGER, meal.getMain());
		assertEquals(mealName, meal.getName());
		assertEquals(Dessert.PASTRY, meal.getDessert());
		assertEquals(Drink.Coffee, meal.getDrink());

	}
}
