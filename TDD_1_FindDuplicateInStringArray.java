///////////Creating Class To Find Duplicates in String///////////////////////////////

import java.util.Set;
import java.util.TreeSet;

public class Main 
{
	public int findDuplicateInString(String str)
	{
		int count =0;
		if(str.equals(null))
		{
			throw new NullPointerException();
		}
		
		
		String [] arr = str.split(" ");
		
		Set s = new TreeSet();
		
		for(int i=0;i<arr.length;i++)
		{
			 if(s.add(arr[i])==false)
			 {
				 count = count+1;
			 }
		}
		
           return count;
	}
}

///////////////////// Creating JUNIT Test Class ////////////////////////////////////////////////


import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void test() 
	{
		Main main = new Main();
		
		String str = "Java is Object Oriented and Java is a good programmig Language Too";
		int expected = 2;
		
		int actual = main.findDuplicateInString(str);
		assertEquals(expected,actual);
	}
	
	
	

}
