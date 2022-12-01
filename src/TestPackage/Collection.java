package TestPackage;
import java.util.ArrayList;
import java.util.Collections;
public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> myCars = new ArrayList<String>();
		myCars.add("Maruti");
		myCars.add("Maruti");
		myCars.add("Ford");
		
		System.out.println(myCars);
		System.out.println(myCars.get(1));
		myCars.set(1, "Hyundai");
		System.out.println(myCars);
		myCars.remove(1);
		System.out.println(myCars);
		System.out.println(myCars.size());
		myCars.add("Toyota");
		myCars.add("Volvo");
		System.out.println(myCars);
		
		//iterating
/*		for(int i=0; i<myCars.size(); i++)
		{
			System.out.println("Element " + i + " Array List : " + myCars.get(i));
		}
*/
		//iterating same as above using for each loop
		Collections.sort(myCars);
		
		for(String i : myCars)
		{
			System.out.println(i);
		}
	}

}
