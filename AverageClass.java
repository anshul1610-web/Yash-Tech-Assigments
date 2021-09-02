
public class AverageClass {
   
	public static void main(String[] args) 
	{
		int[] array = new int[] {22,20,41,55,16,60,100};
		int sum =0;
		for(int i=0;i<array.length;i++)
		{
            sum =sum+array[i];
	    }
		
		float f = sum/array.length;
		System.out.println("Avearge of given array  is :"+f);
		
	}

	

}
