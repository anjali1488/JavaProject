package TestPackage;
import java.util.HashSet;


public class HashSetDemo {

	public static void main(String args[]) {
		//Set can be used when u want to access the elements randomly and not by index
		// u can use to check if specific object exists in the set
		HashSet <String> myNames = new HashSet<String>();
		myNames.add("Anjali");
		myNames.add("Santosh");
		myNames.add("Aparna");
		myNames.add("Rani");
		myNames.add("Anjali");  //it will not add duplicate value to the set and will get created in sorted order
		
		System.out.println(myNames);
		
		myNames.add("Jay");
		System.out.println(myNames);
		
		myNames.add("Don");
		System.out.println(myNames);
		
		myNames.add("Vasu");
		System.out.println(myNames);
		
		//myNames.get()   ---Indexing does not work with set
		
		myNames.remove("Vasu");
		System.out.println(myNames);
		System.out.println(myNames.size());
		
		//Use of contains
		System.out.println(myNames.contains("Vasu"));
		
		// to iterate we can only use For each and not normal For loop
		
		String [] Test = new String[2];
		
		
		int num = 0;
		for(String i: myNames)
		{
			if(i.contains("Jay") || (i.contains("Santosh")))
			{
				
				Test[num] = i;
				System.out.println(Test[num]);
				num ++;
			}
			//System.out.println(i);
		}
		
		for(int k=0; k<Test.length; k++)
		{
			System.out.println(Test[k]);
		}
		
		}
}
