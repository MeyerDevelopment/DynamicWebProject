import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Banking;

public class BankingTest1 {

	@Before
	public void setUp() throws Exception {
	}

	//test monthly interest earned with assertEquals
	@Test
	public void testMonthlyInterestEarned() {
		double interestEarned = Banking.monthlyInterestEarned(12,100.00);
		assertEquals(1.00,interestEarned, 0.00);
	}
	//test end of month amount with assertFalse
	@Test
	public void testEndOfMonthAmount() {
		double endOfMonthAmount = Banking.endOfMonthAmount(12,100.00);
		assertFalse(101.00 !=endOfMonthAmount);
	}
}
