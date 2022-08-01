package aA;

import java.util.Arrays;

public class LeftRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {11,2,3,4,5,6,7};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j]) 
				{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
					
				}
			}
		
		}
		System.out.println(Arrays.toString(a));
	}

}
