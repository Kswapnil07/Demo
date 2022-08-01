package aA;

import java.util.Scanner;

public class SumOfAllElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc=new Scanner(System.in);
				System.out.println("enter size");
				int size=sc.nextInt();
				int a[]=new int[size];
				System.out.println("Enter array element");
				for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt();
				}
				int sum=0;
				for(int i=0;i<a.length;i++)
				{
					sum=sum+a[i];
				}
				System.out.println("sum of array element:"+sum);
	}

}
