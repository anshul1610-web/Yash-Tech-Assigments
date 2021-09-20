
///////////Creating Student CLass Of Attribute///////////////////////////////////////////////


package StudentSortingApp;
import java.util.Comparator;

public class Student 
{

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int roll_No;
	  private String first_Name;
	  private String last_Name;
	  private int age;
	  private int sem_1_marks;
	  private int sem_2_marks;
	  private int sem_3_marks;
	  private int percentage;
	  
	  
	  public Student(int roll_No, String first_Name, String last_Name, int age, int sem_1_marks, int sem_2_marks,
				int sem_3_marks, int percentage) {
			super();
			this.roll_No = roll_No;
			this.first_Name = first_Name;
			this.last_Name = last_Name;
			this.age = age;
			this.sem_1_marks = sem_1_marks;
			this.sem_2_marks = sem_2_marks;
			this.sem_3_marks = sem_3_marks;
			this.percentage = percentage;
		}
	  

	  
	public int getRoll_No() {
		return roll_No;
	}
	public void setRoll_No(int roll_No) {
		this.roll_No = roll_No;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSem_1_marks() {
		return sem_1_marks;
	}
	public void setSem_1_marks(int sem_1_marks) {
		this.sem_1_marks = sem_1_marks;
	}
	public int getSem_2_marks() {
		return sem_2_marks;
	}
	public void setSem_2_marks(int sem_2_marks) {
		this.sem_2_marks = sem_2_marks;
	}
	public int getSem_3_marks() {
		return sem_3_marks;
	}
	public void setSem_3_marks(int sem_3_marks) {
		this.sem_3_marks = sem_3_marks;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}



	@Override
	public String toString() {
		return "Student [roll_No = " + roll_No + ", first_Name = " + first_Name + ",  last_Name = " +
	            last_Name + ",   age = "+ age + ", sem_1_marks = " + sem_1_marks + ",   sem_2_marks = " +
				sem_2_marks + ",   sem_3_marks = " + sem_3_marks+ ",   percentage = " + percentage + "%]";
	}	  
}

//////////Creating Method To Sort According By Age/////////////////////////

public class SortingByAge implements Comparator<Student>
{
	public int compare(Student a,Student b) 
	{
		
		
		return a.getAge()-b.getAge();
		
	}
}
//////////Creating Method To Sort According By First Name /////////////////////////

public class SortingByFirstName implements Comparator<Student>
{
	public int compare(Student a,Student b) 
	{
		
		
		return a.getFirst_Name().compareToIgnoreCase(b.getFirst_Name());
		
	}
}

/////////Creating Method To Sort According By Last Name /////////////////////////

public class SortingByLastName implements Comparator<Student>
{
	public int compare(Student a,Student b) 
	{
		
		
		return a.getLast_Name().compareToIgnoreCase(b.getLast_Name());
		
	}
}


/////////Creating Method To Sort According By percentages /////////////////////////

public class SortingByPercentage implements Comparator<Student>
{
	public int compare(Student a,Student b) 
	{
		
		
		return b.getPercentage()-a.getPercentage();
		
	}
}

//////////////Main Class/////////////////////////////////////////////////////

package StudentSortingApp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main 
{
    public static ArrayList<Student> list;
    
    public static void PrintStudendData() 
    {
    	for(Student st : list)
		{
			System.out.println(st);
		}
    }
    
	public static void main(String[] args)
	{
		int count=1;
		list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<6;i++)
		{
			Student student = new Student();
			System.out.println("Enter Student Data :"+count);
			
			System.out.println("Enter Roll Number");
			student.setRoll_No(sc.nextInt());
			
			System.out.println("Enter First Name");
			student.setFirst_Name(sc.next());
			
			System.out.println("Enter Last Name");
			student.setLast_Name(sc.next());
			
			System.out.println("Enter Age");
			student.setAge(sc.nextInt());
			
			System.out.println("Enter Semester 1st Marks");
			student.setSem_1_marks(sc.nextInt());
			
			System.out.println("Enter Semester 2nd Marks");
			student.setSem_2_marks(sc.nextInt());
			
			System.out.println("Enter Semester 3rd Marks");
			student.setSem_3_marks(sc.nextInt());
			
			
 			int sum = student.getSem_1_marks()+student.getSem_2_marks()+student.getSem_3_marks();
 			int total = sum/3;
 			student.setPercentage(total);

			
		list.add(student);
		count++;
		}
		         System.out.println("***********************************************************************");
		         System.out.println("<<<<<<<Student Record Sorted By Age>>>>>>>>");
                 Collections.sort(list, new SortingByAge());
                 PrintStudendData();
                 
                 System.out.println("***********************************************************************");
                 System.out.println("<<<<<Student Record Sorted By First Name>>>>");
                 Collections.sort(list, new SortingByFirstName());
                 PrintStudendData();
                 
                 System.out.println("************************************************************************");
                 System.out.println("<<<<<Student Record Sorted By Last Name>>>>");
                 Collections.sort(list, new SortingByLastName());
                 PrintStudendData();
                 
                                
                 System.out.println("************************************************************************");
                 System.out.println("<<<<<Student Record Sorted By percentage>>>");
                 Collections.sort(list, new SortingByPercentage());
                 PrintStudendData();
                
	}

}

