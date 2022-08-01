package day4;

import java.util.Scanner;

public class numpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the row numbe");
		r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"");
			}
			
				{
					System.out.println();
				}
				
			}
		System.out.println("Done");
	}

}
