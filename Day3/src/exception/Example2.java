package exception;

import java.util.Scanner;

public class Example2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=6;
		int a[]=new int[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter"+size+"element:");
		
		for(int i=0;i<size;i++) 
		{
		a[i]=sc.nextInt();
		}
		System.out.println("Element of array");
		
		for(int i=0;i<size;i++)
		{
		System.out.println(a[i]+" ");
		}
		
		
	}

}
