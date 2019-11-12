package abstractfactory;

public class FrenchFactory extends AbstractFactory {

	private Weapon weapon;
	private Aircraft aircraft;

	public FrenchFactory(WeaponType weaponToManufacture, AircraftType aircraftToManufacture) {
		this.manufactureAircraft(aircraftToManufacture);
		this.manufactureWeapon(weaponToManufacture);
	}

	private void manufactureWeapon(WeaponType weaponToManufacture) {
		weapon = new FrenchWeapon(weaponToManufacture);

	}

	private void manufactureAircraft(AircraftType aircraftToManufacture) {
		aircraft = new FrenchAircraft(aircraftToManufacture);

	}

	@Override
	public Weapon getWeapon() {
		return weapon;
	}

	@Override
	public Aircraft getAircraft() {
		return aircraft;
	}

	@Override
	ManufactoringUnit manufactoredBy() {
		return ManufactoringUnit.FRANCE;
	}

}
