package TestPackage;
import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap <Integer, String> Employees = new TreeMap<Integer, String>();
		Employees.put(1, "Anjali");
		Employees.put(2, "Aparna");
		Employees.put(3, "Rani");
		Employees.put(4, "Ranjni");
		Employees.put(5, "Jay");
		
		//prints key and value of all employees whose ID is less than 3
		System.out.println(Employees.headMap(3));
		
		//prints key and value of all employees whose ID is greater than equal to 3
		System.out.println(Employees.tailMap(3));
		
		//prints key and value of all employees between 2 keys including lower key's value
		System.out.println(Employees.subMap(1,5));
		
		//Get value of specific key
		System.out.println(Employees.get(1));
	}

}
