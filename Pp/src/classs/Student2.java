package classs;

import java.util.Scanner;

public class Student2 {

	int id,marks;
	String name,dept,sport;
	void setData(int i,int m,String n,String d,String s) {
		id=i;
		marks=m;
		name=n;
		dept=d;
		sport=s;
	}
	void display()
	{
	System.out.println(id+" "+marks+" "+name+" "+dept+" "+sport);	
	}
	void sportMarks() {
		if(sport.equals("badminton")) {
			marks=marks+10;
			System.out.println(marks);
		}
		else if(sport.equals("hokey")){
			marks=marks+5;
			System.out.println(marks);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Student2 s2=new Student2();
//		Student2 s3=new Student2();
//		s2.setData(101, 75, "yyvuj", "ele", "badminton");
//		s2.display();
//		s2.sportMarks();
//		
//		System.out.println();
//		
//		s3.setData(101, 85, "yyvuj", "ele", "gyuv");
//		s3.display();
		
		Scanner sc=new Scanner(System.in);
		Student2 s2=new Student2();
		System.out.println("enter the id ,marks, name,dept,sports");
		int id=sc.nextInt();
		int marks=sc.nextInt();
		String name=sc.next();
		String dept=sc.next();
		String sports=sc.next();
		s2.setData(id, marks, name, dept, sports);
		s2.display();
		s2.sportMarks();
		
	}

}
