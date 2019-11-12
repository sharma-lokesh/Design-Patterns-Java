package singleton;

import org.junit.jupiter.api.Disabled;

@Disabled("No Serialization Implementated, so skipping this test")
public class SerializableAirTrafficControllerTest extends SingletonTest<SerializableAirTrafficController> {

	public SerializableAirTrafficControllerTest() {
		super(SerializableAirTrafficController::getInstance);
	}

}