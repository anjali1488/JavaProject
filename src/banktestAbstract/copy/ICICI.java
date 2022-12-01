package banktestAbstract.copy;

public class ICICI extends ParentBank
{

	
	private double SI;
	
	
	public double calculateInterestRate()
	{
		SI = (getBalance()) *(1 + (getInterestRate() * getTime()));
		return SI;
	}
	
	

}
