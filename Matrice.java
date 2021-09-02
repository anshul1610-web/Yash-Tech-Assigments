
public class Matrice 
{

	public static void main(String[] args) 
	{
		  
	//Code for calculating 3*3 multiplication of Matrices
			int array1[][]={{1,2,3},{4,5,6},{7,8,9}};    
			int array2[][]={{1,2,3},{4,5,6},{7,8,9}};    
			    
			   
			int multiply[][]=new int[3][3];
			    
		
			for(int i=0;i<3;i++)
			{    
			      for(int j=0;j<3;j++)
			      {    
			          multiply[i][j]=0;      
			              for(int k=0;k<3;k++)      
			               {      
			                   multiply[i][j]+=array1[i][k]*array2[k][j];      
			               } 
			        System.out.print(multiply[i][j]+" ");    
			      } 
			      System.out.println();    
		  }   

	}

}
