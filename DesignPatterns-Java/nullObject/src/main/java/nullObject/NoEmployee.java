package nullObject;

public class NoEmployee extends Employee {

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available";
	}

}
