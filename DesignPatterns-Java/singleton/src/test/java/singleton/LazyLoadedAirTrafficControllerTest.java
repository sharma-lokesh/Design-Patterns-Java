package singleton;

public class LazyLoadedAirTrafficControllerTest extends SingletonTest<LazyLoadedAirTrafficController> {

	public LazyLoadedAirTrafficControllerTest() {
		super(LazyLoadedAirTrafficController::getInstance);
	}

}