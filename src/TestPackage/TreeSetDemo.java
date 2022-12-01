package TestPackage;
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet <String> Names = new TreeSet<String> ();
		Names.add("Vasu");
		Names.add("Santosh");
		Names.add("Aparna");
		Names.add("Jay");
		
		System.out.println(Names);
		//if u want Jay's name also included then we can mention true and if we dont want we can leave blank
		System.out.println(Names.headSet("Jay", true));
		System.out.println(Names.headSet("Jay"));
		
		System.out.println(Names.tailSet("Santosh"));
		System.out.println(Names.tailSet("Santosh", false));
		
		System.out.println(Names.subSet("Jay", "Vasu"));
		System.out.println(Names.subSet("Jay", false, "Vasu", true));
		
		System.out.println(Names.descendingSet());
		
	}

}
