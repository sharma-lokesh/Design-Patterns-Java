package method;

public class JapaneseWeaponFactory implements WeaponFactory {

	@Override
	public Weapon manufactureWeapon(WeaponType weaponType) {
		return new JapaneseWeapon(weaponType);
	}

}
