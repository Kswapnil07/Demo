package inheritance;
import java.util.Scanner;

public class PersonFacultyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id,salary,subject,performance,name,contact,address,gender");
		int id=sc.nextInt();
		int salary=sc.nextInt();
		String subject=sc.next();
		String performance=sc.next();
		String name=sc.next();
		String contact=sc.next();
		String address=sc.next();
		String gender=sc.next();
		
		Faculty f=new Faculty();
		f.setId(id);
		f.setSalary(salary);
		f.setSubject(subject);
		f.setPerformance(performance);
		f.setName(name);
		f.setContact(contact);
		f.setAddress(address);
		f.setGender(gender);
		f.bonus();
		System.out.println(f);
		
	}

}
