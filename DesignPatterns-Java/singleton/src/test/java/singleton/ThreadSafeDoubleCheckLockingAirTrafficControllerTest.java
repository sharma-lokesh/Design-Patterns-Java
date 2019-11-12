package singleton;

public class ThreadSafeDoubleCheckLockingAirTrafficControllerTest
		extends SingletonTest<ThreadSafeDoubleCheckLockingAirTrafficController> {

	public ThreadSafeDoubleCheckLockingAirTrafficControllerTest() {
		super(ThreadSafeDoubleCheckLockingAirTrafficController::getInstance);
	}

}