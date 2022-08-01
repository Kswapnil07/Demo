package day4;

import java.util.Scanner;

public class starspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the row number ");
		r=sc.nextInt();
		for(int  i=r;i>=1;i--)
		{
			for(int j=1;j<=i;j++) {
				System.out.print("*");
					
				}
			
				System.out.println(" ");
			}	
		
		    }
	
			}




