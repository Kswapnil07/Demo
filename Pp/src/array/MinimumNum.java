package array;

import java.util.Scanner;

public class MinimumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter number");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			//System.out.println(a[i]);
		}
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
				min=a[i];
			
		}
		System.out.println(min);
	}

}
