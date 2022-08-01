package constructor;

import java.util.Scanner;

public class Student2 {
	int id,marks;
	String name,dept,city,contact;
	Student2(){}

	public void setId(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	public void setDept(String dept) {
		this.dept=dept;
	}
	public String dept() {
		return dept;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public String getcity() {
		return city;
	}
	public void setContact(String contact) {
		this.contact=contact;
	}
	public String getcontact() {
		return contact;
	}
	public void setMarks(int marks) {
		this.marks=marks;
	}
	public int getmarks() {
		return marks;
	}
	
	void grade() {
		if(marks>=80) {
			System.out.println("first class");
		}
		else if(marks>=60) {
			System.out.println("second class");
			
		
		}
		else if(marks>=50) {
			System.out.println("third class");
			
		}
		
		else
		{
			System.out.println("fail");
		}
	}

	public String toString() {
		return id+" "+name+" "+dept+" "+city+" "+contact+" "+marks;
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id,name,dept,city,contact,marks");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			String city=sc.next();
			String contact=sc.next();
			int marks=sc.nextInt();

	Student2 s1=new Student2();
	s1.setId(id);
	s1.setName(name);
	s1.setDept(dept);
	s1.setCity(city);
	s1.setContact(contact);
	s1.setMarks(marks);
	System.out.println(s1);
	s1.grade();
	
	}

}
