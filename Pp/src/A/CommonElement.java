package A;

import java.util.Arrays;

public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int a[]= {1,2,3,4,5,6,3,2,5,8,9,7,10};
//		
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j])
//				{
//					System.out.println(a[i]);	
//				}
//			
//			}
//			}
		
		int a[]= {1,2,3,4,5,6};
		int b[]= {2,5,6,9,8,7};
		
		System.out.println("Array1 : "+Arrays.toString(a));
		//
			       System.out.println("Array1 : "+Arrays.toString(b));

				for(int i=0;i<a.length;i++)
				{
				
				for(int j=0;j<b.length;j++)
				{
					if(a[i]==b[j])
						
						System.out.print(a[i]+" ");
				}
					
				}
		
		
		
		
		
		
		
		}
	}


