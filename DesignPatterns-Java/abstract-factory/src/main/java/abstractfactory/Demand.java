package abstractfactory;

public class Demand {

	public static AbstractFactory initiateManufactoring(ManufactoringUnit unit, WeaponType weaponToManufacture,
			AircraftType aircraftToManufacture) {
		AbstractFactory factory = null;
		switch (unit) {
		case FRANCE:
			factory = new FrenchFactory(weaponToManufacture, aircraftToManufacture);
			break;
		case JAPAN:
			factory = new JapaneseFactory(weaponToManufacture, aircraftToManufacture);
			break;
		default:
			break;
		}

		return factory;
	}
}
