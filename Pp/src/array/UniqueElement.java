package array;

import java.util.Scanner;

public class UniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,3,5,3,9,22,4,3,1,5,6};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++) {
				
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		
			
		}
		
		
		
		
		
		
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter size");
//		int size=sc.nextInt();
//		int a[]=new int[size];
//		System.out.println("enter array element");
//		for(int i=0;i<a.length;i++)
//		{
//			a[i]=sc.nextInt();
//		}
//		
//		System.out.println("guj");
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//				
//			{
//				if(a[i]!=a[j])
//				{
//					
//					System.out.println(a[j]);
//				}
//			}
//		}
	}

}