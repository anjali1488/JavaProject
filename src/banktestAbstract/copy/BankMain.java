package banktestAbstract.copy;

import java.util.Scanner;

public class BankMain{
	
	public static void main(String[] args)
	{
	
	ICICI obj1 = new ICICI();
	Scanner s1 = new Scanner(System.in);
	obj1.setBalance(1000);
	
	obj1.setInterestRate(5.5);
	System.out.println("Enter the time you want to calculate the interest for");
	
	obj1.setTime(s1.nextDouble());
	//obj1.setTime(2);
	System.out.println("SI on balance:" + obj1.calculateInterestRate());
	//System.out.println("Updated balance with interest" + (obj1.getBal) + (obj1.calculateInterestRate()));
	
	s1.close();
	
	}

}
