package aA;

import java.util.Scanner;

public class IndexOfElementValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,40,50,60,7,05,0,3,5};
		
		int value=3;
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter size");
//		int size=sc.nextInt();
//		int a[]=new int[size];
//		System.out.println("enter element");
//		for(int i=0;i<a.length;i++)
//		{
//			a[i]=sc.nextInt();
//			
//		}
//		System.out.println("enter value");
//		int value=sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==value)
				System.out.println("index value:"+i);
			
		}
		
	}

}
