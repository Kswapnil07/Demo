package com.basic;
import java.util.Scanner;
public class Thali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("select the thali");
int no=sc.nextInt();
System.out.println("select the quantity");

int choice=sc.nextInt();
switch(choice)
{
case 1:System.out.println("maha thali");
int quantity=sc.nextInt();
int price=quantity*120;
System.out.println("price"+price);
break;
case 2:System.out.println("raj thali");
int q=sc.nextInt();
int f=q*130;
System.out.println("price"+f);
break;
case 3:System.out.println("raj thali");
int w=sc.nextInt();
int s=w*130;
System.out.println("price"+s);
break;
default:
	System.out.println("select quantity");
}

	}

}
