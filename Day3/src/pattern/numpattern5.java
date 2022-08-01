package pattern;

import java.util.Scanner;

public class numpattern5 {

	public static void main(String[] args) {
		
		int r;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the row numbe");
		r=sc.nextInt();
		for(int i=1;i<=r;i++)
		{
			System.out.print("*");
			for(int j=1;j<=i;j++) {
				System.out.print(j+ " ");
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			
			System.out.print("*");
			System.out.println();			
	       }	
		   }		
	       }


