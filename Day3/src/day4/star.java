package day4;
import java.util.Scanner;
public class star {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numer");
		int r;
		r=sc.nextInt();
		for(int i=1;i<=r;i++)
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
		System.out.println("Done");
		    }
	        }


