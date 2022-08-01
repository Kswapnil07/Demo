package Array;

import java.util.Arrays;

public class Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,6,-7,9,-8-5,-6,-1};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int d=a[i];
					a[i]=a[j];
					a[j]=d;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}