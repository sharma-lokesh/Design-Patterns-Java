package singleton;

public class EnumAirTrafficControllerTest extends SingletonTest<EnumAirTrafficController> {

	public EnumAirTrafficControllerTest() {
		super(() -> EnumAirTrafficController.INSTANCE);
	}

}