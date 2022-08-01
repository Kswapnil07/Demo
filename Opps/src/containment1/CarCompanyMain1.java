package containment1;

import java.util.Scanner;



public class CarCompanyMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Car1 c1 =new Car1();
		System.out.println("enter id  price name model");
		
		int id=sc.nextInt();
		c1.setId(id);
		int price=sc.nextInt();
		c1.setPrice(price);
		String name=sc.next();
		c1.setName(name);
		String model=sc.next();
		c1.setModel(model);
		
		Company1 c2=new Company1();
		System.out.println("enter id name year car");
		
		int Id=sc.nextInt();
		c2.setId(Id);
		String Name=sc.next();
		c2.setName(Name);
		int  year=sc.nextInt();
		c2.setYear(year);
		String Car=sc.next();
		c2.setCar(Car);
		
		c2.setC1(c1);
		System.out.println(c2);
		
		
		
		
		
	}

}
