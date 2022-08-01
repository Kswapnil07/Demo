package assignment5;
import java.util.Scanner;
public class PersonAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner (System.in);
		Address a1=new Address();
		System.out.println("enter city state country");
		String city =sc.next();
		a1.setCity(city);
		String state=sc.next();
		a1.setState(state);
		String country=sc.next();
		a1.setCountry(country);
		
		Person p1=new Person();
		System.out.println("enter age name,gender,address");
		int age =sc.nextInt();
		p1.setAge(age);	
		String name=sc.next();
		p1.setName(name);
		String gender=sc.next();
		p1.setGender(gender);
		String address=sc.next();
		p1.setAddress(address);
		p1.setA1(a1);

		System.out.println(p1);
	
	}

}


















//Address a1=new Address();
//a1.setCity("pune");
//a1.setState("maha");
//a1.setCountry("india");
//
//Person p1=new Person();
//p1.setAge(24);
//p1.setName("ram");
//p1.setGender("male");
//p1.setA1(a1);
//
//
//System.out.println(p1);
//

