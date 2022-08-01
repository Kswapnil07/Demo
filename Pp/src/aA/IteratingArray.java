package aA;

import java.util.Arrays;
import java.util.Scanner;

public class IteratingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a[]= {10,20,30,40,50,2,3,6,8};
//		int b[]=new int[9];
//		System.out.println(Arrays.toString(a));
//		
//		System.out.println();
//		
//		for(int i=0;i<a.length;i++)
//		{
//			b[i]=a[i];
//			
//		}
//		System.out.println(Arrays.toString(b));
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size");
	int size=sc.nextInt();
	int a[]=new int[size];
	int b[]=new int[size];
	System.out.println("enter element");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(a));

	for(int i=0;i<a.length;i++)
	{
		b[i]=a[i];
	}
	System.out.println(Arrays.toString(b));

	
	}
	
	
	

}
