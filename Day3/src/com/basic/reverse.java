package com.basic;
import java.util.Scanner;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  num,reverse=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("entere a number: ");
		num=sc.nextInt();

		while(num>0)
		{
			int r=num%10;
			reverse= reverse*10+r;
			num=num/10;
		}
		System.out.println("reverse number is: "+reverse);
	}

}
