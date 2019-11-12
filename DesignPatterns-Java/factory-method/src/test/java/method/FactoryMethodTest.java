package method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class FactoryMethodTest {

	private void verifyWeaponForInstanceOf(Weapon weapon, WeaponType expectedWeaponType, Class<?> clazz) {
		assertEquals(expectedWeaponType, weapon.getWeaponType(), "Weapon must be of weaponType: " + expectedWeaponType);
		assertTrue(clazz.isInstance(weapon), "Weapon must be an instance of: " + clazz.getName());

	}

	private void verifyIfWeaponIsManufacturedByJapaneseCompany(WeaponType weaponType, Weapon weapon) {
		this.verifyWeaponForInstanceOf(weapon, weaponType, JapaneseWeapon.class);
	}

	private void verifyIfWeaponIsManufacturedByFrenchCompany(WeaponType weaponType, Weapon weapon) {
		this.verifyWeaponForInstanceOf(weapon, weaponType, FrenchWeapon.class);
	}

	@Test
	public void testFrenchCompanyWithAxe() {
		WeaponFactory factory = new FrenchWeaponFactory();
		this.verifyIfWeaponIsManufacturedByFrenchCompany(WeaponType.AXE, factory.manufactureWeapon(WeaponType.AXE));
	}

	@Test
	public void testFrenchCompanyWithSpear() {
		WeaponFactory factory = new FrenchWeaponFactory();
		this.verifyIfWeaponIsManufacturedByFrenchCompany(WeaponType.SPEAR, factory.manufactureWeapon(WeaponType.SPEAR));
	}

	@Test
	public void testJapaneseCompanyWithAxe() {
		WeaponFactory factory = new JapaneseWeaponFactory();
		this.verifyIfWeaponIsManufacturedByJapaneseCompany(WeaponType.AXE, factory.manufactureWeapon(WeaponType.AXE));
	}

	@Test
	public void testJapaneseCompanyWithSpear() {
		WeaponFactory factory = new JapaneseWeaponFactory();
		this.verifyIfWeaponIsManufacturedByJapaneseCompany(WeaponType.SPEAR,
				factory.manufactureWeapon(WeaponType.SPEAR));
	}
}
