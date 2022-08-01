package aA;

import java.util.Arrays;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,7,8};
		int n=a.length;
		for(int i=0;i<n/2;i++)
		{
			int temp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
			
		}
		System.out.println(Arrays.toString(a));
	}

}
