package nullObject;

public class Coder extends Employee {

	public Coder(String name) {
		this.name = name;
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public String getName() {
		return name;
	}

}
