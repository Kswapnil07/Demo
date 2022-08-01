package array;

import java.util.Scanner;

public class IndexPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("enter value of element");
		int value=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==value)
				System.out.println(i);
		}
		
	}

}
