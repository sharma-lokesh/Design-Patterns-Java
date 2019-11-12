package nullObject;

public class EmployeeData {

	public static final String[] names = { "Ian", "Erling", "Fanhua" };

	public static Employee getClient(String name) {
		for (int i = 0; i < names.length; i++) {
			if (names[i].equalsIgnoreCase(name)) {
				return new Coder(name);
			}
		}
		return new NoEmployee();
	}
}
