package abstractfactory;

public enum WeaponType {
	SWORD("Sword"), AXE("Axe"), BOW("Bow"), SPEAR("Spear");

	private String title;

	WeaponType(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
