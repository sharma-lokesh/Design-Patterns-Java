package nullObject;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NoEmployeeTest {
	@Test
	public void testNoEmployee() {
		Employee emp = EmployeeData.getClient("Bjorn");
		Assertions.assertTrue(emp.isNull());
		Assertions.assertEquals("Not Available", emp.getName());
	}
}
