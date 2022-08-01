package aA;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a[]= {1,2,3,4,5,6,7,8,9,10};
//		for(int i=0;i<a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
//		System.out.println();
//		
//		for(int j=a.length-1;j>=0;j--) {
//			System.out.print(+a[j]+" ");
//		}
//		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter element array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
//		for(int i=0;i<a.length;i++)
//		{
//			
//			System.out.println(a[i]);
//	
//		}
		System.out.println();

		for(int j=a.length-1;j>=0;j--)
		{
			System.out.println(a[j]+" ");
		}
	}

}
