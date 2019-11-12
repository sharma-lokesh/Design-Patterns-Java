package abstractfactory;

public class JapaneseWeapon implements Weapon {
	private WeaponType weaponType;

	public JapaneseWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "Japanese " + weaponType;
	}

	@Override
	public WeaponType getWeaponType() {
		return weaponType;
	}

}
