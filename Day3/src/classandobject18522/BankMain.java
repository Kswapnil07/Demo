package classandobject18522;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance,accono,amt;
		String name,contact;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter balance accono name contact");
		balance=sc.nextInt();
		accono=sc.nextInt();
		name=sc.next();
		contact=sc.next();
		Account a1=new Account();
		a1.setAccono(accono);
		a1.setName(name);
		a1.setBalance(balance);
		a1.setContact(contact);
		System.out.println("enter amount");
		amt=sc.nextInt();

		Bank b1=new Bank();
		b1.gpay(amt,a1);

	}

}
