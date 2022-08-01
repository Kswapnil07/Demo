package ArrayObject;

import java.util.Scanner;

public class Student33Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student3 stud[]=new Student3[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter marks");
			int marks=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			Student3 s=new
			Student3(id,marks,name);
			stud[i]=s;
		}
		
		
		Student3 stud1[]=new Student3[3];
		
		for(int i=0;i<3;i++) {
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter marks");
			int marks=sc.nextInt();
			System.out.println("enter name");
			String name=sc.next();
			Student3 s=new
			 Student3(id,marks,name);
			stud1[i]=s;

		}
		int k=0;
		for(Student3 s:stud) {
			
		}
	}
	

}
