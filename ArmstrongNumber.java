import java.util.Scanner;

public class ArmstrongNumber 
{

	public static void main(String[] args) 
	{
		int rem =0;
		int sum =0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int temp = num;
		
		while(num!=0)
		{
		   rem = num%10;
		   sum = sum+(rem*rem*rem);
		   num = num/10;
		}
		
		if(sum==temp) 
		{
			System.out.println("Number is Armstrong");
		}
		else 
		{
			System.out.println("Number is not Armstrong");
		}
		

	}

}
