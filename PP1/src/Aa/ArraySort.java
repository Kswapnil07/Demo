package Aa;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter array element");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int tepm=a[i];
					a[i]=a[j];
					a[j]=tepm;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
