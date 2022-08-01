package array;

import java.util.Scanner;

public class DuplicateElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter the element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("duplicate element");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
				}
				
			}
			//System.out.println("total num of count:"+);
			
		}
		
		
	}

}
