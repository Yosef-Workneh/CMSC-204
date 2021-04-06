
public class CheckingAccount extends BankAccount {

	final double FEE = 15;
	String AccountNumber;
    public CheckingAccount (String name, double amount){
	
	super(name, amount);
	AccountNumber = super.getAccountNumber() + "-10";
	
	}
    
    /**
     * @param amount
     */
    public boolean withdraw(double amount)
     
    {
	
	boolean completed = false;
    double a1 = FEE + amount;
    
     if (super.withdraw(a1)) {
	   
	   completed = true;
	   
    }
    
	 return completed;
     
     }
  
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public double getFEE() {
		return FEE;
	}

}
