package command;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CommandTest {
	private static final String GOBLIN = "Goblin";

	@Test
	public void testCommand() {

		Wizard wizard = new Wizard();
		Goblin goblin = new Goblin();

		wizard.castSpell(new ShrinkSpell(), goblin);
		verifyGoblin(goblin, GOBLIN, Size.SMALL, Visibility.VISIBLE);

		wizard.castSpell(new InvisibilitySpell(), goblin);
		verifyGoblin(goblin, GOBLIN, Size.SMALL, Visibility.INVISIBLE);

		wizard.undoLastSpell();
		verifyGoblin(goblin, GOBLIN, Size.SMALL, Visibility.VISIBLE);

		wizard.undoLastSpell();
		verifyGoblin(goblin, GOBLIN, Size.NORMAL, Visibility.VISIBLE);

		wizard.redoLastSpell();
		verifyGoblin(goblin, GOBLIN, Size.SMALL, Visibility.VISIBLE);

		wizard.redoLastSpell();
		verifyGoblin(goblin, GOBLIN, Size.SMALL, Visibility.INVISIBLE);
	}

	private void verifyGoblin(Goblin goblin, String expectedName, Size expectedSize, Visibility expectedVisibility) {
		assertEquals(expectedName, goblin.toString(), "Goblin's name must be same as expectedName");
		assertEquals(expectedSize, goblin.getSize(), "Goblin's size must be same as expectedSize");
		assertEquals(expectedVisibility, goblin.getVisibility(),
				"Goblin's visibility must be same as expectedVisibility");
	}
}
