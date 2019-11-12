package abstractfactory;

public class FrenchAircraft implements Aircraft {
	private AircraftType aircraftType;

	public FrenchAircraft(AircraftType type) {
		this.aircraftType = type;
	}

	@Override
	public AircraftType getAircraftType() {
		return aircraftType;
	}

	@Override
	public String toString() {
		return "French Aircraft of type : " + aircraftType;
	}
}
