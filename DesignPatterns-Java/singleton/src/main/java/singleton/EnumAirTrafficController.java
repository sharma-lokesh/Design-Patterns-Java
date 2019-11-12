package singleton;

public enum EnumAirTrafficController {
	/**
	 * Enum method is recommended as the best method of making singletons in
	 * Java.
	 * 
	 * One thing to remember here is, when serializing an enum, field variables
	 * are not getting serialized. For example, if we serialize and deserialize
	 * the SingletonEnum class, we will lose the value of the int value field.
	 * 
	 * Eagerly initialized Singleton is enum based Singleton. At first glance
	 * the code looks short and simple. However, you should be aware of the
	 * downsides including committing to implementation strategy, extending the
	 * enum class, serializability and restrictions to coding.
	 */
	INSTANCE;

	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.getDeclaringClass().getCanonicalName() + "@" + this.hashCode();
	}
}
