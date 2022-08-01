package aA;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {55,2,6,8,9,5,5};
		for(int i=0;i<a.length;i++)//element count
		{
			for(int j=i+1;j<a.length;j++)
					{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
					}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-2]);
	}
	

}
