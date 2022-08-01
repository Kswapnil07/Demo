package Array;

import java.util.Scanner;

public class example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=10;
		float a[]=new float [size];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter"+size+"element:");
		float sum=0;
		for(int i=0;i<size;i++) 
		{
		a[i]=sc.nextFloat();
		System.out.print(a[i]+" ");
		sum+=a[i];
		}	
		System.out.println();
		float total=sum/size;
		System.out.println(total);
		{
		
		}
	}

}
