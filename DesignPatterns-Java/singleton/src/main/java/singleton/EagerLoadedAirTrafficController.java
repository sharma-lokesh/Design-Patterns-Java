package singleton;

/**
 * Singleton class. Eagerly initialized static instance guarantees thread
 * safety, to be used for models, where threading is not of prime importance.
 * Can we used for configuration based singleton loading.
 *
 */
public class EagerLoadedAirTrafficController {
	private final static EagerLoadedAirTrafficController INSTANCE = new EagerLoadedAirTrafficController();

	private EagerLoadedAirTrafficController() {
	}

	public static EagerLoadedAirTrafficController getInstance() {
		return INSTANCE;
	}
}
