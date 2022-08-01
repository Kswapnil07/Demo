package ArrayObject;

import java.util.Scanner;

public class ArrayOfObject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student1 stud[]=new Student1[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
		System.out.println("enter"+(i+1)+"Student details:");
		System.out.println("id");
		int id=sc.nextInt();
		System.out.println("name");
		String name=sc.next();
		System.out.println("dept");
		String dept=sc.next();
		System.out.println("marks");
		int marks=sc.nextInt();
		
		Student1 s=new Student1();
		
	    s.setId(id);
		s.setName(name);
		s.setDept(dept);
		s.setMarks(marks);
		
	   stud[i]=s;
	}
	
	for(Student1 s:stud) {
		
	System.out.println(s);

}
	}
}
