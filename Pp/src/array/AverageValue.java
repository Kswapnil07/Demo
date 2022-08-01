package array;

import java.util.Scanner;

public class AverageValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter size ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter array element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
	//	 int[] a = new int[]{20, 30, 25, 35};
		int sum=0;
		for(int i=0;i<a.length;i++) 
		
			sum=sum+a[i];
			double average=sum/a.length;
			
			System.out.println(average);
		
		
		
	}

}
