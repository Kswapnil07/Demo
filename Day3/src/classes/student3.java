package classes;

import java.util.Scanner;

public class student3 {
	int id,marks;
	String name,dept,sports;
void studentData(int i,String n,String d,int m,String s ) {
	id=i;
	marks=m;
	name=n;
	dept=d;
	sports=s;
}

void sportsMarks() {
	if (sports.equals("Badminton")) {
		marks=marks+5;
		System.out.println("new marks are: "+marks);
	}
	else if (sports.equals("hocky")) {
		marks=marks+3;
		System.out.println("new marks are: "+marks);
	}		
	else if (sports.equals("khokho")) {
		marks=marks+2;
		System.out.println("new marks are: "+marks);
	}
	else if (sports.equals("no")) {
	
		System.out.println("new marks are: "+marks);
	}		
}
public String toString() {
	
		return id+" "+name+" "+dept+" "+marks+" "+sports;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id, marks;
		String name, dept, sports;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the id,name,dept,marks,sports: ");
		id = sc.nextInt();
		name = sc.next();
		dept = sc.next();
		marks = sc.nextInt();
		sports = sc.next();
		student3 s1 = new student3();
		s1.studentData(id, name, dept, marks, sports);

		student3 s2 = new student3();
		System.out.println("enter the id,name,dept,marks,sports: ");
		id = sc.nextInt();
		name = sc.next();
		dept = sc.next();
		marks = sc.nextInt();
		sports = sc.next();

		System.out.println(s1);
		s1.sportsMarks();

		System.out.println(s2);
		s2.sportsMarks();

	}

}
