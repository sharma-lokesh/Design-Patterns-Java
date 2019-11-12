package singleton;

import org.apache.log4j.Logger;

/**
 * Singleton pattern ensures that the class can have only one existing instance
 * per Java classloader instance and provides global access to it.
 * <p>
 * One of the risks of this pattern is that bugs resulting from setting a
 * singleton up in a distributed environment can be tricky to debug, since it
 * will work fine if you debug with a single classloader. Additionally, these
 * problems can crop up a while after the implementation of a singleton, since
 * they may start out synchronous and only become async with time, so you it may
 * not be clear why you are seeing certain changes in behaviour.
 *
 */
public class App {
	private static final Logger LOGGER = Logger.getLogger(App.class);

	public static void main(String[] args) {
		// Enum based Singleton
		EnumAirTrafficController enumAirTrafficController1 = EnumAirTrafficController.INSTANCE;
		enumAirTrafficController1.setValue(2812);
		EnumAirTrafficController enumAirTrafficController2 = EnumAirTrafficController.INSTANCE;
		LOGGER.debug("enumAirTrafficController1  " + enumAirTrafficController1);
		LOGGER.debug("enumAirTrafficController2  " + enumAirTrafficController2);
		LOGGER.debug("enumAirTrafficController2.getValue()" + enumAirTrafficController2.getValue());

		// Cloneable based singleton
		CloneableAirTrafficController cloneableAirTrafficController1 = CloneableAirTrafficController.getInstance();
		CloneableAirTrafficController cloneableAirTrafficController2 = (CloneableAirTrafficController) cloneableAirTrafficController1
				.clone();
		LOGGER.debug("cloneableAirTrafficController1  " + cloneableAirTrafficController1);
		LOGGER.debug("cloneableAirTrafficController2  " + cloneableAirTrafficController2);

		// eagerly initialized singleton
		EagerLoadedAirTrafficController eagerLoadedAirTrafficController1 = EagerLoadedAirTrafficController
				.getInstance();
		EagerLoadedAirTrafficController eagerLoadedAirTrafficController2 = EagerLoadedAirTrafficController
				.getInstance();
		LOGGER.debug("eagerLoadedAirTrafficController1={}" + eagerLoadedAirTrafficController1);
		LOGGER.debug("eagerLoadedAirTrafficController2={}" + eagerLoadedAirTrafficController2);

		// lazily initialized singleton
		LazyLoadedAirTrafficController lazyLoadedAirTrafficController1 = LazyLoadedAirTrafficController.getInstance();
		LazyLoadedAirTrafficController lazyLoadedAirTrafficController2 = LazyLoadedAirTrafficController.getInstance();
		LOGGER.debug("lazyLoadedAirTrafficController1" + lazyLoadedAirTrafficController1);
		LOGGER.debug("lazyLoadedAirTrafficController2}" + lazyLoadedAirTrafficController2);

		// serializable singleton can't be tested as no persistance.

		// double checked locking
		ThreadSafeDoubleCheckLockingAirTrafficController doubleCheckList1 = ThreadSafeDoubleCheckLockingAirTrafficController
				.getInstance();
		LOGGER.debug("doubleCheckList1" + doubleCheckList1);
		ThreadSafeDoubleCheckLockingAirTrafficController doubleCheckList2 = ThreadSafeDoubleCheckLockingAirTrafficController
				.getInstance();
		LOGGER.debug("doubleCheckList2" + doubleCheckList2);

		// initialize on demand holder with thread safety.
		ThreadSafeLazyLoadedAirTrafficController demandHolder1 = ThreadSafeLazyLoadedAirTrafficController.getInstance();
		LOGGER.debug("demandHolder1" + demandHolder1);
		ThreadSafeLazyLoadedAirTrafficController demandHolder2 = ThreadSafeLazyLoadedAirTrafficController.getInstance();
		LOGGER.debug("demandHolder2" + demandHolder2);

	}
}
