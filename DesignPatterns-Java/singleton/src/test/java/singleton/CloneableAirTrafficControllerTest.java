package singleton;

public class CloneableAirTrafficControllerTest extends SingletonTest<CloneableAirTrafficController> {

	public CloneableAirTrafficControllerTest() {
		super(CloneableAirTrafficController::getInstance);
	}
}
