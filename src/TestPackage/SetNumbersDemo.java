package TestPackage;

import java.util.Iterator;
import java.util.TreeSet;

public class SetNumbersDemo {

	
	public static void main(String[] args)
	{
		TreeSet<Integer> num = new TreeSet<Integer> ();
		
		num.add(11);
		num.add(28);
		num.add(54);
		num.add(34);
		num.add(21);
		num.add(10);
		
		System.out.println(num);
		
		//System.out.println(num.pollFirst());
		//System.out.println(num.pollLast());
		
	
		Iterator<Integer> itr = num.iterator();
		while(itr.hasNext())
		{
			//System.out.println(itr.next());
			Integer i = itr.next();
			if(i>30)
			{
				itr.remove();
			}
		}
		
		
		/*
		for(Integer i : num) //6
		{
			if(i>30)
			{
			//System.out.println(i);
			num.remove(i);
			}  //5
		}
		*/
		
		System.out.println(num);
		
	}
}
