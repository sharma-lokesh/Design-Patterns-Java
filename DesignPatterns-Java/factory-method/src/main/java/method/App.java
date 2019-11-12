package method;

public class App {
	private WeaponFactory manufacturer;

	public static void main(String[] args) {
		App app = new App(new JapaneseWeaponFactory());
		app.manufactureWeapons();

		app = new App(new FrenchWeaponFactory());
		app.manufactureWeapons();
	}

	public App(WeaponFactory manufacturer) {
		this.manufacturer = manufacturer;
	}

	private void manufactureWeapons() {
		Weapon weapon;
		weapon = manufacturer.manufactureWeapon(WeaponType.SPEAR);
		System.out.println(weapon.toString());
		weapon = manufacturer.manufactureWeapon(WeaponType.AXE);
		System.out.println(weapon.toString());
	}
}
