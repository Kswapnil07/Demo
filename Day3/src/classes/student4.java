package classes;

import java.util.Scanner;

public class student4 {

		int id,marks;
		String name,dept;
	void studentData(int id ,String name ,String dept,int marks) {
		this.id=id;
		this.marks=marks;
		this.name=name;
		this.dept=dept;
		
	}

	void display() {
		
System.out.println(id+" "+name+" "+marks+" "+dept);
		}
	public static void main(String[] args) {
		int id=101;
		int marks=50;
		String name="raj";
		String dept="ele";
	    student4 s1=new student4();
		s1.studentData(id,name,dept,marks);
		s1.display();
	}
	}

	
