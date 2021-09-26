/////////////// Creating Class To Find Fourth Largest Num In Array//////////////////////////
public class ArrayClass 
{

	public int ForthLargest(int[] array)
	{
		int temp = 0;
		if(array.length < 5)
		{
			throw new RuntimeException();
		}
			
		for(int i=0;i<array.length;i++) 
		{
			for(int j=i+1;j<array.length;j++) 
			{
				if(array[i] > array[j])
				{
					temp = array[i];
					array[i] = array[j];
					array[j]= temp;
				}
			}
		}
		
		return array[3];
		
	}
}


//////////////// Creating JUNIT Class FOr Test/////////////////////////////////////


import static org.junit.Assert.*;

import org.junit.Test;

public class TestArray {

	@Test
	public void test() 
	{
		
		ArrayClass arrayClass = new ArrayClass();
	   int[] array = {5,4,2,3,1,6};
	   int expected = 4;
	   
	   int actual = arrayClass.ForthLargest(array);
	   assertEquals(expected, actual);
	}

}
