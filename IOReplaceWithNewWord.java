import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class IOReplaceWithNewWord 
{

	public static void replaceWord (String str,String oldWord,String newWord ) throws IOException
	{
		
		String modify = " ";
		String Update = " ";
		FileReader fr = new FileReader(str);
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		while(line!= null)
		{	
			modify = modify + line + System.lineSeparator();
			line = br.readLine();	
		}
		br.close();
		Update = modify.replaceAll("Java","C++");
			
		FileWriter fw = new FileWriter(str);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(Update);
		bw.flush();
		bw.close();
		
	}
	
	public static void main(String[] args) throws IOException
	{
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the path Of File..........");
			String str = sc.nextLine();
			System.out.println("Enter the Word to be Repalced");
			String oldWord = sc.nextLine();	
			System.out.println("Enter the new Word to be placed");
			String newWord = sc.nextLine();	
			replaceWord("D:\\Drivers\\input.txt","Java","C++");

	}

}
