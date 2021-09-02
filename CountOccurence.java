
public class CountOccurence
{

	public static void main(String[] args)
	{
		String str = "Java is Object Oriented. Java is platform independent. Java is Simple";
		String str1 = "Java";
		int count=0;
		//Code to count the Occurrences of java in string
		
		String [] arr = str.split(" ");
		for(int i=0;i<arr.length;i++) 
		{
		   if(arr[i].equals(str1)) 
		   {
			   count++;
		   }
		}
		
               System.out.println("The number of Occurence of Java is: "+count);
	}

}
