package AssignmentException;

import java.util.Scanner;

import exception.ThrowsExample;

public class Example2 {

	 void division(int a,int b)
	{
	System.out.println("divide is:"+a/b);	
	}
	 void arrayElement(int arr[],int i) {
		System.out.println("element of index is:"+arr[i]);
	}
	 int getStringLength(String s)//throws NullPointerException
		{
			if(s==null)
			{
			
				throw  new NullPointerException("string is null");
			}
			return s.length();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example2 f=new Example2();
		Scanner sc=new Scanner(System.in);
		int arr[]= {10,20,30,40,50,60};
		System.out.println("enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try
		{
			f.arrayElement(arr, 5);
			f.division(a, b);
			System.out.println(f.getStringLength(null));
			
			}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
					
	}

}
