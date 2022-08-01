package Array;

import java.util.Arrays;

public class Asscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a[]= {10,20,50,6,0,3,6,1,4,41,5,8};
//		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				
//				if(a[i]>a[j])
//				{
//				int t=a[i];
//				a[i]=a[j];
//				a[j]=t;
//			}
//			}
//			
//		}
//		System.out.println(Arrays.toString(a));
		
		
		
		int a[]= {5,6,3,2,1,4,7,8,9};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int s=a[i];
					a[i]=a[j];
					a[j]=s;
					
				}
				
			}
		}
		System.out.println(Arrays.toString(a));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
