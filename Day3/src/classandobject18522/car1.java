package classandobject18522;

import java.util.Scanner;


public class car1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int id,year,price,installment;
		String name,brandname, payment;
		Scanner sc=new Scanner(System.in);
		caracc c2=new caracc();
		System.out.println("enter the id, year,price,installment,name,brandname,payment,");
		id=sc.nextInt();
		year=sc.nextInt();
		price=sc.nextInt();
		installment=sc.nextInt();
		name=sc.next();
		brandname=sc.next();
		payment=sc.next();
	
		c2.setId(id);
		c2.setName(name);
		c2.setYear(year);
		c2.setbrandname(brandname);
		c2.setPrice(price);
		c2.setInstallment(installment);
		c2.setPayment(payment);
		   
        System.out.println(c2);
        discount c1=new discount();
        
        c1.Discount(c2);

	}

}

