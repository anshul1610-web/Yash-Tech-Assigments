import java.util.StringTokenizer;

public class TokenizerCountNumberInNumber 
{
     public static void Count(String str)
     {
    	 	boolean b1;
    	 	int count =0;
    	 	char[] array = new char[str.length()];
    	 	for(int i=0;i<str.length();i++)
    	 	{
    	 		array[i] = str.charAt(i);
    	 		b1 = Character.isDigit(array[i]);
    	 		if(b1==true) 
    	 		{
    	 			count++;
    	 		}
    	 	}
 
 		System.out.println("The Number count in String Is: "+count);
 
     }
	public static void main(String[] args) 
	{
		
		String str = "12, Rutherford Building, Lake Street, Chicago-29";
		Count(str);
	}

}
