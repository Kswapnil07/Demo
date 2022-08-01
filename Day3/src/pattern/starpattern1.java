package pattern;

import java.util.Scanner;

public class starpattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row numer");
		int r;
		r=sc.nextInt();
		for(int i=r;i>=1;i--)
		   {
			for(int j=1;j<=r-i;j++)
			{
				System.out.print(" ");
			}
				for(int j=1;j<=i;j++) {
					System.out.print("*");

				}
					System.out.println();			
		}
	}
}
