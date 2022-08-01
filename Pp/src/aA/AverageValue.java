package aA;

import java.util.Scanner;

public class AverageValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a[]= {10,20,30,40,50,60,70,80};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
		sum=sum+a[i];	
		}
		double average=sum/a.length;
		
		System.out.println("average value:"+average);
		
		
	}

}
