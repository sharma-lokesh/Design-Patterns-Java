package chainOfResponsibility;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class OrcKingTest {
	private static final Request[] REQUESTS = new Request[] {
			new Request(RequestType.DEFEND_CASTLE, "Don't let the barbarians enter my castle!!"),
			new Request(RequestType.TORTURE_PRISONER, "Don't just stand there, tickle him!"),
			new Request(RequestType.COLLECT_TAX, "Don't steal, the King hates competition ..."), };

	@Test
	public void testMakeRequest() throws Exception {
		OrcKing king = new OrcKing();

		for (final Request request : REQUESTS) {
			king.makeRequest(request);
			Assertions.assertTrue(request.isHandled(),
					"Expected all requests from King to be handled, but [" + request + "] was not!");
		}

	}
}
