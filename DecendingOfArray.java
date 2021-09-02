
public class DecendingOfArray
{

	public static void main(String[] args)
	{
	//Code to perform Decending order
		int [] Array = new int[] {8,2,3,1,6,5,7};
		int temp =0;
		
	    for(int i=0;i<Array.length-1;i++) 
	  {
		    for(int j=i+1;j<Array.length;j++) 
		    {
		    	if(Array[i]>Array[j])
		    	{
		    		temp = Array[i];
		    		Array[i]= Array[j];
		    		Array[j]= temp;
		    	}
		    }
	  }
	 
	   //Code to print Array Of Decending Order
		 for(int j=0;j<Array.length;j++) 
		 {
			 System.out.println(Array[j]);
		 }
		

	}

	}
