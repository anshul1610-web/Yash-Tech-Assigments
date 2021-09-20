import java.util.*;
public class Convert3rdCharStringToupper
{
	public static void convertString()
	{
		String[] Array = new String[5];
		Scanner sc = new Scanner(System.in);
		int count=1;
		for(int i=0;i<5;i++) 
		{
			System.out.println("Enter the "+count+" Name:");
			Array[i] = sc.next();
			count++;
		}
		System.out.println("************************Converted String***********************");
		for(String Array1:Array) 
		{
			String str = Array1;
	        char ch = str.charAt(2);
	        String Temp = Character.toString(ch).toUpperCase();
	        System.out.println("Name : "+str.substring(0, 2)+Temp+str.substring(3));
	        str = null;
		}
		
	}

	public static void main(String[] args)
	{
		
	        convertString();
	}

}
