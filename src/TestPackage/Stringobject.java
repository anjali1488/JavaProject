package TestPackage;

public class Stringobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 7;
		String b = Integer.toString(a);
		String c = "test";
		String d= "This is the third session";
		String e = a+d;
		//Using escape character to print Norse in quotes
		String text = "Thor and Loki are \"Norse\" gods";
		// Giving tab space
		String text1 = "Thor and Loki are \tNorse\t gods";
		//Using carriage return or enter key
		String text2 = "Thor and Loki are \rNorse\r gods";
		
		String greeting = "Hello everyone";
		System.out.println(greeting.length());
		System.out.println(greeting.charAt(a));
		System.out.println(greeting.toUpperCase());
		System.out.println(greeting.toLowerCase());
		System.out.println(greeting.equalsIgnoreCase(c));
		System.out.println(greeting.equalsIgnoreCase("aparna"));
		System.out.println("Concatenation of two strings: " + greeting + " " + d);
		System.out.println(greeting.concat(d));
		System.out.println(e);
		System.out.println(text);
		System.out.println(text1);
		System.out.println(text2);
	}

}
