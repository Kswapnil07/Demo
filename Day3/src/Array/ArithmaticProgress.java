package Array;

import java.util.Scanner;

public class ArithmaticProgress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter  num");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("index value");
		int c=sc.nextInt();
		int d=b-a;
		
		int f=a%d;
		for(int i=f;i<c;i++)
		{
			f=f+d;
		}
		System.out.println(f);
		
	
		
		
		
		
		

	}

}
