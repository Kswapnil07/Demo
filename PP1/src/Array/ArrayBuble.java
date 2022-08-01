 package Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBuble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {10,20,58,9,6,7,4,8,5,55,66,22};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int f=a[i];
					a[i]=a[j];
					a[j]=f;
				}
			}
			
		}
		System.out.println("bubble sort: "+Arrays.toString(a));
		System.out.println(a[a.length-2]);
		System.out.println(a[1]);
		
	}

}
