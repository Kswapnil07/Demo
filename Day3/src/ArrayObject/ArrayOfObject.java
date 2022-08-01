package ArrayObject;

import java.util.Scanner;

public class ArrayOfObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud[]=new Student[5];
		
		
		Scanner sc=new Scanner (System.in);
		for(int i=0;i<5;i++) {
			System.out.println("enter the id: ");
			int id=sc.nextInt();
			System.out.println("enter the name: ");
			String name=sc.next();
			System.out.println("enter the dept");
			String dept=sc.next();
			System.out.println("enter the marks");
			int marks=sc.nextInt();
			
			stud[i]=new Student(id,name,dept,marks);
			
		}
		for(Student a:stud)
		{
			System.out.println(a);
		}
	}

}
