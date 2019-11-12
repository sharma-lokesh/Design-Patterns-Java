package factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FactoryTest {

	private WeaponFactory factory;

	@Before
	public void init() {
		factory = WeaponFactory.factory(builder -> {
			builder.add(WeaponType.SPEAR, Spear::new);
			builder.add(WeaponType.AXE, Axe::new);
			builder.add(WeaponType.SWORD, Sword::new);
			builder.add(WeaponType.BOW, Bow::new);
		});
	}

	@SuppressWarnings("rawtypes")
	private void verifyWeapon(Weapon weapon, Class klass) {
		Assert.assertTrue("Weapon must be an object of: " + klass.getName(), klass.isInstance(weapon));
	}

	@Test
	public void testSpearWeapon() {
		Weapon weapon = factory.create(WeaponType.SPEAR);
		this.verifyWeapon(weapon, Spear.class);
	}

	@Test
	public void testAxeWeapon() {
		Weapon weapon = factory.create(WeaponType.AXE);
		this.verifyWeapon(weapon, Axe.class);
	}

	@Test
	public void testSwordWeapon() {
		Weapon weapon = factory.create(WeaponType.SWORD);
		this.verifyWeapon(weapon, Sword.class);
	}

	@Test
	public void testBowWeapon() {
		Weapon weapon = factory.create(WeaponType.BOW);
		this.verifyWeapon(weapon, Bow.class);
	}
}
