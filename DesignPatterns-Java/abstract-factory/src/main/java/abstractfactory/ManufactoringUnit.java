package abstractfactory;

public enum ManufactoringUnit {
	FRANCE("French"), JAPAN("Japanese");

	private String displayName;

	ManufactoringUnit(String title) {
		this.displayName = title;
	}

	@Override
	public String toString() {
		return displayName;
	}
}
