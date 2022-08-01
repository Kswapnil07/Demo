package aA;

import java.util.Arrays;

public class SecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,60,40,50,60,70};
		
		for(int i=0;i<a.length;i++)
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
		System.out.println("second smallest:"+a[1]);
	}

}
