
public class SavingsAccount extends BankAccount {

	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	
	/**
	 * 
	 * @param name
	 * @param balance
	 */
	
	public SavingsAccount (String name, double balance) {
		
		super(name, balance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		
	}
	
	/**
	 * @no arg Constrctor
	 */
	public void postInterest() {
		
		double r1 =(super.getBalance()* (rate/12))/100;
	    super.deposit(r1);
	}
	
	public String getAccountNumber()
	{
		
		return accountNumber;
	}

	public SavingsAccount(SavingsAccount s1, double Balance) {
		
		super(s1, Balance);
		savingsNumber = s1.savingsNumber++;

		accountNumber = super.getAccountNumber() + "-" + s1.savingsNumber;
		
	}
	
}
 