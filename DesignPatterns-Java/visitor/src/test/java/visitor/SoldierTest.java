package visitor;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

public class SoldierTest extends UnitTest<Soldier> {
	public SoldierTest() {
		super(Soldier::new);
	}

	@Override
	void verifyVisit(Soldier unit, UnitVisitor mockedVisitor) {
		verify(mockedVisitor).visitSoldier(eq(unit));
	}

}