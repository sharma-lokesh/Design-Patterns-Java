package abstractfactory;

public enum AircraftType {
	FIGHTER("Fighter"), CHOPPER("Chopper"), CARRIER("Carrier"), COMMERCIAL("Commercial");

	private String title;

	AircraftType(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
