
public class StringReplaceChar
{

	public static void main(String[] args)
	{
		//Replacing Given String char a with e And 3rd index with Upper Case..................
		String str = "Halo";
		String str1 = "";
		
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i))=='a')
			{
	
				str1 = str1+"e";
			}
			else if((str.charAt(i))=='l') 
			{
				str1 = str1+"L";
			}
			else
			{
				str1 = str1+(str.charAt(i));
		
			}		
		}
                System.out.println("Halo is Replaced with: "+str1);
	}
}
