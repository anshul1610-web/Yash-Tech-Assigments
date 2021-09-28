/////////  Creating Employee Class///////////////////////////////////

import java.io.Serializable;

public class Employee implements Serializable
{
	
	private int empId;
    private String  empFirstName;
    private String empLastName;
    private String empDOB;
    private String empGender;
    
    public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getEmpDOB() {
		return empDOB;
	}

	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empDOB=" + empDOB + ", empGender=" + empGender + "]";
	}
    
    
}

///////////////Creating SubClass Of Employee ////////////////////

import java.io.Serializable;

public class Manager extends Employee implements Serializable
{
	
	private int managerId;
	transient private String empDOB;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public String getEmpDOB() {
		return empDOB;
	}

	public void setEmpDOB(String empDOB) {
		this.empDOB = empDOB;
	}

	@Override
	public String toString() {
		return "Manager [managerId=" + managerId + "]";
	}   

}


////////////////Creating Main Class//////////////////////////////////////////////

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main 
{

	public static void main(String[] args) throws Exception
	{
		Manager manager = new Manager();
		manager.setManagerId(1001);
		manager.setEmpId(1);
		manager.setEmpFirstName("Shaktimaan");
		manager.setEmpLastName("Kumar");
		manager.setEmpDOB("22-11-1996");
		manager.setEmpGender("Male");
		

		   FileOutputStream FOS = new FileOutputStream("manger.ser");
		   ObjectOutputStream OOS = new ObjectOutputStream(FOS);
		   OOS.writeObject(manager);
		   
		   FileInputStream FIS = new FileInputStream("manger.ser");
		   ObjectInputStream OIS = new ObjectInputStream(FIS);
		   
		   Manager M = (Manager)OIS.readObject();
		   System.out.println("ManagerID :"+" EmpID :"+" EmpFirstName :"+" EmplastName :"+" EmpDOB :"+" EmpGender");
		   System.out.println(M.getManagerId()+" : "+M.getEmpId()+" : "+M.getEmpFirstName()+" : "+M.getEmpLastName()+" : "+M.getEmpDOB()+" : "+M.getEmpGender());
	
	}

}


