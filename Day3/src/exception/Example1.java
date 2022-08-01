package exception;

import java.util.Scanner;

public class Example1 {

	static void add(int a,int b)
	{
		System.out.println("addition is:"+(a+b));
	}
	static void division(int a,int b)
	{
		System.out.println("dicision is process");
		System.out.println("division is:"+(a/b));
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 2 number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
		
		division(a,b);	
	}

		catch(ArithmeticException e)
		{
			//System.out.println(e);
			
		
}
		
		add(a,b);
		
}
}
