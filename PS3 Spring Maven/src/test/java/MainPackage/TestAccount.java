package MainPackage;

import org.junit.Test;

public class TestAccount {
	
	

	@Test
	public void testAccount() throws InsufficientFundsException {
		Account ac = new Account(1122, 20000);
		ac.setAnnualInterestRate(.045);
		ac.withdraw(2500);
		ac.deposit(3000);
		System.out.println("Balance is " + ac.getBalance());
		System.out.println("Monthly Interest is " + ac.getMonthlyInterestRate());
		System.out.println("Date created is " + ac.getDateCreated());
		try {
			ac.withdraw(50000);
		}
		catch (InsufficientFundsException ife) {
			System.out.println("Your account is $" + ife.getAmount() + " short.");
		}
	}
}
