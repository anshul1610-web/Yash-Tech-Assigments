import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

//////////////Method Creating To word Count In file////////////////////////////
public class IOCountNumberIAndWordsInfile
{
	public static void totalWord(String str) throws IOException 
	{
		
		int wordCount=0;
		FileReader fr = new FileReader(str);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		while(line!=null) 
		{	
			String [] arr = line.split(" ");
			for(String Array : arr) 
			{
				 wordCount++;
			}
			line = br.readLine();
		}
		   br.close();
           System.out.println("Total Number Of Word Present In Given File is:"+wordCount);
	}
//////////////Method Creating To Number Count In file////////////////////////////	
	public static void totalNumber(String str) throws IOException 
	{
		int numCount=0;
		boolean b;
		FileReader fr = new FileReader(str);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		while(line!=null) 
		{
		char[] array = new char[line.length()];
	 	for(int i=0;i<line.length();i++)
	 	 {
	 		array[i] = line.charAt(i);
	 		b = Character.isDigit(array[i]);
	 		if(b==true) 
	 		{
	 			numCount++;
	 		}
	 	 }
	 	    line = br.readLine();
		}
		br.close();
           System.out.println("Total Number Of Word Present In Given File is:"+numCount);
	}
	
	public static void main(String[] args) throws IOException 
	{
	
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the path Of File..........");
		String str = sc.nextLine();
		totalWord(str) ;
		totalNumber(str);
		
		
	}

}