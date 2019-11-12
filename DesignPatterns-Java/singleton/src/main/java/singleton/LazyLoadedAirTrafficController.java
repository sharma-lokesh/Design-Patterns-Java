package singleton;

/**
 * Lazy Initiated Singleton class, Thread safe.
 *
 */
public class LazyLoadedAirTrafficController {
	private LazyLoadedAirTrafficController() {
	}

	public static LazyLoadedAirTrafficController getInstance() {
		return SingletonHelper.INSTANCE;
	}

	private static class SingletonHelper {
		public static LazyLoadedAirTrafficController INSTANCE = new LazyLoadedAirTrafficController();
	}
}
