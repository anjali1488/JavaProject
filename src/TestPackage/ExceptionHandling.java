package TestPackage;


public class ExceptionHandling {
	
	public static void main(String args[]) 
	{
		
		int num1, num2;
		
		try
		{
		num1 = 10;
		num2 = num1/0; 
		
		System.out.println(num1);
		System.out.println(num2);
	
		}
		//if we know the exception
		/*
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero will throw an exception");
		}
		*/
		//if we dont know the type of exception
		catch(Exception e)
		{
			System.out.println("An exception found");
		}
	}
}
