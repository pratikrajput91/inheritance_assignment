package inheritance_assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	private Employee employee;
	
	@BeforeEach
	public void SetUp() {
		employee=new Employee(101,"john",20000,5000);
	}

	@Test
	public void testEmployeeObjectCreated() {
		Employee employee=new Employee();
		assertNotNull(employee);
	}
	@Test
	public void testGrossSalary() {
		assertEquals(35000,employee.getGrossSalary(),0.01);
		
	}
	@Test
	public void testnetSalary() {
		assertEquals(32600,employee.getNetSalary(),0.01);
		
	

}
}
