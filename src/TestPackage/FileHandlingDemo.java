package TestPackage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo {
	
	public static void main(String args[]) throws IOException
	{
		File myFile = new File("Testfile.txt");
		File myFile1 = new File("C:\\Users\\Anjali.Dhawan\\OneDrive - EY\\Desktop\\Anjali_Eclipse\\TestFile.txt");
		if (myFile1.createNewFile())
		{
			System.out.println("File created" + myFile.getName());
			
		}
		
		else
		{
			System.out.println("File already exists");
		}
		//write to a file
		/*
		FileWriter fWrite = new FileWriter("TestFile.txt");
		//fWrite.write("Writing first line to my file");
		fWrite.append("Appending in file");
		fWrite.close();
		*/
		/*
		// to append in existing file
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter("TestFile.txt",true)); 
		buffWrite.write("Is it working?");
		buffWrite.close();
		*/
		//read a file
		 
		Scanner scn = new Scanner(myFile);
		
		while(scn.hasNextLine())
		{
			String str = scn.nextLine();
			System.out.println(str);
			
		}
		
		scn.close();
	}

}
