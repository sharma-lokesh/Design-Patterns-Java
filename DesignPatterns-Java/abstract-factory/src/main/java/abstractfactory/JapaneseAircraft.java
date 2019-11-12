package abstractfactory;

public class JapaneseAircraft implements Aircraft {
	private AircraftType aircraftType;

	public JapaneseAircraft(AircraftType type) {
		this.aircraftType = type;
	}

	@Override
	public AircraftType getAircraftType() {
		return aircraftType;
	}

	@Override
	public String toString() {
		return "Japanese Aircraft of type : " + aircraftType;
	}

}
