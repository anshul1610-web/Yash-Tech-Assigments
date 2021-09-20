
//////////////////Creating Student Class/////////////////////////////////////////////////

package StudentManagement;
import java.util.ArrayList;
import java.util.Scanner;


public class Student 
{
     
	
	
	private int id;
     private String  fName;
     private int age;
     private String Course;
     
     public Student() {
 		super();
 		// TODO Auto-generated constructor stub
 	}
     
     public Student(int id, String fName, int age, String course) {
 		super();
 		this.id = id;
 		this.fName = fName;
 		this.age = age;
 		Course = course;
     }
     
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	
}

//////////////////////Class For Operation Like Add,Update,Delete,View////////////////////////////////////////
public class Operations 
{
	
	public static ArrayList<Student> list= new ArrayList<Student>();;
	int ID;
	 
	/*-----------------Method To ADD Student Object------------------------------------------- */
   public void addStudent() 
   {
	  
	    Student student = new Student();
	    Scanner sc = new Scanner(System.in);
	    
	          System.out.println("Enter Student ID");
	          student.setId(sc.nextInt());
	          
	          System.out.println("Enter Student Full Name");
	          student.setfName(sc.next());
	          sc.nextLine();
	           
	          System.out.println("Enter Student Age");
	          student.setAge(sc.nextInt());
	          sc.nextLine();
	          
	          System.out.println("Enter Student Course");
	          student.setCourse(sc.nextLine());
	          
	   list.add(student);
	   
	
   }
   /*--------Method To View Student Object Detail-----------------------------*/
   
   public  void viewStudent() 
   {

	  for (int i = 0; i < list.size(); i++)
	  {
		Student student = list.get(i);
		   System.out.println("******************************************************************************");
		     System.out.println("Student ID: "+student.getId());
		     System.out.println("Student Name: "+student.getfName());
		     System.out.println("Student Age: "+student.getCourse());
		     System.out.println("Student Course:"+student.getAge());
		   System.out.println("******************************************************************************");
	  }
	   	  
   }
   
   /*-----------Method To Delete Student Object--------------------------------------------*/
   
   
   public void deleteStudent() 
   {
	   System.out.println("Enter Student ID");
	   Scanner sc = new Scanner(System.in);
	   int ID = sc.nextInt();
	   	   
	   for (int i = 0; i < list.size(); i++) 
	   {
		   Student student = list.get(i);
		   if(student.getId()==ID) 
		   {
			   list.remove(student);
			   break;
		   }

	   }
   }
   
   /*---------Method To Update Student Detail--------------------------------------------*/
   
   public void updateStudent()
   {
	   System.out.println("Enter Student ID");
	   Scanner sc = new Scanner(System.in);
	   int ID = sc.nextInt();
	   	   
	   for (int i = 0; i < list.size(); i++) 
	   {
		   Student student = list.get(i);
		   if(student.getId()==ID) 
		   {
			   System.out.println("Enter Student new Name");
		          student.setfName(sc.next());
		          sc.nextLine();
		           
		          System.out.println("Enter Student new Age");
		          student.setAge(sc.nextInt());
		          sc.nextLine();
		          
		          System.out.println("Enter Student new Course");
		          student.setCourse(sc.nextLine());
		   }

	   }
   }

}

/////////////////////Controller Class////////////////////////////////////////////////////////

public class Controler 
{
	
	static void menuDriven()
	{
		System.out.println("Please Enter the Number option to Proceed in the Application");
		System.out.println("1----To Register new Student");
		System.out.println("2----To View Existing Student Records");
		System.out.println("3----To Update Student Record");
		System.out.println("4----To Delete Student Record");
		System.out.println("0----To Exit from the Application");
	}

	public static void main(String[] args) 
	{
		
		Operations operation = new Operations();

		int option;
		do 
		{
			Student st = new Student();
			menuDriven();
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			switch(option)
			{
			case 1:operation.addStudent();
			       System.out.println("Congratulations!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			       System.out.println("Your Data Has Been Submitted!  Back to Menu");
			       System.out.println("*********************************************************");
			       break;
			       
			       
			case 2:operation.viewStudent();
			       System.out.println("***********************************************************");
			       break;
			       
			case 3:operation.updateStudent();
			       System.out.println("Student Data Has Been Update");
			       System.out.println("***********************************************************");
			       
		       break;
			       
			case 4:operation.deleteStudent();
			       System.out.println("Deleted Successfully");
			       System.out.println("***********************************************************");
		           break;
			       
						       
			}
		}
		while(option !=0);
			

	}

}

