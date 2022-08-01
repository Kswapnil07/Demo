package com.basic;

import java.util.Scanner;

public class STAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the row numbe");
		r=sc.nextInt();
		for(int i=r-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" *" + " ");
			}
				{
					System.out.println();
				}
				
			}
		System.out.println("Done");
	}

}
