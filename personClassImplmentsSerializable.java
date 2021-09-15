import java.io.Serializable;

public class Person implements Serializable
{
    private int personId;
    private String personName;
    private int personAge;
    private String personLocation;
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public String getPersonLocation() {
		return personLocation;
	}
	public void setPersonLocation(String personLocation) {
		this.personLocation = personLocation;
	}
}

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main
{

	public static void main(String[] args) 
	{
		Person person = new Person();
		
		Class cs = person.getClass();
		System.out.println("name of the class:"   +cs.getName());
		
		
		Constructor[]  con = cs.getConstructors();
		for(Constructor ct:con) 
		{
		System.out.println("name of the contructor:"   +ct.getName());
		}
		
		Method [] mtd = cs.getMethods();
		for(Method MT:mtd) 
		{
		System.out.println("name of the methods:"   +MT.getName());
		

	    }
	}
}
