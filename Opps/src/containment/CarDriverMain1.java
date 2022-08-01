package containment;
import java.util.Scanner;
public class CarDriverMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Driver1 d=new Driver1();
		System.out.println("enter id name contact");
		int id=sc.nextInt();
		d.setId(id);
		String name=sc.next();
		d.setName(name);
		String contact=sc.next();
		d.setContact(contact);
		
		Car1 c1=new Car1();
		System.out.println("enter id name brand");
		int Id=sc.nextInt();
		c1.setId(Id);
		String Name=sc.next();
		c1.setName(Name);
		String brand=sc.next();
		c1.setBrand(brand);
		c1.setD(d);
		System.out.println(c1);
		
	}

}
