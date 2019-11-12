package singleton;

public class ThreadSafeLazyLoadedAirTrafficControllerTest
		extends SingletonTest<ThreadSafeLazyLoadedAirTrafficController> {

	public ThreadSafeLazyLoadedAirTrafficControllerTest() {
		super(ThreadSafeLazyLoadedAirTrafficController::getInstance);
	}

}