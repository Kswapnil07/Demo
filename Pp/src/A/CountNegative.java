package A;

import java.util.Arrays;

public class CountNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,-5,6,-8,9,-4,1,-10,-6};
		int cnt=0;
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
			
//			if(a[i]<0) 
//			{
//				cnt++;
//			}
		}
		System.out.println(Arrays.toString(a));

	}

}
