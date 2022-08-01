package com.basic;
import java.util.Scanner;
public class largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,r,large=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("entere a number:");
		num= sc.nextInt();
		while(num>0)
		{
		 r=num%10;
		
		{
		large=r;
		}
		num=num/10;
		
	}
     System.out.println("large number:"+large);
}
}