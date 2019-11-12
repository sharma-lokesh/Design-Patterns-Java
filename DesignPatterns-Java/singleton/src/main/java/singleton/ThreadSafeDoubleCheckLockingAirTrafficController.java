package singleton;

public class ThreadSafeDoubleCheckLockingAirTrafficController {
	private static final Object dummyObjectToLock = new Object();
	private static volatile ThreadSafeDoubleCheckLockingAirTrafficController instance;

	private ThreadSafeDoubleCheckLockingAirTrafficController() {
	}

	public static ThreadSafeDoubleCheckLockingAirTrafficController getInstance() {
		// local variable increases performance by 25 percent
		ThreadSafeDoubleCheckLockingAirTrafficController result = instance;
		if (result == null) {
			// It is not initialized but we cannot be sure because some other
			// thread might have initialized it
			// in the meanwhile. So to make sure we need to lock on an object to
			// get mutual exclusion.
			synchronized (dummyObjectToLock) {
				// Again assign the instance to local variable to check if it
				// was initialized by some other thread
				// while current thread was blocked to enter the locked zone. If
				// it was initialized then we can
				// return the previously created instance just like the previous
				// null check.
				result = instance;
				if (result == null) {
					// The instance is still not initialized so we can safely
					// (no other thread can enter this zone)
					// create an instance and make it our singleton instance.
					instance = result = new ThreadSafeDoubleCheckLockingAirTrafficController();
				}
			}
		}
		return result;
	}
}
