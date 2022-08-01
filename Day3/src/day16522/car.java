package day16522;
import java.util.Scanner;

public class car {
int id,year,price,installment;
String name,brandname,payment;
void cardata(int i,String n,String b,int y,int p,int in,String py) {
	id=i;
	name=n;
	brandname=b;
	year=y;
	price=p;
	installment=in;
	payment=py;
	
			
}
public String toString() {
	
	return id+" "+name+" "+brandname+" "+year+" "+price+" "+installment+" "+payment;
}
void discount() {
	double discount;

	if(payment.equals("cash") && installment==0) {

	discount =price*30/100;
	System.out.println(discount);
	
	}

if (payment.equals("online") && installment==0){
	 discount =price*30/100;
	
	System.out.println(discount);
}

 if(installment==2) {
	discount=price*20/100;
	
	System.out.println(discount);
	
 }
if(installment==3) {
	
	
	System.out.println("no discount");
}
}

 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id,year,price,installment;
		String name,brandname, payment;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id, name,brandname,year,price,installment,payment");
		id=sc.nextInt();
		name=sc.next();
		brandname=sc.next();
		year=sc.nextInt();
		price=sc.nextInt();
		installment=sc.nextInt();
		payment=sc.next();
		car c1=new car();
        c1.cardata(id, name,brandname,year,price,installment,payment);
        System.out.println(c1);
        c1.discount();
        
        System.out.println("enter the id, name,brandname,year,price,installment,payment");
		id=sc.nextInt();
		name=sc.next();
		brandname=sc.next();
		year=sc.nextInt();
		price=sc.nextInt();
		installment=sc.nextInt();
		payment=sc.next();
		car c2=new car();
        c2.cardata(id, name,brandname,year,price,installment,payment);
        System.out.println(c2);
        c2.discount();
		
	}

}
