import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		
		int rem;
		int reverse=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		while(num!=0)
		{

		rem = num%10;	
		
		reverse = reverse*10+rem;	
		num = num/10;	
	    }
		
		System.out.println("Reverse of "+ num + "is :"+reverse);
		
		
	}
	

}
