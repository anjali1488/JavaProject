package TestPackage;

public class Typecast {

	public static void main(String[] args)
	{
		//int, float, double, char and string- commonly used data types
		//byte, short, int , long, float , double
		
		int a= 10;
		double b = a; //implicit casting - assigning lower size value to bigger size variable 
		
		System.out.println("value of a :" + a);
		System.out.println("value of b :" + b);
		
		double c = 10.58;
		//int d = c; //will throw an error
		int d = (int) c;   //Manual or explicit type casting --- assigning bigger size value to lower size variable, we need to manually type cast
				
		
		System.out.println("value of c :" + c);
		System.out.println("value of d :" + d);
		
		
				
		
	}
}
