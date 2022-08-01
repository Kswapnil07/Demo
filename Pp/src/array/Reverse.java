package array;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();	
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println("reverse array element");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		
	}

}
