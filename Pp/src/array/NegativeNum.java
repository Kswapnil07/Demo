package array;

import java.util.Arrays;

public class NegativeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,8,-3,4,5,-5,-7,-8}; 
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
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
