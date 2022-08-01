package com.basic;
import java.util.Scanner;
public class Doehileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch,a,b;
		char c='n';
		do
		{
		System.out.println("1.additation");
		System.out.println("2.substraction");
		System.out.println("3.multiplication");
		System.out.println(".division");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice: ");
		ch=sc.nextInt();
		
		System.out.println("enter 2 numbers: ");
		a=sc.nextInt();
		b=sc.nextInt();
		switch(ch)
		{
		case 1:	System.out.println("addition is: "+(a+b));
		break;
		case 2:	System.out.println("substraction is: "+(a-b));
		break;
		case 3:	System.out.println("multiplication is: "+(a*b));
		break;
		case 4:	System.out.println("division is: "+(a/b));
		break;
		default:System.out.println("invalid input");

		}
		
		System.out.println("do you want to continue:(y/n): ");
		c=sc.next().charAt(0);

		}while(c=='y'||c=='y');
		System.out.println("done");

	}

}
