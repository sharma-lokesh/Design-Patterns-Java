package proxy;

import org.junit.Test;

public class ConnectToRestrictedSitesTest {

	@Test(expected = Exception.class)
	public void connectWithExpectationOfExceptionTest() throws Exception {
		InternetProxy tryToConnect = new InternetProxy();
			tryToConnect.connectTo("blabla.com");
	}
}
