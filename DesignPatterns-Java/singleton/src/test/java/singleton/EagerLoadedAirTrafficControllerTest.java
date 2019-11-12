package singleton;

public class EagerLoadedAirTrafficControllerTest extends SingletonTest<EagerLoadedAirTrafficController> {

	public EagerLoadedAirTrafficControllerTest() {
		super(EagerLoadedAirTrafficController::getInstance);
	}

}