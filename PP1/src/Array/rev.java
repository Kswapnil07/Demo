package Array;

import java.util.Arrays;

public class rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,6,5,4,8};
		int n=a.length;
		
		for(int i=0;i<n/2;i++)
		{
			int t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
		}
		System.out.println(Arrays.toString(a));
	}

}
