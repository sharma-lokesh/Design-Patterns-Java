package abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AbstractFactoryTest {

	AbstractFactory factory;
	AbstractFactory factory1;
	AbstractFactory factory2;
	AbstractFactory factory3;
	AbstractFactory factory4;
	AbstractFactory factory5;

	@Before
	public void init() {
		factory = Demand.initiateManufactoring(ManufactoringUnit.FRANCE, WeaponType.SPEAR, AircraftType.FIGHTER);
		factory1 = Demand.initiateManufactoring(ManufactoringUnit.FRANCE, WeaponType.AXE, AircraftType.CARRIER);
		factory2 = Demand.initiateManufactoring(ManufactoringUnit.FRANCE, WeaponType.SWORD, AircraftType.COMMERCIAL);
		factory3 = Demand.initiateManufactoring(ManufactoringUnit.JAPAN, WeaponType.SPEAR, AircraftType.FIGHTER);
		factory4 = Demand.initiateManufactoring(ManufactoringUnit.JAPAN, WeaponType.AXE, AircraftType.CARRIER);
		factory5 = Demand.initiateManufactoring(ManufactoringUnit.JAPAN, WeaponType.SWORD, AircraftType.COMMERCIAL);
	}

	@Test
	public void checkForAircraft() {

		assertEquals(factory.getAircraft().getAircraftType(), AircraftType.FIGHTER);
		assertEquals(factory3.getAircraft().getAircraftType(), AircraftType.FIGHTER);

		assertEquals(factory1.getAircraft().getAircraftType(), AircraftType.CARRIER);
		assertEquals(factory4.getAircraft().getAircraftType(), AircraftType.CARRIER);

		assertEquals(factory2.getAircraft().getAircraftType(), AircraftType.COMMERCIAL);
		assertEquals(factory5.getAircraft().getAircraftType(), AircraftType.COMMERCIAL);
	}

	@Test
	public void checkForManufactoringUnit() {
		assertEquals(factory.manufactoredBy(), ManufactoringUnit.FRANCE);
		assertTrue(factory instanceof FrenchFactory);

		assertEquals(factory1.manufactoredBy(), ManufactoringUnit.FRANCE);
		assertTrue(factory1 instanceof FrenchFactory);

		assertEquals(factory2.manufactoredBy(), ManufactoringUnit.FRANCE);
		assertTrue(factory2 instanceof FrenchFactory);

		assertEquals(factory3.manufactoredBy(), ManufactoringUnit.JAPAN);
		assertTrue(factory3 instanceof JapaneseFactory);

		assertEquals(factory4.manufactoredBy(), ManufactoringUnit.JAPAN);
		assertTrue(factory4 instanceof JapaneseFactory);

		assertEquals(factory5.manufactoredBy(), ManufactoringUnit.JAPAN);
		assertTrue(factory5 instanceof JapaneseFactory);

	}

	@Test
	public void checkForWeapon() {
		assertEquals(factory.getWeapon().getWeaponType(), WeaponType.SPEAR);
		assertEquals(factory3.getWeapon().getWeaponType(), WeaponType.SPEAR);

		assertEquals(factory1.getWeapon().getWeaponType(), WeaponType.AXE);
		assertEquals(factory4.getWeapon().getWeaponType(), WeaponType.AXE);

		assertEquals(factory2.getWeapon().getWeaponType(), WeaponType.SWORD);
		assertEquals(factory5.getWeapon().getWeaponType(), WeaponType.SWORD);
	}
}
