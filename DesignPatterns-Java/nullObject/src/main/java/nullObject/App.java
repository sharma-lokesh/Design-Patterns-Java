package nullObject;

public class App {
	public static void main(String[] args) {
		Employee emp1 = EmployeeData.getClient("Ian");
		Employee emp2 = EmployeeData.getClient("Fanhua");
		Employee emp3 = EmployeeData.getClient("Erling");
		Employee emp4 = EmployeeData.getClient("Bjorn");

		System.out.println(emp1.getName());
		System.out.println(emp2.getName());
		System.out.println(emp3.getName());
		System.out.println(emp4.getName());
	}
}
