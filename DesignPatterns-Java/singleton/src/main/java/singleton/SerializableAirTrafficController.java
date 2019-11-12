package singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SerializableAirTrafficController implements Serializable {

	private static final long serialVersionUID = -3431240458478484706L;
	private final static SerializableAirTrafficController INSTANCE = new SerializableAirTrafficController();

	private SerializableAirTrafficController() {
	}

	public static SerializableAirTrafficController getInstance() {
		return INSTANCE;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	private Object readResolve() throws ObjectStreamException {
		return INSTANCE;
	}
}
