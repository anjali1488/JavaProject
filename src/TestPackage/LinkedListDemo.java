package TestPackage;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;

public class LinkedListDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Eg of Array
		
		String[] List = new String[5];
		List[0]= "Maruti";
		List[3]= "Toyota";
		System.out.println("*******Eg of Array: ********" );
		for (String i : List)
		{
			System.out.println( i);
		}
		
		
		// eg of Array List
		System.out.println("*******Eg of ArrayList: ********" );
		ArrayList<String> myCars = new ArrayList<String>();
		
		myCars.add("Maruti"); //0
		myCars.add("Maruti"); //1
		myCars.add("Ford");   //2
		System.out.println(myCars);
		myCars.remove(1);	
		System.out.println(myCars);
		System.out.println(myCars.get(1));  //gets based on index
		
		
		
		// eg of Linked List
		LinkedList<String> myCountries = new LinkedList<String>();
		System.out.println("*******Eg of Linked List: ********" );
		myCountries.add("India");  
		myCountries.add("Russia");   //gets based on links. So if we use get(1) then it will not go to 1st index rather it will go to India and see what is stored next to it
		
		myCountries.add("Switzerland");
		myCountries.add("Canada");
		myCountries.add("UnitedKingdom");
		
		System.out.println(myCountries);
		Collections.sort(myCountries);
		System.out.println(myCountries);
		
		myCountries.addFirst("Newzeland");
		myCountries.addLast("Australia");
		
		System.out.println(myCountries);
		
		myCountries.removeFirst();
		myCountries.removeLast();
		System.out.println(myCountries);
		
	}

}
