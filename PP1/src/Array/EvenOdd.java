package Array;

import java.util.Arrays;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,5,6,1,7,8,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]%2!=0)
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
