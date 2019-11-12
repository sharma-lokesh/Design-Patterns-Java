package unitOfWork;

//Database Table
public class Employee extends AbstractDomainObject {

	private String name;
	private String address;

	public Employee(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
