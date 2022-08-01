package ArrayObject;
import java.util.Scanner;
public class Employee {

	int id,salary;
	String name,dept,location;
	Employee(){}

	void setId(int id) {
		this.id=id;
	}
	int getid() {
		return id;
	}
	void setName(String name) {
		this.name=name;
	}
	String getname() {
		return name;
	}
	
	void setDept(String dept) {
		this.dept=dept;
	}
	String getdept() {
		return dept;
	}
	void setLocation(String location) {
		this.location=location;
	}
	String getlocation() {
		return location;
	}
	void setSalary(int salary) {
		this.salary=salary;
	}
	int getsalary() {
		return salary;
	}

	public String toString () {
		return id+" "+name+" "+dept+" "+location+" "+salary;
	}
}