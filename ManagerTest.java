package inheritance_assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ManagerTest {
	private Manager manager;
	
	@BeforeEach
	public void SetUp() {
		manager=new Manager(101,"john",20000,5000);
}
	@Test
	public void testManagerObjectCreated() {
		Manager manager=new Manager();
		assertNotNull(manager);
}
	@Test
	public void testManagerGrosssalary() {
		assertEquals(39800,manager.getManagerGrossSalary(),0.01);
	}
	@Test
	public void testManagerNetsalary() {
		assertEquals(37200,manager.getManagerNetSalary(),0.01);
		
	}
}
