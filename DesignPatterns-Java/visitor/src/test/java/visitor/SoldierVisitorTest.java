package visitor;

import java.util.Optional;

public class SoldierVisitorTest extends VisitorTest<SoldierVisitor> {

	public SoldierVisitorTest() {
		super(new SoldierVisitor(), Optional.empty(), Optional.empty(), Optional.of("Greetings soldier"));
	}

}
