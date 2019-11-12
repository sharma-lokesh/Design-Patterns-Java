package abstractfactory;

public class JapaneseFactory extends AbstractFactory {

	private Weapon weapon;
	private Aircraft aircraft;

	public JapaneseFactory(WeaponType weaponToManufacture, AircraftType aircraftToManufacture) {
		this.manufactureWeapon(weaponToManufacture);
		this.manufactureAircraft(aircraftToManufacture);
	}

	private void manufactureWeapon(WeaponType weaponToManufacture) {
		weapon = new JapaneseWeapon(weaponToManufacture);

	}

	private void manufactureAircraft(AircraftType aircraftToManufacture) {
		aircraft = new JapaneseAircraft(aircraftToManufacture);
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
		return ManufactoringUnit.JAPAN;
	}
}
