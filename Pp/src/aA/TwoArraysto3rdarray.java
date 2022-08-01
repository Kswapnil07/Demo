package aA;

import java.util.Arrays;

public class TwoArraysto3rdarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,30,40};
		int b[]= {50,60,70,80,90};
		
		int c[]=new int[9];
		
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
			
		}
		for(int i=0;i<c.length;i++)
		{
			
		}
		System.out.println(Arrays.toString(c));
	}

}
