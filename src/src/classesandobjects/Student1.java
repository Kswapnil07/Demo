package classesandobjects;

import java.util.Scanner;

public class Student1 {
	
	int id,marks;
	String name,dept,sports;
	static String colgname;
	
	{
		id=00;
		marks=00;
		name="name";// instance block,method,constructor
		dept="dept";
		sports="sports";
		colgname="DYPCOE";//instance block,static block, static method, constructor
		System.out.println("In instance block 1");
	}
	
	{
		System.out.println("Instance block 2");
	}
	
	Student1()
	{
		System.out.println("In default constructor");
	}
	
	void setData(int id,String name,String dept,int marks,String sports)
	{
		this.id=id; //represent the current object in use //this-->s1 s1.id=id
		this.name=name;
		this.dept=dept;
		this.marks=marks;
		this.sports=sports;
		//System.out.println(id+" "+name+" "+dept+" "+marks+" "+sports);
		//display(); //s1.display()
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+marks+" "+sports);
	}
	
	void sportsMarks()
	{
		if(sports.equals("Badminton"))
		{
			marks=marks+5;
			System.out.println("New Marks are: "+marks);
		}
		else if(sports.equals("Hockey"))
		{
			marks= marks+3;
			System.out.println("New Marks are: "+marks);
		}
		else if(sports.equals("khokho"))
		{
			marks=marks+2;
			System.out.println("New Marks are: "+marks);
		}
		else if(sports.equals("No"))
		{
			System.out.println("New Marks are: "+marks);
		}
		else
		{
			marks=marks+1;
			System.out.println("New Marks are: "+marks);
		}
		
	}
	
	public String toString() //Object class
	{
		return id+" "+name+" "+dept+" "+marks+" "+sports;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1= new Student1();
		System.out.println(s1);
		
		System.out.println();
		System.out.println();
		Student1 s2= new Student1();
		System.out.println(s2);
		
		
		//System.out.println(s1);//hexadecimal form of the hashcode
		//System.out.println(s1.hashCode());
		//System.out.println(s2);
		
		
		/*s1.setData(101, "Raj", "Computer", 70,"Badminton");
		System.out.println(s1);
		//s1.display();
		//s1.sportsMarks();
		System.out.println();
		
		s2.setData(102, "Riya", "ENTC", 65,"Tennis");
		//s2.display();
		//s2.sportsMarks();
		System.out.println(s2);

		Student1 s3= new Student1();
		s3.id=103;
		//s3.setData(103, "Ramesh", "ENTC", 65,"No");
		s3.display();
		s3.sportsMarks();*/
	}

}
