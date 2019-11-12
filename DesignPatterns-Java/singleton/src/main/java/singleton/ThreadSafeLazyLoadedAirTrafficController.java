package singleton;

public class ThreadSafeLazyLoadedAirTrafficController {
	private static ThreadSafeLazyLoadedAirTrafficController instance;

	private ThreadSafeLazyLoadedAirTrafficController() {
		if (instance == null) {
			instance = this;
		} else {
			throw new IllegalStateException("Already initialized: ThreadSafeLazyLoadedAirTrafficController");
		}
	}

	/**
	 * The instance gets created only when it is called for first time.
	 * Lazy-loading
	 */
	public static synchronized ThreadSafeLazyLoadedAirTrafficController getInstance() {
		if (instance == null) {
			instance = new ThreadSafeLazyLoadedAirTrafficController();
		}
		return instance;
	}
}
