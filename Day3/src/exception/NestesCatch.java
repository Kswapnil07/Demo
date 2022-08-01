package exception;

import java.util.Scanner;

public class NestesCatch {

	static void add(int a,int b)
	{
		System.out.println("addition is:"+(a+b));
	}
	static void divide(int a,int b)
	{
		System.out.println("divide is:"+(a/b));
	}
	static void arrayElement(int arr[],int i) {
		System.out.println("Element of index is:"+arr[i]);
	}
	static void StringElement(String s,int i)
	{
		System.out.println("char at the index of string:"+s.charAt(i));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,40,50,60};
		System.out.println("enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		//nested try catch
		try
		{
			try {
				try 
				{
					arrayElement(arr,5);
					
				}
				catch(Exception e)
				{
				System.out.println(e);
				}
				StringElement("India",4);
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			divide (a,b);
			
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		add(a,b);
		System.out.println("done with operation");

	}

}
