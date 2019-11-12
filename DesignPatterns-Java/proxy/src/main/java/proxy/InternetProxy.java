package proxy;

import java.util.ArrayList;
import java.util.List;

public class InternetProxy implements Internet {

	private Internet internet = new RealInternetImpl();
	private static List<String> restrictedSites;

	static {
		restrictedSites = new ArrayList<>();
		restrictedSites.add("blabla.com");
		restrictedSites.add("tuttiFrutti.com");
		restrictedSites.add("googleDrive.com");
		restrictedSites.add("brazzers.com");
	}

	@Override
	public void connectTo(String host) throws Exception {

		if (!restrictedSites.contains(host.toLowerCase())) {
			internet.connectTo(host);
		} else {
			throw new Exception("Company restricted this site view");
		}
	}

}
