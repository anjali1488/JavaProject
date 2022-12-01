package TestPackage;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListNumbersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ArrayList<Integer> myMonths = new ArrayList<Integer>();
	
	myMonths.add(12);
	myMonths.add(1);
	myMonths.add(4);
	myMonths.add(7);
	myMonths.add(3);
	myMonths.add(11);
	myMonths.add(9);
	myMonths.add(5);
	myMonths.add(2);
	
	System.out.println(myMonths);
	
	Collections.sort(myMonths);
	System.out.println(myMonths);
	// with this array list object will not get deleted but the elements will get deleted	
	myMonths.clear();
	System.out.println(myMonths);
	
	//now we can add to the same list again
	myMonths.add(12);
	myMonths.add(1);
	myMonths.add(4);
	myMonths.add(7);
	myMonths.add(3);
	myMonths.add(11);
	myMonths.add(9);
	myMonths.add(5);
	myMonths.add(2);
	
	
	System.out.println(myMonths);
	}

}
