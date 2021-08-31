import java.util.Arrays;
import java.util.Scanner;

public class ArrayBiggest {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
	
		int[] array = new int[5];
		
		for(int i=0;i<array.length;i++) 
		{
			array[i]= sc.nextInt();
		}
		
		Arrays.sort(array);
		
		
		System.out.println("The 3rd biggest number is "+array[2]);

	}

}
