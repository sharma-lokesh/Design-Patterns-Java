package prototype;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PrototypeTest<P extends Color> {

	static Collection<Object[]> dataProvider() {
		return Arrays.asList(new Object[] { new BlackColor(), "Black" }, new Object[] { new BlueColor(), "Blue" });
	}

	@Test
	@ParameterizedTest
	@MethodSource("dataProvider")
	public void testPrototype(P testedPrototype, String colorToExpect) throws Exception {
		Assertions.assertEquals(colorToExpect, testedPrototype.getColor());

		final Object clone = testedPrototype.clone();
		Assertions.assertNotNull(clone);
		Assertions.assertNotSame(clone, testedPrototype);
		Assertions.assertSame(testedPrototype.getClass(), clone.getClass());
	}
}
