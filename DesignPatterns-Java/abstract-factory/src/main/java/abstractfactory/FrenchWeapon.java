package abstractfactory;

public class FrenchWeapon implements Weapon {
	private WeaponType weaponType;

	public FrenchWeapon(WeaponType weaponType) {
		this.weaponType = weaponType;
	}

	@Override
	public String toString() {
		return "French " + weaponType;
	}

	@Override
	public WeaponType getWeaponType() {
		return weaponType;
	}

}
