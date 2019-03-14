package inheritance_assignment;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MarketingExecutiveTest {
private MarketingExecutive executive;

	@BeforeEach
 public void SetUp() {
	executive=new MarketingExecutive(101,"john",20000,5000,20);
}

	@Test
public void testExecutiveObjectCreated() {
		MarketingExecutive executive=new MarketingExecutive();
	assertNotNull(executive);
}
	@Test
	public void testExecutiveObjectCreatedWithParameter() {
			MarketingExecutive executive=new MarketingExecutive(101,"john",20000,5000,20);
		assertNotNull(executive);
}
	@Test
	public void testmarketingExecutiveGrosssalary() {
		assertEquals(35100,executive.getExecutiveGrossSalary(),0.01);
	}
}