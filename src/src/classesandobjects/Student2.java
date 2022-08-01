package classesandobjects;

import java.util.Scanner;

public class Student2 {
	
	int id,marks;
	String name,dept,sports;
	
	void setData(int i,String n,String d,int m,String s)
	{
		id=i;
		name=n;
		dept=d;
		marks=m;
		sports=s;
	}
	
	/*void display()
	{
		System.out.println(id+" "+name+" "+dept+" "+marks+" "+sports);
	}*/
	
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
		
		
	int id,marks;
		String name,dept,sports;
		Scanner sc= new Scanner(System.in);
		
		Student2 s1= new Student2();
		System.out.println("enter the id,name,department,marks,sports: ");
		id=sc.nextInt(); //101
		name= sc.next();//raj
		dept=sc.next();//Computer
		marks=sc.nextInt();//70
		sports=sc.next(); //Badminton
		s1.setData(id, name, dept, marks, sports);//101,Raj...
		
		
		Student2 s2= new Student2();
		System.out.println("enter the id,name,department,marks,sports: ");
		id=sc.nextInt(); //101
		name= sc.next();//raj
		dept=sc.next();//Computer
		marks=sc.nextInt();//70
		sports=sc.next(); //Badminton
		
		s2.setData(id, name, dept, marks, sports);
		
		
		Student2 s3= new Student2();
		System.out.println("enter the id,name,department,marks,sports: ");
		id=sc.nextInt(); //101
		name= sc.next();//raj
		dept=sc.next();//Computer
		marks=sc.nextInt();//70
		sports=sc.next(); //Badminton
		
		s3.setData(id, name, dept, marks, sports);
		
		
		System.out.println(s1);
		s1.sportsMarks();
		
		System.out.println(s2);
		s2.sportsMarks();
		
		System.out.println(s3);
		s3.sportsMarks();
		//Student2 s1=null;
		/*for(int i=1;i<=2;i++)
		{
			System.out.println("enter the id,name,department,marks,sports: ");
			id=sc.nextInt(); //101
			name= sc.next();//raj
			dept=sc.next();//Computer
			marks=sc.nextInt();//70
			sports=sc.next(); //Badminton
			
			Student2 s1 = new Student2();
			s1.setData(id, name, dept, marks, sports);
			
		}*/
		//System.out.println(s1);
	}

}
