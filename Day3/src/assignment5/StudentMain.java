package assignment5;
import java.util.Scanner;
public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id name");
		int id=sc.nextInt();
		String name=sc.next();
		Department d1=new Department(id,name);
		
		System.out.println("enter roll Sname");
		int roll=sc.nextInt();
		String Sname=sc.next();

		Student s=new Student(roll,Sname,d1);
		System.out.println(s);
	}

}
