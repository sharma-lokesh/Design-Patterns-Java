package abstractfactory;

public class App {
	public static void main(String[] args) {
		AbstractFactory factory = Demand.initiateManufactoring(ManufactoringUnit.FRANCE, WeaponType.SPEAR,
				AircraftType.FIGHTER);
		AbstractFactory factory1 = Demand.initiateManufactoring(ManufactoringUnit.FRANCE, WeaponType.AXE,
				AircraftType.CARRIER);
		AbstractFactory factory2 = Demand.initiateManufactoring(ManufactoringUnit.FRANCE, WeaponType.SWORD,
				AircraftType.COMMERCIAL);
		AbstractFactory factory3 = Demand.initiateManufactoring(ManufactoringUnit.JAPAN, WeaponType.SPEAR,
				AircraftType.FIGHTER);
		AbstractFactory factory4 = Demand.initiateManufactoring(ManufactoringUnit.JAPAN, WeaponType.AXE,
				AircraftType.CARRIER);
		AbstractFactory factory5 = Demand.initiateManufactoring(ManufactoringUnit.JAPAN, WeaponType.SWORD,
				AircraftType.COMMERCIAL);

		System.out.println("Manufacturing done from France with factory1");
		System.out.println("Aircraft : " + factory.getAircraft());
		System.out.println("Weapon : " + factory.getWeapon());

		System.out.println("Manufacturing done from France with factory2");
		System.out.println("Aircraft : " + factory1.getAircraft());
		System.out.println("Weapon : " + factory1.getWeapon());

		System.out.println("Manufacturing done from France with factory3");
		System.out.println("Aircraft : " + factory2.getAircraft());
		System.out.println("Weapon : " + factory2.getWeapon());

		System.out.println("Manufacturing done from Japan with factory4");
		System.out.println("Aircraft : " + factory3.getAircraft());
		System.out.println("Weapon : " + factory3.getWeapon());

		System.out.println("Manufacturing done from Japan with factory5");
		System.out.println("Aircraft : " + factory4.getAircraft());
		System.out.println("Weapon : " + factory4.getWeapon());

		System.out.println("Manufacturing done from Japan with factory6");
		System.out.println("Aircraft : " + factory5.getAircraft());
		System.out.println("Weapon : " + factory5.getWeapon());

	}
}
