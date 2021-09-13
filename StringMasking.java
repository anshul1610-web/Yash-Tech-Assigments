
public class StringMasking 
{

	public static void main(String[] args) 
	{
	//Performing Masking of String
		String str = "SABBIR POONAWALA";
		String [] stArray = str.split(" ");
		
		String str1 = stArray[0];
		String str2 = stArray[1];
		
		
		String str3 = str1.substring(0, 2);
		String str4 = str2.substring(0, 2);
	
	
	            for(int i=0;i<str1.length()-2;i++)
	                 {	 
                      str3 = str3+"X";
	                 }
	            for(int i=0;i<str2.length()-2;i++)
                     {	 
                      str4 = str4+"X";
                     }
	            
	            System.out.println(str3+" "+str4);
	}
}
