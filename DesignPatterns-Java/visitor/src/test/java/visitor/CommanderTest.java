package visitor;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

public class CommanderTest extends UnitTest<Commander> {

  public CommanderTest() {
    super(Commander::new);
  }

  @Override
  void verifyVisit(Commander unit, UnitVisitor mockedVisitor) {
    verify(mockedVisitor).visitCommander(eq(unit));
  }

}