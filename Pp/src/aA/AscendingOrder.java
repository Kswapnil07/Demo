package aA;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {7,5,60,50,40,80,3,2,10};
		
		
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
		System.out.println(Arrays.toString(a));
	}

}
