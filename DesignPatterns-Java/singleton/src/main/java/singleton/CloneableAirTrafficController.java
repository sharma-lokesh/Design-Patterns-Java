package singleton;

/**
 * clone method can return the same instance as well as throw
 * CloneNotSupportedException
 *
 */
public class CloneableAirTrafficController implements Cloneable {
	private final static CloneableAirTrafficController INSTANCE = new CloneableAirTrafficController();

	private CloneableAirTrafficController() {
	}

	public static CloneableAirTrafficController getInstance() {
		return INSTANCE;
	}

	@Override
	protected Object clone() {
		return INSTANCE;
	}

	/*
	 * @Override protected Object clone() throws CloneNotSupportedException {
	 * throw new CloneNotSupportedException(); }
	 */
}
