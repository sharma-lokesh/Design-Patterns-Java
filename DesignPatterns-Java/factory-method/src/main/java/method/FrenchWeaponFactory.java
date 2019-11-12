package method;

public class FrenchWeaponFactory implements WeaponFactory {

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new FrenchWeapon(weaponType);
	}

}
