package array;

import java.util.Scanner;

public class MaximumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
		
			if(a[i]>max)
			
				max=a[i];
			
			
		}
		System.out.println(max);
		
		}
		
	}


