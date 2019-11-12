package proxy;

import static org.junit.Assert.fail;

import org.junit.Test;

public class ConnectToNonRestrictedSitesTest {
	@Test
	public void connectToTest() {
		InternetProxy tryToConnect = new InternetProxy();
		try {
			tryToConnect.connectTo("google.com");
		} catch (Exception e) {
			fail("Trying to connect to Restricted Website from non restrictive class");
		}
	}
}
