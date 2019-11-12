package visitor;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

public class SergeantTest extends UnitTest<Sergeant> {

	public SergeantTest() {
		super(Sergeant::new);
	}

	@Override
	void verifyVisit(Sergeant unit, UnitVisitor mockedVisitor) {
		verify(mockedVisitor).visitSergeant(eq(unit));
	}

}