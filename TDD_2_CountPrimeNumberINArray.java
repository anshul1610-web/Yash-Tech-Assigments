///////////////////// Creating Class To Find Count Of Prime num in Given Array////////////////////////////


public class ArrayClass 
{
  public int findCountOfPrime(int [] arr)
  {
	  int temp =0;
	  int count =0;
  
	  if(arr.length < 5)
	  {
		  throw new RuntimeException();
	  }
	  for(int i=0;i<arr.length;i++) 
	  {
		  for(int j=2;j<arr[i];j++) 
		  {
			  if(arr[i]%j ==0) 
			  {
				  temp = temp+1;
			  }
		  }
		  if(temp==0) 
		  {
			 count = count+1; 
		  }
		  
		  temp =0;
	  }
	  return count;
  }
}

/////////////////// Creating JUNIT test Class //////////////////////////////////////////////////


import static org.junit.Assert.*;

import org.junit.Test;

public class TestArray {

	@Test
	public void test()
	{
		ArrayClass arrayclass = new ArrayClass();
		
		int [] arr = {2,3,4,5,6,7,9,10,11};
		int expected = 5;
		
		int actual = arrayclass.findCountOfPrime(arr);
		assertEquals(expected,actual);
		
	}

}
