import java.util.Scanner;

public class Stringvalidate 
{

	public static void main(String[] args)
	{
		//Checking String start with "A" and ends with "t".........
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();
		
		if(str.startsWith("A") && str.endsWith("t")) 
		    {
			System.out.println("Given String is valid");
		    }
		else
		    {
			System.out.println("Given String is invalid");
		    }
		

	}

}
