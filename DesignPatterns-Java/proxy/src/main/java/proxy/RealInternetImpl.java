package proxy;

import org.apache.log4j.Logger;

public class RealInternetImpl implements Internet {
	private static final Logger LOGGER = Logger.getLogger(RealInternetImpl.class);

	@Override
	public void connectTo(String host) {
		LOGGER.info("Connecting to Internet with Host : " + host);
	}

}
