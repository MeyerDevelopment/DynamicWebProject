import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Banking;

public class BankingTest2 {

	@Before
	public void setUp() throws Exception {
	}

	//test yearlyInterestEarned with assertTrue
	@Test
	public void testYearlyInterestEarned() {
		double interestEarned = Banking.yearlyInterestEarned(12,100.00);
		assertTrue(interestEarned==12.0);
	}
}
