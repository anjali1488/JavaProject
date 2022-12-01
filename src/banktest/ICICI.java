package banktest;

public class ICICI extends ParentBankAbstract
{

	
	private double SI;
	
	
	public double calculateInterestRate()
	{
		SI = (getBalance()) *(1 + (getInterestRate() * getTime()));
		return SI;
	}
	
	public double updateBalance()
	{
		Balance = getBalance() + SI ; 
		return Balance;
	}

}
